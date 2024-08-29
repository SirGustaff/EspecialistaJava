import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data: ");
        Date data = formatador.parse(input.nextLine());

        System.out.print("Digite a quantidade de parcelas: ");
        int quantidadeParcelas = input.nextInt();

        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas(data, quantidadeParcelas);

        calculadoraParcelas.imprimirParcelas();

    }
}