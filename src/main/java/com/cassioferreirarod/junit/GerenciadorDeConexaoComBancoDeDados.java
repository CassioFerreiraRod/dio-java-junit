package com.cassioferreirarod.junit;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        // fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void inserirDados(Pessoa pessoa) {
        // insere pessoa no bd
        LOGGER.info("inseiu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        // remove pessoa no bd
        LOGGER.info("removeu dados");
    }
}
