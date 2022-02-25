package net.bradball.resume.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Architecture
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Work
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.bradball.resume.ui.screens.about.AboutScreen
import net.bradball.resume.ui.screens.education.EducationScreen
import net.bradball.resume.ui.screens.experience.ExperienceScreen
import net.bradball.resume.ui.screens.skills.SkillsScreen


/**
 * Represents a destination in the [NavGraph].
 *
 * @param route The unique route for the destination.
 *   Use this property only for setting up the [NavGraph].
 *   Do not use this property when calling `navigate()` on the
 *   [NavHostController]. Use the [buildRoute] method instead,
 *   to get a route with proper parameters.
 * @param name The name of the destination, suitable for display.
 */
sealed class Destination (val route: String, val name: String) {
    object Experience : Destination("experience", "Experience")
    object Skills: Destination("skills", "Skills")
    object Education: Destination("education", "Education")
    object About: Destination("about", "About")

    /**
     * Call this function to get a route that you can
     * use when calling [NavHostController].`navigate()`.
     */
    open fun buildRoute(): String = route

    companion object {
        val navBarDestinations: List<NavItem> = listOf(
            NavItem(Experience, Icons.Filled.Work),
            NavItem(Skills, Icons.Filled.Architecture),
            NavItem(Education, Icons.Filled.School),
            NavItem(About, Icons.Filled.Person)
        )
    }
}


