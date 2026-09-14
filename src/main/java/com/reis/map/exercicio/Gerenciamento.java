package com.reis.map.exercicio;



import java.util.*;

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

            System.out.println("Codigo do produto: ");
            int codigo = sc.nextInt();

            Produtos produto = new Produtos(nome, preco);
            estoque.add(produto);

            Map<Produtos, Integer> codigos = new HashMap<>();
            codigos.put(produto, codigo);

            System.out.println(codigos.get(codigo));

        }



    }
}
