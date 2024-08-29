import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal4 {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 20);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = (Conta) contaEspecial;

        ContaInvestimento contaInvestimento = (ContaInvestimento) contaEspecial;

    }
}
