package com.example.ejercicioparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ConvsersionTemperaturaActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView nombreUsuarioTemp, txtTemperatura;
    public Button btnConvertirTemp, btnMenuPpal;
    public RadioButton celsius, fahrenheit, kelvin;
    public TextView temperatura1,temperatura2, valorTemp1,valorTemp2;
    public RadioGroup radioTemp;
    Temperatura convertTemp = new Temperatura();


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
        btnMenuPpal.setOnClickListener(this);
    }

    private void setContentAtributes() {
        nombreUsuarioTemp = findViewById(R.id.nombreUsuarioTemp);
        btnConvertirTemp = findViewById(R.id.btnConvertirTemp);
        celsius = findViewById(R.id.celsius);
        fahrenheit = findViewById(R.id.fahrenheit);
        kelvin = findViewById(R.id.kelvin);
        temperatura1 = findViewById(R.id.temperatura1);
        temperatura2 = findViewById(R.id.temperatura2);
        valorTemp1 = findViewById(R.id.valorTemp1);
        valorTemp2 = findViewById(R.id.valorTemp2);
        btnMenuPpal = findViewById(R.id.btnMenuPpal);
        txtTemperatura = findViewById(R.id.txtTemperatura);
        radioTemp = findViewById(R.id.radio_temperatura);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnConvertirTemp:
                convertirTempAction();
                break;
            case R.id.btnMenuPpal:
                goToMenuPpalAction();
                break;

        }
    }

    private void goToMenuPpalAction() {
        Intent intent = new Intent(ConvsersionTemperaturaActivity.this,MainActivity.class);
        startActivity(intent);
    }

    private void convertirTempAction() {
        double temperatura = Double.parseDouble(txtTemperatura.getText().toString());

        if(celsius.isChecked())
        {
            temperatura1.setText("Fahrenheit:");
            valorTemp1.setText(convertTemp.converCelsius_Fahrenheit(temperatura));
            temperatura2.setText("Kelvin:");
            valorTemp2.setText(convertTemp.converCelsius_Kelvin(temperatura));
        }

        if(fahrenheit.isChecked())
        {
            temperatura1.setText("Celsius:");
            valorTemp1.setText(convertTemp.converFahrenheit_Celsius(temperatura));
            temperatura2.setText("Kelvin:");
            valorTemp2.setText(convertTemp.converFahrenheit_Kelvin(temperatura));

        }
        if(kelvin.isChecked())
        {
            temperatura1.setText("Celsius:");
            valorTemp1.setText(convertTemp.converKelvin_Celsius(temperatura));
            temperatura2.setText("Fahrenheit:");
            valorTemp2.setText(convertTemp.converkelvin_Fahrenheit(temperatura));
        }

    }

}