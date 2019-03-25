package com.lennon.navigationapp.view.onboarding.fragments.signin.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.lennon.navigationapp.util.isEmailValid
import com.lennon.navigationapp.view.onboarding.fragments.signin.factory.prepareSigninFragmentVO
import com.lennon.navigationapp.view.onboarding.fragments.signin.model.vo.SigninFramentVO

class SigninViewModel : ViewModel() {

    private var loginFragmentVOLiveData = MutableLiveData<SigninFramentVO>()

    private var loginFragmentVO: SigninFramentVO = prepareSigninFragmentVO()

    init {
        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    fun getLoginFragmentVO() = loginFragmentVO

    fun getLoginFragmentVOLiveData() = loginFragmentVOLiveData

    fun inputPassword(typedPassword: String) {
        loginFragmentVO.password = typedPassword
        loginFragmentVO.loginButton.enabled = inputedDataAreValid()

        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    fun inputEmail(typedEmail: String) {
        loginFragmentVO.email = typedEmail
        loginFragmentVO.loginButton.enabled = inputedDataAreValid()

        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    fun inputName(typedName: String) {
        loginFragmentVO.username = typedName
        loginFragmentVO.loginButton.enabled = inputedDataAreValid()

        loginFragmentVOLiveData.postValue(loginFragmentVO)
    }

    private fun inputedDataAreValid(): Boolean {
        return loginFragmentVO.email.isEmailValid() &&
                loginFragmentVO.password.length > 6
                && loginFragmentVO.username.isNotBlank()
    }
}
