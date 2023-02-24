package edu.anabeatriz.java.estruturasDeDados.implementacoes.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Volkswagen"));

        System.out.println(stackCarros); //[Carro { marca: Ford }, Carro { marca: Chevrolet }, Carro { marca: Volkswagen }]

        System.out.println(stackCarros.pop()); //Carro { marca: Volkswagen }

        System.out.println(stackCarros); //[Carro { marca: Ford }, Carro { marca: Chevrolet }]
           
        System.out.println(stackCarros.peek()); //Carro { marca: Chevrolet }

        System.out.println(stackCarros); //[Carro { marca: Ford }, Carro { marca: Chevrolet }]

        System.out.println(stackCarros.isEmpty()); //false
        
    }
}
