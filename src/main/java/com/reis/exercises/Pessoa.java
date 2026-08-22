package com.reis.exercises;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    abstract double calcularImposto();

    @Override
    public String
    toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
