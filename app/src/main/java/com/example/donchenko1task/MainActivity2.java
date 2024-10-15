package com.example.donchenko1task;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);
        String surname = getIntent().getStringExtra("surname");

        String message = getString(R.string.parameter_message, surname);
        textView.setText(message);
    }
}