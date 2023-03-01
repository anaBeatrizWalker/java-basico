package edu.anabeatriz.exercicios.set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as cores: ");
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "amarelo", "roxo", "rosa", "azul", "verde", "laranja"));
        System.out.println(arcoIris.toString()); //[vermelho, roxo, amarelo, verde, laranja, azul, rosa]

        System.out.println("\nExiba a quantidade de cores que o arco-íris tem: " + arcoIris.size()); //7

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> arcoIris2 = new TreeSet<>(new ComparatorNome());
        arcoIris2.addAll(arcoIris);
        for (String cor : arcoIris2) {
            System.out.println(cor); 
            /* 
            amarelo
            azul
            laranja
            rosa
            roxo
            verde
            vermelho
            */
        }

        System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
        Set<String> arcoIris3 = new LinkedHashSet<>(arcoIris); //Ordem de inserção: [vermelho, roxo, amarelo, verde, laranja, azul, rosa]
        List<String> arcoIris3Inverso = new ArrayList<>(arcoIris3);
        Collections.reverse(arcoIris3Inverso);
        System.out.println(arcoIris3Inverso); //Ordem inversa: [rosa, azul, laranja, verde, amarelo, roxo, vermelho]
        
        System.out.println("\nExiba todas as cores que começam com a letra 'v':");
        for (String cor: arcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
            /*
            vermelho
            verde
            */
        }

        System.out.println("\nRemova todas as cores que não começam com a letra “v”:");
        Iterator<String> iterator2 = arcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoIris); //[vermelho, verde]

        System.out.println("\nLimpe o conjunto: ");
        arcoIris.clear();
        System.out.println(arcoIris.toString()); // []

        System.out.println("\nConfira se o conjunto está vazio: ");
        System.out.println(arcoIris.isEmpty()); //true
    }
}

class ComparatorNome implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}