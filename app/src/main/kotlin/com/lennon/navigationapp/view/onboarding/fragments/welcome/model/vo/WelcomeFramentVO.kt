package com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo

import android.view.View

class WelcomeFramentVO(
    val title: Int,
    val signUpButton: WelcomeFramentButtonVO,
    val signInfo: WelcomeFramentSignInfoVO
) {

    class WelcomeFramentButtonVO(
        val title: Int,
        val callback: View.OnClickListener
    )

    class WelcomeFramentSignInfoVO(
        val title: Int,
        val callback: View.OnClickListener
    )
}


