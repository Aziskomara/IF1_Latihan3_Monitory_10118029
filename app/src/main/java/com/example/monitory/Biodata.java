package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// NIM     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
// Tanggal : 07-05-2021

public class Biodata extends AppCompatActivity {

    private EditText edt_Nama;
    private String nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        edt_Nama = findViewById(R.id.edt_nama);

        Button sl = findViewById(R.id.btn_selanjutnya);
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nm = edt_Nama.getText().toString();

                Intent i = new Intent(Biodata.this,SayHai.class);
                i.putExtra("dataNama",nm);
                startActivity(i);
                finish();
            }
        });


    }
}