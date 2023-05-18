package com.example.api.design.cor;

public class PayPalHandler extends PaymentHandler{
    public void handlePayment(int amount){
        System.out.println("processed at Paypal");
    }
}
