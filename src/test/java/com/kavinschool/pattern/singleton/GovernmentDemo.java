package com.kavinschool.pattern.singleton;

public class GovernmentDemo {
    public static void main(String[] args) {
        Government government  = Government.getInstance();
        government.setName("India");
        System.out.println(government);

        government = Government.getInstance();
        government.setName("USA");
        System.out.println(government);

        government = null;
        System.out.println(government);

        government = Government.getInstance();
        government.setName("Canada");
        System.out.println(government);
    }
}
