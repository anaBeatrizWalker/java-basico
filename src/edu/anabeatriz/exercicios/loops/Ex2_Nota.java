package edu.anabeatriz.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça uma nota entre zero e dez. Mostre um mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Dê uma nota: ");
        nota = scan.nextInt();
        System.out.println("Obrigado! ");

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Tente novamente: ");
            nota = scan.nextInt();
        }
    }
}
