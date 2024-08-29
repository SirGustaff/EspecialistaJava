package com.algaworks.crm;

public class Cliente {

    private String razaoSocial;
    private double faturamento;

    public Cliente(String razaoSocial, double faturamento) {
        this.razaoSocial = razaoSocial;
        this.faturamento = faturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamento;
    }

    public void setFaturamentoMensal(double faturamento) {
        this.faturamento = faturamento;
    }
}
