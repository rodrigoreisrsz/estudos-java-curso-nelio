package com.reis.logicadeprogramacao.entities;

import com.reis.logicadeprogramacao.exception.IdInexistenteException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Produtos {
    private String nome;
    private int id;
    private double preco;

    public static List<Produtos> produtos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public Produtos(){

    }

    public Produtos(String nome, int id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }
    public static Produtos adicionarProduto(){

        System.out.println("Quantidade de produtos");
        int quantidade = sc.nextInt();
        for(int i =0; i<= quantidade; i++){
            System.out.println("Digite o nome do produto");
            String nomeProduto = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite o ID do produto");
            int id = sc.nextInt();
            System.out.println("Digite o preço");
            double preco = sc.nextDouble();
            Produtos produto = new Produtos(nomeProduto, id, preco);
            produtos.add(produto);
            return produto;

        }

        return null;
    }

    public static void listarProdutos(){
        for(Produtos produto: produtos){
            System.out.println("Produtos : " + produto.getNome());
        }
    }
    public static void escolherProduto() throws IdInexistenteException{

        int escolha = 0;
        do{
            try{
                System.out.println("Escolha um produto pelo ID: ");
                escolha = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Digite apenas números");
            }
        }while(escolha == 0);
        for(Produtos produto: produtos){
            if(escolha == produto.getId()){
                System.out.println(produto);
            }else{
                throw new IdInexistenteException();
            }
        }





    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId(){
        return id;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String

    toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }


}
