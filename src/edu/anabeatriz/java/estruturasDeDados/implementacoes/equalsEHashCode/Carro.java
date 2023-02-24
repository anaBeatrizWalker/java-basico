package edu.anabeatriz.java.estruturasDeDados.implementacoes.equalsEHashCode;

import java.util.Objects;

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //se as referencias de memórias dos objetos comparados são iguasi
        if (o == null || getClass() != o.getClass()) return false; //se são objetos de classe diferentes
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca()); //faz a comparação de acordo com o atributo marca
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca()); //retorna um inteiro gerado pelo atributo marca
    }
}
