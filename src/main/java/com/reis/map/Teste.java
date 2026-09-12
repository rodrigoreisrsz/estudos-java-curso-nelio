package com.reis.map;

import java.util.HashMap;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Chuteira", 899.0);
        Product p2 = new Product("sapato", 199.0);

        stock.put(p1, 699.0);

        System.out.println(stock.get(p1));
    }
}
