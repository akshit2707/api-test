//package com.example.api.design;
//
//import com.example.api.design.cor.Bankhandler;
//import com.example.api.design.cor.PayPalHandler;
//import com.example.api.design.cor.PaymentHandler;
//import com.example.api.design.cor.UpiHandler;
//
//public class COR {
//    public static void main(String[] args){
//        PaymentHandler bankhandler = new Bankhandler();
//        PaymentHandler upi = new UpiHandler();
//        PaymentHandler paypal = new PayPalHandler();
//        bankhandler.setNext(upi);
//        upi.setNext(paypal);
//        bankhandler.handlePayment(1001);
//        bankhandler.handlePayment(500);
//        bankhandler.handlePayment(10);
//        bankhandler.handlePayment(100001);
//        bankhandler.handlePayment(800);
//
//
//    }
//}
