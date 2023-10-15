package com.cassioferreirarod.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosTeste() {
        GerenciadorDeConexaoComBancoDeDados.inserirDados(new Pessoa("Mario",LocalDateTime.of(
                1985,3,14,4,0,0)));
    }

    @AfterEach
    void removeDadosTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Mario", LocalDateTime.of(
                1985, 3,14,4,0,0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}
