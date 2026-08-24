package com.reis.exceptions.exception.application;

import com.reis.exceptions.exception.model.entities.Conta;

public class ContaMain {
    public static void main(String[] args)   {
        Conta conta = new Conta(1, "Rd", 0, 300);
        conta.deposito(-400);
        conta.saque(400);
    }
}
