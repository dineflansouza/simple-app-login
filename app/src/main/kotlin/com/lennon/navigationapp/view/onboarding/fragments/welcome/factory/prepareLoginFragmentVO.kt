package com.lennon.navigationapp.view.onboarding.fragments.welcome.factory

import com.lennon.navigationapp.R
import com.lennon.navigationapp.model.vo.ButtonVO
import com.lennon.navigationapp.model.vo.LinkVO
import com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo.WelcomeFramentVO

internal fun prepareWelcomeFragmentVO(): WelcomeFramentVO {
    return WelcomeFramentVO(
        title = R.string.product_info_title,
        signUpButton = ButtonVO(
            title = R.string.sign_up_button_text,
            nextStep = R.id.from_welcome_fragment_to_signin_fragment
        ),
        signInfo = LinkVO(
            title = R.string.sign_info_text,
            nextStep = R.id.from_welcome_fragment_to_login_fragment
        )
    )
}
