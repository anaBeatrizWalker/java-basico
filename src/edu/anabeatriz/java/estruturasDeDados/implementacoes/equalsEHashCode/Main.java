package edu.anabeatriz.java.estruturasDeDados.implementacoes.equalsEHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford"))); //se contém Ford

        System.out.println(new Carro("Ford").hashCode()); //hash do dado
        System.out.println(new Carro("Ford").hashCode());
        
    }
}
