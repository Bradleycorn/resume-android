//[My Resume](../../index.md)/[net.bradball.resume.ui.theme](index.md)

# Package net.bradball.resume.ui.theme

## Types

| Name | Summary |
|---|---|
| [Shape](-shape/index.md) | [androidJvm]<br>data class [Shape](-shape/index.md)(default: RoundedCornerShape, small: RoundedCornerShape, medium: RoundedCornerShape, large: RoundedCornerShape)<br>Defines a set of shapes to use for elements of various sizes (small, medium, large). Usually, you will want to create a an instance of this object and assign it to the [LocalShape](-local-shape.md) Composition Local, and then use the [MaterialTheme.shapes](shapes.md) property to get the current value of the Composition Local in order to set shapes in your composables. |

## Functions

| Name | Summary |
|---|---|
| [ResumeTheme](-resume-theme.md) | [androidJvm]<br>@Composable<br>fun [ResumeTheme](-resume-theme.md)(useDarkTheme: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = isSystemInDarkTheme(), content: @Composable() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [AppTypography](-app-typography.md) | [androidJvm]<br>val [AppTypography](-app-typography.md): Typography |
| [Black_800](-black_800.md) | [androidJvm]<br>val [Black_800](-black_800.md): Color |
| [Blue_100](-blue_100.md) | [androidJvm]<br>val [Blue_100](-blue_100.md): Color |
| [Blue_200](-blue_200.md) | [androidJvm]<br>val [Blue_200](-blue_200.md): Color |
| [Blue_400](-blue_400.md) | [androidJvm]<br>val [Blue_400](-blue_400.md): Color |
| [Blue_600](-blue_600.md) | [androidJvm]<br>val [Blue_600](-blue_600.md): Color |
| [Blue_800](-blue_800.md) | [androidJvm]<br>val [Blue_800](-blue_800.md): Color |
| [Blue_900](-blue_900.md) | [androidJvm]<br>val [Blue_900](-blue_900.md): Color |
| [Gery_600](-gery_600.md) | [androidJvm]<br>val [Gery_600](-gery_600.md): Color |
| [Green_100](-green_100.md) | [androidJvm]<br>val [Green_100](-green_100.md): Color |
| [Green_200](-green_200.md) | [androidJvm]<br>val [Green_200](-green_200.md): Color |
| [Green_600](-green_600.md) | [androidJvm]<br>val [Green_600](-green_600.md): Color |
| [Green_800](-green_800.md) | [androidJvm]<br>val [Green_800](-green_800.md): Color |
| [Green_900](-green_900.md) | [androidJvm]<br>val [Green_900](-green_900.md): Color |
| [Grey_100](-grey_100.md) | [androidJvm]<br>val [Grey_100](-grey_100.md): Color |
| [Grey_200](-grey_200.md) | [androidJvm]<br>val [Grey_200](-grey_200.md): Color |
| [grey_300](grey_300.md) | [androidJvm]<br>val [grey_300](grey_300.md): Color |
| [Grey_400](-grey_400.md) | [androidJvm]<br>val [Grey_400](-grey_400.md): Color |
| [Grey_500](-grey_500.md) | [androidJvm]<br>val [Grey_500](-grey_500.md): Color |
| [Grey_700](-grey_700.md) | [androidJvm]<br>val [Grey_700](-grey_700.md): Color |
| [Grey_800](-grey_800.md) | [androidJvm]<br>val [Grey_800](-grey_800.md): Color |
| [Grey_900](-grey_900.md) | [androidJvm]<br>val [Grey_900](-grey_900.md): Color |
| [isLight](is-light.md) | [androidJvm]<br>var ColorScheme.[isLight](is-light.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [LocalShape](-local-shape.md) | [androidJvm]<br>val [LocalShape](-local-shape.md): ProvidableCompositionLocal&lt;[Shape](-shape/index.md)&gt;<br>A Composition Local that provides a [Shape](-shape/index.md) instance with shapes to use in the current composition scope. |
| [Red_100](-red_100.md) | [androidJvm]<br>val [Red_100](-red_100.md): Color |
| [Red_200](-red_200.md) | [androidJvm]<br>val [Red_200](-red_200.md): Color |
| [Red_400](-red_400.md) | [androidJvm]<br>val [Red_400](-red_400.md): Color |
| [Red_500](-red_500.md) | [androidJvm]<br>val [Red_500](-red_500.md): Color |
| [Red_700](-red_700.md) | [androidJvm]<br>val [Red_700](-red_700.md): Color |
| [Red_900](-red_900.md) | [androidJvm]<br>val [Red_900](-red_900.md): Color |
| [Roboto](-roboto.md) | [androidJvm]<br>val [Roboto](-roboto.md): SystemFontFamily |
| [shapes](shapes.md) | [androidJvm]<br>@get:Composable<br>@get:ReadOnlyComposable<br>val MaterialTheme.[shapes](shapes.md): [Shape](-shape/index.md)<br>Retuns a [Shape](-shape/index.md) that can be used within the current compose context to set shapes on various elements. |
