package edu.anabeatriz.exercicios.arrays;

import java.util.Scanner;

/* Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas. Imprima somente as consoantes. */

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Iniciando array com quantidade de valores definido
        String[] letras = new String[6];

        int quantConsoantes = 0;

        int count = 0;

        do{

            System.out.println("Digite uma letra: ");
            String letra = scan.next();


            if(!(letra.equalsIgnoreCase("a") | 
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
            
            letras[count] = letra;
            quantConsoantes++;
        }

        count++;

        } while(count < letras.length);

        System.out.println("Quantidade de letras: " + letras.length);

        //Percorre cada elemento do array e imprime
        System.out.println("Consoantes: ");
        for (String consoante : letras) {
            if(consoante != null) System.out.print(consoante + " ");
        }

        System.out.println("\nQuantidade de consoantes: " + quantConsoantes);
    }
}
