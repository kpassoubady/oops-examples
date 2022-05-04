package com.kavinschool.pattern.strategy;

public class Add implements Calculate {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
