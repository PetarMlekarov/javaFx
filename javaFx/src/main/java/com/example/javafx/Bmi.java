package com.example.javafx41a;

public class Bmi {
    private String name;
    private int age;
    private double weight;
    private double height;

    private double bmi;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = 0;
    }

    public Bmi(String name, double weight, double height) {
        this(name, 0, weight, height);
    }

    public double getBmi() {
        bmi = 10000 * weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        return bmi < 18.5 ? "Underweight"
                : bmi < 25 ? "Healthy"
                : bmi < 30 ? "Overweight"
                : "Obese";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
