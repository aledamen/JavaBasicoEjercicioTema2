package com.company;

public class Main {
    public static void main(String[] args) {
        pricePlusIva(10);
    }
    public static double pricePlusIva(int price){
        double iva = price * 0.21;
        return price + iva;
    }
}