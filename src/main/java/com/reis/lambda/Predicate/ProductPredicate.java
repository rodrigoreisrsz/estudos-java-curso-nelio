package com.reis.lambda.Predicate;
import com.reis.map.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p){
        return p.getValor() >= 100;
    }


}
