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

public class KodeKeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_keluarga);

        Button masuk = findViewById(R.id.btn_masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(KodeKeluarga.this,Biodata.class);
                startActivity(intent1);
                finish();
            }
        });


    }
}