package org.example.entities;

public class Legal extends Person {
    private Integer employeeAmount;

    public Legal() {
        super();
    }

    public Legal(String name, Double annualIncome, Integer employeeAmount) {
        super(name, annualIncome);
        this.employeeAmount = employeeAmount;
    }

    public Integer getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    @Override
    public Double tax() {
        if (employeeAmount < 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }
}
