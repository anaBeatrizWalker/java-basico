package edu.anabeatriz.java.orientacaoAObjetos.collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:

(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            /*
                Ordem aleatória: 
                dark - drama - 60
                that '70s show - comédia - 25
                got - fantasia - 60
            */

        System.out.println("\nOrdem de inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries1) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            /*
                Ordem de inserção:
                got - fantasia - 60
                dark - drama - 60
                that '70s show - comédia - 25
            */

        System.out.println("\nOrdem natural (TempoEpisodio): ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for (Serie serie: minhasSeries2) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            /*
                Ordem natural (TempoEpisodio
                that '70s show - comédia - 25
                dark - drama - 60
                got - fantasia - 60
            */

        System.out.println("\nOrdem Nome/Gênero/TempoEpisodio: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie: minhasSeries3) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            /*
                Ordem Nome/Gênero/TempoEpisodio
                dark - drama - 60
                got - fantasia - 60
                that '70s show - comédia - 25
            */

        System.out.println("\nOrdem por gênero: ");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);

        for (Serie serie: minhasSeries4) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\nOrdem por Tempo Episódio: ");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        minhasSeries5.addAll(minhasSeries);

        for (Serie serie: minhasSeries5) 
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    //Compara pelo tempo de episódio
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio; //se o tempo for diferente, retorna pelo tempo
        return this.getGenero().compareTo(serie.getGenero()); //se não, compara pelos generos
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        return genero;
    }

}

class ComparatorTempo implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return s1.getNome().compareTo(s2.getNome()); //se tiver tempos iguais, não irá excluir e sim ordenar pelo nome
    }
}
