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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);
        setContentAtributes();
        setContentViewEvents();
        SharedPreferences spGet = getSharedPreferences("datosUsuario", MODE_PRIVATE);
        String altura = spGet.getString("Altura", "");
        String peso = spGet.getString("Peso", "");
        nombreUsuarioResultImc.setText(peso);
    }

    private void setContentViewEvents() {
        btnRegresarMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnRegresarMain:
                goToMainPpalAction();
        }
    }

    private void goToMainPpalAction() {
        Intent intent = new Intent(ResultadoImcActivity.this,MainActivity.class);
        startActivity(intent);
    }

    private void setContentAtributes() {
        saludo=findViewById(R.id.saludo);
        nombreUsuarioResultImc=findViewById(R.id.nombreUsuarioResultImc);
        btnRegresarMain=findViewById(R.id.btnRegresarMain);
    }
}