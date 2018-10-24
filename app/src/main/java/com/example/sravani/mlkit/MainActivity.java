package com.example.sravani.mlkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button recogText;
    private Button detectFace;
    private Button recogLand;
    private Button labImg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recogText = (Button) findViewById(R.id.recText1);
        detectFace = (Button) findViewById(R.id.faceDet1);
        recogLand = (Button)findViewById(R.id.recLand);
        labImg = (Button) findViewById(R.id.labImage);

        recogText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, recText.class));
            }
        });
        detectFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FaceDetect.class));
            }
        });
        labImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, labelImg.class));
            }
        });
        recogLand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Not available, upgrade to Blaze plan", Toast.LENGTH_LONG).show();
                    }
        });


    }


}
