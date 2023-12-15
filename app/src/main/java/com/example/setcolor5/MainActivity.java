package com.example.setcolor5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button r=findViewById(R.id.r);
        Button g=findViewById(R.id.g);
        Button b=findViewById(R.id.b);
        View v = findViewById(R.id.v);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundColor(getResources().getColor(R.color.redd));
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundColor(Color.GREEN);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundColor(Color.BLUE);
            }
        });
    }
}