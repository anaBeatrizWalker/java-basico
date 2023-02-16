package edu.anabeatriz.exercicios.arrays;

import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9. */

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();

        //Primeira [] representa as linhas, a segunda [] representa as colunas
        int[][] M = new int[4][4];

        //Percorrendo as linhas
        for(int i = 0; i < M.length; i++){
            //Percorrendo as colunas (elementos da matriz)
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        //Imprime a matriz
        System.out.println("Matriz 4x4 de números aleatórios: ");
        for (int[] linha : M) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
