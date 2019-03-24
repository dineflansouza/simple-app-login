package com.lennon.navigationapp.view.onboarding.fragments.welcome.factory

import android.view.View
import com.lennon.navigationapp.R
import com.lennon.navigationapp.view.onboarding.fragments.welcome.model.vo.WelcomeFramentVO

internal fun prepareWelcomeFragmentVO(): WelcomeFramentVO {
    return WelcomeFramentVO(
        title = R.string.product_info_title,
        signUpButton = WelcomeFramentVO.WelcomeFramentButtonVO(
            title = R.string.sign_up_button_text,
            callback = View.OnClickListener { view ->

            }
        ),
        signInfo = WelcomeFramentVO.WelcomeFramentSignInfoVO(
            title = R.string.sign_info_text,
            callback = View.OnClickListener { view ->

            }
        )
    )
}
