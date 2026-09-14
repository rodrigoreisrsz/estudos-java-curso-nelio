package com.reis.lambda;
import java.util.Comparator;
import com.reis.map.Product;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2){
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
}
