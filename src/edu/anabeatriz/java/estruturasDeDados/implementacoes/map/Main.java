package edu.anabeatriz.java.estruturasDeDados.implementacoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String args[]){

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno); //{Turma=3a, Idade=17, Media=8.5, Nome=João}

        System.out.println(aluno.keySet()); //[Turma, Idade, Media, Nome]

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        //[{Turma=3a, Idade=17, Media=8.5, Nome=João}, {Turma=3b, Idade=18, Media=8.9, Nome=Maria}]

        System.out.println(aluno.containsKey("Nome")); //true
    }
}
