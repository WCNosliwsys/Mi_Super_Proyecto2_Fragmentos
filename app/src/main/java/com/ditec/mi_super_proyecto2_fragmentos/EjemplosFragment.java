package com.ditec.mi_super_proyecto2_fragmentos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import com.ditec.mi_super_proyecto2_fragmentos.ejemplo1.MainActivity;

public class EjemplosFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos_fragment);
    }

    public void ejemplo1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void ejemplo2(View view) {
        startActivity(new Intent(this, ListaCorreo.class));
    }


    public void ejemplo3(View view) {
        startActivity(new Intent(this, MainFragmentCorreo.class));
    }
}