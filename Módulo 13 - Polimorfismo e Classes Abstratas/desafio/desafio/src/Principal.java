import com.algaworks.impostos.EmpresaSimples;
import com.algaworks.impostos.GestorDeImpostos;
import com.algaworks.impostos.PessoaFisica;

public class Principal {
    public static void main(String[] args) {

        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica pessoaFisica1 = new PessoaFisica("Gustavo", 52000);
        EmpresaSimples empresaSimples1 = new EmpresaSimples("Gustavo's Bar",
                100_000, 20_000);

        gestorDeImpostos.adicionarPessoa(pessoaFisica1);
        gestorDeImpostos.adicionarPessoa(empresaSimples1);

        System.out.printf("Valor total impostos: %.2f%n", gestorDeImpostos.getValorTotalImpostos());

    }
}
