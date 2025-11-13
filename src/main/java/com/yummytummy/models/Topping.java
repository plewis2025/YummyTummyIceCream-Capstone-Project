package com.yummytummy.models;

public class Topping {
    private String name;
    private double price;
<<<<<<< HEAD
    private boolean isExtra;
    public Topping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra=isExtra;
=======

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
>>>>>>> 9a132f1fd583aefd0cd23316c1aafe9fef642997
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
<<<<<<< HEAD

    public boolean isExtra() {
        return isExtra;
    }
=======
>>>>>>> 9a132f1fd583aefd0cd23316c1aafe9fef642997
}
