package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class AppDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_development)

        val btnDial = findViewById<Button>(R.id.btn2)
        val btnMsg = findViewById<Button>(R.id.btnMsg)
        val btnLinkdin = findViewById<Button>(R.id.btnLinkdin)
        val cardView1 = findViewById<CardView>(R.id.app)
        val cardView2 = findViewById<CardView>(R.id.web)
        val cardView3 = findViewById<CardView>(R.id.blockChain)
        val cardView4 = findViewById<CardView>(R.id.devOps)
        val cardView5 = findViewById<CardView>(R.id.dataScience)
        val cardView6 = findViewById<CardView>(R.id.ai_ml)

        btnDial.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel: +916394031829"))
            startActivity(intent)
        }
        btnMsg.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.setData(Uri.parse("smsto:"+Uri.encode("+916394031829")))
            intent.putExtra("sms_body", "Please solve this issue asap.")
            startActivity(intent)
        }
        btnLinkdin.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/feed/")
            startActivity(intent)
        }
        cardView1.setOnClickListener{
            intent = Intent(applicationContext, APP::class.java)
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            intent = Intent(applicationContext, WEB::class.java)
            startActivity(intent)
        }
        cardView3.setOnClickListener{
            intent = Intent(applicationContext, BLOCK_CHAIN::class.java)
            startActivity(intent)
        }
        cardView4.setOnClickListener{
            intent = Intent(applicationContext, DEV_OPS::class.java)
            startActivity(intent)
        }
        cardView5.setOnClickListener{
            intent = Intent(applicationContext, DATA_SCIENCE::class.java)
            startActivity(intent)
        }
        cardView6.setOnClickListener{
            intent = Intent(applicationContext, AI_ML::class.java)
            startActivity(intent)
        }
    }
}