package net.bradball.resume.ui.screens.about


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import net.bradball.resume.R

/**
 * Renders the About Screen. This is the root composable
 * for the entire About section.
 *
 * Includes a Top App Bar, as well as the main content
 * for the About section.
 *
 * This composable is a wrapper that includes a [Scaffold] for the screen,
 * along with necessary launch effects and other "setup" items. The screen's content
 * is rendered via [AboutContent], which is called from this composable.
 */
@Composable
fun AboutScreen() {
    val screenDescription = stringResource(id = R.string.cd_about_screen)
    Scaffold(
        topBar = { AboutAppBar() },
        modifier = Modifier.clearAndSetSemantics { contentDescription = screenDescription }
    ) {
        AboutContent(it)
    }
}

/**
 * Renders the Top App Bar for the About Screen.
 */
@Composable
fun AboutAppBar() {
    val appBarDescription = stringResource(id = R.string.cd_about_app_bar)
    TopAppBar(
        title = {Text(text = stringResource(id = R.string.about)) },
        modifier = Modifier.clearAndSetSemantics { contentDescription = appBarDescription },
        contentPadding = rememberInsetsPaddingValues(insets = LocalWindowInsets.current.systemBars, applyBottom = false)
    )
}

/**
 * Renders the primary content in the [AboutScreen].
 *
 * @param contentPadding a [PaddingValues] that should be applied to
 * appropriately pad the content, typically supplied by a [Scaffold].
 */
@Composable
private fun AboutContent(contentPadding: PaddingValues) {
    Text("Screen Content", modifier = Modifier.padding(contentPadding))
}