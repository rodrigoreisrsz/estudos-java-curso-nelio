package com.reis.fixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com os dados do contrato:");
        System.out.println("Nùmero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        String date = sc.nextLine();
        LocalDate data = LocalDate.parse(date, formatter);
        System.out.println(data);
    }
}
