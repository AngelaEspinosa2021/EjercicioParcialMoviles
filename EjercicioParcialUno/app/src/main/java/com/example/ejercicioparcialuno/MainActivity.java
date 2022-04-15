package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
    }

    public void setContentAtributes(){
        tituloMenuPpal=findViewById(R.id.tituloMenuPpal);
        nombreUsuario=findViewById(R.id.nombreUsuario);
        txtNombreUsuario=findViewById(R.id.txtNombreUsuario);
        btnImc=findViewById(R.id.btnImc);
        btnTemperatura=findViewById(R.id.btnTemperatura);
        btnCalculadora=findViewById(R.id.btnCalculadora);
    }
}