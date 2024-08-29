import com.algaworks.seguradora.modelo.ImovelResidencial;
import com.algaworks.seguradora.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {

        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        servicoPropostaSeguro.emitir(imovel);


    }
}
