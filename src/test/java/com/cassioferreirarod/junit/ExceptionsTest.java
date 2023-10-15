package com.cassioferreirarod.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("147852", 0);
        Conta contaDestino = new Conta("789456", 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(()-> transferenciaEntreContas.transfere(contaOrigem,contaDestino,20));
    }
}
