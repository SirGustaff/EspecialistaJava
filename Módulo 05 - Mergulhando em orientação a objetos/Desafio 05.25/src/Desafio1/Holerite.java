package Desafio1;

public class Holerite {

    Funcionario funcionario;
    double totalHorasNormais;
    double totalHorasExtras;
    double adicionalParaFilhos;

    Holerite(Funcionario funcionario, double horasNormais, double horasExtras, double adicionalParaFilhos) {
        this.funcionario = funcionario;
        totalHorasNormais = horasNormais;
        totalHorasExtras = horasExtras;
        this.adicionalParaFilhos = adicionalParaFilhos;
    }

    private double calcularValorTotal() {
        return totalHorasNormais + totalHorasExtras + adicionalParaFilhos;
    }

    void imprimir() {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Quantidade de filhos: " + funcionario.quantidadeFilhos);
        System.out.println("Horas Normais Trabalhadas: " + totalHorasNormais);
        System.out.println("Horas Extras Trabalhadas: " + totalHorasExtras);
        System.out.println("Adicional Para Filhos: " + adicionalParaFilhos);
        System.out.println("Salário Final: " + calcularValorTotal());
    }
}
