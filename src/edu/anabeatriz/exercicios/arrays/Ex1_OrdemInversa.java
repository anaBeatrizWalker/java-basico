package edu.anabeatriz.exercicios.arrays;

//Array Unidimensional (uma linha)

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        //Iniciando um vetor
        int[] vetor = {5, 8, 9, 14, 16, 3};

        int count = 0;

        System.out.print("Vetor: ");
        while(count  < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nOrdem inversa do Vetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

        //System.out.println(vetor); //[I@7a81197d (posição do array na máquina)
    }
}
