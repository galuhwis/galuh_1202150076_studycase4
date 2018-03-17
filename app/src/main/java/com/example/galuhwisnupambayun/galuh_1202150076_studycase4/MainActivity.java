package com.example.galuhwisnupambayun.galuh_1202150076_studycase4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list,pencarigambar;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.menu_listmahasiswa);
        //menu list mahasiswa
        pencarigambar = findViewById(R.id.menu_pencarigambar);
        //menu pencarian gambar

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //untuk menampilkan menu selanjutnya dari list mahasiswa
                Intent a = new Intent(MainActivity.this,ListNamaMahasiswa.class);
                startActivity(a);
            }
        });

        pencarigambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menampilkan pencarian gambar dari link
                Intent b = new Intent(MainActivity.this,PencariGambar.class);
                startActivity(b);
            }
        });
    }
}