package edu.anabeatriz.java.estruturasDeDados.implementacoes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String args[]){

        Queue<Carro> queueCarros = new LinkedList<Carro>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot"))); //true (porque conseguiu adicionar)

        System.out.println(queueCarros); //[Carro{ marca=Ford }, Carro{ marca=Chevrolet }, Carro{ marca=Fiat }, Carro{ marca=Peugeot }]

        System.out.println(queueCarros.element());//Carro{ marca=Ford } (pega o elemento da cabeça da fila sem remover)


        System.out.println(queueCarros.offer(new Carro("Renault"))); // true (retorna false se não conseguir adicionar ao invés de um erro)

        System.out.println(queueCarros); //[Carro{ marca=Ford }, Carro{ marca=Chevrolet }, Carro{ marca=Fiat }, Carro{ marca=Peugeot }, Carro{ marca=Renault }]

        System.out.println(queueCarros.peek());//Carro{ marca=Ford } (pega o elemento da cabeça da fila sem remover e se tiver vazia retorna null)

        System.out.println(queueCarros);

        System.out.println(queueCarros.remove());

        System.out.println(queueCarros); //[Carro{ marca=Chevrolet }, Carro{ marca=Fiat }, Carro{ marca=Peugeot }, Carro{ marca=Renault }]

        System.out.println(queueCarros.poll()); //Carro{ marca=Chevrolet }(pega e remove)

        System.out.println(queueCarros); //[Carro{ marca=Fiat }, Carro{ marca=Peugeot }, Carro{ marca=Renault }]

        System.out.println(queueCarros.isEmpty()); //false
    }
}
