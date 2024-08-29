import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data da primeira parcela: ");
        String dataPrimeiraParcela = input.nextLine();

        System.out.print("Digite a quantidade de parcelas: ");
        int quantidadeDeParcelas = input.nextInt();

        LocalDate dataParcela = LocalDate.parse(dataPrimeiraParcela, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        CalculadoraParcelas.calcularParcelas(dataParcela, quantidadeDeParcelas);

    }
}
