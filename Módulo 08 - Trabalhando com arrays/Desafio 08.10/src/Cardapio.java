import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {

        itens = Arrays.copyOf(itens, itens.length + 1);

        itens[itens.length - 1] = item;

    }
    void removerItem(int indice) {

        ItemCardapio[] novoItemsCardapio = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, novoItemsCardapio, 0, indice);

        System.arraycopy(itens, indice + 1, novoItemsCardapio, indice, novoItemsCardapio.length - 1);

        itens = novoItemsCardapio;
    }

    void imprimirItensCardapio() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].descricao);
        }
    }
    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {

        for (int i = 0; i < itens.length; i++) {
            if(itens[i].preco >= precoMinimo && itens[i].preco <= precoMaximo)
                System.out.println(itens[i].descricao);
        }

    }

}
