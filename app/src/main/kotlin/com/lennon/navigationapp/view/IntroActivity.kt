package com.lennon.navigationapp.view

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.lennon.navigationapp.R
import com.lennon.navigationapp.view.onboarding.OnboardingActivity

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_activity)
        setupActivityClose()
    }

    private fun setupActivityClose() {
        Handler().postDelayed({
            startActivity(OnboardingActivity(this))
            finish()
        }, 3000)
    }
}
