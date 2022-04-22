package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    public TextView nombreUsuarioCalc;
    public EditText pantallaCalculadora;
    public Button uno, dos, tres, cuatro, cinco, seis, siete,ocho, nueve, cero;
    public Button suma, resta, multiplicacion, division;

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
        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);
        cero = findViewById(R.id.cero);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        multiplicacion = findViewById(R.id.multiplicacion);
        division = findViewById(R.id.division);
    }
}