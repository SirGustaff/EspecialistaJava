import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal1 {
    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();

        Locale.setDefault(new Locale("en", "US"));

        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);



        System.out.println(formatador.format(dataHora));



    }
}
