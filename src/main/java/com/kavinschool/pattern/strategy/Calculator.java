package com.kavinschool.pattern.strategy;

public class Calculator {
    private Calculate calculate;

    public Calculator(Calculate calculate) {
        this.calculate = calculate;
    }

    public int calculate(int num1, int num2) {
        return calculate.doOperation(num1, num2);
    }
}
