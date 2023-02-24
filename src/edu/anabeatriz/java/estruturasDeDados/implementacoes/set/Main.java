package edu.anabeatriz.java.estruturasDeDados.implementacoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]){
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros); //adiciona em ordem aleatória
        //[Carro{ marca= Zip}, Carro{ marca= Fiat}, Carro{ marca= Alfa Romeo}, Carro{ marca= Chevrolet}, Carro{ marca= Ford}, Carro{ marca= Peugeot}]

        //Árvore de carro
        Set<Carro> treeSetCarros = new TreeSet<>(); 
        

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        //Compare to por tamanho das string's
        System.out.println(treeSetCarros);
        //[Carro{ marca= Zip}, Carro{ marca= Ford}, Carro{ marca= Peugeot}, Carro{ marca= Chevrolet}, Carro{ marca= Alfa Romeo}]

        //Compare to por marca em ordem alfabética
        System.out.println(treeSetCarros);
        //[Carro{ marca= Alfa Romeo}, Carro{ marca= Chevrolet}, Carro{ marca= Fiat}, Carro{ marca= Ford}, Carro{ marca= Peugeot}, Carro{ marca= Zip}]

    }
}
