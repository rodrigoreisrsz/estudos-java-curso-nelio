package com.reis.herança;

public class GTR extends Carro{
    public GTR(String marca) {
        super(marca);
    }
    @Override
    public void dadosVeiculo(){
        System.out.println(getMarca());

    }
}
