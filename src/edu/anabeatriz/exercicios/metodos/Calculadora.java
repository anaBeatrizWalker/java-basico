package edu.anabeatriz.exercicios.metodos;

/* Calcule as 4 operações matemáticas básicas passando sempre 2 valores */

public class Calculadora {

    public static void somar(int valor1, int valor2){
        int resultado = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + resultado);
    }

    public static void subtrair(int valor1, int valor2){
        int resultado = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + resultado);
    }

    public static void dividir(int valor1, int valor2){
        int resultado = valor1 / valor2;
        System.out.println(valor1 + " / " + valor2 + " = " + resultado);
    }

    public static void multiplicar(int valor1, int valor2){
        int resultado = valor1 * valor2;
        System.out.println(valor1 + " * " + valor2 + " = " + resultado);
    }
}
