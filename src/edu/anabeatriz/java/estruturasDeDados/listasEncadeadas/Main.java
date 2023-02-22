package edu.anabeatriz.java.estruturasDeDados.listasEncadeadas;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Ana Beatriz");
        minhaListaEncadeada.add("Gustavo");
        minhaListaEncadeada.add("Júlia");
        minhaListaEncadeada.add("Cláudia");

        System.out.println(minhaListaEncadeada.get(2));

        System.out.println(minhaListaEncadeada);
        //Nó { conteúdo = Ana Beatriz } ---> Nó { conteúdo = Gustavo } ---> Nó { conteúdo = Júlia } ---> Nó { conteúdo = Cláudia } --->  null

        System.out.println(minhaListaEncadeada.remove(3)); //Cláudia
        System.out.println(minhaListaEncadeada);
        //Nó { conteúdo = Ana Beatriz } ---> Nó { conteúdo = Gustavo } ---> Nó { conteúdo = Júlia } --->  null
    }
}
