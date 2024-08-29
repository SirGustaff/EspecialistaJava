import com.algaworks.estoque.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(20);
        produto.ativar();

        comprar(produto);

    }

    private static void comprar(Produto produto) {
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = input.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (BaixaEstoqueException e) {
                System.out.println("Erro na compra: " + e.getCause().getMessage());
                e.printStackTrace();
            }
        } while(true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n"
                    , quantidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        }
    }
}
