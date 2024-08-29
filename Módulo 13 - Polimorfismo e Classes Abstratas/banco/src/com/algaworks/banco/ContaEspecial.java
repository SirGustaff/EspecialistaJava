package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento {

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void  imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        if(getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "titular=" + (getTitular() != null? getTitular().getNome() : null) +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                ", tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

}
