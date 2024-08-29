package com.algaworks.seguradora.servico;

import com.algaworks.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {

        System.out.println(bem.descrever());

        System.out.printf("Premio: R$%.2f%n", bem.calcularValorPremio());
    }
}
