package com.lennon.navigationapp.view.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lennon.navigationapp.R

class OnboardingActivity : AppCompatActivity() {

    companion object {
        operator fun invoke(context: Context) = Intent(context, OnboardingActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_activity)
    }
}
