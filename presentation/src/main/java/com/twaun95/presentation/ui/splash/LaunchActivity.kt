package com.twaun95.presentation.ui.splash

import android.animation.Animator
import android.content.Intent
import com.twaun95.core.BaseActivity
import com.twaun95.presentation.R
import com.twaun95.presentation.databinding.ActivityLaunchBinding
import com.twaun95.presentation.ui.main.MainActivity
import com.twaun95.presentation.utils.MyLogger
import org.koin.androidx.viewmodel.ext.android.viewModel

class LaunchActivity : BaseActivity<ActivityLaunchBinding, LaunchActivityViewModel>(R.layout.activity_launch) {
    override val viewModel: LaunchActivityViewModel by viewModel()

    override fun initView() {
        super.initView()

        binding.viewLottie.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {
                MyLogger.d("lottie onAnimationStart")

                MyLogger.d(viewModel.getLoginId())
                viewModel.putLoginId("TEST")
            }

            override fun onAnimationEnd(p0: Animator?) {
                val intent = Intent(this@LaunchActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_enter_from_right, R.anim.slide_exit_to_left)
            }

            override fun onAnimationCancel(p0: Animator?) {
                MyLogger.d("lottie onAnimationCancel")
            }

            override fun onAnimationRepeat(p0: Animator?) {
                MyLogger.d("lottie onAnimationRepeat")
            }
        })
    }
}