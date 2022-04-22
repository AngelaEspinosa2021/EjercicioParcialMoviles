package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    public TextView nombreUsuarioCalc;
    public EditText pantallaCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        setContentAtributes();
        SharedPreferences spGet4 = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet4.getString("Nombre", "");
        nombreUsuarioCalc.setText(name);
    }

    private void setContentAtributes() {
        nombreUsuarioCalc = findViewById(R.id.nombreUsuarioCalc);
        pantallaCalculadora = findViewById(R.id.pantallaCalculadora);
    }
}