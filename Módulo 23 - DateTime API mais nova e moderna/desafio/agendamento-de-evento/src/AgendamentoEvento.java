import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class AgendamentoEvento {

    private static LocalDate dataEvento;
    private static LocalTime horaEvento;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(dataEvento == null) {

            try {

                System.out.print("Data do evento: ");
                String dataTexto = input.next();

                dataEvento = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            } catch (DateTimeParseException dateTimeParseException) {

                System.out.println("Data inválida. Tente novamente");

            }

        }

        while(horaEvento == null) {

            try {

                System.out.print("Horário do evento: ");
                String horaTexto = input.next();

                    horaEvento = LocalTime.parse(horaTexto, DateTimeFormatter.ofPattern("HH:mm"));

            } catch (DateTimeParseException dateTimeParseException) {

                System.out.println("Horário inválido. Tente novamente");

            }

        }

        LocalDateTime dataHoraEvento = LocalDateTime.of(dataEvento, horaEvento);

        System.out.println("Evento agendado para " +
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).format(dataHoraEvento));

    }
}
