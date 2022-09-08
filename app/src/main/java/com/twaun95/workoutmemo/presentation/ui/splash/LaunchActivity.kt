package com.twaun95.workoutmemo.presentation.ui.splash

import android.animation.Animator
import android.content.Intent
import com.twaun95.core.BaseActivity
import com.twaun95.workoutmemo.R
import com.twaun95.workoutmemo.databinding.ActivityLaunchBinding
import com.twaun95.workoutmemo.presentation.ui.main.MainActivity
import com.twaun95.workoutmemo.presentation.utils.MyLogger
import org.koin.androidx.viewmodel.ext.android.viewModel

// 메모 앱에서는 빠른 접근이 필요하기 때문에 스플래시는 불필요하다고 생각함.
class LaunchActivity : BaseActivity<ActivityLaunchBinding, LaunchActivityViewModel>(R.layout.activity_launch) {
    override val viewModel: LaunchActivityViewModel by viewModel()

    override fun initView() {
        super.initView()

        binding.viewLottie.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {

                MyLogger.d(viewModel.getLoginId())
                viewModel.putLoginId("TEST")
            }

            override fun onAnimationEnd(p0: Animator?) {
                val intent = Intent(this@LaunchActivity, MainActivity::class.java)
                startActivity(intent)
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