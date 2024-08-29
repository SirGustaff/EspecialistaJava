public class Participante {

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        this(nome, 0);
    }

    Participante(String nome, int saldoDePontosInicial) {
        if(nome == null) {
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
        if(saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("A quantidade de pontos iniciais nao pode ser negativa");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

}
