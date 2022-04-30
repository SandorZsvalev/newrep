package com.company;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        while (b > a) {
            if (b % 3 == 0) {
                System.out.println(b);
            }
            b--;
        }
    }
}
