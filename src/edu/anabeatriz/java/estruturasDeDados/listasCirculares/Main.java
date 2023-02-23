package edu.anabeatriz.java.estruturasDeDados.listasCirculares;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("Item 1");
        minhaListaCircular.add("Item 2");
        minhaListaCircular.add("Item 3");
        minhaListaCircular.add("Item 4");

        System.out.println(minhaListaCircular);
        //[Nó {conteúdo = Item 4}] ---> [Nó {conteúdo = Item 3}] ---> [Nó {conteúdo = Item 2}] ---> [Nó {conteúdo = Item 1}] ---> (Retorna ao ínicio)

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        //[Nó {conteúdo = Item 3}] ---> [Nó {conteúdo = Item 2}] ---> [Nó {conteúdo = Item 1}] ---> (Retorna ao ínicio)

        System.out.println(minhaListaCircular.get(0)); //Item 3

        System.out.println(minhaListaCircular.get(4)); //Item 2 //Loop circular, voltando sempre da cauda para cabeça




    }
}
