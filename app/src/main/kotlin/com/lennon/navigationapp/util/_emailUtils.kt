package com.lennon.navigationapp.util

import android.util.Patterns.EMAIL_ADDRESS

internal fun String.isEmailValid(): Boolean = EMAIL_ADDRESS.matcher(this).matches()
