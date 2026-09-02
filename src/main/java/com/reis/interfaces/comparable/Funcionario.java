package com.reis.interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Funcionario implements Comparable<Funcionario>{

    private String name;
    private double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void listarFuncionarios() {
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\rodri\\Downloads\\in.txt.txt";//"C:\\Users\\User\\Downloads\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCSV = br.readLine();
            while (funcionarioCSV != null) {
                String[] fields = funcionarioCSV.split(",");
                list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCSV = br.readLine();

            }
            Collections.sort(list);
            for (Funcionario funcionario : list) {
                System.out.println(funcionario);
            }
        } catch (IOException e) {
            System.out.println("Err0: " + e.getMessage());

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Funcionario o) {
        return name.compareTo(o.getName()); // comparar os nomes
    }

}
