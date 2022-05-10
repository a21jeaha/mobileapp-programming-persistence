package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button readButton;
    Button writeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readButton = findViewById(R.id.Read_Button);
        writeButton = findViewById(R.id.Write_Button);

        readButton.setOnClickListener(new View.OnClickListener() {        // GÖR KLART SENARE
            @Override
            public void onClick(View v) {

            }
        });

        writeButton.setOnClickListener(new View.OnClickListener() {        // GÖR KLART SENARE
            @Override
            public void onClick(View v) {

            }
        });

    }
}
