package com.example.datatest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   var isMain=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }
    fun openNext(){
        if (isMain){
            val intent= Intent(this,TestActivity::class.java)
            startActivity(intent)
            finish()
        }else{
            val intent=Intent(this,StartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun initViews() {
        Handler().postDelayed({
            openStartActivity()
        }, 2000)
    }

    private fun openStartActivity() {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun inetveiw(){
        val image= findViewById<ImageView>(R.id.iv_icon)


    }
}