import com.algaworks.agencia.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Caret Lodge", "Fortim/CE", 1300);
        Hotel hotel2 = new Hotel("Bar Selvagem", "Fortim/CE", 1400);
        Hotel hotel3 = new Hotel("ABC Fazenda Dona Carolina", "Itatipa/SP", 800);

        CadastroHotel cadastroHotel = new CadastroHotel();

        cadastroHotel.adicionar(hotel1);
        cadastroHotel.adicionar(hotel2);
        cadastroHotel.adicionar(hotel3);

        Collections.sort(cadastroHotel.obterTodos(), new PrecoHotelComparator());

        imprimirHoteis(cadastroHotel.obterTodos());

    }

    private static void imprimirHoteis(List<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.println(hotel);
        }
    }
}
