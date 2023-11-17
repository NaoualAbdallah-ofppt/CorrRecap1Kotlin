package com.example.corrrecap1kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn1.setOnClickListener(View.OnClickListener {
            val it = Intent(applicationContext, OrganismeActivity::class.java)
            startActivity(it)
          //  val it = Intent(this@MainActivity2, Organisme::class.java)

        })
        btn2.setOnClickListener(View.OnClickListener {

            val it = Intent(applicationContext, OrdinateurActivity::class.java)
            startActivity(it)
        })
        btn3.setOnClickListener(View.OnClickListener {

            val it = Intent(applicationContext, LocationActivity::class.java)
            startActivity(it)
        })

    }
}