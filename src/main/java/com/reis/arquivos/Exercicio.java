package com.reis.arquivos;

public class Exercicio {
    public static void main(String[] args) {
        Produto produto = new Produto("sapato", 14, 3);
        Produto produto2 = new Produto("tenis", 200, 3);
        //produto.registrarCSV(produto);
        produto2.registrarCSV();
        produto2.valorTotal();
        produto2.registrarSummaryCSV();
    }
}
