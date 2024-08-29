package com.algabank;

import com.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator implements Conta {

    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getPontos() {
        return pontos;
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += (int) (valor / 100);
    }

}
