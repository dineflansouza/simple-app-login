package com.lennon.navigationapp.view.onboarding.fragments.signin.model.vo

import com.lennon.navigationapp.model.vo.ButtonVO
import com.lennon.navigationapp.model.vo.LinkVO

class SigninFramentVO(
    var title: Int,
    var username: String,
    var email: String,
    var password: String,
    var loginButton: ButtonVO,
    var signLink: LinkVO
)

