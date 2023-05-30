package com.example.intro5966

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity : AppCompatActivity() {
    lateinit var Button_culc:Button
    lateinit var Button_intent:Button
    lateinit var Button_web:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button_culc=findViewById(R.id.btn_calc)
        Button_intent=findViewById(R.id.btn_intent)
        Button_web=findViewById(R.id.btn_web)

        Button_culc.setOnClickListener {
            val Calc = Intent(this, CalcActivity::class.java)
            startActivity(Calc)
        }

            Button_intent.setOnClickListener {
                val intent = Intent(this, intentActivity::class.java)
                startActivity(intent)
            }

                Button_web.setOnClickListener {
                    val web=Intent( this,webActivity::class.java)
                    startActivity(web)
        }
    }
}

