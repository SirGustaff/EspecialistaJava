import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.List;


public class Principal {
    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatipa/SP", 800);

        cadastro.adicionar("Vila Selvagem", "Fortaleza/CE", 1400);

        //System.out.println(cadastro.obterTodos());

        List<Hotel> hoteis = cadastro.obterTodos();

        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(List<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.println(hotel);
        }

    }
}
