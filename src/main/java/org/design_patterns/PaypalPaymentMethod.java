package org.design_patterns;

public class PaypalPaymentMethod implements PaymentMethod{
    @Override
    public void handlePaymentProcessing(double amount) {
        System.out.println("handle payment operation on amount "+amount+" with paypal payment method");
    }
}
