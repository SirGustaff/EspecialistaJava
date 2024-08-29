import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("4564565462123.55");
        BigDecimal y = new BigDecimal("0.30");

        //NumberFormat formatador = new DecimalFormat("¤#,##0.00#");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println(formatador.format(y));

    }
}
