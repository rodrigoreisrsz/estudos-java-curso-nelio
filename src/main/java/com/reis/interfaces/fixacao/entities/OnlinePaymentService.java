package com.reis.interfaces.fixacao.entities;

public interface OnlinePaymentService {
    public double paymentFee(double amount);
    double interest(double amount, int months);
}
