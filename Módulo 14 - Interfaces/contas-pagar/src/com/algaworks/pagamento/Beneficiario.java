package com.algaworks.pagamento;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contabancaria;

    public Beneficiario(String nome, String chavePix, String contabancaria) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contabancaria = contabancaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContabancaria() {
        return contabancaria;
    }

    public void setContabancaria(String contabancaria) {
        this.contabancaria = contabancaria;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().isEmpty();
    }

    public boolean naoPossuiContaBancaria() {
        return getContabancaria() == null || getContabancaria().isEmpty();
    }

}
