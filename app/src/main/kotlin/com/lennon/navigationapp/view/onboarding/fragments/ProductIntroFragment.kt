package com.lennon.navigationapp.view.onboarding.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lennon.navigationapp.R
import com.lennon.navigationapp.util.parseText
import com.lennon.navigationapp.viewmodel.ProductIntroViewModel
import kotlinx.android.synthetic.main.product_info_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel

class ProductIntroFragment : Fragment() {

    private val viewModel: ProductIntroViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.product_info_fragment,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupViews()
    }

    private fun setupViews() {
        product_info_title.text = resources.getString(viewModel.fragmentVO.productInfoTitle)
        sign_info.parseText(resources.getString(viewModel.fragmentVO.signInfo))
    }
}

