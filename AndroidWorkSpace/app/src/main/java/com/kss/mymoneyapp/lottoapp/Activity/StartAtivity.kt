package com.kss.mymoneyapp.lottoapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.kss.mymoneyapp.lottoapp.MainActivity
import com.kss.mymoneyapp.lottoapp.R

class StartAtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_ativity)

        //3초뒤 움직이게함
        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },3000)
      

    }
}