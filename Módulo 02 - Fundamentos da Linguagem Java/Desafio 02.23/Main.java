import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();

        float valorHora = input.nextFloat();

        int horasTrabalhadas = input.nextInt();

        float valorDescontos = input.nextFloat();

        input.close();

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = %.2f%n", horasTrabalhadas, valorHora, valorHora * horasTrabalhadas);
        System.out.printf("Descontos: R$%.2f%n", valorDescontos);
        System.out.printf("Total devido: R$%.2f", valorHora * horasTrabalhadas - valorDescontos);
 
    }
}