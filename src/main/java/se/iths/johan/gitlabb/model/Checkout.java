package se.iths.johan.gitlabb.model;

import java.util.List;

public class Checkout {
    private String paymentMethod;
    private List<String> products;
    private char currency;

    public Checkout(String paymentMethod, List<String> products, char currency) {
        this.paymentMethod = paymentMethod;
        this.products = products;
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public List<String> getProducts() {
        return products;
    }

    public char getCurrency() {
        return currency;
    }
}
