package com.kavinschool.pattern.strategy;

public class Sub implements Calculate{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
