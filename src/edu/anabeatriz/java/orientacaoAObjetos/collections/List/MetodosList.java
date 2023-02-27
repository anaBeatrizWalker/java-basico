package edu.anabeatriz.java.orientacaoAObjetos.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) {

        //Formas de inicializar uma List
        /* 
        List notas = new ArrayList(); //antes do java 5

        List<Double> notas = new ArrayList<Double>(); //com generics

        ArrayList<Double> notas = new ArrayList<>(); //geralmente não recomendado

        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //elementos passados como parâmetros

        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d); //não pode inserir e nem remover

        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //list imutável
        notas.add(1d); //erro
        notas.remove(5d); //erro
        */

        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Lista de notas: " + notas.toString());

        System.out.println("\nPosição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista");
        //notas.clear();
        System.out.println(notas);
        
        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
        
        /* Resolva esses exercícios utilizando os métodos da implementação LinkedList */
        System.out.println("\nCrie uma lista chamada notas2  e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new LinkedList<>();
        notas2 = notas;
        System.out.println(notas2.toString());

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));
        System.out.println(notas2.toString());

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.remove(0));
        System.out.println(notas2.toString());
        
    }
}
