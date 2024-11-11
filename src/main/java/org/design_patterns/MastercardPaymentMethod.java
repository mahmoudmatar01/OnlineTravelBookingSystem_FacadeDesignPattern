package org.design_patterns;

public class MastercardPaymentMethod implements PaymentMethod{
    @Override
    public void handlePaymentProcessing(double amount) {
        System.out.println("handle payment operation on amount "+amount+" with mastercard payment method");
    }
}
