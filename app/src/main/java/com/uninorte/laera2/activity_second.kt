package com.uninorte.laera2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        actionBar?.hide()

        val curso1 = findViewById<ImageButton>(R.id.imageButton_python)
        curso1.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S9uPNppGsGo&list=PLHz_AreHm4dlKP6QQCekuIPky1CiwmdI6"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso2 = findViewById<ImageButton>(R.id.imageButton_java)
        curso2.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sTX0UEplF54&list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso3 = findViewById<ImageButton>(R.id.imageButton_Dollar)
        curso3.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yRtjuTTGhh4&list=PLrfk0nlDFiXNOKANeZ-HDyaZew5AqkEaq"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso4 = findViewById<ImageButton>(R.id.imageButton_Costura)
        curso4.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SL9DiM8PMvA"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso5 = findViewById<ImageButton>(R.id.imageButton_Gastronomia)
        curso5.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8FYfy33SAeA&list=PLkQ6jjj52roiYogDGO9oXANRRdJ3qxOtU"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso6 = findViewById<ImageButton>(R.id.imageButton_Youtuber)
        curso6.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=83wExY1qQ1g&t=2s"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso7 = findViewById<ImageButton>(R.id.imageButton_Portugues)
        curso7.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zd8_NUqoZH4&list=PLonj8APB8U2gpcVuB0dULMCHpaZQrCpvg"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }
        val curso8 = findViewById<ImageButton>(R.id.imageButton_cursoingles)
        curso8.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=00ltEc3sEEQ"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("force_fullscreen", true)
            startActivity(intent)
        }

    }

}