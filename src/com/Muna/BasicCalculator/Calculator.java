package com.Muna.BasicCalculator;

public class Calculator {

    public Calculator() {

    }

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multipy(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public int modulo(int a, int b) {
        int result = a % b;
        return result;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(49, 263));
        System.out.println(myCalculator.subtract(427, 154));
    }

}
