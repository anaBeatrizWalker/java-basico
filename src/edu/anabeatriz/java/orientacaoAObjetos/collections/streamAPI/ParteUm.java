package edu.anabeatriz.java.orientacaoAObjetos.collections.streamAPI;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ParteUm {

    public static void main(String[] args) {

        System.out.println("Ordem Inserção");
        Map<Integer, Contato> agenda = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);//{1=Contato{nome='Simba', numero='5555'}, 4=Contato{nome='Cami', numero='1111'}, 3=Contato{nome='Jon', numero='2222'}}4

        //Normal
        System.out.println("\nOrdem número telefone (normal): ");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +": " +entry.getValue().getNome());
            /*
            4 - 1111: Cami
            3 - 2222: Jon
            1 - 5555: Simba
            */
        }

        //Classe anônima
        System.out.println("\nOrdem por número de telefone (com classe anônima): ");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        set1.addAll(agenda.entrySet());
        System.out.println(set1);
        //[4=Contato{nome='Cami', numero='1111'}, 3=Contato{nome='Jon', numero='2222'}, 1=Contato{nome='Simba', numero='5555'}]

        //Functional interface
        /* 
        System.out.println("\nOrdem por número de telefone (com functional interface): ");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        set2.addAll(agenda.entrySet());
        System.out.println(set2);
        */

        //Lambda
        System.out.println("\nOrdem por número de telefone (com lambda): ");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        set3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +": " +entry.getValue().getNome());
            /*
            4 - 1111: Cami
            3 - 2222: Jon
            1 - 5555: Simba
            */
        }
    }
}

class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

