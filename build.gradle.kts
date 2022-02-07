import org.gradle.api.tasks.Delete

import net.bradball.resume.buildsrc.DependencyUpdates
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // The AGP version number is kept here (instead of the libs toml file), so that
        // Android Studio can update it for us automatically.
        classpath("com.android.tools.build:gradle:7.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.get()}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${libs.versions.hilt.get()}")
    }
}

// https://youtrack.jetbrains.com/issue/KTIJ-19369
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.gradleDependencyUpdate)
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        when {
            candidate.module.contains("compose") -> false
            else -> {
                val current = DependencyUpdates.versionToRelease(currentVersion)
                val candidate = DependencyUpdates.versionToRelease(candidate.version)

                candidate.isLessStableThan(current)
            }
        }
    }
}

