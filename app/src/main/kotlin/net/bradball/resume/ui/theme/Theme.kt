package net.bradball.resume.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColors(
	primary = Blue_700,
	onPrimary = Color.White,
	primaryVariant = Blue_900,
	secondary = Red_400,
	onSecondary = Color.White,
	secondaryVariant = Red_500,
	error = Red_700,
	onError = Color.White,
	background = Grey_100,
	onBackground = Black_800,
	surface = Grey_100,
	onSurface = Black_800,

)

private val DarkThemeColors = darkColors(
	primary = Blue_700,
	onPrimary = Color.White,
	primaryVariant = Blue_900,
	secondary = Red_400,
	onSecondary = Color.White,
	secondaryVariant = Red_500,
	error = Red_700,
	onError = Color.White,
	background = Grey_900,
	onBackground = Grey_100,
	surface = Grey_700,
	onSurface = Grey_100,
)

/**
 * The primary theme for the Resume app.
 * This theme should be applied at the root of the compose tree.
 * It is a wrapper around the Compose [MaterialTheme] composable,
 * and applies our color, and type schemes.
 *
 * @param useDarkTheme Whether to use a dark or light theme. Defaults to the current
 *   value of the Compose [isSystemInDarkTheme] composable.
 * @param content The content to render using this theme.
 */
@Composable
fun ResumeTheme(
	useDarkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable() () -> Unit
) {
	val colors = when {
		useDarkTheme -> DarkThemeColors
  		else -> LightThemeColors
	}

	MaterialTheme(
  		colors = colors,
  		typography = typography,
		shapes = shapes,
  		content = content
	)
}