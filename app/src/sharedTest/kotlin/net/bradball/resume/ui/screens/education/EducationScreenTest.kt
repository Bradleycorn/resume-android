package net.bradball.resume.ui.screens.education

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
class EducationScreenTest : ComposeTest() {
    @Test
    fun containsAppBar() {
        val appBarDescription = activity.getString(R.string.cd_education_app_bar)

        composeRule.setContent {
            EducationScreen()
        }

        val appBar = composeRule.onNodeWithContentDescription(appBarDescription, useUnmergedTree = true)
        appBar.assertIsDisplayed()
    }

    @Test
    fun appBarContent() {
        val appBarTitle = activity.getString(R.string.education)

        composeRule.setContent {
            EducationAppBar()
        }

        val appBarLabel = composeRule.onNodeWithText(appBarTitle, useUnmergedTree = true)
        appBarLabel.assertIsDisplayed()
    }
}