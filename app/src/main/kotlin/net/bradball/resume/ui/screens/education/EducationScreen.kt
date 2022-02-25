package net.bradball.resume.ui.screens.education

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
 * Renders the Education Screen. This is the root composable
 * for the entire Education section.
 *
 * Includes a Top App Bar, as well as the main content
 * for the Education section.
 *
 * This composable is a wrapper that includes a [Scaffold] for the screen,
 * along with necessary launch effects and other "setup" items. The screen's content
 * is rendered via [EducationContent], which is called from this composable.
 */
@Composable
fun EducationScreen() {
    val screenDescription = stringResource(id = R.string.cd_education_screen)
    Scaffold(
        topBar = { EducationAppBar() },
        modifier = Modifier.clearAndSetSemantics { contentDescription = screenDescription }
    ) {
        EducationContent(it)
    }
}

/**
 * Renders the Top App Bar for the Education Screen.
 */
@Composable
fun EducationAppBar() {
    val appBarDescription = stringResource(id = R.string.cd_education_app_bar)
    TopAppBar(
        title = {Text(text = stringResource(id = R.string.education)) },
        modifier = Modifier.clearAndSetSemantics { contentDescription = appBarDescription },
        contentPadding = rememberInsetsPaddingValues(insets = LocalWindowInsets.current.systemBars, applyBottom = false)
    )
}

/**
 * Renders the primary content in the [EducationScreen].
 *
 * @param contentPadding a [PaddingValues] that should be applied to
 * appropriately pad the content, typically supplied by a [Scaffold].
 */
@Composable
private fun EducationContent(contentPadding: PaddingValues) {
    Text("Screen Content", modifier = Modifier.padding(contentPadding))
}