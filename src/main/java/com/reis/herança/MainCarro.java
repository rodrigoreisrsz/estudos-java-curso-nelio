package com.reis.herança;

public class MainCarro {
    public static void main(String[] args) {
//        Carro carro = new Carro();
        GTR gtr = new GTR("GTR r35");
        Merceds mercedes = new Merceds("MW3");

        mercedes.dadosVeiculo();
        gtr.dadosVeiculo();
    }
}
