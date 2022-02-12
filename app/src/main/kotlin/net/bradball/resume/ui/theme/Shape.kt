package net.bradball.resume.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

/**
 * Defines Material [Shapes]
 * to use in the main theme throughout the application.
 *
 * Material defaults are rounded corners,
 * with a 4dp radius for small and medium components and 0dp for large components.
 */
val shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)