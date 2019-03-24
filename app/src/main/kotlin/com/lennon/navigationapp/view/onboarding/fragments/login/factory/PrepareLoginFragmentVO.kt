package com.lennon.navigationapp.view.onboarding.fragments.login.factory

import com.lennon.navigationapp.R
import com.lennon.navigationapp.view.onboarding.fragments.login.model.vo.LoginFramentVO
import com.lennon.navigationapp.view.onboarding.model.vo.ButtonVO
import com.lennon.navigationapp.view.onboarding.model.vo.LinkVO

internal const val BLANK_EMAIL = ""
internal const val BLANK_PASSWORD = ""

internal fun prepareLoginFragmentVO(): LoginFramentVO {

    return LoginFramentVO(
        title = R.string.product_info_title,
        email = BLANK_EMAIL,
        password = BLANK_PASSWORD,
        loginButton = ButtonVO(
            title = R.string.login_button_text,
            nextStep = 0,
            enabled = false
        ),
        signLink = LinkVO(
            title = R.string.sign_info_text,
            nextStep = 0
        )
    )
}
