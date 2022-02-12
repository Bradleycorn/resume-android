package net.bradball.resume

import android.os.Bundle
import androidx.compose.ui.graphics.Color
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.systemBarsPadding
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import net.bradball.resume.ui.theme.ResumeTheme
import net.bradball.resume.ui.theme.isLight

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

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val systemUiController = rememberSystemUiController()
            val useDarkIcons = MaterialTheme.colorScheme.isLight
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = useDarkIcons)
            }


            ResumeTheme {
                ProvideWindowInsets {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize().systemBarsPadding(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Greeting("Android")
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ResumeTheme {
        Greeting("Android")
    }
}