// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.gradle.enterprise") version "3.12.3" apply false
}
android {
    compileSdk 32
    defaultConfig{
        applicationId "com.example.customnavigation"
        minSdk 21
        targetSdk 32
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUmitRunner"

    }
    buildTypes{
        release{
            minifyEnabled false
            proguardFiles getDefaultProguardfile('proguard.android-optimize.txt'),'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8

    }
}