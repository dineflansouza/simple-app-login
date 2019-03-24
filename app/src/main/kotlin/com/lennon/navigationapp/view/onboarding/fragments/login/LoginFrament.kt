package com.lennon.navigationapp.view.onboarding.fragments.login

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lennon.navigationapp.util.onRequestFocusShowKeyboard
import com.lennon.navigationapp.util.parseText
import com.lennon.navigationapp.view.onboarding.fragments.login.util.TextWatcherImpl
import com.lennon.navigationapp.view.onboarding.fragments.login.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.login_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel


class LoginFrament : Fragment() {

    private val viewModel: LoginViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            com.lennon.navigationapp.R.layout.login_fragment,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInfoTitle()
        setEmailInput()
        setPasswordInput()
        setSignUpButton()
        setSignInfo()
    }

    private fun setEmailInput() {
        login_in_email_type.onRequestFocusShowKeyboard()
        login_in_email_type.addTextChangedListener(object : TextWatcherImpl() {
            override fun afterTextChanged(s: Editable?) {
                viewModel.inputEmail(s.toString())
            }
        })
    }

    private fun setPasswordInput() {
        login_in_password_type.addTextChangedListener(object : TextWatcherImpl() {
            override fun afterTextChanged(s: Editable?) {
                viewModel.inputPassword(s.toString())
            }
        })
    }

    private fun setInfoTitle() {
        login_title.text = getString(viewModel.getLoginFragmentVO().title)
    }

    private fun setSignUpButton() {
        login_button.text = getString(viewModel.getLoginFragmentVO().loginButton.title)
        login_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.getLoginFragmentVO().loginButton.nextStep
            )
        )

        viewModel.getLoginFragmentVOLiveData().observe(this, Observer {
            login_button.isEnabled = it!!.loginButton.enabled
        })
    }

    private fun setSignInfo() {
        create_account_info.parseText(getString(viewModel.getLoginFragmentVO().signLink.title))
        create_account_info.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.getLoginFragmentVO().signLink.nextStep
            )
        )
    }

}
