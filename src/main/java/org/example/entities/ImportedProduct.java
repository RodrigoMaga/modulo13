package org.example.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " $ ");
        sb.append(totalPrice());
        sb.append(" (Customs fee: $" + String.format("%.2f", customsFee) + ")");
        return sb.toString();
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }
}
