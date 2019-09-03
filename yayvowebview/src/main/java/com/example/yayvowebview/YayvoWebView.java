package com.example.yayvowebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class YayvoWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yayvo_web_view);
        Log.d("Farzal","Library");
        WebView myWebView = (WebView) findViewById(R.id.yayvo_web_view);
        myWebView.loadUrl("https://tickets.yayvo.com/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
