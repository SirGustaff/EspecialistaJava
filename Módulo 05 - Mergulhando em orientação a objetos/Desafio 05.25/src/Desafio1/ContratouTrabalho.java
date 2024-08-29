package Desafio1;

public class ContratouTrabalho {

    Funcionario funcionario;
    double qtdHorasTrabalhadas;
    double qtdHorasExtrasTrabalhadas;
    double valorHoraNormal;
    double valorHoraExtra;
    boolean possuiMaisDeUmFilho;

    ContratouTrabalho(Funcionario funcionario, double qtdHorasTrabalhadas, double qtdHorasExtrasTrabalhadas,
                      double valorNormal, double valorExtra) {
        this.funcionario = funcionario;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.qtdHorasExtrasTrabalhadas = qtdHorasExtrasTrabalhadas;
        valorHoraNormal = valorNormal;
        valorHoraExtra = valorExtra;
        possuiMaisDeUmFilho = funcionario.quantidadeFilhos > 1;
    }
}
