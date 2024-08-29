package br.com.algamilhas;

public class Participante {

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this(nome, 0);
    }

    private Participante(String nome, int saldoDePontosInicial) {
        if(nome == null) {
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
        if(saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("A quantidade de pontos iniciais nao pode ser negativa");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    public int getSaldoDePontos() {
        return saldoDePontos;
    }

    public void creditarPontos(int pontos) {
        this.saldoDePontos += pontos;
    }

}
