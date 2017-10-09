import org.gradle.kotlin.dsl.repositories

buildscript {
  repositories {
    google()
    jcenter()
  }

  dependencies {
    classpath("com.android.tools.build:gradle:3.0.0-beta7")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.51")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}
