package edu.anabeatriz.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número e a média desses números */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;

        int contador = 0;

        int maior = 0;

        int soma = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            soma = soma + numero;

            contador = contador + 1;
        } while(contador < 5);

        System.out.println("O maior número é: " + maior);

        System.out.println("A média dos números é: " + soma / 5);

    }
}
