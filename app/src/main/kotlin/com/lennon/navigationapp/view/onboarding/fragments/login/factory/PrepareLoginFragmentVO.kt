package com.lennon.navigationapp.view.onboarding.fragments.login.factory

import android.view.View
import com.lennon.navigationapp.R
import com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo.LoginFramentVO

internal fun prepareLoginFragmentVO(): LoginFramentVO {
    return LoginFramentVO(
        title = R.string.product_info_title,
        signUpButton = LoginFramentVO.WelcomeFramentButtonVO(
            title = R.string.sign_up_button_text,
            callback = View.OnClickListener { view ->

            }
        ),
        signInfo = LoginFramentVO.WelcomeFramentSignInfoVO(
            title = R.string.sign_info_text,
            callback = View.OnClickListener { view ->

            }
        )
    )
}
