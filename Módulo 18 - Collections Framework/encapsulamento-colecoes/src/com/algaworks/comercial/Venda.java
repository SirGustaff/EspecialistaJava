package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(ItemVenda item) {

        if(excedeLimiteDeCompra(item))
            throw new LimiteDeCompraExcedidoException("Limite excedido por: " + item.getDescricao());

        valorTotal += item.getValor();
        itens.add(item);
    }

    private boolean excedeLimiteDeCompra(ItemVenda itemVenda) {
        return valorTotal + itemVenda.getValor()  > getCliente().getLimiteCompras();
    }

}
