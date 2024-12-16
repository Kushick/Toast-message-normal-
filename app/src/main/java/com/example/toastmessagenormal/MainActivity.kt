package com.example.toastmessagenormal

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toastmessagenormal.R.id.btn_toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creating & initializing variable
        val btn=findViewById<Button>(R.id.btn_toast)
        val cus_btn=findViewById<Button>(R.id.cus_btn_toast)

        //showing toast when clicking
        btn.setOnClickListener{
            Toast.makeText(this, "Toast of normal button!", Toast.LENGTH_SHORT).show() //(where the toast will show,message,message duration)
        }

        //showing toast when clicking
        cus_btn.setOnClickListener{
            Toast.makeText(this, "Toast of custom button!", Toast.LENGTH_LONG).show() //(where the toast will show,message,message duration)
        }
    }
}