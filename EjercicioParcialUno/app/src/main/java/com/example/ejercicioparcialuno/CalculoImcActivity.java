package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class CalculoImcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "NA");
        Toast.makeText(getApplicationContext(), "Hola "+name, Toast.LENGTH_LONG).show();
    }


}