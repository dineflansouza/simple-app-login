package com.lennon.navigationapp.view.onboarding.fragments.signin

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lennon.navigationapp.util.TextWatcherImpl
import com.lennon.navigationapp.util.onRequestFocusShowKeyboard
import com.lennon.navigationapp.util.parseText
import com.lennon.navigationapp.view.onboarding.fragments.signin.viewmodel.SigninViewModel
import kotlinx.android.synthetic.main.signin_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel

class SigninFrament : Fragment() {

    private val viewModel: SigninViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            com.lennon.navigationapp.R.layout.signin_fragment,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInfoTitle()
        setNameInput()
        setEmailInput()
        setPasswordInput()
        setSignUpButton()
        setSignInfo()
    }

    private fun setNameInput() {
        sig_in_name_type.onRequestFocusShowKeyboard()
        sig_in_name_type.addTextChangedListener(object : TextWatcherImpl() {
            override fun afterTextChanged(s: Editable?) {
                viewModel.inputName(s.toString())
            }
        })
    }

    private fun setEmailInput() {
        sig_in_email_type.addTextChangedListener(object : TextWatcherImpl() {
            override fun afterTextChanged(s: Editable?) {
                viewModel.inputEmail(s.toString())
            }
        })
    }

    private fun setPasswordInput() {
        sig_in_password_type.addTextChangedListener(object : TextWatcherImpl() {
            override fun afterTextChanged(s: Editable?) {
                viewModel.inputPassword(s.toString())
            }
        })
    }

    private fun setInfoTitle() {
        sig_in_title.text = getString(viewModel.getLoginFragmentVO().title)
    }

    private fun setSignUpButton() {
        sign_in_button.text = getString(viewModel.getLoginFragmentVO().loginButton.title)
        sign_in_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.getLoginFragmentVO().loginButton.nextStep
            )
        )

        viewModel.getLoginFragmentVOLiveData().observe(this, Observer {
            sign_in_button.isEnabled = it!!.loginButton.enabled
        })
    }

    private fun setSignInfo() {
        login_account_info.parseText(getString(viewModel.getLoginFragmentVO().signLink.title))
        login_account_info.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.getLoginFragmentVO().signLink.nextStep
            )
        )
    }
}
