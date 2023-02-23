package edu.anabeatriz.java.estruturasDeDados.listasCirculares;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia.");

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < index; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //Remove pela cauda
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");

        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);

        } else if(index == 1){
            //Passando a ref do nó de índice 0 para o nó de índice 2
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());

        } else {
            for(int i = 0; i < index - 1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            //
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);

        } else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo); //atual cauda
            this.cauda = novoNo; //nova cauda
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;

        for(int i = 0; i < this.size(); i++){
            strRetorno += "[Nó {conteúdo = " + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += this.isEmpty() ? "[]" : "(Retorna ao ínicio)";

        return strRetorno;
    }
}
