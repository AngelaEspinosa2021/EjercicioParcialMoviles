package com.example.ejercicioparcialuno;

public class Imc {
    public String peso;
    public String altura;
    public double resultado;
    public String[] imc;
    public String resultImc;
    public String rango;

    public String calcularImc(String peso, String altura) {
        double valorPeso = Double.parseDouble(altura);
        double valorAltura = Double.parseDouble(peso);
        resultado = (valorPeso) / (valorAltura * valorAltura);
        resultImc = String.valueOf(resultado);
        return resultImc;
    }

    public String validarRango(String result) {
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

}
