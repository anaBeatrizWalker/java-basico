package edu.anabeatriz.java.orientacaoAObjetos.estruturaBasica;

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Série B");
        carro1.setCapacidadeTanque(59);

        System.out.println("Cor: "+ carro1.getCor());
        System.out.println("Modelo: "+ carro1.getModelo());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Total do tanque" + carro1.totalValorTanque(5.98));

        Carro carro2 = new Carro("Cinza", "Série 3", 67);

        System.out.println("Cor: "+ carro1.getCor());
        System.out.println("Modelo: "+ carro1.getModelo());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Total do tanque" + carro1.totalValorTanque(5.98));
    }
}
