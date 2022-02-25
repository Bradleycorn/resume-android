package net.bradball.resume.ui.screens.experience

import androidx.compose.ui.test.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.bradball.resume.R
import net.bradball.resume.testUtil.ComposeTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExperienceScreenTest: ComposeTest() {

    @Test
    fun containsAppBar() {
        val appBarDescription = activity.getString(R.string.cd_experience_app_bar)

        composeRule.setContent {
            ExperienceScreen()
        }

        val appBar = composeRule.onNodeWithContentDescription(appBarDescription, useUnmergedTree = true)
        appBar.assertIsDisplayed()
    }

    @Test
    fun appBarContent() {
        val appBarTitle = activity.getString(R.string.experience)

        composeRule.setContent {
            ExperienceAppBar()
        }

        val appBarLabel = composeRule.onNodeWithText(appBarTitle, useUnmergedTree = true)
        appBarLabel.assertIsDisplayed()
    }
}