package edu.anabeatriz.exercicios.metodos.sobrecarga;

/* Usando a sobrecarga, calcular a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio. */

public class Quadrilatero {
    
    public static void area(double lado) {
        System.out.println("\nÁrea do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("\nÁrea do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("\nÁrea do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    //Bônus
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("\nÁrea do losango:" + (diagonal1 * diagonal2)/2);
    }
}
