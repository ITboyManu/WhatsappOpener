package com.example.whatsappopener

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
     lateinit var  editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
       editText=findViewById<EditText>(R.id.editTextTextPersonName)


    }

    fun openWhatsapp(view: View) {

        val data=editText.text.toString();
        Whatsopener(data)
    }

    private fun Whatsopener(data: String) {

        val intent= Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://api.whatsapp.com/send?phone=$data")
        startActivity(intent)

    }
}