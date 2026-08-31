package com.reis.interfaces.model.application;

import com.reis.interfaces.model.entities.CarRental;
import com.reis.interfaces.model.entities.Vehicle;
import com.reis.interfaces.model.service.BrazilTaxService;
import com.reis.interfaces.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt); // le o nextline e converte pro formato fmt
        System.out.println("Retorno (dd/MM/yyyy hh:mm)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt); // le o nextline e converte pro formato fmt

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Digite o preço por hora");
        double pricePerHour = sc.nextDouble();
        System.out.println("Digite o preço por dia");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("Fatura: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Total: " + cr.getInvoice().getTotalPayment());

    }
}
