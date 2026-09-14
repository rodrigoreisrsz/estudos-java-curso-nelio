package com.reis.logicadeprogramacao.app;

import com.reis.logicadeprogramacao.entities.Produtos;
import com.reis.logicadeprogramacao.exception.IdInexistenteException;

import java.util.Scanner;

import static com.reis.logicadeprogramacao.entities.Produtos.produtos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produtos.adicionarProduto();
        //Produtos.listarProdutos();

//        try{
//            Produtos.escolherProduto();
//        }catch(IdInexistenteException e){
//            e.printStackTrace();
//        }

        produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        System.out.println(produtos);


    }
}
