public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "M3";
        meuCarro.fabricante = "BMW";
        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2015;
        meuCarro.valorCompra = 90000;

        Pessoa eu = new Pessoa();
        eu.anoNascimento = 2005;
        eu.cpf = "923.012.123-28";
        eu.nome = "Gustavo Carvalho";

        meuCarro.proprietario = eu;

        System.out.println("Dados do carro:");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Ano de Fabricação: " + meuCarro.anoFabricacao);

        System.out.println();

        System.out.println("Dados do proprietário:");
        System.out.println("Nome: " + meuCarro.proprietario.nome);
        System.out.println("Ano de Nascimento: " + meuCarro.proprietario.anoNascimento);
        System.out.println("Cpf: " + meuCarro.proprietario.cpf);

        System.out.println();
        meuCarro.calcularValorRevenda();

    }
}
