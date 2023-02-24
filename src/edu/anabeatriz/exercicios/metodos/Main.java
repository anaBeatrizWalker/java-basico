package edu.anabeatriz.exercicios.metodos;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("\nExercício calculadora");
        Calculadora.somar(10, 9);
        Calculadora.subtrair(10, 9);
        Calculadora.dividir(10, 9);
        Calculadora.multiplicar(10, 9);

        System.out.println("\nExercício relógio e mensagem");
        Relogio.mensagem(2);
        Relogio.mensagem(8);
        Relogio.mensagem(15);
        Relogio.mensagem(21);

        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
}
