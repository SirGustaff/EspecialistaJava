package com.algaworks.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {

        double valorPremio = getValorMercado() * 0.04;

        if(getAnoFabricacao() < 2000) {
            return valorPremio * 0.05;
        }

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro de modelo: %s, fabricado em: %d, avaliado em R$%.2f%n",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
