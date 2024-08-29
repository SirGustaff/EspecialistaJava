package Desafio1;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gustavo";
        funcionario.quantidadeFilhos = 2;

        ContratouTrabalho assistente = new ContratouTrabalho(
                funcionario,
                40,
                20,
                45,
                20
        );

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(assistente);

        holerite.imprimir();

    }
}
