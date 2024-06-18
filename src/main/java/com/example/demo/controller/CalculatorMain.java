package com.example.demo.controller;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorController cc = new CalculatorController();
        double result= cc.add(2.4, 3.0, 4.6);
        System.out.print(result);

    }


}
