package com.reis.map.exercicio;



import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Gerenciamento {
    public static void main(String[] args) {
        Set<Produtos> estoque = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de produtos para inserção: ");
        int quantidade = sc.nextInt();
        for(int i = 0; i < quantidade; i++){
            sc.nextLine();
            System.out.println("Nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Preço do produto:");
            double preco = sc.nextDouble();
            Produtos produto = new Produtos(nome, preco);
            estoque.add(produto);
        }


    }
}
