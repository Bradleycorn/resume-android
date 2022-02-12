//[app](../../index.md)/[net.bradball.resume.ui.theme](index.md)/[ResumeTheme](-resume-theme.md)

# ResumeTheme

[app]\

@Composable

fun [ResumeTheme](-resume-theme.md)(useDarkTheme: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = isSystemInDarkTheme(), content: @Composable() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

The primary theme for the Resume app. This theme should be applied at the root of the compose tree. It is a wrapper around the Compose MaterialTheme composable, and applies our color, and type schemes.

## Parameters

app

| | |
|---|---|
| useDarkTheme | Whether to use a dark or light theme. Defaults to the current value of the Compose isSystemInDarkTheme composable. |
| content | The content to render using this theme. |
