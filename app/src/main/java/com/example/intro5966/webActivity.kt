package com.example.intro5966

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webActivity : AppCompatActivity() {
    lateinit var myWebView:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
   myWebView=findViewById(R.id.Webview)
        instagram()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun  instagram(){
        myWebView.webViewClient= WebViewClient()
        myWebView.apply {
            loadUrl("https://www.instagram.com/")
            settings. javaScriptEnabled
            settings. safeBrowsingEnabled
        }
    }
}