package com.kavinschool.pattern.singleton;

public class Government {
    private static Government governmentInstance;
    private String name;


    private Government() {
    }

    public static Government getInstance() {
        if (governmentInstance == null) {
            governmentInstance = new Government();
        }
        return governmentInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Government{" +
                "name='" + name + '\'' +
                '}' + " ==> " + super.toString();
    }
}
