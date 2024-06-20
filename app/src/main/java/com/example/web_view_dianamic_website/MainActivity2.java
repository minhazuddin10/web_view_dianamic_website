package com.example.web_view_dianamic_website;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        web=findViewById(R.id.webId);

        String data =getIntent().getExtras().getString("key1");
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl(data);

    }
}