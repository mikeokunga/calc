package com.example.intro5966

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalcActivity : AppCompatActivity() {
    lateinit var tv_myanswer:TextView
    lateinit var edt_myfnum:EditText
    lateinit var edt_mysnum:EditText
    lateinit var btn_myaddD:Button
    lateinit var btn_mysub:Button
    lateinit var btn_mydivv:Button
    lateinit var btn_mymult:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        tv_myanswer =findViewById(R.id.tv_answer)
        edt_myfnum =findViewById(R.id.edt_fnum)
        edt_mysnum =findViewById(R.id.edt_snum)
        btn_mysub = findViewById(R.id.btn_sub)
        btn_mydivv =findViewById(R.id.btn_div)
        btn_mymult =findViewById(R.id.btn_mult)
        btn_myaddD =findViewById(R.id.btn_add)

        btn_myaddD.setOnClickListener {
            val firstnum=edt_myfnum.text.toString()
            val secondnum=edt_mysnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                tv_myanswer.text="please fill in all detail"

            }else{
                val answer =firstnum.toDouble()+ secondnum.toDouble()
                tv_myanswer.text=answer.toString()
            }
        }
        btn_mysub.setOnClickListener {
            val firstnum=edt_myfnum.text.toString()
            val secondnum=edt_mysnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                tv_myanswer.text="please fill in all detail"

            }else{
                val answer =firstnum.toDouble()- secondnum.toDouble()
                tv_myanswer.text=answer.toString()
            }
        }

        btn_mydivv.setOnClickListener {
            val firstnum = edt_myfnum.text.toString()
            val secondnum = edt_mysnum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                tv_myanswer.text = "please fill in all detail"

            } else {
                val answer = firstnum.toDouble() / secondnum.toDouble()
                tv_myanswer.text = answer.toString()
            }
        }
        btn_mymult.setOnClickListener {
            val firstnum=edt_myfnum.text.toString()
            val secondnum=edt_mysnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                tv_myanswer.text="please fill in all detail"

            }else {
                val answer = firstnum.toDouble() * secondnum.toDouble()
                tv_myanswer.text = answer.toString()
            }
        }
    }
}