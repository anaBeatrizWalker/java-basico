package edu.anabeatriz.java.orientacaoAObjetos.heranca.updcastDownscast;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Upcast (implicito)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast (explicito)
        //Gerente gerente_ = new Funcionario(); //implicito não funciona
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //erro, gera perda de informações
    }
}
