package com.reis.revisao.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Rodrigo");
        //nomes.add(8); → compilador nao permite pois ele sabe que a List espera valores em *String*
    }
}
