package com.twaun95.workoutmemo.presentation.utils

import android.animation.ValueAnimator
import android.view.View
import androidx.core.animation.*

object MyAnimator {

    enum class STATE {
        START,
        PAUSE,
        RESUME,
        CANCEL,
        REPEAT,
        END,
        IDLE
    }

    val fadeOutAnimator : ValueAnimator = ValueAnimator.ofFloat(1f, 0f)
    val fadeInAnimator : ValueAnimator = ValueAnimator.ofFloat(0f, 1f)

    fun fadeIn(view: View, animatorDuration : Long = 250L, ) {
        fadeInAnimator.apply {
            duration = animatorDuration
            addUpdateListener { animator-> view.alpha = animator.animatedValue as Float }
            doOnEnd {  }
            doOnCancel {  }
            doOnPause { }
            doOnResume {  }
            doOnStart {}
            doOnRepeat { }

            start()
        }
    }

    fun fadeOut(view: View, animatorDuration : Long = 250L) {
        fadeOutAnimator.apply {
            duration = animatorDuration
            addUpdateListener { animator-> view.alpha = animator.animatedValue as Float }
            doOnEnd {  }
            doOnCancel {  }
            doOnPause { }
            doOnResume {  }
            doOnStart {}
            doOnRepeat { }

            start()
        }
    }


}