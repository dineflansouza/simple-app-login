package com.lennon.navigationapp.util

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

internal fun EditText.onRequestFocusShowKeyboard() {
    this.requestFocus()
    showKeyboard(this.context)
}

internal fun showKeyboard(context: Context) {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
}

internal fun closeKeyboard(context: Context) {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
}
