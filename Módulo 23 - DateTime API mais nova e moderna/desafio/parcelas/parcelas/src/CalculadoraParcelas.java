import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculadoraParcelas {

    public static void calcularParcelas(LocalDate dataPrimeiraParcela, int quantidadeDeParcelas) {

        LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(1);

        for (int i = 2; i <= quantidadeDeParcelas; i++) {

            System.out.printf("%d - %s%n", i, dataProximaParcela.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            dataProximaParcela = dataPrimeiraParcela.plusMonths(i);

        }

    }

}
