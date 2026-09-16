package com.reis.lambda.Predicate;


// A partir de uma lista remover somente aqueles cujo preço mínimo seja 100.

import com.reis.map.Product;

import java.util.ArrayList;
import java.util.List;

public class Problema {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 3000));
        list.add(new Product("mouse", 90));

        //list.removeIf(p -> p.getValor() >= 100); // pode ser feito assim
        list.removeIf(new ProductPredicate()); // funciona da mesma forma que a expressão lambda
        for(Product p : list){
            System.out.println(p);
        }
    }
}
