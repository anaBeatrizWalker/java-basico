package edu.anabeatriz.java.orientacaoAObjetos.estruturaBasica;

//Classe
public class Carro {
    
    //Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //Métodos
    //Construtores com sobrecarga
    public Carro() {
    
    }
    public Carro(String corDoCarro, String modeloDoCarro, int tanque) {
        this.cor = corDoCarro;
        this.modelo = modeloDoCarro;
        this.capacidadeTanque = tanque;
    }

    //Getters e setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //Total da capacidade do tanque
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
