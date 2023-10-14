package com.cassioferreirarod.junit;

public class TransferenciaEntreContas {

    public static void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
