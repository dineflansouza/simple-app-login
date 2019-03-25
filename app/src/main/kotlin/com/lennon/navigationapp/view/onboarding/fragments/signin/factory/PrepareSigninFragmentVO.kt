package com.lennon.navigationapp.view.onboarding.fragments.signin.factory

import com.lennon.navigationapp.R
import com.lennon.navigationapp.model.vo.ButtonVO
import com.lennon.navigationapp.model.vo.LinkVO
import com.lennon.navigationapp.view.onboarding.fragments.signin.model.vo.SigninFramentVO

internal const val BLANK_USERNAME = ""
internal const val BLANK_EMAIL = ""
internal const val BLANK_PASSWORD = ""

internal fun prepareSigninFragmentVO(): SigninFramentVO {

    return SigninFramentVO(
        title = R.string.product_info_title,
        username = BLANK_USERNAME,
        email = BLANK_EMAIL,
        password = BLANK_PASSWORD,
        loginButton = ButtonVO(
            title = R.string.login_button_text,
            nextStep = R.id.from_signin_fragment_to_sigin_complete_activity,
            enabled = false
        ),
        signLink = LinkVO(
            title = R.string.sign_info_text,
            nextStep = R.id.login_fragment
        )
    )
}
