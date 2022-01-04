package com.company;


public class Main {
    public static void main(String[] args) {
        Complex com = new Complex(4,1);
        System.out.println(com);
        com.divide(3, 2);
        System.out.println(com);
    }
}
