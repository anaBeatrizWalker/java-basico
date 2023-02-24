package edu.anabeatriz.java.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.mudarCanal(18);

    }
}
