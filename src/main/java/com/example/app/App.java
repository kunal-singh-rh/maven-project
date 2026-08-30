package com.example.app;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Jenkins + SonarQube Maven Demo");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("5 * 6 = " + calculator.multiply(5, 6));
        System.out.println("10 / 2 = " + calculator.divide(10, 2));
    }
}
