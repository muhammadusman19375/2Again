package com.example.a2again

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var lottie_animation = findViewById<LottieAnimationView>(R.id.lotti_animation)

        Handler().postDelayed(Runnable {
            run {
                startActivity(Intent(this@SplashActivity,SignupActivity::class.java))
                lottie_animation.pauseAnimation()
            }
        },5000)

    }
}
