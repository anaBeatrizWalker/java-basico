package edu.anabeatriz.java.estruturasDeDados.conceitoDeNo;

public class Main {
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("Conteúdo do nó 1");

        No<String> no2 = new No<>("Conteúdo do nó 2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo do nó 3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo do nó 4");

        no3.setProximoNo(no4);

        System.out.println(no1); //No{conteudo='Conteúdo do nó 1'}
        System.out.println(no1.getProximoNo()); //No{conteudo='Conteúdo do nó 2'}
        System.out.println(no1.getProximoNo().getProximoNo()); //No{conteudo='Conteúdo do nó 3'}
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); //No{conteudo='Conteúdo do nó 4'}
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); //null

    }
}
