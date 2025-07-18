package com.redefinescience.kninja

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AndroidApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AndroidApplication)
            androidLogger()
            modules(
                androidKoinModule,
                commonKoinModule
            )
        }
    }
}
