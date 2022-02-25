package net.bradball.resume.testUtil

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import org.junit.Rule

/**
 * Extend this class for Test classes that need to test composables.
 *
 * Provides a set of common tools for writing unit tests for a piece of composable content,
 * so that you don't have to write the boilerplate yourself each time.
 */
abstract class ComposeTest {

    //This MUST be public. AndroidJunitRunner will fail if it's not.
    /**
     * An [AndroidComposeTestRule] that can be used to execute and
     * test composables.
     */
    @get:Rule(order = 0)
    val composeRule = createAndroidComposeRule<ComponentActivity>()


    /**
     * The [ComponentActivity] that the content under test is running in.
     */
    protected val activity: ComponentActivity
        get() = composeRule.activity

    /**
     * Logs the root compose tree out to the LogCat for debugging.
     *
     * @param title The title that is logged at the top of the tree.
     * @param unMerged True to log the unmerged tree. Defaults to false.
     */
    protected fun logTree(title: String, unMerged: Boolean = false) {
        composeRule.onRoot(useUnmergedTree = unMerged).printToLog(title)
    }

}