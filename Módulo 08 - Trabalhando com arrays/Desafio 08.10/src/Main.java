public class Main {
    public static void main(String[] args) {

        Cardapio novoCardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;
        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;
        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        novoCardapio.adicionarItem(item1);
        novoCardapio.adicionarItem(item2);
        novoCardapio.adicionarItem(item3);




        novoCardapio.imprimirItensCardapio();

    }
}
