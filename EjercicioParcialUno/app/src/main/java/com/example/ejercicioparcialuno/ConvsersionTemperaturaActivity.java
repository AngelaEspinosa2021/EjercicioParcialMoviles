package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ConvsersionTemperaturaActivity extends AppCompatActivity {
    public TextView nombreUsuarioTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convsersion_temperatura);
        setContentAtributes();
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "");
        nombreUsuarioTemp.setText(name);
    }

    private void setContentAtributes() {
        nombreUsuarioTemp=findViewById(R.id.nombreUsuarioTemp);

    }
}