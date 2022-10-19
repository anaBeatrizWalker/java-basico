package edu.anabeatriz.java.tipos;

public class TiposVariaveis {
    public static void main(String[] args) {
    //Tipos de Dados
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
    long cpf = 98765432109L; //se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salario = 1275.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    //Casting
    short numeroCurto2 = (short)numeroNormal; //Java não permite correr o risco

    //Constantantes

    //Isso funciona
    int numero = 5;
    numero = 10;
    System.out.print(numero);

    /*Ao usar a palavra reservada final, você determina que jamais esta variavel poderá obter outro valor; logo a linha 25 vai apresentar um erro de compilação, isso é considerado uma CONSTANTE na linguagem Java*/
    final double VALOR_DE_PI = 3.14;
    //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    }
}
