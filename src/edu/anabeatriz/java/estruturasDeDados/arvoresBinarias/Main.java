package edu.anabeatriz.java.estruturasDeDados.arvoresBinarias;

import edu.anabeatriz.java.anatomia.MinhaClasse;
import edu.anabeatriz.java.estruturasDeDados.arvoresBinarias.model.Obj;

public class Main {
    public static void main(String[] args) {
     
        ArvoreBinaria<Obj> minhArvoreBinaria = new ArvoreBinaria<>();

        minhArvoreBinaria.inserir(new Obj(13));
        minhArvoreBinaria.inserir(new Obj(10));
        minhArvoreBinaria.inserir(new Obj(25));
        minhArvoreBinaria.inserir(new Obj(2));
        minhArvoreBinaria.inserir(new Obj(12));
        minhArvoreBinaria.inserir(new Obj(20));
        minhArvoreBinaria.inserir(new Obj(31));
        minhArvoreBinaria.inserir(new Obj(29));
        minhArvoreBinaria.inserir(new Obj(32));

        minhArvoreBinaria.exibirInOrdem();

        minhArvoreBinaria.exibirPosOrdem();

        minhArvoreBinaria.exibirPreOrdem();

        /*
         * Exibição in-ordem: 2, 10, 12, 13, 20, 25, 29, 31, 32, 
         * Exibição pós-ordem: 2, 12, 10, 20, 29, 32, 31, 25, 13,
         * Exibição pré-ordem: 13, 10, 2, 12, 25, 20, 31, 29, 32,
        */

    }   
}
