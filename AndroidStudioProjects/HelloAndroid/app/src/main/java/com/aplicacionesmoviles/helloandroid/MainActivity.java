package com.aplicacionesmoviles.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    // extiende appcompact activity, todas las actividades la entienden y
    // tienen que sobre escribir, el metodo oncreate.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mostrar el UI de usuario, y esta en R resotces y pone el layout. activity main

        Log.d("MainActivity", "Primer mensajes para depurar");
        System.out.println("MainActivity: Otro mensaje");

    }
}