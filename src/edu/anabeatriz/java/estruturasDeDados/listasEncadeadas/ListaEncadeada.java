package edu.anabeatriz.java.estruturasDeDados.listasEncadeadas;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else{
                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i < this.size() -1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public No<T> getNo(int index){

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Essa lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    public  T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            //Removendo o primeiro nó e passando a ref para o segundo nó
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i < this.size(); i++){
            strRetorno += "Nó { conteúdo = " + noAuxiliar.getConteudo() + " } ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        strRetorno += " null";

        return strRetorno;
    }
    
}
