package edu.anabeatriz.java.orientacaoAObjetos.heranca.polimorfismoESobrescrita;

public class Main {
    public static void main(String[] args) {

        //Polimorfismo
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
            //Método 1 da Classe Filha 1
            //Método 1 da Classe Filha 2
            //Método 1 da Classe Mãe
        }

        System.out.println("");

        //Poli + sobrescrita
        for (ClasseMae classe: classes) {
            classe.metodo2();
            //Método 2 da Classe Mãe = não se comporta polimórficamente pois ClasseFilha1 não tem o método2()
            //Método 2 da Classe Filha 2
            //Método 2 da Classe Mãe 
        }

        System.out.println("");

        //Sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2(); //Método 2 da Classe Filha 2
    }
}
