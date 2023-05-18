package com.example.api.design.cor;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    public void setNext(PaymentHandler next){
        this.next  = next;
    }
    public abstract void handlePayment(int amount);
}
