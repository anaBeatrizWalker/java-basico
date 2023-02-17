package edu.anabeatriz.java.estruturasDeDados.filas;

public class No {
    
    private Object conteudo;
    private No refNo;

    public No() {
    }

    public No(Object conteudo){
        this.refNo = null;
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + conteudo +
                '}';
    }
}
