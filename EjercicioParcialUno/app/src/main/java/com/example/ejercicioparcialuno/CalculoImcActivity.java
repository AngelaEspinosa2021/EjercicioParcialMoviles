package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoImcActivity extends AppCompatActivity implements View.OnClickListener{
    public TextView tituloBienvenida;
    public TextView mostrarNombreUsuario;
    public TextView altura;
    public EditText txtAltura;
    public TextView peso;
    public EditText txtPeso;
    public Button btnCalcularImc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
        setContentAtributes();
        setContentViewEvents();
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "");
        //Toast.makeText(getApplicationContext(), "Hola "+name, Toast.LENGTH_LONG).show();
        mostrarNombreUsuario.setText(name);
    }

    private void setContentViewEvents() {
        btnCalcularImc.setOnClickListener(this);
    }

    public void setContentAtributes()
    {
        tituloBienvenida=findViewById(R.id.tituloBienvenida);
        mostrarNombreUsuario=findViewById(R.id.mostrarNombreUsuario);
        altura=findViewById(R.id.altura);
        txtAltura=findViewById(R.id.txtAltura);
        peso=findViewById(R.id.peso);
        txtPeso=findViewById(R.id.txtPeso);
        btnCalcularImc=findViewById(R.id.btnCalcularImc);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnCalcularImc:
                goToResultImcAction();
        }
    }

    private void goToResultImcAction() {
        SharedPreferences sp1 = getSharedPreferences("datosUsuario",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp1.edit();
        editor.putString("Altura", txtAltura.getText().toString());
        editor.putString("Peso", txtPeso.getText().toString());
        editor.commit();

        Intent intent = new Intent(CalculoImcActivity.this,ResultadoImcActivity.class);
        startActivity(intent);
    }


}