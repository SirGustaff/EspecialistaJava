import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {

        Path arquivo = Path.of("E:\\Faculdade e Estudos\\Cursos externos\\" +
                "Java Algaworks\\Módulo 16 - Exceções\\excecoes\\teste\\teste.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
