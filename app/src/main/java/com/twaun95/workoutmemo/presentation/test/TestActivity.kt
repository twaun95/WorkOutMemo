package com.twaun95.workoutmemo.presentation.test

import com.twaun95.core.BaseActivity
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.ActivityTestBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class TestActivity : BaseActivity<ActivityTestBinding, TestActivityViewModel>(R.layout.activity_test) {
    override val viewModel: TestActivityViewModel by viewModel()

    override fun initView() {
        super.initView()
        initViewPager()
    }

    private fun initViewPager() {
        val naviList = mutableListOf<Navigation>()
        naviList.add(Navigation("A", { AFragment.newInstance() }, R.id.rb_a))
        naviList.add(Navigation("B", { BFragment.newInstance() }, R.id.rb_b))

        binding.viewPager.apply {
            adapter = TestViewPageAdapter(this@TestActivity).apply {
                naviList.forEach{ addFragment(it.newInstance()) }
            }
        }

        binding.rgNavigation.apply {
            check(naviList.first().radioButtonId)
            setOnCheckedChangeListener { _, id ->
                val index = naviList.indices.find { naviList[it].radioButtonId == id } ?: 0
                binding.viewPager.setCurrentItem(index, true)
            }
        }
    }

}