package com.example.lab1_mob201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lab11MainActivity2 extends AppCompatActivity {
    EditText edt1,edt2;
    Button btnStart,btnStop;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab11_main2);
        intent = new Intent(this,Service1.class);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnStart = findViewById(R.id.btnStar);
        btnStop = findViewById(R.id.btnStop);

    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        String ten = edt1.getText().toString();
        String ma = edt2.getText().toString();
        intent.putExtra("ten",ten);
        intent.putExtra("ma",ma);
            startService(intent);

        }
    });
    btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            stopService(intent);
        }
    });

    }
}