package com.abhishekchoksi.multiscreenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Result");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        textView = findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String mydata = extras.getString("mydata");

            textView.setText(mydata);
        }
    }
    }