package com.lennon.navigationapp.util

import com.lennon.navigationapp.R
import com.lennon.navigationapp.data.model.ProductIntroFragmentVO

internal fun prepareProductIntroFragmentVO(): ProductIntroFragmentVO {
    return ProductIntroFragmentVO(
        productInfoTitle = R.string.product_info_title,
        signInfo = R.string.sign_info_text
    )
}
