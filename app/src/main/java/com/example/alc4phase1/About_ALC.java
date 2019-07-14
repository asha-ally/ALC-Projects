package com.example.alc4phase1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class About_ALC extends AppCompatActivity {
    WebView wView;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);
        wView=findViewById(R.id.wView);
        wView.setWebViewClient(new WebViewClient());
        wView.getSettings().setJavaScriptEnabled(true);
        wView.loadUrl("https://andela.com/alc/");


            }



}
