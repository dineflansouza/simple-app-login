package com.lennon.navigationapp.util

import android.widget.TextView
import ru.noties.markwon.Markwon

fun TextView.parseText(text: String) {
    Markwon.create(this.context).let {
        it.setMarkdown(this, text)
    }
}
