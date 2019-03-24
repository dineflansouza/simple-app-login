package com.lennon.navigationapp

import android.app.Application
import com.lennon.navigationapp.di.appModule
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}