package edu.anabeatriz.java.debugging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    public static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack(); //gera a stack trace
        System.out.println("Finalizou o método c.");
    }
    /* Antes da depuração
    Iniciou do programa no método main.
    Entrou no método a.
    Entrou no método b.
    0
    1
    2
    3
    4
    Entrou no método c.
    Finalizou o método c.
    Finalizou o método b.
    Finalizou o método a.
    Finalizou do programa no método main.
    */

    /* Rodando o stack trace
    Iniciou do programa no método main.
    Entrou no método a.
    Entrou no método b.
    0
    1
    2
    3
    4
    Entrou no método c.
    java.lang.Exception: Stack trace
            at java.base/java.lang.Thread.dumpStack(Thread.java:1380)
            at edu.anabeatriz.java.debugging.Main.c(Main.java:25)
            at edu.anabeatriz.java.debugging.Main.b(Main.java:19)
            at edu.anabeatriz.java.debugging.Main.a(Main.java:12)
            at edu.anabeatriz.java.debugging.Main.main(Main.java:6)
    Finalizou o método c.
    Finalizou o método b.
    Finalizou o método a.
    Finalizou do programa no método main.                               
    */
}
