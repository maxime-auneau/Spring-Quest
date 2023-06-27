package com.wildcodeschool.myProject.model;

public class Doctor {
    private final int number;
    private final String name;

    public Doctor(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
