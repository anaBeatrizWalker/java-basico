package edu.anabeatriz.exercicios.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Linguagens {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto com 3 linguagens: ");
        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>();
        minhasLinguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
        minhasLinguagens.add(new LinguagemFavorita("Javascript", 1995, "VS Code"));
        minhasLinguagens.add(new LinguagemFavorita("React.js", 2013, "Stackblitz"));
        for (LinguagemFavorita linguagemFavorita : minhasLinguagens) {
            System.out.println(linguagemFavorita);
            /*
            {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
            {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
            {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
            */
        }

        System.out.println("\nOrdem de inserção: ");
        Set<LinguagemFavorita> minhasLinguagens2 = new LinkedHashSet<>(Arrays.asList(
            new LinguagemFavorita("Java", 1991, "Eclipse"),
            new LinguagemFavorita("Javascript", 1995, "VS Code"),
            new LinguagemFavorita("React.js", 2013, "Stackblitz")
        ));
        for (LinguagemFavorita linguagemFavorita : minhasLinguagens2) {
            System.out.println(linguagemFavorita);
            /*
            {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
            {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
            {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
            */
        }

        System.out.println("\nOrdem natural (nome): ");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens3) System.out.println(linguagem);
        /*
        {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
        {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
        {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
        */

        System.out.println("\nOrdem por IDE: ");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens4) System.out.println(linguagem);
        /*
        {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
        {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
        {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
        */

        System.out.println("\nOrdem por ano de criação e nome: ");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
        for (LinguagemFavorita linguagem : minhasLinguagens5) System.out.println(linguagem);
        /*
        {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
        {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
        {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
        */

        System.out.println("\nOrdem por ano de criação, nome e IDE: ");
        Set<LinguagemFavorita> minhasLinguagens6 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIde());
        minhasLinguagens6.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens6) System.out.println(linguagem);
        /*
        {nome='Java', anoDeCriacao=1991, ide='Eclipse'}
        {nome='Javascript', anoDeCriacao=1995, ide='VS Code'}
        {nome='React.js', anoDeCriacao=2013, ide='Stackblitz'}
        */

        
    }
}
class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome; 
    int anoDeCriacao; 
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }
    public void setIde(String ide) {
        this.ide = ide;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    } 
}
class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if(ano != 0) return ano;
        return o1.nome.compareToIgnoreCase(o2.nome);
    } 
}
class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        if(nome != 0) return nome;

        int ano = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if(ano != 0) return ano;

        return o1.ide.compareToIgnoreCase(o2.ide);
    } 
}