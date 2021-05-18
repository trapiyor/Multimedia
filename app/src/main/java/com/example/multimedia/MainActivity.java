package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGato, btnPerro;
    Button btnLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGato = (ImageButton) findViewById(R.id.btnGato);
        btnPerro = (ImageButton) findViewById(R.id.btnPerro);
        btnLlamar = (Button) findViewById(R.id.btnLlamar);

        // Reproducir el mp3
        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Maullar();
            }
        });

        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ladrar();
            }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form2 = new Intent(MainActivity.this, Formulario2Activity.class);
                startActivity(form2);
            }
        });
    }

    private void Ladrar() {
        MediaPlayer mpPerro = MediaPlayer.create(MainActivity.this, R.raw.ladra);
        mpPerro.start();
    }

    private void Maullar() {
        MediaPlayer mpGato = MediaPlayer.create(MainActivity.this, R.raw.miau);
        mpGato.start();
    }
}