package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoImcActivity extends AppCompatActivity {
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
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "");
        //Toast.makeText(getApplicationContext(), "Hola "+name, Toast.LENGTH_LONG).show();
        mostrarNombreUsuario.setText(name);
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


}