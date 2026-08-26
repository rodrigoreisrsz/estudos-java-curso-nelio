package com.reis.arquivos;

import java.io.*;

public class Conta {
    private String dono;
    private double saldo;

    public Conta(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }
    public double deposito(double valor){
        return saldo += valor;
        //registrar();
    }
    public double sacar(double valor){
        return saldo -= valor;
    }
    public void registrar(){
        String path = "C:\\Users\\User\\Desktop\\file.txt";
        String text = "Saldo atualizado:  "+ saldo + " Dono: " + dono;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(text);
            bw.newLine();

        }catch(IOException e){
            System.out.println("erro "+ e.getMessage());
        }
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

    @Override
    public String toString() {
        return "Pratica{" +
                "dono='" + dono + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
