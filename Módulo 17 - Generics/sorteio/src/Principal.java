import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.Sorteador;

public class Principal {
    public static void main(String[] args) {

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);

        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
