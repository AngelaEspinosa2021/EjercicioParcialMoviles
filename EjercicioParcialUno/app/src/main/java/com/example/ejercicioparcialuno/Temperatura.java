package com.example.ejercicioparcialuno;

public class Temperatura {
    double resultado;
    String resultadoTemp;

    public String converCelsius_Fahrenheit(double temperatura){
        resultado = Math.round((temperatura * 1.8  ) + 32);
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

    public String converCelsius_Kelvin(double temperatura){
        resultado = Math.round((temperatura + 273.15));
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

    public String converFahrenheit_Celsius(double temperatura){
        resultado = Math.round((temperatura - 32) / 1.8);
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

    public String converFahrenheit_Kelvin(double temperatura){
        resultado = (((temperatura - 32) + 273.15)* (5 / 9));
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

    public String converKelvin_Celsius(double temperatura){
        resultado = Math.round(temperatura - 273.15);
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

    public String converkelvin_Fahrenheit(double temperatura){
        resultado = Math.round(((temperatura - 273.15) * 1.8) + 32);
        resultadoTemp = String.valueOf(resultado);
        return resultadoTemp;
    }

}
