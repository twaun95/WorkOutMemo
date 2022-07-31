package com.twaun95.presentation.ui

import android.widget.Toast
import com.twaun95.core.BaseActivity
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.ActivityMainBinding
import com.twaun95.presentation.ui.body_part.BodyPartFragment
import com.twaun95.presentation.utils.MyLogger
import com.twaun95.presentation.utils.MyToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(R.layout.activity_main) {
    override val viewModel : MainActivityViewModel by viewModel()

    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout_main, BodyPartFragment()).commit()
    }

    override fun setEvent() {
        super.setEvent()

//        applicationContext // applicationContext
//        Toast.makeText(this, "d",Toast.LENGTH_LONG).show() // activity context
//        baseContext // ?? what context
    }

    override fun setObserver() {
        super.setObserver()
    }

}