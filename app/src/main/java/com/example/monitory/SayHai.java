package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// NIM     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
// Tanggal : 07-05-2021

public class SayHai extends AppCompatActivity {

    private TextView nama;
    private String Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        nama = findViewById(R.id.txt_nama);

        Intent i = getIntent();
        Nama = i.getStringExtra("dataNama");


        nama.setText(Nama);
    }
}