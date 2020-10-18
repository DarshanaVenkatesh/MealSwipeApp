package com.example.mealswipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private ImageButton qdobaButton;
    private ImageButton cfaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cfaButton = (ImageButton) findViewById(R.id.cfaButton);
        cfaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencfaButtonActivity();
            }
        });



        qdobaButton = (ImageButton) findViewById(R.id.qdobaButton);
        qdobaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openqdobaButtonActivity();
            }
        });
    }

    public void opencfaButtonActivity(){
        Intent intent= new Intent(this,cfaButtonActivity.class);
        startActivity(intent);
    }

    public void openqdobaButtonActivity(){
        Intent intent= new Intent(this,qdobaButtonActivity.class);
        startActivity(intent);

    }





}
