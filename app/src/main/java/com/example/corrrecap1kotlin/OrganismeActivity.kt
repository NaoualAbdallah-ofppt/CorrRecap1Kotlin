package com.example.corrrecap1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class OrganismeActivity : AppCompatActivity() {
    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organisme)
        edit1=findViewById(R.id.editNom)
        edit2=findViewById(R.id.editCat)
        btn =findViewById(R.id.btn)
        btn.setOnClickListener(View.OnClickListener {
            val org=Organisme(edit1.text.toString(), edit2.text.toString())
            Organisme.lstOrganisme.add(org)
        })

    }
}