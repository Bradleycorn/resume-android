//[app](../../../index.md)/[net.bradball.resume.ui.theme](../index.md)/[Shape](index.md)

# Shape

[MyResume]\
data class [Shape](index.md)(default: RoundedCornerShape, small: RoundedCornerShape, medium: RoundedCornerShape, large: RoundedCornerShape)

Defines a set of shapes to use for elements of various sizes (small, medium, large). Usually, you will want to create a an instance of this object and assign it to the [LocalShape](../-local-shape.md) Composition Local, and then use the [MaterialTheme.shapes](../shapes.md) property to get the current value of the Composition Local in order to set shapes in your composables.

Material3, doesn't support shapes (yet), so this is an implementation that follows the Material 2 shapes implementation, and provides it for use with Material 3 components.

## Constructors

| | |
|---|---|
| [Shape](-shape.md) | [MyResume]<br>fun [Shape](-shape.md)(default: RoundedCornerShape = RoundedCornerShape(0.dp), small: RoundedCornerShape = RoundedCornerShape(4.dp), medium: RoundedCornerShape = RoundedCornerShape(4.dp), large: RoundedCornerShape = RoundedCornerShape(0.dp)) |

## Properties

| Name | Summary |
|---|---|
| [default](default.md) | [MyResume]<br>val [default](default.md): RoundedCornerShape |
| [large](large.md) | [MyResume]<br>val [large](large.md): RoundedCornerShape |
| [medium](medium.md) | [MyResume]<br>val [medium](medium.md): RoundedCornerShape |
| [small](small.md) | [MyResume]<br>val [small](small.md): RoundedCornerShape |
