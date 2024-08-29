import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {

        NotaFiscalProduto nfBola = new NotaFiscalProduto("Bola de Futebol", 300, 30);
        NotaFiscalServico nfConsertoMotor = new NotaFiscalServico("Concerto do Motor", 999, true);

        System.out.println(nfBola.calcularImpostos());
        System.out.println(nfConsertoMotor.calcularImpostos());

        GestorFiscal gestorFiscal = new GestorFiscal();
        gestorFiscal.emitirNotasFiscais(nfBola, nfConsertoMotor);

    }
}
