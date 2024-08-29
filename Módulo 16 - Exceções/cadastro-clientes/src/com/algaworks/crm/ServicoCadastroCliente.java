package com.algaworks.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            throw new MenorDeIdadeException("Cliente menor de idade nao pode ser cadastrado");
        }

        return new Cliente(nome, idade);
    }

}
