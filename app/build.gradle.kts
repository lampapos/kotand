import com.android.builder.model.ApiVersion

apply {
    plugin("com.android.application")
    plugin("kotlin-android")
    plugin("kotlin-android-extensions")
}

android {
    compileSdkVersion(26)
    buildToolsVersion = "26.0.2"
    defaultConfig {
        applicationId = "org.example.kotlin.dsl"
        minSdkVersion(19)
        targetSdkVersion(26)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release")  {
            isMinifyEnabled = true
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation( "com.android.support:appcompat-v7:26.1.0")
    implementation( "com.android.support.constraint:constraint-layout:1.0.2")
    testImplementation("junit:junit:4.12")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.51")
}
