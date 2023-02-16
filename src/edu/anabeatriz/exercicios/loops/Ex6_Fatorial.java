package edu.anabeatriz.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. 
 * Ex: 5! = 120
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        for(int i = numero; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(numero + "! = " + multiplicacao);
    }
}
