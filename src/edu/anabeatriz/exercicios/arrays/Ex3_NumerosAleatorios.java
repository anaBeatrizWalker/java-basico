package edu.anabeatriz.exercicios.arrays;

import java.util.Random;

/* Faça um programa que leia 20 números inteiros aleatórios entre 0 e 100 armazene-os num vetor e ao final mostre os números e seus sucessores */

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        
        //Classe array que gera números aleatórios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        
        System.out.println("Lista de números aleatórios: ");
        for (int elemento : numerosAleatorios) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nLista de sucessores dos números aleatórios: ");
        for (int elemento : numerosAleatorios) {
            System.out.print((elemento + 1) + " ");
        }
    }
}
