package com.algaworks.detran;

import java.util.Collections;
import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String placa;
    private String modelo;

    public Carro(String placa, String modelo) {
        Objects.requireNonNull(placa);
        Objects.requireNonNull(modelo);
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public int compareTo(Carro o) {
        return getPlaca().compareTo(o.getPlaca());
    }
}
