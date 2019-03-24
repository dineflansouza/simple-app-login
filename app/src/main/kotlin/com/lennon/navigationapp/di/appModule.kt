package com.lennon.navigationapp.di

import com.lennon.navigationapp.view.onboarding.fragments.welcome.viewmodel.WelcomeViewModel
import org.koin.dsl.module

val appModule = module {
    single {
        WelcomeViewModel()
    }
}
