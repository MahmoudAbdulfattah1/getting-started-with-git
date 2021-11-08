package com.git.learn;

public class Main {

    public int adder(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(new Main().adder(2, 5));
    }
}
