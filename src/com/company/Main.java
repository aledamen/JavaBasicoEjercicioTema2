package com.company;

public class Main {
    public static void main(String[] args) {
        pricePlusIva(10);
    }
    public static int pricePlusIva(int price){
        int iva = 10;
        return price + iva;
    }
}