package com.algaworks.banco;

import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new OperacaoBancariaException("Nao pode ser realizado um saque de um valor menor que zero");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }

        if (isInativa()) {
            throw new ContaInativaException("O saque nao pode ser realizado em uma conta inativa");
        }

        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new OperacaoBancariaException("Nao pode ser realizado o deposito de um valor menor que zero");
        }

        if (isInativa()) {
            throw new ContaInativaException("O deposito nao pode ser realizado em uma conta inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("A conta destino esta inativa");
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }

}