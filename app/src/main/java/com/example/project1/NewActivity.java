package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView txtGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        txtGreet = findViewById(R.id.txtGreetID);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String greet = extras.getString("greetings");
            txtGreet.setText(greet);
        }

    }
}