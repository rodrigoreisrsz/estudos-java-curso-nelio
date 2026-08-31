package com.reis.interfaces.fixacao.application;

import com.reis.interfaces.fixacao.entities.Contract;
import com.reis.interfaces.fixacao.entities.ContractService;
import com.reis.interfaces.fixacao.entities.Installment;
import com.reis.interfaces.fixacao.entities.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy)");
        LocalDate date = LocalDate.parse(sc.next(), fmt); // pega texto e vira date
        System.out.println("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contract contract = new Contract(numero, date, valorTotal);

        System.out.println("Numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);


        System.out.println("Parcelas: ");
        for(Installment installment: contract.getInstallments())
            System.out.println(installment);





        sc.close();
    }
}
