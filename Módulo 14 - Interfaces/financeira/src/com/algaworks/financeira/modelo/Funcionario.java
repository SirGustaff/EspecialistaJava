package com.algaworks.financeira.modelo;

public class Funcionario implements ClienteFinanciavel, PessoaBonificavel {

    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;

    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return salarioMensal * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}
