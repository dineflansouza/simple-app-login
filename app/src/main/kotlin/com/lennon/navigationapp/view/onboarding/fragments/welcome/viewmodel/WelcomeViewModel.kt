package com.lennon.navigationapp.view.onboarding.fragments.welcome.viewmodel

import android.arch.lifecycle.ViewModel
import com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo.WelcomeFramentVO
import com.lennon.navigationapp.view.onboarding.fragments.welcome.factory.prepareWelcomeFragmentVO

class WelcomeViewModel : ViewModel() {

    val fragmentVO: WelcomeFramentVO by lazy {
        prepareWelcomeFragmentVO()
    }

}
