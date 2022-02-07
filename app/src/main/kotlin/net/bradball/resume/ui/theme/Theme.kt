package net.bradball.resume.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColorScheme(
	primary = Blue_400,
	onPrimary = Color.White,
	primaryContainer = Blue_100,
	onPrimaryContainer = Blue_900,
	secondary = Red_400,
	onSecondary = Color.White,
	secondaryContainer = Red_100,
	onSecondaryContainer = Red_900,
	tertiary = Red_900,
	onTertiary = Color.White,
	tertiaryContainer = Green_100,
	onTertiaryContainer = Green_900,
	error = Red_400,
	errorContainer = Red_100,
	onError = Color.White,
	onErrorContainer = Red_900,
	background = Grey_100,
	onBackground = Black_800,
	surface = Grey_100,
	onSurface = Black_800,
	surfaceVariant = grey_300,
	onSurfaceVariant = Grey_800,
	outline = Grey_700,
	inverseOnSurface = Grey_200,
	inverseSurface = Grey_900,
)

private val DarkThemeColors = darkColorScheme(
	primary = Blue_200,
	onPrimary = Blue_800,
	primaryContainer = Blue_600,
	onPrimaryContainer = Blue_100,
	secondary = Red_200,
	onSecondary = Red_700,
	secondaryContainer = Red_500,
	onSecondaryContainer = Red_100,
	tertiary = Green_200,
	onTertiary = Green_800,
	tertiaryContainer = Green_600,
	onTertiaryContainer = Green_100,
	error = Red_200,
	errorContainer = Red_500,
	onError = Red_700,
	onErrorContainer = Red_100,
	background = Black_800,
	onBackground = Grey_400,
	surface = Black_800,
	onSurface = Grey_400,
	surfaceVariant = Grey_800,
	onSurfaceVariant = Grey_500,
	outline = Gery_600,
	inverseOnSurface = Black_800,
	inverseSurface = Grey_400,
)


var ColorScheme.isLight: Boolean by mutableStateOf(true, structuralEqualityPolicy())
	private set

@Composable
fun ResumeTheme(
	useDarkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable() () -> Unit
) {
	val colors = when {
		useDarkTheme -> DarkThemeColors
  		else -> LightThemeColors
	}

	colors.isLight = !useDarkTheme

	MaterialTheme(
  		colorScheme = colors,
  		typography = AppTypography,
  		content = content
	)
}