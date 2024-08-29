import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator {

    private ArrayList<Integer> numerosSorteados = new ArrayList<>();
    private int posicao = 0;

    SorteadorIterator() {

        Random random = new Random();

        for (int i = 0; i < 6; i++) {

            int numeroSorteado = random.nextInt(0, 60);

            while(numerosSorteados.contains(numeroSorteado)) {
                numeroSorteado = random.nextInt(0, 60);
            }

            numerosSorteados.add(numeroSorteado);
        }
    }

    @Override
    public boolean hasNext() {
        return posicao < numerosSorteados.size();
    }

    @Override
    public Integer next() {

        if(!hasNext()) {
            throw new NoSuchElementException("Todos numeros ja foram sorteados");
        }

        return numerosSorteados.get(posicao++);
    }

}
