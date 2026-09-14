package com.reis.SistemaFuncionarios.exceptions;

public class QuantidadeDeContratosInvalida extends RuntimeException {
    public QuantidadeDeContratosInvalida() {
        super("Não é possivel adicionar um numero negativo ou maior que 10");

    }
}
