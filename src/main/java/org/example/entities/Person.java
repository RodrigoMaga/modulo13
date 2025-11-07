package org.example.entities;

public abstract class Person {
    private String name;
    private Double annualIncome;

    public Person() {
        super();
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract Double tax();

    @Override
    public String toString() {
        return name + ": " + "$ " + String.format("%.2f",tax());
    }
}
