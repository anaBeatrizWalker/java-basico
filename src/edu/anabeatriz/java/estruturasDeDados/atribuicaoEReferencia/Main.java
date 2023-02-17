package edu.anabeatriz.java.estruturasDeDados.atribuicaoEReferencia;

public class Main {
    public static void main(String[] args) {
        
        //Com tipos primitivos
        int a = 1;
        int b = a;

        System.out.println("a = " + a + " b = " + b); //a = 1 b = 1

        a = 2;

        System.out.println("a = " + a + " b = " + b); //a = 2 b = 1

        //Com objetos
        Objeto objA = new Objeto(1);
        Objeto objB = objA;

        System.out.println("objA = " + objA + " objB = " + objB); //objA = 1 objB = 1

        objA.setNum(2);

        System.out.println("objA = " + objA + " objB = " + objB); //objA = 2 objB = 2

    }
}
