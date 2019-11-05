package com.example.falsedialer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        if(getIntent().getData() != null)
        {
            tvResult.setText(getIntent().getData().toString());
        }
        else
        {
            tvResult.setText("No data received!");
        }
    }
}
