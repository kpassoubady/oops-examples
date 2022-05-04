package com.kavinschool.pattern.builder;

public class DogInternalBuilderDemo {
    public static void main(String[] args) {
        Dog mimi = new Dog.Builder()
                .withName("mimi")
                .withAge(5)
                .withSize("small")
                .withColor("Brown")
                .build();
        System.out.println(mimi);
    }
}
