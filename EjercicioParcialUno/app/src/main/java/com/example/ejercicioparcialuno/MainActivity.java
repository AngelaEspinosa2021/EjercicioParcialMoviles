package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView tituloMenuPpal;
    public TextView nombreUsuario;
    public EditText txtNombreUsuario;
    public Button btnImc;
    public Button btnTemperatura;
    public Button btnCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentAtributes();
        setContentViewEvents();
        }

    private void setContentViewEvents() {
        btnImc.setOnClickListener(this);
    }

    public void setContentAtributes(){
        tituloMenuPpal=findViewById(R.id.tituloMenuPpal);
        nombreUsuario=findViewById(R.id.nombreUsuario);
        txtNombreUsuario=findViewById(R.id.txtNombreUsuario);
        btnImc=findViewById(R.id.btnImc);
        btnTemperatura=findViewById(R.id.btnTemperatura);
        btnCalculadora=findViewById(R.id.btnCalculadora);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnImc:
                goToBtnImcAction();
        }
    }

    private void goToBtnImcAction() {
        //Toast.makeText(this, "Diste Click para IMC", Toast.LENGTH_LONG).show();
        SharedPreferences sp = getSharedPreferences("nombreUsuario",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", txtNombreUsuario.getText().toString());
        editor.commit();

        Intent intent = new Intent(MainActivity.this,CalculoImcActivity.class);
        startActivity(intent);
    }
}