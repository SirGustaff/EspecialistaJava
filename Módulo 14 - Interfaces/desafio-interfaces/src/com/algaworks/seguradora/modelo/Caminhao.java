package com.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = (getValorMercado() * 0.02) + (getQuantidadeEixos() * 50);

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhao de modelo: %s, fabricado em: %d, com %d eixos, " +
                "avaliado em R$%.2f%n", getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }
}
