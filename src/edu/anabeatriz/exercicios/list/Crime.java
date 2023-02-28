package edu.anabeatriz.exercicios.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");

        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\nSuas respostas foram: " + respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println("\nResultaod: Suspeita"); break;
            case 3:
            case 4:
                System.out.println("\nResultaod: Cúmplice"); break;
            case 5:
                System.out.println("\nResultaod: Assassino"); break;
            default:
                System.out.println("\nResultaod: Inocente"); break;
        }
    }
}
