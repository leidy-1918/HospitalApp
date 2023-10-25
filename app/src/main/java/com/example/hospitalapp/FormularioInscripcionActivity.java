package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class FormularioInscripcionActivity extends MainActivity {

    private EditText etNombre;
    private EditText etEdad;
    private Spinner spnTipoSangre;
    private CheckBox chkApto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_inscripcion);

        etNombre = findViewById(R.id.tvNombre);
        etEdad = findViewById(R.id.tvEdad);
        spnTipoSangre = findViewById(R.id.spnTipoSangre);
        chkApto = findViewById(R.id.tvAptoParaDonar);

        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString();
                int edad = Integer.parseInt(etEdad.getText().toString());
                String tipoSangre = spnTipoSangre.getSelectedItem().toString();
                boolean aptoParaDonar = chkApto.isChecked();

                Donante donante = new Donante(nombre, edad, tipoSangre, aptoParaDonar);

                Intent intent = new Intent(FormularioInscripcionActivity.this, AceptacionInscripcionActivity.class);
                intent.putExtra("donante", donante);
                startActivity(intent);
            }
        });
    }
}





