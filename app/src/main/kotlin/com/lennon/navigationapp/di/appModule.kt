package com.lennon.navigationapp.di

import com.lennon.navigationapp.viewmodel.ProductIntroViewModel
import org.koin.dsl.module

val appModule = module {
    single {
        ProductIntroViewModel()
    }
}
