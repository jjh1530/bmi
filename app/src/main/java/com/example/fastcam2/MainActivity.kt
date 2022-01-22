package com.example.fastcam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height: EditText = findViewById(R.id.et_height)
        val weight: EditText = findViewById(R.id.et_weight)
        val resultButton = findViewById<Button>(R.id.btn_ok)

        resultButton.setOnClickListener {
            if (height.text.isEmpty() || weight.text.isEmpty()) {
                Toast.makeText(this,"값이 비어있습니다.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val height: Int = et_height.text.toString().toInt()
            val weight: Int = et_weight.text.toString().toInt()

            val intent = Intent(this,ResultActivity::class.java)

            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)
        }
    }
}