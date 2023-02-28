package edu.anabeatriz.exercicios.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> temperaturasLista = new ArrayList<Double>();

        double soma = 0.0;
    
        System.out.println("Digite a temperatura dos 6 primeiros meses do ano: ");
        for(int i = 0; i < 6; i++){
            double temperatura = leitor.nextDouble();
            temperaturasLista.add(temperatura);
            soma += temperatura;
        } 
        System.out.println("\nMédia semestral: " + soma / 6);

        System.out.println("\nTemperaturas maiores que a média semestral: ");
        for (int i = 0; i < temperaturasLista.size(); i++ ) {
            if(temperaturasLista.get(i) > (soma / 6)){
                if(i == 0) System.out.println("1 - Janeiro: " + temperaturasLista.get(i) + "º");
                if(i == 1) System.out.println("2 - Fevereiro: " + temperaturasLista.get(i) + "º");
                if(i == 2) System.out.println("3 - Março: " + temperaturasLista.get(i) + "º");
                if(i == 3) System.out.println("4 - Abril: " + temperaturasLista.get(i) + "º");
                if(i == 4) System.out.println("5 - Maio: " + temperaturasLista.get(i) + "º");
                if(i == 5) System.out.println("6 - Junho: " + temperaturasLista.get(i) + "º");
            }
        }
    }        
}
