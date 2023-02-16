package edu.anabeatriz.exercicios.loops;

import java.util.Scanner;

/* Faça  um programa que peça n números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares. */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int quantidade;

        System.out.println("Digite a quantidade de números: ");
        quantidade = scan.nextInt();

        int contador = 0;

        int numero;
        int quantPares = 0, quantImpares = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            contador++;
        } while(contador < quantidade);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);
    }
}
