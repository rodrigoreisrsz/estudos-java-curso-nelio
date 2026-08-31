package com.reis.interfaces.fixacao.entities;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;//dependencia

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getValorTotal() / months;
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getData().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota)); // pega a lista de installments e adiciona um novo installment
        }
    }
}
