import java.math.BigDecimal;
import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.print("Preço do produto em Dólares: ");
        String valorDolar = input.next();

        BigDecimal preco = dolarParaBigDecimal(valorDolar);

        System.out.print("Cotação do 1 Dólar em Real: ");
        String valorDolarEmReal = input.next();

        BigDecimal cotacaoDolar = realParaBigDecimal(valorDolarEmReal);

        BigDecimal valorTotal = preco.multiply(cotacaoDolar);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.printf("Preço do produto em Reais: %s%n", formatador.format(valorTotal));
    }

    private static BigDecimal dolarParaBigDecimal(String valor) throws ParseException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("en", "US"));

        DecimalFormat formatador = new DecimalFormat("#,###.##");
        formatador.setDecimalFormatSymbols(symbols);
        formatador.setParseBigDecimal(true);

        return (BigDecimal) formatador.parse(valor);
    }

    private static BigDecimal realParaBigDecimal(String valor) throws ParseException {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));

        DecimalFormat formatador = new DecimalFormat("#,###.##");
        formatador.setDecimalFormatSymbols(symbols);
        formatador.setParseBigDecimal(true);

        return (BigDecimal) formatador.parse(valor);
    }

}
