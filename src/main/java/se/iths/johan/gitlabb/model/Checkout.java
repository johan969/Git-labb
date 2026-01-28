package se.iths.johan.gitlabb.model;

import java.util.List;

public class Checkout {
    private String paymentMethod;
    private List<String> products;
    private String currency;

    public Checkout(String paymentMethod, List<String> products, String currency) {
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

    public String getCurrency() {
        return currency;
    }
}
