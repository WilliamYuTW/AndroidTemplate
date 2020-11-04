// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(GradlePlugin.gradle)
        classpath(GradlePlugin.kotlin)
        classpath(GradlePlugin.saveArgs)
        classpath(GradlePlugin.hiltAndroid)
    }
}

plugins {
    id("com.github.ben-manes.versions") version "0.34.0"
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}