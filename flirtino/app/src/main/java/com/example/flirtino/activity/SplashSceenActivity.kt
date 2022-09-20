package com.example.flirtino.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.flirtino.MainActivity
import com.example.flirtino.R
import com.example.flirtino.auth.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class SplashSceenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_sceen)

        val user = FirebaseAuth.getInstance().currentUser

        Handler(Looper.getMainLooper()).postDelayed({
            if(user == null)
                startActivity(Intent(this, LoginActivity::class.java))
            else
                startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)
    }
}