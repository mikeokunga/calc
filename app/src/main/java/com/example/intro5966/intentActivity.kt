package com.example.intro5966

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class intentActivity : AppCompatActivity() {
    lateinit var Button_sms: Button
    lateinit var Button_share: Button
    lateinit var Button_mpesa: Button
    lateinit var Button_call: Button
    lateinit var Button_dial: Button
    lateinit var Button_camera: Button
    lateinit var Button_email: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Button_sms = findViewById(R.id.btn_sms)
        Button_sms.setOnClickListener {

            val uri = Uri.parse("smsto:07456789")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            startActivity(intent)
        }
        Button_camera= findViewById(R.id.btn_camera)
        Button_camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        Button_share = findViewById(R.id.btn_share)
        Button_share.setOnClickListener {
                val shareIntent = Intent(Intent.ACTION_SEND)

                shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                shareIntent.type = "text/plain"

                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

                startActivity(shareIntent)


        }
        Button_mpesa = findViewById(R.id.btn_mpesa)
        Button_mpesa.setOnClickListener {
            val simToolkitLaunchIntent=
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitLaunchIntent?.let { startActivity(it) }
        }
        Button_call = findViewById(R.id.btn_call)
        Button_call.setOnClickListener {

            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@intentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@intentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }
        Button_dial = findViewById(R.id.btn_dial)
        Button_dial.setOnClickListener {
            Button_dial.setOnClickListener {
                val phone = "0797746447"

                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

                startActivity(intent)

            }
        }
        Button_camera = findViewById(R.id.btn_camera)
        Button_camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }

        Button_email = findViewById(R.id.btn_email)
        Button_email.setOnClickListener {

            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}
