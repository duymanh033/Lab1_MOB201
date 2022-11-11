package com.example.lab1_mob201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab12MainActivity2 extends AppCompatActivity {
    EditText edt1,edt2;
    Button btn1;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab12_main2);
        intent = new Intent(this,Service2.class);
        edt1 = findViewById(R.id.lab12edt1);
        edt2 = findViewById(R.id.lab12edt2);
        btn1 = findViewById(R.id.btnTim);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputChar = edt1.getText().toString();
                char[] c =inputChar.toCharArray();

                String chuoicancheck = edt2.getText().toString();
                intent.putExtra("char",c[0]);
                intent.putExtra("chk",chuoicancheck);
                startService(intent);


            }
        });
    }
}