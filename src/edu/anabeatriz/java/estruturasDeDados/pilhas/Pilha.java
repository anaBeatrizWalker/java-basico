package edu.anabeatriz.java.estruturasDeDados.pilhas;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    //Se a pilha está vazia
    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    //Retorna o último, topo
    public No top(){
        return refNoEntradaPilha;
    }

    //Acrescenta um novo nó no topo
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha; //pega a ref do topo
        refNoEntradaPilha = novoNo; //acrescenta um novo nó no topo
        refNoEntradaPilha.setRefNo(refAuxiliar); //acrescenta a última ref no topo
    }

    //Remove o último nó da pilha
    public No pop(){
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";

        //Percorrendo a pilha
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
