package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class APP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        val cardView1 = findViewById<CardView>(R.id.cv_1)
        val cardView2 = findViewById<CardView>(R.id.cv_2)
        val resource = findViewById<Button>(R.id.res_app)
        val course1 = findViewById<Button>(R.id.btn_c1)
        val course2 = findViewById<Button>(R.id.btn_c2)
        val course3 = findViewById<Button>(R.id.btn_c3)
        val course4 = findViewById<Button>(R.id.btn_c4)
        val course5 = findViewById<Button>(R.id.btn_c5)
        val course6 = findViewById<Button>(R.id.btn_c6)
        val course7 = findViewById<Button>(R.id.btn_c7)

        cardView1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/android")
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/introduction-to-android-development/")
            startActivity(intent)
        }
        resource.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/")
            startActivity(intent)
        }
        course1.setOnClickListener{
             val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/android-development-java-android-studio-masterclass/")
            startActivity(intent)
        }
        course2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/android-kotlin-developer/")
            startActivity(intent)
        }
        course3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/java-android-complete-guide/")
            startActivity(intent)
        }
        course4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/flutter-dart-the-complete-flutter-app-development-course/")
            startActivity(intent)

        }
        course5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PLTV_nsuD2lf4UCTV6xwvNPvFdmCNKyhc8")
            startActivity(intent)
        }
        course6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PLjVLYmrlmjGdDps6HAwOOVoAtBPAgIOXL")
            startActivity(intent)
        }
        course7.setOnClickListener{
           val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/android")
            startActivity(intent)
        }
    }
}