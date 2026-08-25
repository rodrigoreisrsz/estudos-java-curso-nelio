package com.reis.exceptions.exception.model.entities;

import com.reis.exceptions.exception.model.exceptions.DepositoInvalidoException;
import com.reis.exceptions.exception.model.exceptions.LimiteAtringidoException;
import com.reis.exceptions.exception.model.exceptions.SaldoInsuficienteException;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private double limite;


    public Conta(int numero, String dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
    }
    public void deposito(double valor){
        if(valor <=0){
            throw new DepositoInvalidoException("Não é possivel depositar um valor nulo.");
        }
        saldo += valor;
        System.out.println("Novo saldo: " + saldo);



    }
    public void saque(double valor){
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente! ");
        }
        if(valor > limite){
            throw new LimiteAtringidoException("Limite de saque atingido!");
        }
        saldo -= valor;
        System.out.println("Novo saldo: " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", dono='" + dono + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
