package com.example.api.design.cor;

public class UpiHandler extends PaymentHandler{
    public void handlePayment(int amount){
        if(amount<=1000){
            System.out.println("processed by upi");
        }else {
            System.out.println("too much for upi, passing it on");
            next.handlePayment(amount);
        }
    }
}
