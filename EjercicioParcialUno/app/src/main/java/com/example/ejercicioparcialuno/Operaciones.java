package com.example.ejercicioparcialuno;

public class Operaciones {

    int numero;
    int numeroAcum;

    public int suma(int numero){
        numeroAcum = numeroAcum + numero;
        return numeroAcum;
    }

    public int resta(int numero){
        numeroAcum = numeroAcum - numero;
        return numeroAcum;
    }

    public int multiplicacion(int numero){
        numeroAcum = numeroAcum * numero;
        return numeroAcum;
    }

    public int division(int division){
        numeroAcum = numeroAcum / numero;
        return numeroAcum;

    }

}
