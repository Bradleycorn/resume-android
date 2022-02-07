plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
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