package edu.anabeatriz.exercicios.metodos.retorno;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("\nÁrea do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,3);
        System.out.println("\nÁrea do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("\nÁrea do trapézio: " + areaTrapezio);
    }
}
