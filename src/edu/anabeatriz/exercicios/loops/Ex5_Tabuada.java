package edu.anabeatriz.exercicios.loops;

import java.util.Scanner;

/* Faça um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 0 e 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saíde deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5: 
 * 5 x 0 = 0
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ": ");

        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

    }
}
