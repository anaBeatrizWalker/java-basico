package edu.anabeatriz.java.anatomia;
public class MinhaClasse {
    
    //O método main permite a classe fazer a inicialização do projeto
    public static void main(String[] args) {
        //Classe do sistema
        System.out.print("Olá mundo! ");

        //Variáveis
        String meuNome = "Ana Beatriz";
        int anoNascimento = 2001;
        boolean estagiaria = false;
        String apresentacao = apresentacao(meuNome);

        System.out.println(apresentacao);
    }

    //Métodos
    public static String apresentacao(String nome){
        return "Bem vinda, " + nome + "!";
    }
}
