package com.redefinescience.kninja

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.koin.compose.KoinApplication

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kninja"
    ) {
        KoinApplication(
            application = {
                modules(
                    jvmKoinModule,
                    commonKoinModule
                )
            },
            content = { App() }
        )
    }
}
