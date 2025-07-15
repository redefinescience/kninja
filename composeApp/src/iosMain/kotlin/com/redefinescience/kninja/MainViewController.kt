package com.redefinescience.kninja

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.compose.KoinApplication

fun MainViewController() = ComposeUIViewController {
    KoinApplication(
        application = {
            modules(
                commonKoinModule,
                iosKoinModule
            )
        },
        content = { App() }
    )
}
