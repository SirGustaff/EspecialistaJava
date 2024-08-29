package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiario nao possui conta bancaria");
        }

        System.out.printf("DEBUG: Efetuando transferencia para %s no valor de %.2f com a " +
                        "chave %s%n", beneficiario.getNome(), documento.getValorTotal(),
                beneficiario.getContabancaria());
    }

}
