package com.example.alc4phase1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
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
        wView.loadUrl("https://andela.com/alc/");
        wView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        wView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

      wView.getSettings().setJavaScriptEnabled(true);
        wView.getSettings().setDomStorageEnabled(true);
       wView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
       wView.getSettings().setLoadWithOverviewMode(true);
        wView.getSettings().setUseWideViewPort(true);
       wView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
    }


}




