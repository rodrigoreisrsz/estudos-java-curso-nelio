package com.reis.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidade;
    private double valorTotal;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    public double valorTotal(){
        return valorTotal = precoUnitario * quantidade;
    }
    public void registrarCSV(){
        String path = "C:\\Users\\User\\Downloads\\produtos.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(nome + ","+precoUnitario + ","+quantidade);
            bw.newLine();
        }catch(IOException e){
            System.out.println("Erro: " +  e.getMessage());
        }
    }
    public void registrarSummaryCSV(){
        Path pasta = Paths.get( "C:\\Users\\User\\Downloads\\out");
        Path arquivo = pasta.resolve( "summary.csv");
        try{
            Files.createDirectories(pasta);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));){
                bw.write(nome + "," + valorTotal);
                bw.newLine();
            }catch(IOException e){
                e.getMessage();
            }

        }catch(IOException e){
            e.getMessage();
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}
