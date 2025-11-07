package org.example.entities;

public class Natural extends Person {
    private Double healthExpenses;

    public Natural() {
        super();
    }

    public Natural(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        if (getAnnualIncome() < 20000) {
            return (getAnnualIncome() * 0.15) - (getHealthExpenses() * 0.5);
        } else {
            return (getAnnualIncome() * 0.25) - (getHealthExpenses() * 0.5);
        }
    }


}
