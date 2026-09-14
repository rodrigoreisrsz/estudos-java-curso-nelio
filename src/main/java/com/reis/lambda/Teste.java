package com.reis.lambda;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> aluno = new ArrayList<>();

        aluno.add("Rodrigo");
        aluno.add("Ray");


        //aluno.sort((aluno1, aluno2) -> aluno1.toUpperCase().compareTo(aluno2.toUpperCase()));
        aluno.sort((aluno1, aluno2) -> aluno1.compareTo(aluno2));
        System.out.println(aluno);
    }
}
