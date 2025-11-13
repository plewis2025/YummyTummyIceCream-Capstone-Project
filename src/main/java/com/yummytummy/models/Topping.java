package com.yummytummy.models;

public class Topping {
    private String name;
    private double price;
    private boolean isExtra;
    public Topping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra=isExtra;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExtra() {
        return isExtra;
    }
}
