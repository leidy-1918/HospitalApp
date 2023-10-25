package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AceptacionInscripcionActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion_inscripcion);

        Intent intent = getIntent();
        Donante donante = (Donante) intent.getSerializableExtra("donante");

        if (donante != null) {
            TextView tvNombre = findViewById(R.id.tvNombre);
            TextView tvEdad = findViewById(R.id.tvEdad);
            TextView tvTipoSangre = findViewById(R.id.tvTipoSangre);
            TextView tvAptoParaDonar = findViewById(R.id.tvAptoParaDonar);

            tvNombre.setText("Nombre: " + donante.getNombre());
            tvEdad.setText("Edad: " + donante.getEdad());
            tvTipoSangre.setText("Tipo de Sangre: " + donante.getTipoSangre());
            tvAptoParaDonar.setText("Apto para Donar: " + (donante.isAptoParaDonar() ? "Sí" : "No"));
        }
    }
}

