package com.example.ejercicioparcialuno;

public class Imc {
    public double resultado;
    public String rango;
    public String riesgo;

    public double calcularImc(double peso, double altura) {
       resultado = Math.round( peso / (altura * altura));
       return resultado;
    }

    public String validarRango(double resultado) {
        if (resultado >= 18.5 && resultado <= 24.9) {
            rango = "Normal";
            return rango;
        }
        if (resultado >= 25 && resultado <= 29.9) {
            rango = "Sobrepeso";
            return rango;
        }
        if (resultado >= 30 && resultado <= 34.9) {
            rango = "Obesidad grado I";
            return rango;
        }
        if (resultado >= 35 && resultado <= 39.9) {
            rango = "Obesidad grado II";
            return rango;
        }
        if (resultado > 40) {
            rango = "Obesidad grado III";
            return rango;
        }
        rango="Fuera de rango";
        return rango;
    }

    public String validarRiesgo(String rango){
        switch (rango){
            case("Normal"):
                riesgo = "Promedio";
               break;
            case("Sobrepeso"):
                riesgo = "Aumentado";
                break;
            case("Obesidad grado I"):
                riesgo = "Moderado";
                break;
            case("Obesidad grado II"):
                riesgo = "Severo";
                break;
            case("Obesidad grado III"):
                riesgo = "Muy Severi";
            break;
        }
        return riesgo;
    }

}
