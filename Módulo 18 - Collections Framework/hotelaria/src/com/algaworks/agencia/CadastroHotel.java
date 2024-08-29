package com.algaworks.agencia;

import java.util.*;

public class CadastroHotel {

    private final List<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {

        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if(hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel ja foi adicionado");
        }

        hoteis.add(new Hotel(nome, cidade, precoDiaria));
    }

    public void adicionar(Hotel hotel) {

        if(hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel ja foi adicionado");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {

        ListIterator<Hotel> hotelIterator = hoteis.listIterator();

        while(hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if(hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }

    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel nao encontrado para remocao");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);
    }
}
