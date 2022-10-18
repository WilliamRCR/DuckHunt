package com.proyect.duckhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import common.Constantes;

public class LoginActivity extends AppCompatActivity {
    EditText etNick;
    Button btnStart;
    String nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNick = findViewById(R.id.editTextTextNick);
        btnStart = findViewById(R.id.buttonStart);

        //Eventos
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nick = etNick.getText().toString();

                if(nick.isEmpty()){
                    etNick.setError("El nombre de usuario es obligatorio");
                } else {
                    Intent i = new Intent(LoginActivity.this, GameActivity.class);
                    i.putExtra(Constantes.ExtraNick, nick);
                    startActivity(i);
                }
            }
        });
    }
}