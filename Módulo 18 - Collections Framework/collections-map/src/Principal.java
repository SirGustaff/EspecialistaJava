import com.algaworks.detran.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new TreeMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

//        System.out.println(proprietarios.get(bmw));

//        for (Carro carro : proprietarios.keySet()) {
//            System.out.println(carro);
//        }

//        for(Proprietario proprietario : proprietarios.values()) {
//            System.out.println(proprietario);
//        }

//        for (Carro carro : proprietarios.keySet()) {
//            Proprietario proprietario = proprietarios.get(carro);
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), proprietario.getNome());
//        }

//        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
//            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
//                    entry.getKey().getModelo(), entry.getValue().getNome());
//        }

        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
                    entry.getKey().getModelo(), entry.getValue().getNome());
        }

        proprietarios.put(porsche, jose);


    }
}

