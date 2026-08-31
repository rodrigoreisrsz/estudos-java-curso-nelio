package com.reis.interfaces.fixacao.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int numero;
    private LocalDate data;
    private double valorTotal;
    private List<Installment> installments = new ArrayList<>();

    public Contract(int numero, LocalDate data, double valotTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valotTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valotTotal) {
        this.valorTotal = valotTotal;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numero=" + numero +
                ", data=" + data +
                ", valotTotal=" + valorTotal +
                '}';
    }
}
