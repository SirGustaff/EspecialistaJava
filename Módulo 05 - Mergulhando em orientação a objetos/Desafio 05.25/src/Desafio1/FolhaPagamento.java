package Desafio1;

public class FolhaPagamento {
    Holerite calcularSalario(ContratouTrabalho contratouTrabalho) {

        double totalHorasNormais = contratouTrabalho.qtdHorasTrabalhadas * contratouTrabalho.valorHoraNormal;
        double totalHorasExtras = contratouTrabalho.qtdHorasExtrasTrabalhadas * contratouTrabalho.valorHoraExtra;
        double adicionalFilhos = 0;

        if (contratouTrabalho.possuiMaisDeUmFilho) {
            adicionalFilhos = (totalHorasNormais + totalHorasExtras) * 0.10;
        }

        Holerite holerite = new Holerite(
                contratouTrabalho.funcionario,
                totalHorasNormais,
                totalHorasExtras,
                adicionalFilhos
        );

        return holerite;
    }
}
