package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class WEB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

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
            intent.data = Uri.parse("https://roadmap.sh/")
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/web-development/")
            startActivity(intent)
        }
        resource.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/whatis/")
            startActivity(intent)
        }
        course1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/become-a-certified-web-developer/")
            startActivity(intent)
        }
        course2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/web-developer-course/")
            startActivity(intent)
        }
        course3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/the-complete-web-developer-course-2/")
            startActivity(intent)
        }
        course4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n")
            startActivity(intent)

        }
        course5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agiCUZYRsvtGTXdxkzPyItg")
            startActivity(intent)
        }
        course6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=EceJQ05KTf4&list=PLwoh6bBAszPrES-EOajos_E9gvRbL27wz")
            startActivity(intent)
        }
        course7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/topics/web-development-project")
            startActivity(intent)
        }
    }
}