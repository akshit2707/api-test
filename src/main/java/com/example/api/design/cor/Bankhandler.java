package com.example.api.design.cor;

public class Bankhandler extends PaymentHandler{
    public void handlePayment(int amount){
        if(amount<=500){
            System.out.println("processed by bank");
        }else {
            System.out.println("too much money for bank passing it on");
            next.handlePayment(amount);
        }
    }
}
