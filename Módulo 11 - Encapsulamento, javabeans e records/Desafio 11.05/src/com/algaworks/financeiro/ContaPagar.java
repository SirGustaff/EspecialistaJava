package com.algaworks.financeiro;

public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar() {
        if(isPago()) {
            throw new RuntimeException("A conta ja foi paga");
        }
        pago = true;
    }

    public void cancelarPagamento() {
        if(isPago()) {
            pago = false;
        }
        else
            throw new RuntimeException("A conta ja esta com o pagamento pendente");
    }
}
