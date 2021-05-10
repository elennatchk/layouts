package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()


    }
    private fun init(){
        moveToConstraint.setOnClickListener {
            val intent = Intent(this, constraint::class.java)
            startActivity(intent)


        }





    }
}