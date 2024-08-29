package br.com.algamilhas;

public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Jorge");
        participante1.creditarPontos(20);
        System.out.printf("Quantidade de pontos: %d%n", participante1.getSaldoDePontos());
    }
}

