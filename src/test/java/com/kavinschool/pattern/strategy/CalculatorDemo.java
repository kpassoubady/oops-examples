package com.kavinschool.pattern.strategy;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Add());
        System.out.println("Add Result:" + calculator.calculate(10,5));

        calculator = new Calculator(new Sub());
        System.out.println("Sub Result:" + calculator.calculate(10,5));
    }

}
