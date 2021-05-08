package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// NIM     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
// Tanggal : 07-05-2021

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mulai= findViewById(R.id.btn_mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,KodeKeluarga.class);
                startActivity(intent);
                finish();

            }
        });

    }
}