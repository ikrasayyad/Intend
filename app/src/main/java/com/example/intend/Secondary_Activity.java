package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secondary_Activity extends AppCompatActivity {

    Button button_to_secondary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        button_to_secondary = findViewById(R.id.button_2_activity);

        button_to_secondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Secondary_Activity.this, MainActivity.class));
            }
        });

    }
}