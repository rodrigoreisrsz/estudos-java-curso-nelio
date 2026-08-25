package com.reis.exceptions.exception.application;

import com.reis.exceptions.exception.model.entities.Conta;
import com.reis.exceptions.exception.model.exceptions.DepositoInvalidoException;
import com.reis.exceptions.exception.model.exceptions.LimiteAtringidoException;
import com.reis.exceptions.exception.model.exceptions.SaldoInsuficienteException;

public class ContaMain {
    public static void main(String[] args)   {
        Conta conta = new Conta(1, "Rd", 0, 300);
        try {
            conta.deposito(400);
            conta.saque(200);
            conta.saque(300);
        }catch(DepositoInvalidoException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(LimiteAtringidoException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(SaldoInsuficienteException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
