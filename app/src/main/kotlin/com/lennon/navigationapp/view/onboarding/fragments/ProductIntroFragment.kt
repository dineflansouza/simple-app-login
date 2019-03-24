package com.lennon.navigationapp.view.onboarding.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lennon.navigationapp.R
import com.lennon.navigationapp.data.model.ProductIntroFragmentVO
import com.lennon.navigationapp.util.parseText
import kotlinx.android.synthetic.main.product_info_fragment.*

class ProductIntroFragment : Fragment() {

    val productIntroFragmentVO = ProductIntroFragmentVO(
        productInfoTitle = R.string.product_info_title,
        signInfo = R.string.sign_info_text
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.product_info_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setSignInfoText()
        setProductInfoTitle()
    }

    private fun setProductInfoTitle() {
        product_info_title.parseText(resources.getString(productIntroFragmentVO.productInfoTitle))
    }

    private fun setSignInfoText() {
        sign_info.parseText(resources.getString(productIntroFragmentVO.signInfo))
    }
}

