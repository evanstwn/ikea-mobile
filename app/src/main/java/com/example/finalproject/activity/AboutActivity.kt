package com.example.finalproject.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.example.finalproject.R
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnBack: ImageButton
    private lateinit var btnPhone: ImageButton
    private lateinit var btnEmail: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnBack = findViewById(R.id.btn_about_back)
        btnPhone = findViewById(R.id.btn_phone)
        btnEmail = findViewById(R.id.btn_email)

        btnBack.setOnClickListener(this)
        btnPhone.setOnClickListener(this)
        btnEmail.setOnClickListener(this)
    }

    @SuppressLint("IntentReset")
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_about_back -> {
                super.onBackPressed()
            }
            R.id.btn_phone -> {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:(021) 29853900")
                startActivity(intent)
            }
            R.id.btn_email -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.apply{
                    type = "plain/text"
                    data = Uri.parse("mailto:cs@ikea.co.id")
                }
                startActivity(intent)
            }
        }
    }
}