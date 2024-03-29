package edu.anabeatriz.java.orientacaoAObjetos.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodosSet {
    public static void main(String[] args) {

        //Inicialização de um set
        //Set notas = new HashSet(); //antes do java 5
        //HashSet<Double> notas = new HashSet<>();
        //Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        /* Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas)*/

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:        
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString()); //[0.0, 8.5, 3.6, 5.0, 9.3, 7.0]
        
        //System.out.println("Exiba a posição da nota 5.0: "); //erro
        
        //System.out.println("Adicione na lista a nota 8.0 na posição 4: "); //erro
        
        //System.out.println("Substitua a nota 5.0 pela nota 6.0: "); //erro
        
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d)); //true
        
        //System.out.println("Exiba a terceira nota adicionada: "); //erro
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //0.0

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); //9.3

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma); //33.40...

        System.out.println("Exiba a média das notas: " + (soma/ notas.size())); //5.56...

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas); //[8.5, 3.6, 5.0, 9.3, 7.0]
        
        //System.out.println("Remova a nota da posição 0"); //erro
        
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas); //[8.5, 9.3, 7.0]

        //LinkedHashSet ou HashSet (igual linha 25)
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2); //[7.0, 8.5, 9.3, 5.0, 0.0, 3.6]

        //TreeSet
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3); //[0.0, 3.6, 5.0, 7.0, 8.5, 9.3]

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty()); //true

        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty()); //false

        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty()); //false
    }
}
