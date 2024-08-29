import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.*;

public class Principal {
    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Transferencia();

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Joao da Silva", "99999999", "23232");
        DocumentoPagavel holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "1068779900018", "1312321");
        OrdemServico os = new OrdemServico(fornecedor, 65000);


        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);

    }
}
