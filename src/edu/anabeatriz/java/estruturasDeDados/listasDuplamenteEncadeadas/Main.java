package edu.anabeatriz.java.estruturasDeDados.listasDuplamenteEncadeadas;

public class Main {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        
        minhaLista.addFinal("Ana Beatriz");
        minhaLista.addFinal("Gustavo");
        minhaLista.addFinal("Júlia");
        minhaLista.addFinal("Amanda");
        minhaLista.addFinal("Helloiza");

        System.out.println(minhaLista);
        //[Nó { conteúdo = Ana Beatriz }] ---> [Nó { conteúdo = Gustavo }] ---> [Nó { conteúdo = Júlia }] ---> [Nó { conteúdo = Amanda }] ---> [Nó { conteúdo = Helloiza }] ---> null

        minhaLista.remove(3);
        System.out.println(minhaLista);

        minhaLista.add(3, "Cláudia");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(1)); //Gustavo
    }
}
