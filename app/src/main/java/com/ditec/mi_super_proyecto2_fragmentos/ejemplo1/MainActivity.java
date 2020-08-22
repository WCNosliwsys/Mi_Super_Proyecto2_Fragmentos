package com.ditec.mi_super_proyecto2_fragmentos.ejemplo1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ditec.mi_super_proyecto2_fragmentos.R;

public class MainActivity extends AppCompatActivity {

    Spinner mispinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mispinner = findViewById(R.id.mispinner);
        mispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,(String)mispinner.getSelectedItem() , Toast.LENGTH_SHORT).show();
                Fragment FragmentoSeleccionado = null;
                switch (i){
                    case 0:
                        FragmentoSeleccionado= new ListaFragmento();
                        break;
                    case 1:
                        FragmentoSeleccionado= new GridFragmento();
                }
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmento,FragmentoSeleccionado);
                transaction.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
