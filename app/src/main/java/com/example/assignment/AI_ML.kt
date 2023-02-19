package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class AI_ML : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_ml)

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
            intent.data = Uri.parse("https://i.am.ai/roadmap")
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/machine-learning-versus-artificial-intelligence/")
            startActivity(intent)
        }
        resource.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.pluralsight.com/blog/software-development/essential-skills-ml-ai-devs-aws")
            startActivity(intent)
        }
        course1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/artificial-intelligence-games-in-java/")
            startActivity(intent)
        }
        course2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/artificial-intelligence-az/")
            startActivity(intent)
        }
        course3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/introduction-to-machine-learning-in-python/")
            startActivity(intent)
        }
        course4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/data-science-logistic-regression-in-python/")
            startActivity(intent)

        }
        course5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=ukzFI9rgwfU&list=PLEiEAq2VkUULYYgj13YHUWmRePqiu8Ddy")
            startActivity(intent)
        }
        course6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PL9ooVrP1hQOGHNaCT7_fwe9AabjZI1RjI")
            startActivity(intent)
        }
        course7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/topics/ai-ml")
            startActivity(intent)
        }
    }
}