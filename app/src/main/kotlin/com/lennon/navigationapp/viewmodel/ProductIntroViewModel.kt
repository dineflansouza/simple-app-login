package com.lennon.navigationapp.viewmodel

import android.arch.lifecycle.ViewModel
import com.lennon.navigationapp.data.model.ProductIntroFragmentVO
import com.lennon.navigationapp.util.prepareProductIntroFragmentVO

class ProductIntroViewModel : ViewModel() {

    val fragmentVO: ProductIntroFragmentVO by lazy {
        prepareProductIntroFragmentVO()
    }

}
