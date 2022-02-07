package net.bradball.resume.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

//Material 3 doesn't have shapes support.
// This is a way to hack it until support is added.

/**
 * Defines a set of shapes to use for elements of various sizes
 * (small, medium, large). Usually, you will want to create a
 * an instance of this object and assign it to the [LocalShape]
 * Composition Local, and then use the [MaterialTheme.shapes]
 * property to get the current value of the Composition Local
 * in order to set shapes in your composables.
 *
 * Material3, doesn't support shapes (yet), so this
 * is an implementation that follows the Material 2 shapes
 * implementation, and provides it for use with Material 3 components.
 */
data class Shape(
    val default: RoundedCornerShape = RoundedCornerShape(0.dp),
    val small: RoundedCornerShape = RoundedCornerShape(4.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(4.dp),
    val large: RoundedCornerShape = RoundedCornerShape(0.dp)
)


/**
 * A Composition Local that provides a [Shape] instance
 * with shapes to use in the current composition scope.
 *
 * You probably don't want to read this directly.
 * Instead use [MaterialTheme.shapes]
 */
val LocalShape = compositionLocalOf { Shape() }


/**
 * Retuns a [Shape] that can be used within the current
 * compose context to set shapes on various elements.
 */
val MaterialTheme.shapes: Shape
    @Composable
    @ReadOnlyComposable
    get() = LocalShape.current