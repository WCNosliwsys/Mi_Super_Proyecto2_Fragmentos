package com.ditec.mi_super_proyecto2_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView txtdetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        txtdetalle=findViewById(R.id.TxtDetalle);
        txtdetalle.setText("De: "+ getIntent().getExtras().getString("de")+
                " Asunto: "+ getIntent().getExtras().getString("asunto")+
                " Contenido: "+ getIntent().getExtras().getString("texto"));
    }
}