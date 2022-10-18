package com.proyect.duckhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import common.Constantes;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvCounterDucks, tvTimer, tvNick;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvCounterDucks = findViewById(R.id.textViewCounter);
        tvTimer = findViewById(R.id.textViewTimer);
        tvNick = findViewById(R.id.textViewNick);

        //Obtener nick
        Bundle extras = getIntent().getExtras();
        String nick = extras.getString(Constantes.ExtraNick);
        tvNick.setText(nick);


    }
}