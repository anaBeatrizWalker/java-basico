package edu.anabeatriz.java.excecoes;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i++){
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);
        }
    }
    /*
    2
    1
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at edu.anabeatriz.java.excecoes.ExceptionCustomizada2.main(ExceptionCustomizada2.java:10)
    */
}
