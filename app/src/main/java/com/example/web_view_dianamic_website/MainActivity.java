package com.example.web_view_dianamic_website;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editiD);
        b1=findViewById(R.id.btnID);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii =new Intent(getApplicationContext(), MainActivity2.class);
                String a=e1.getText().toString().trim();
                String b="https://";
                String c=b.concat(a);




                ii.putExtra("key1",c);

                startActivity(ii);




            }
        });

    }
}