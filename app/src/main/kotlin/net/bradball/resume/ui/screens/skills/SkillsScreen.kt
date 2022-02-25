package net.bradball.resume.ui.screens.skills

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
 * Renders the Skills Screen. This is the root composable
 * for the entire Skills section.
 *
 * Includes a Top App Bar, as well as the main content
 * for the Skills section.
 *
 * This composable is a wrapper that includes a [Scaffold] for the screen,
 * along with necessary launch effects and other "setup" items. The screen's content
 * is rendered via [SkillsContent], which is called from this composable.
 */
@Composable
fun SkillsScreen() {
    val screenDescription = stringResource(id = R.string.cd_skills_screen)
    Scaffold(
        topBar = { SkillsAppBar() },
        modifier = Modifier.clearAndSetSemantics { contentDescription = screenDescription }
    ) {
        SkillsContent(it)
    }
}

/**
 * Renders the Top App Bar for the Skills Screen.
 */
@Composable
fun SkillsAppBar() {
    val appBarDescription = stringResource(id = R.string.cd_skills_app_bar)
    TopAppBar(
        title = {Text(text = stringResource(id = R.string.skills)) },
        modifier = Modifier.clearAndSetSemantics { contentDescription = appBarDescription },
        contentPadding = rememberInsetsPaddingValues(insets = LocalWindowInsets.current.systemBars, applyBottom = false)
    )
}

/**
 * Renders the primary content in the [SkillsScreen].
 *
 * @param contentPadding a [PaddingValues] that should be applied to
 * appropriately pad the content, typically supplied by a [Scaffold].
 */
@Composable
private fun SkillsContent(contentPadding: PaddingValues) {
    Text("Screen Content", modifier = Modifier.padding(contentPadding))
}