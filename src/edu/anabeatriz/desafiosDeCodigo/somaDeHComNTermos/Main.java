package edu.anabeatriz.desafiosDeCodigo.somaDeHComNTermos;

import java.util.Scanner;

/* Neste desafio, faça um programa que calcule o valor de H com N termos. 
Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.  */

public class Main {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
   
        for (int i = 1; i <= n; i++) {
        //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (1/((double)i));
            
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
    }
}
