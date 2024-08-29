import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws ParseException {

//        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//
        Scanner input = new Scanner(System.in);
//        String dataTexto = input.nextLine();
//
//        Date data = formatador.parse(dataTexto);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(data);
//
//        System.out.println(calendar.getTime());
//
//        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER && calendar.get(Calendar.DAY_OF_MONTH) == 25) {
//            System.out.println("Você nasceu no natal!");
//        }
//
        int mes = input.nextInt();
        int dia = input.nextInt();
        int ano = input.nextInt();

        Calendar data = Calendar.getInstance();

        data.set(Calendar.DAY_OF_MONTH, dia);
        data.set(Calendar.MONTH, mes);
        data.set(Calendar.YEAR, ano);

        data.set(Calendar.HOUR, 0);
        data.set(Calendar.MINUTE, 0);
        data.set(Calendar.SECOND, 0);
        data.set(Calendar.MILLISECOND, 0);


        DateFormat formatador = new SimpleDateFormat("EEEE");


        System.out.println(formatador.format(data.get(Calendar.DAY_OF_WEEK)));


    }
}
