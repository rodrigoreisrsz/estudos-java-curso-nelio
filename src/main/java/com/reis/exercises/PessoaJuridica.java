package com.reis.exercises;

public class PessoaJuridica extends Pessoa{
    private double rendaAnual;
    private int numeroDeFuncionarios;
    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome);
        this.rendaAnual = rendaAnual;
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    @Override
    public double calcularImposto(){
        if(numeroDeFuncionarios >= 10){
            return rendaAnual * 0.14;
        }else{
            return rendaAnual *  0.16;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}
