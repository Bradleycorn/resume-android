import java.net.URL

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.dokka")

}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "net.bradball.resume"
        versionCode = 1
        versionName = "1.0"

        minSdk = 23
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables.useSupportLibrary = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
        unitTests.all {
            it.useJUnit {
                excludeCategories("net.bradball.resume.testUtil.IgnoreOnRobolectric")
            }
        }
    }


    sourceSets["test"].apply {
        java {
            srcDir("src/sharedTest/kotlin")
        }
        res {
            srcDir("src/sharedTest/res")
        }
    }
    sourceSets["androidTest"].apply {
        java {
            srcDir("src/sharedTest/kotlin")
        }
        res {
            srcDir("src/sharedTest/res")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

//Hilt necessity
kapt {
    correctErrorTypes = true
}

dependencies {

    implementation(libs.androidx.activity)
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle.runtime)

    implementation(libs.bundles.compose)
    implementation(libs.bundles.accompianist)
    debugImplementation(libs.compose.ui.tooling)

    implementation(libs.hilt)
    kapt(libs.hilt.kapt)

    implementation(libs.material)

    implementation(libs.bundles.navigation)

    testImplementation(libs.junit)
    testImplementation(libs.bundles.androidx.test)
    testImplementation(libs.robolectric)

    androidTestImplementation(libs.bundles.androidx.test)
}

tasks.dokkaGfm {
    moduleName.set("app")
    outputDirectory.set(projectDir.resolve("../docs"))
    suppressObviousFunctions.set(true)

    dokkaSourceSets {
        configureEach {
            displayName.set("")

            sourceLink {
                // Unix based directory relative path to the root of the project (where you execute gradle respectively).
                localDirectory.set(file("src/main/kotlin"))

                // URL showing where the source code can be accessed through the web browser
                remoteUrl.set(URL("https://github.com/bradleycorn/resume-android/blob/master/src/main/kotlin"))
                // Suffix which is used to append the line number to the URL. Use #L for GitHub
                remoteLineSuffix.set("#L")
            }
        }
    }

}