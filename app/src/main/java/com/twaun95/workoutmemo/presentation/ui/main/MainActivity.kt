package com.twaun95.workoutmemo.presentation.ui.main

import com.twaun95.core.base.BaseActivity
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.ActivityMainBinding
import com.twaun95.workoutmemo.presentation.ui.body_part.BodyPartFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(R.layout.activity_main) {
    override val viewModel : MainActivityViewModel by viewModel()

    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout_main, BodyPartFragment.newInstance()).commit()
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