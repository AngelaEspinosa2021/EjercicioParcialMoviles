package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConvsersionTemperaturaActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView nombreUsuarioTemp;
    public Button btnConvertirTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convsersion_temperatura);
        setContentAtributes();
        setContentViewEvents();
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "");
        nombreUsuarioTemp.setText(name);
    }

    private void setContentViewEvents() {
        btnConvertirTemp.setOnClickListener(this);
    }

    private void setContentAtributes() {
        nombreUsuarioTemp = findViewById(R.id.nombreUsuarioTemp);
        btnConvertirTemp = findViewById(R.id.btnConvertirTemp);

    }

    @Override
    public void onClick(View view){
        convertirTempAction();
    }

    private void convertirTempAction() {
    }

}