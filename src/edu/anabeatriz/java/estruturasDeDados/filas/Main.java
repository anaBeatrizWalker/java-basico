package edu.anabeatriz.java.estruturasDeDados.filas;

public class Main {
    public static void main(String[] args) {
        
        Fila minhaFila = new Fila();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila); 
        //[No{objeto=Quarto}]--->[No{objeto=Terceiro}]--->[No{objeto=Segundo}]--->[No{objeto=Primeiro}]--->null

        System.out.println(minhaFila.dequeue());
        //No{dado=Primeiro}

        System.out.println(minhaFila);
        //[No{objeto=Quarto}]--->[No{objeto=Terceiro}]--->[No{objeto=Segundo}]--->null

        minhaFila.enqueue("Último");
        System.out.println(minhaFila); 
        //[No{objeto=Último}]--->[No{objeto=Quarto}]--->[No{objeto=Terceiro}]--->[No{objeto=Segundo}]--->null

        System.out.println(minhaFila.first()); //No{dado=Segundo}
    }
}
