package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    private List<PacoteViagem> pacoteViagems = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {

        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if(pacoteViagems.contains(pacoteViagem)) {
            throw new IllegalArgumentException("Este pacote viagem ja existe na lista");
        }

        pacoteViagems.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagems;
    }

    public void ordenar() {
        Collections.sort(pacoteViagems);
    }

    public void ordenarPorPrecoDecrescente() {
        Collections.sort(pacoteViagems, Collections.reverseOrder());
    }

    public void removerPorDescricao(String descricao) {

        Iterator<PacoteViagem> iterator = pacoteViagems.iterator();

        while(iterator.hasNext()) {

            PacoteViagem pacoteViagem = iterator.next();

            if(pacoteViagem.getDescricao().equals(descricao)) {
                iterator.remove();
                return;
            }

        }

        throw new NoSuchElementException(String.format("Elemento nao encontrado, nenhum pacote removido."));
    }

    public PacoteViagem buscarPorDescricao(String descricao) {

        for(PacoteViagem pacoteViagem : pacoteViagems) {

            if(pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }

        }

        throw new NoSuchElementException(String.format("Elemento nao encontrado."));
    }
}