package com.reis.arquivos;

public class PraticaMain {
    public static void main(String[] args) {
        Conta conta = new Conta("Rd", 200);
        conta.deposito(100);
        conta.deposito(100);
        conta.deposito(600);
        conta.sacar(200);
        conta.sacar(799);
        conta.registrar();
    }
}
