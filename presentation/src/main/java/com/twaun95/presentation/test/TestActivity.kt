package com.twaun95.presentation.test

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
        naviList.add(Navigation("A", { AFragment.newInstance() }, binding.rbA))
        naviList.add(Navigation("B", { BFragment.newInstance() }, binding.rbB))


        binding.viewPager.apply {
            adapter = TestViewPageAdapter(this@TestActivity).apply {
                for (i in naviList) {
                    addFragment(i.newInstance())
                }
            }
        }

        binding.rgNavigation.setOnCheckedChangeListener { group, id ->

//            group.indexOfChild(naviList)
//            val index = naviList.find { it.radioButtonId == id }
            val index = when(id) {
                R.id.rb_a -> 0
                R.id.rb_b -> 1
                else -> 0
            }
            binding.viewPager.setCurrentItem(index, false)
        }

    }

}