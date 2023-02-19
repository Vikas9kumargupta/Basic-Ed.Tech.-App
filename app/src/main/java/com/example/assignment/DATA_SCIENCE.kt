package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class DATA_SCIENCE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_science)

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
            intent.data = Uri.parse("https://www.geeksforgeeks.org/how-to-become-data-scientist-a-complete-roadmap/")
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/what-is-data-science/")
            startActivity(intent)
        }
        resource.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.simplilearn.com/tutorials/data-science-tutorial/what-is-data-science")
            startActivity(intent)
        }
        course1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/datascience/")
            startActivity(intent)
        }
        course2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/data-science-and-machine-learning-with-python-hands-on/")
            startActivity(intent)
        }
        course3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/data-science-and-machine-learning-bootcamp-with-r/")
            startActivity(intent)
        }
        course4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/python-coding/")
            startActivity(intent)

        }
        course5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=BLW_nit5Hg8&list=PLrk5tgtnMN6RXbt-LDwyYq-3YyoonkW26")
            startActivity(intent)
        }
        course6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=X3paOmcrTjQ&list=PLEiEAq2VkUUIEQ7ENKU5Gv0HpRDtOphC6")
            startActivity(intent)
        }
        course7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/topics/data-science-projects")
            startActivity(intent)
        }
    }
}