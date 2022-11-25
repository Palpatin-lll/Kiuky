package com.example.kyukiproject

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class mapscardboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapscardboard)

        val button = findViewById<Button>(R.id.btn_back1)
        button.setOnClickListener{
            val intent = Intent(this@mapscardboard, MainMenu::class.java)
            startActivity(intent)
        }

        val webView1 = findViewById<WebView>(R.id.webViewCardboard)
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("https://recyclemap.ru/?id=37333")

        val webViewClient: WebViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }

            @TargetApi(Build.VERSION_CODES.N)
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                view.loadUrl(request.url.toString())
                return true
            }
        }
        webView1.setWebViewClient(webViewClient);
    }
}