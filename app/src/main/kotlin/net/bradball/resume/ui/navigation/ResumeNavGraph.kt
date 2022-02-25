package net.bradball.resume.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.bradball.resume.ui.screens.about.AboutScreen
import net.bradball.resume.ui.screens.education.EducationScreen
import net.bradball.resume.ui.screens.experience.ExperienceScreen
import net.bradball.resume.ui.screens.skills.SkillsScreen

/**
 * Defines the navigation graph for the application.
 * Renders a [NavHost] that defines the composable tree of destinations
 * for the entire application.
 */
@Composable
fun ResumeNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = Destination.Experience.route, modifier = modifier) {
        composable(Destination.Experience.route) { ExperienceScreen() }
        composable(Destination.Skills.route) { SkillsScreen() }
        composable(Destination.Education.route) { EducationScreen() }
        composable(Destination.About.route) { AboutScreen() }
    }
}