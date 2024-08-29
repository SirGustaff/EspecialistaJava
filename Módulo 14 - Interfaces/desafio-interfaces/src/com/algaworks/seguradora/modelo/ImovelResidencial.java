package com.algaworks.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.1 / 100) + (0.3 * areaConstruida);
    }

    @Override
    public String descrever() {
        return String.format("Imovel residencial com %d de area construida, avaliado em %.2f%n"
        , getAreaConstruida(), getValorMercado());
    }

}
