
object Version{
    const val core = "1.7.0"
    const val appcompact = "1.6.1"
    const val meterial = "1.6.1"
    const val constraintlayout = "2.1.4"
    const val junit = "4.13.2"
    const val testJunit = "1.1.5"
    const val espresso = "3.5.1"

    const val hiltAndroid="2.44"
    const val lifecycle_version = "2.6.2"

    const val retrofit = "2.9.0"
    const val okHttp = "4.9.3"

    const val coroutine="1.6.0"
    const val nav_version = "2.4.2"

    const val viewModelDelegate = "1.6.0"

    const val glide = "4.16.0"
}
// 'androidx.core:core-ktx:1.7.0'

object Deps{
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appcompact = "androidx.appcompat:appcompat:${Version.appcompact}"
    const val meterial = "com.google.android.material:material:${Version.meterial}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintlayout}"
    const val junit = "junit:junit:${Version.junit}"
    const val testJunit = "androidx.test.ext:junit:${Version.testJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
}

object Hilt{
    const val hilt_android = "com.google.dagger:hilt-android:${Version.hiltAndroid}"
    const val hilt_compiler = "com.google.dagger:hilt-compiler:${Version.hiltAndroid}"
}

object Lifecycle{
    const val lifecycleViewModl = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle_version}"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle_version}"
}

object Retrofit{
    const val retrofit="com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitConverter="com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val retrofit_OkkHttp="com.squareup.okhttp3:okhttp:${Version.okHttp}"
}

object Coroutine{
    const val coroutine_core ="org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutine}"
    const val coroutine_android ="org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutine}"
}

object Nevigation{
    const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Version.nav_version}"
    const val nevigation_ui = "androidx.navigation:navigation-ui-ktx:${Version.nav_version}"
}

object ViewModelDelegate{
    const val viewModelDelegate = "androidx.activity:activity-ktx:${Version.viewModelDelegate}"
}

object Glide{
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"

}