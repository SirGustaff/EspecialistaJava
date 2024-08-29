import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContaPoupanca minhaConta = new ContaPoupanca();
        double valor = 0;

        System.out.println("Comandos:\n1 -> Depositar\n2 -> Sacar\n3 -> Ver Extrato");

        while(true) {
            System.out.println();
            System.out.print("Selecione uma opcao: ");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.print("Valor do deposito: ");
                    valor = input.nextDouble();
                    minhaConta.depositar(valor);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Valor do saque: ");
                    valor = input.nextDouble();
                    try {
                        minhaConta.sacar(valor);
                    }
                    catch (SaqueMaiorQueSaldoException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Extrato:");
                    minhaConta.verExtrato();
                    break;
                default:
                    System.out.println();
                    System.out.println("Nenhum valor valido foi selecionado");
                    break;
            }
        }
    }
}
















