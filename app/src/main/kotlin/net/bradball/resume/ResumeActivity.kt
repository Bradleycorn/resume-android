package net.bradball.resume

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.compose.ui.graphics.Color
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.BottomNavigation
import net.bradball.resume.ui.navigation.ResumeNavGraph
import net.bradball.resume.ui.theme.ResumeTheme
import com.google.accompanist.systemuicontroller.SystemUiController
import net.bradball.resume.ui.navigation.Destination

/**
 * This is the primary/initial activity that is launched when the user opens the app.
 * This Activity serves as the root of a Compose Tree, and applies the [ResumeTheme] as the root
 * level composable.
 *
 * This activity sets itself to draw behind system windows, and further, sets the system
 * windows to be transparent. As a result, when rendering content in this Activity,
 * it is your responsibility to position your content and ensure that it doesn't get obscured
 * by system bars.
 *
 * To aid in handling insets, this Activity wraps all content in the [ProvideWindowInsets]
 * composable. In order to consume insets and position your content, you can use the various
 * modifiers and other tools provided by the
 * [Accompanist Insets](https://google.github.io/accompanist/insets/) library to properly position
 * content in your composables.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Draw under system windows. We'll handle insetting content ourselves.
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ResumeTheme {
                ConfigureSystemBars()
                ResumeScreen()
            }
        }
    }
}


/**
 * Renders the initial screen for the application.
 * This composable provides window insets, sets up the [NavHostController], and
 * renders a [NavHost] in a [Scaffold] with a [BottomNavBar].
 */
@Composable
fun ResumeScreen() {
    ProvideWindowInsets {
        val navController = rememberNavController()

        Scaffold(bottomBar = { BottomNavBar(navController) }) {
            ResumeNavGraph(navController = navController)
        }
    }
}

/**
 * Renders the primary bottom navigation bar for the app.
 */
@Composable fun BottomNavBar(navController: NavHostController, modifier: Modifier = Modifier) {
    BottomNavigation(
        modifier = modifier,
        contentPadding = rememberInsetsPaddingValues(insets = LocalWindowInsets.current.navigationBars),
        backgroundColor = MaterialTheme.colors.primary) {
        Destination.navBarDestinations.forEach { item ->
            val backStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = backStackEntry?.destination



            BottomNavigationItem(
                label = { Text(item.label) },
                icon = { Icon(item.icon , item.label) },
                selected = currentDestination?.hierarchy?.any { it.route == item.destination.route } == true,
                onClick = {
                    navController.navigate(item.destination.buildRoute()) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        // Avoid multiple copies of the same destination when
                        // re-selecting the same item
                        launchSingleTop = true
                        // Restore state when re-selecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}


/**
 * Configures system bars using the Insets library's [SystemUiController].
 * Configures the colors for both the system bars (at the top of the device),
 * and the system navigation bars (at the bottom of the device).
 */
@Composable
private fun ConfigureSystemBars() {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = false, isNavigationBarContrastEnforced = false)
        systemUiController.setNavigationBarColor(Color.Black.copy(alpha = 0.2F) , darkIcons = false, navigationBarContrastEnforced = false)
    }
}


@Preview(name = "Home Screen - Light", showSystemUi = true, showBackground = true)
@Preview(name = "Home Screen - Dark", showSystemUi = true, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun PreviewResumeScreen() {
    ResumeTheme {
        //ConfigureSystemBars will break in a preview.
        //Issue will be fixed when this is released https://github.com/google/accompanist/pull/986
        //ConfigureSystemBars()
        ResumeScreen()
    }
}