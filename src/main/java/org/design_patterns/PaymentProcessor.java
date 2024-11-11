package org.design_patterns;

public class PaymentProcessor {

    public void paymentProcess(double amount, PaymentMethodType paymentMethod) {
        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
        System.out.println("Payment processing started");
        PaymentMethod paymentMethod1 = paymentMethodFactory.getPaymentMethod(paymentMethod);
        paymentMethod1.handlePaymentProcessing(amount);
    }
}
