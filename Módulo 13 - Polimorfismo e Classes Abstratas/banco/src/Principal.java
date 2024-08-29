import com.algaworks.banco.*;

public class Principal {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Joao da Silva", "12341234123"),
                1234, 99999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(50);
        conta1.creditarRendimentos(10);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Joao da Silva", "12341234123"),
                1234, 99999);
        conta2.depositar(20);
        conta2.creditarRendimentos(5);

        ContaSalario conta3 = new ContaSalario(new Titular("Joao da Silva", "12341234123"),
                1234, 99999, 18000);
        conta3.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta1);

    }
}
