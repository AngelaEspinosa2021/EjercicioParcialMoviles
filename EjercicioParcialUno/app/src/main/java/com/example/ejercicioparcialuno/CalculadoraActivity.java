package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView nombreUsuarioCalc;
    public EditText pantallaCalculadora;
    public Button uno, dos, tres, cuatro, cinco, seis, siete,ocho, nueve, cero;
    public Button suma, resta, multiplicacion, division, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        setContentAtributes();
        setContentViewEvents();
        SharedPreferences spGet4 = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet4.getString("Nombre", "");
        nombreUsuarioCalc.setText(name);
    }

    private void setContentViewEvents() {
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
        total.setOnClickListener(this);
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
        total = findViewById(R.id.total);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.uno:
                goToUnoAction();
                break;
            case R.id.dos:
                goToDosAction();
                break;
            case R.id.tres:
                goToTresAction();
                break;
            case R.id.cuatro:
                goToCuatroAction();
                break;
            case R.id.cinco:
                goToCincoAction();
                break;
            case R.id.seis:
                goToSeisAction();
                break;
            case R.id.siete:
                goToSieteAction();
                break;
            case R.id.ocho:
                goToOchoAction();
                break;
            case R.id.nueve:
                goToNueveAction();
                break;
            case R.id.cero:
                goToCeroAction();
                break;
            case R.id.suma:
                goToSumaAction();
                break;
            case R.id.resta:
                goToRestaAction();
                break;
            case R.id.multiplicacion:
                goToMultiplicacionAction();
                break;
            case R.id.division:
                goToDivisionAction();
                break;
            case R.id.total:
                goToTotalAction();
                break;
        }
    }

    private void goToTotalAction() {
        pantallaCalculadora.setText("=");
    }

    private void goToDivisionAction() {
        pantallaCalculadora.setText("/");
    }

    private void goToMultiplicacionAction() {
        pantallaCalculadora.setText("*");
    }

    private void goToRestaAction() {
        pantallaCalculadora.setText("-");
    }

    private void goToSumaAction() {
        pantallaCalculadora.setText("+");
    }

    private void goToCeroAction() {
        pantallaCalculadora.setText("0");
    }

    private void goToNueveAction() {
        pantallaCalculadora.setText("9");
    }

    private void goToOchoAction() {
        pantallaCalculadora.setText("8");
    }

    private void goToSieteAction() {
        pantallaCalculadora.setText("7");
    }

    private void goToSeisAction() {
        pantallaCalculadora.setText("6");
    }

    private void goToCincoAction() {
        pantallaCalculadora.setText("5");
    }

    private void goToCuatroAction() {
        pantallaCalculadora.setText("4");
    }

    private void goToTresAction() {
        pantallaCalculadora.setText("3");
    }

    private void goToDosAction() {
        pantallaCalculadora.setText("2");
    }

    private void goToUnoAction() {
        pantallaCalculadora.setText("1");
    }
}