package com.reis.fixacao;

import java.util.Date;

public class Contract {
    private int numero;
    private Date data;
    private double valor;


    public Contract(int numero, Date data, double valor){
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
