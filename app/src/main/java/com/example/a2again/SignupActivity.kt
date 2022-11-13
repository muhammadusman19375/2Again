package com.example.a2again

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class SignupActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btn_sign_in = findViewById<TabItem>(R.id.btn_sign_in)
        var btn_sign_up = findViewById<TabItem>(R.id.btn_sign_up)
        var tab_layout = findViewById<TabLayout>(R.id.tab_layout)
        var btn_facebook = findViewById<CardView>(R.id.btn_facebook)
        var btn_google = findViewById<CardView>(R.id.btn_google)
        var btn_email = findViewById<CardView>(R.id.btn_email)
        var btn_phone = findViewById<CardView>(R.id.btn_phone)
        var tv_bottom_bar = findViewById<TextView>(R.id.tv_bottom_bar)




        tab_layout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                if(tab_layout.selectedTabPosition == 0){
                    btn_phone.visibility = View.VISIBLE
                    tv_bottom_bar.setText("By sign in you agree to 2Again")
                }

                if(tab_layout.selectedTabPosition == 1){
                    btn_phone.visibility = View.GONE
                    tv_bottom_bar.setText("By sign up you agree to 2Again")
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }


        })

        btn_email.setOnClickListener{

            startActivity(Intent(this@SignupActivity,MainActivity::class.java))

        }

    }
}