package com.cassioferreirarod.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("João", LocalDate.of(1999, 7, 20));

        int idade = LocalDate.now().getYear() - pessoa.getNascimento().getYear();
        Assertions.assertEquals(24, idade);
    }

}