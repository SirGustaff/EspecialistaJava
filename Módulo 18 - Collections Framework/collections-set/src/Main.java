import com.algaworks.crm.Contato;
import com.algaworks.crm.IdadeContatoComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        contatos.add(new Contato("Josefina", "josefina@algaworks.com", 70));

        for (Contato contato : contatos) {
            System.out.println(contato);
        }

    }

}
