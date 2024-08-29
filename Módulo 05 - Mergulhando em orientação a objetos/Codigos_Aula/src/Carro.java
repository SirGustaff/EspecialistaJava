public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double valorCompra;
    Pessoa proprietario;

    void calcularValorRevenda() {

        int tempoDeUsoEmAnos = 2023 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (valorCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) 
            valorRevenda = 0;

        System.out.printf("O valor de revenda do seu carro é: %.2f%n", valorRevenda);
    }
}
