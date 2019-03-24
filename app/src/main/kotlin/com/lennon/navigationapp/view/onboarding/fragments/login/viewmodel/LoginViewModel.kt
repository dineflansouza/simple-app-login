package com.lennon.navigationapp.view.onboarding.fragments.login.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.lennon.navigationapp.util.isEmailValid
import com.lennon.navigationapp.view.onboarding.fragments.login.factory.prepareLoginFragmentVO
import com.lennon.navigationapp.view.onboarding.fragments.login.model.vo.LoginFramentVO

class LoginViewModel : ViewModel() {

    private var loginFragmentVOLiveData = MutableLiveData<LoginFramentVO>()

    private var loginFragmentVO: LoginFramentVO = prepareLoginFragmentVO()

    init {
        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    fun getLoginFragmentVO() = loginFragmentVO

    fun getLoginFragmentVOLiveData() = loginFragmentVOLiveData

    fun inputPassword(typedPassword: String) {
        loginFragmentVO.password = typedPassword
        loginFragmentVO.loginButton.enabled = emailAndPasswordAreValid()

        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    fun inputEmail(typedEmail: String) {
        loginFragmentVO.email = typedEmail
        loginFragmentVO.loginButton.enabled = emailAndPasswordAreValid()

        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    private fun emailAndPasswordAreValid(): Boolean {
        return loginFragmentVO.email.isEmailValid() && loginFragmentVO.password.length > 6
    }
}
