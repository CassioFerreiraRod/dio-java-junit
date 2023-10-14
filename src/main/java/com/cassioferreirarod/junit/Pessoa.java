package com.cassioferreirarod.junit;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getNascimento(), pessoa.getNascimento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNascimento());
    }
}