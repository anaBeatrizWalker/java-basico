package edu.anabeatriz.java.estruturasDeDados.listasDuplamenteEncadeadas;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index){

        NoDuplo<T> noAuxuliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxuliar !=null); i++){
            noAuxuliar = noAuxuliar.getNoProximo();
        }

        return noAuxuliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //Adiciona sempre no final
    public void addFinal(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null); //último nó
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++; //a cada adição, incrementa um no tamanho
    }

    //Adiciona em qualquer índice
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        } else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            //Remoção do primeiro nó
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        } else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                //Se não esta no último nó
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < size(); i++){
            strRetorno += "[Nó { conteúdo = " + noAuxiliar.getConteudo() + " }] ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null"; //se a lista é vazia imprime nulo
        return strRetorno;
    }
}
