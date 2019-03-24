package com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo

class WelcomeFramentVO(
    val title: Int,
    val signUpButton: WelcomeFramentButtonVO,
    val signInfo: WelcomeFramentLinkVO
) {

    class WelcomeFramentButtonVO(
        val title: Int,
        val nextStep: Int
    )

    class WelcomeFramentLinkVO(
        val title: Int,
        val nextStep: Int
    )
}

