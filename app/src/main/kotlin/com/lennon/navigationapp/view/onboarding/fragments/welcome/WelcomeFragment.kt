package com.lennon.navigationapp.view.onboarding.fragments.welcome

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lennon.navigationapp.R
import com.lennon.navigationapp.util.parseText
import com.lennon.navigationapp.view.onboarding.fragments.welcome.viewmodel.WelcomeViewModel
import kotlinx.android.synthetic.main.welcome_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel

class WelcomeFragment : Fragment() {

    private val viewModel: WelcomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.welcome_fragment,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInfoTitle()
        setSignUpButton()
        setSignInfo()
    }

    private fun setInfoTitle() {
        product_info_title.text = getString(viewModel.fragmentVO.title)
    }

    private fun setSignUpButton() {
        sign_up_button.isEnabled = viewModel.fragmentVO.signUpButton.enabled
        sign_up_button.text = getString(viewModel.fragmentVO.signUpButton.title)
        sign_up_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.fragmentVO.signUpButton.nextStep
            )
        )
    }

    private fun setSignInfo() {
        sign_info.parseText(getString(viewModel.fragmentVO.signInfo.title))
        sign_info.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                viewModel.fragmentVO.signInfo.nextStep
            )
        )
    }
}
