package org.design_patterns;

public class PaymentMethodFactory {

    public PaymentMethod getPaymentMethod(PaymentMethodType paymentMethodType) {
        if(paymentMethodType == PaymentMethodType.VISA)
            return new VisaPaymentMethod();
        if (paymentMethodType == PaymentMethodType.MASTERCARD)
            return new MastercardPaymentMethod();
        if (paymentMethodType == PaymentMethodType.PAYPAL)
            return new PaypalPaymentMethod();
        throw new IllegalArgumentException("Unsupported payment method type");
    }
}
