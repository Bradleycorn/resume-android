//[app](../../../index.md)/[net.bradball.resume](../index.md)/[MainActivity](index.md)

# MainActivity

[app]\
class [MainActivity](index.md) : [ComponentActivity](https://developer.android.com/reference/kotlin/androidx/activity/ComponentActivity.html)

This is the primary/initial activity that is launched when the user opens the app. This Activity serves as the root of a Compose Tree, and applies the [ResumeTheme](../../net.bradball.resume.ui.theme/-resume-theme.md) as the root level composable.

This activity sets itself to draw behind system windows, and further, sets the system windows to be transparent. As a result, when rendering content in this Activity, it is your responsibility to position your content and ensure that it doesn't get obscured by system bars.

To aid in handling insets, this Activity wraps all content in the ProvideWindowInsets composable. In order to consume insets and position your content, you can use the various modifiers and other tools provided by the [Accompanist Insets](https://google.github.io/accompanist/insets/) library to properly position content in your composables.

## Constructors

| | |
|---|---|
| [MainActivity](-main-activity.md) | [app]<br>fun [MainActivity](-main-activity.md)() |
