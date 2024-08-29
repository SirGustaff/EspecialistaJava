package com.algaworks.comercial;

public class LimiteDeCompraExcedidoException extends RuntimeException{
    LimiteDeCompraExcedidoException(String message) {
        super(message);
    }
}
