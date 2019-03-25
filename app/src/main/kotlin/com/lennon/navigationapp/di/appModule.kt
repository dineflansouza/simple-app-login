package com.lennon.navigationapp.di

import com.lennon.navigationapp.view.onboarding.fragments.login.viewmodel.LoginViewModel
import com.lennon.navigationapp.view.onboarding.fragments.signin.viewmodel.SigninViewModel
import com.lennon.navigationapp.view.onboarding.fragments.welcome.viewmodel.WelcomeViewModel
import org.koin.dsl.module

val appModule = module {
    single {
        WelcomeViewModel()
    }

    single {
        SigninViewModel()
    }

    single {
        LoginViewModel()
    }
}
