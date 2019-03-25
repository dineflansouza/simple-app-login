package com.lennon.navigationapp.view.onboarding.fragments.login.factory

import com.lennon.navigationapp.R
import com.lennon.navigationapp.model.vo.ButtonVO
import com.lennon.navigationapp.model.vo.LinkVO
import com.lennon.navigationapp.view.onboarding.fragments.login.model.vo.LoginFramentVO

internal const val BLANK_EMAIL = ""
internal const val BLANK_PASSWORD = ""

internal fun prepareLoginFragmentVO(): LoginFramentVO {

    return LoginFramentVO(
        title = R.string.product_info_title,
        email = BLANK_EMAIL,
        password = BLANK_PASSWORD,
        loginButton = ButtonVO(
            title = R.string.login_button_text,
            nextStep = R.id.from_login_fragment_to_sigin_complete_activity,
            enabled = false
        ),
        signLink = LinkVO(
            title = R.string.not_account_still_text,
            nextStep = R.id.from_login_fragment_to_sigin_complete_activity
        )
    )
}
