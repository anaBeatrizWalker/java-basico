package edu.anabeatriz.java.excecoes;

import javax.swing.JOptionPane;

//Divisão de dois números inteiros
public class UncheckedException {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: "); //ana
        String b = JOptionPane.showInputDialog("Denominador: "); //3

        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);

        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "ana" 
            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            at java.base/java.lang.Integer.parseInt(Integer.java:668)
            at java.base/java.lang.Integer.parseInt(Integer.java:786)
            at edu.anabeatriz.java.excecoes.UncheckedException.main(UncheckedException.java:12)

        Nome da exceção: NumberFormatException
        */
    }
    public static int dividir(int a, int b) { return a / b;}
}
