package edu.anabeatriz.java.estruturasDeDados.filas;

public class No<T> {
    
    private T conteudo;
    private No<T> refNo;

    public No() {
    }

    public No(T conteudo){
        this.refNo = null;
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + conteudo +
                '}';
    }
}
