package com.lennon.navigationapp.view.onboarding

import android.os.Bundle
import android.support.v4.app.ActivityCompat.finishAffinity
import android.support.v7.app.AppCompatActivity
import com.lennon.navigationapp.R
import com.lennon.navigationapp.util.parseText
import kotlinx.android.synthetic.main.home_activity.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setWelcomeMessage()
    }

    private fun setWelcomeMessage() {
        home_welcome_message.parseText(getString(R.string.home_welcome_message))
    }

    override fun onBackPressed() {
        finishAffinity(this)
    }
}
