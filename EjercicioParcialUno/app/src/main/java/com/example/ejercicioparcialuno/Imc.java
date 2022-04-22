package com.example.ejercicioparcialuno;

public class Imc {
    double peso;
    double altura;
    double resultado;
    String[] niveles;
    String rango;
    String riesgo;

    public Imc(double peso, double altura){
        this.peso=peso;
        this.altura=altura;
    }

    public double calcularImc(double peso, double altura){
        resultado = (peso) /(altura*altura);
        return resultado;
    }

    public String[] validarRango(double resultado){

        if(resultado >= 18.5 && resultado <= 24.9) {
            rango = "Normal";
            riesgo = "Promedio";
            String[] niveles = {rango,riesgo};
            return niveles;
        }
        if(resultado >= 25 && resultado <= 29.9)
        {
            rango="Sobrepeso";
            riesgo="Aumentado";
            String[] niveles = {rango,riesgo};
            return niveles;
        }
        if(resultado >= 30 && resultado <= 34.9)
        {
            rango="Obesidad grado I";
            riesgo="Moderado";
            String[] niveles = {rango,riesgo};
            return niveles;
        }
        if(resultado >= 35 && resultado <= 39.9)
        {
            rango="Obesidad grado II";
            riesgo="Severo";
            String[] niveles = {rango,riesgo};
            return niveles;
        }
        if(resultado> 40)
        {
            rango="Obesidad grado III";
            riesgo="Muy Severo";
            String[] niveles = {rango,riesgo};
            return niveles;
        }

        return null;
    }
}
