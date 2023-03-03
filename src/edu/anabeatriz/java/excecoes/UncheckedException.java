package edu.anabeatriz.java.excecoes;

import javax.swing.JOptionPane;

//Divisão de dois números inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: "); //ana
            String b = JOptionPane.showInputDialog("Denominador: "); //3
            
            try {
                //Código a ser executado
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                //Tratamento da Exception para string
                JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro: " + e.getMessage());

            } catch (ArithmeticException e){
                //Tratamento da Exception para denominador = 0
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0. ");

            } finally {
                System.out.println("Finalizando...");
            }
        } while (continueLooping);
    }
    public static int dividir(int a, int b) { return a / b;}
}
