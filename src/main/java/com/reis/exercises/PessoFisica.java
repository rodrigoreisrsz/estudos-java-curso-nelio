package com.reis.exercises;

public class PessoFisica extends Pessoa{
    private double rendaAnual;
    private double gastosComSaude;
    private boolean teveGastosComSaude = false;

    public PessoFisica(String nome, double rendaAnual) {
        super(nome);
        this.rendaAnual = rendaAnual;

    }

    public PessoFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome);
        this.rendaAnual = rendaAnual;
        this.gastosComSaude = gastosComSaude;
        this.teveGastosComSaude = true;
    }
    @Override
    public double calcularImposto(){
        if(rendaAnual >= 20000){
            double novaRenda = rendaAnual *  0.25;
            if(teveGastosComSaude == true){
                return novaRenda  - (gastosComSaude * 0.50);
            }else{
                return novaRenda;
            }


        }else{
            double novaRenda = rendaAnual *  0.15;
            if(teveGastosComSaude == true){
                return novaRenda  - (gastosComSaude *  0.50);
            }else{
                return novaRenda;
            }

        }

    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }
}
