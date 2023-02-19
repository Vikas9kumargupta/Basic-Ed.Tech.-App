package com.example.assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class BLOCK_CHAIN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain)

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
            intent.data = Uri.parse("https://roadmap.sh/blockchain")
            startActivity(intent)
        }
        cardView2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/blockchain-technology-introduction/")
            startActivity(intent)
        }
        resource.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.cyberbahnit.com/blockchain/")
            startActivity(intent)
        }
        course1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/build-your-blockchain-az/?ranMID=39197&ranEAIDJVFxdTr9V80&ranSiteID=JVFxdTr9V80-yFhUZjnXSXQ7Es9TuqhntA&LSNPUBID=JVFxdTr9V80&utm_source=aff-campaign&utm_medium=udemyads")
            startActivity(intent)
        }
        course2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/ethereum-and-solidity-the-complete-developers-guide/?ranMID=39197&ranEAID=JVFxdTr9V80&ranSiteID=JVFxdTr9V80-.mQTCtB2A9ArBz2aGrULIg&LSNPUBID=JVFxdTr9V80&utm_source=aff-campaign&utm_medium=udemyads")
            startActivity(intent)
        }
        course3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/blockchain-and-bitcoin-fundamentals/")
            startActivity(intent)
        }
        course4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.udemy.com/course/hyperledger/")
            startActivity(intent)

        }
        course5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/playlist?list=PLgPmWS2dQHW-BRQCQCNYgmHUfCN115pn0")
            startActivity(intent)
        }
        course6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=6aF6p2VUORE")
            startActivity(intent)
        }
        course7.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/topics/blockchain")
            startActivity(intent)
        }
    }
}