package com.example.android_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView urlText;
    private Button btnPrev;
    private Button btnNext;
    private String pictureUrl = "http://myfile.org/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        int pictureIndex = (int) (Math.random() * 101);
        urlText.setText(pictureUrl + pictureIndex);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void init() {
        btnPrev = findViewById(R.id.button1);
        btnNext = findViewById(R.id.button2);
        urlText = findViewById(R.id.urlText);
    }
}
