package com.reis.lambda;

import com.reis.map.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("zap", 899.0));
        products.add( new Product("sapato", 199.0));
        products.add( new Product("jordan", 199.0));
        products.add(new Product("Chuteira", 899.0));

        // outra forma de comparar
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
//            }
//        };

        // usando expressões lambda
        Comparator<Product> compLambda = (p1, p2) ->  p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

        // outra maneira
        //products.sort( (p1, p2) ->  p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()););
        products.sort(compLambda);

        //products.sort(new MyComparator()); // ordena por ordem alfabetica
        for(Product p: products){
            System.out.println(p);
        }
    }
}
