package net.bradball.resume.ui.screens.about

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.bradball.resume.R
import net.bradball.resume.testUtil.ComposeTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AboutScreenTest : ComposeTest() {
    @Test
    fun containsAppBar() {
        val appBarDescription = activity.getString(R.string.cd_about_app_bar)

        composeRule.setContent {
            AboutScreen()
        }

        val appBar = composeRule.onNodeWithContentDescription(appBarDescription, useUnmergedTree = true)
        appBar.assertIsDisplayed()
    }

    @Test
    fun appBarContent() {
        val appBarTitle = activity.getString(R.string.about)

        composeRule.setContent {
            AboutAppBar()
        }

        val appBarLabel = composeRule.onNodeWithText(appBarTitle, useUnmergedTree = true)
        appBarLabel.assertIsDisplayed()
    }
}