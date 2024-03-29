package edu.anabeatriz.java.estruturasDeDados.filas;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    //Enfileirando
    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            //Percorrendo pelo último
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ //se não for o primeiro
                    primeiroNo = primeiroNo.getRefNo();
                }
                else{
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ //se não for o primeiro
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getConteudo() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
