package com.reis.interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("ray", 20000);
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\rodri\\Downloads\\in.txt.txt"; //"C:\\Users\\User\\Downloads\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();
            while(name != null){
                list.add(name);
                name = br.readLine();

            }
            Collections.sort(list);
            for(String s : list){
                System.out.println(s);
            }
        } catch(IOException e){
            System.out.println("Err0: " + e.getMessage());

        }
        funcionario.listarFuncionarios();
    }


}


