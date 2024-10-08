package com.algaworks.impostos;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionarPessoa(Pessoa pessoa) {
       this.valorTotalImpostos += pessoa.calcularImpostos();
       System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
