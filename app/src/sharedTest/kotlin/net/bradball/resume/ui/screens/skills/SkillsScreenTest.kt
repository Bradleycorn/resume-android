package net.bradball.resume.ui.screens.skills

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.bradball.resume.R
import org.junit.Assert.*

import net.bradball.resume.testUtil.ComposeTest
import net.bradball.resume.ui.screens.experience.ExperienceAppBar
import net.bradball.resume.ui.screens.experience.ExperienceScreen
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SkillsScreenTest : ComposeTest() {
    @Test
    fun containsAppBar() {
        val appBarDescription = activity.getString(R.string.cd_skills_app_bar)

        composeRule.setContent {
            SkillsScreen()
        }

        val appBar = composeRule.onNodeWithContentDescription(appBarDescription, useUnmergedTree = true)
        appBar.assertIsDisplayed()
    }

    @Test
    fun appBarContent() {
        val appBarTitle = activity.getString(R.string.skills)

        composeRule.setContent {
            SkillsAppBar()
        }

        val appBarLabel = composeRule.onNodeWithText(appBarTitle, useUnmergedTree = true)
        appBarLabel.assertIsDisplayed()
    }
}