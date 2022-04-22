package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultadoImcActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView saludo;
    public TextView nombreUsuarioResultImc;
    public Button btnRegresarMain;
    public TextView rango;
    public TextView riesgo;
    public TextView imcUsuario;
    String altura;
    String peso;
    Imc usuario = new Imc();

    double valorImc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);
        setContentAtributes();
        setContentViewEvents();
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "");
        nombreUsuarioResultImc.setText(name);
        Bundle bundle = this.getIntent().getExtras();
        altura = bundle.getString("Altura");
        peso = bundle.getString("Peso");
        mostrarResultado();
    }

    private void setContentViewEvents() {
        btnRegresarMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        goToMainPpalAction();
    }

    private void mostrarResultado(){
        double valorPeso = Double.parseDouble(peso);
        double valorAltura = Double.parseDouble(altura);
        valorImc = usuario.calcularImc(valorPeso,valorAltura);
        imcUsuario.setText(String.valueOf(valorImc));
        rango.setText(usuario.validarRango(valorImc));
        riesgo.setText(usuario.validarRiesgo(usuario.validarRango(valorImc)));
    }

    private void goToMainPpalAction() {
        Intent intent = new Intent(ResultadoImcActivity.this,MainActivity.class);
        startActivity(intent);
    }

    private void setContentAtributes() {
        saludo=findViewById(R.id.saludo);
        nombreUsuarioResultImc=findViewById(R.id.nombreUsuarioResultImc);
        btnRegresarMain=findViewById(R.id.btnRegresarMain);
        rango=findViewById(R.id.rango);
        riesgo=findViewById(R.id.riesgo);
        imcUsuario=findViewById(R.id.imcUsuario);
    }
}