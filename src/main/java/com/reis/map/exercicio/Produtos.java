package com.reis.map.exercicio;

public class Produtos {
    private String nome;
    private double preco;
    private int codigo;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        //this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
