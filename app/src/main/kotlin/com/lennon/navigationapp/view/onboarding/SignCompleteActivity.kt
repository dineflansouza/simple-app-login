package com.lennon.navigationapp.view.onboarding

import android.os.Bundle
import android.support.v4.app.ActivityCompat.finishAffinity
import android.support.v7.app.AppCompatActivity
import com.lennon.navigationapp.R
import com.lennon.navigationapp.util.parseText
import kotlinx.android.synthetic.main.sigin_complete_activity.*

class SignCompleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sigin_complete_activity)
        setInfoTitle()
    }

    private fun setInfoTitle() {
        sigin_complete_message.parseText(getString(R.string.sigin_complete_title))
    }

    override fun onBackPressed() {
        finishAffinity(this)
    }
}
