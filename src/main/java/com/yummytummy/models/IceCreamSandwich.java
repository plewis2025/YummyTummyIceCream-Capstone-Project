package com.yummytummy.models;

import java.util.ArrayList;
import java.util.List;

public class IceCreamSandwich {
    private String cookieType;
    private String iceCreamFlavor;
    private List<Topping> toppings = new ArrayList<>();
    private double basePrice = 4.00;

    public IceCreamSandwich(String cookieType, String iceCreamFlavor) {
        this.cookieType = cookieType;
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculatePrice() {
        double total = basePrice;
        for (Topping t : toppings) {
            total += t.getPrice();
        }
        return total;
    }

    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append(cookieType).append(" + ").append(iceCreamFlavor);

        if (!toppings.isEmpty()) {
            sb.append(" (Toppings: ");
            for (int i = 0; i < toppings.size(); i++) {
                sb.append(toppings.get(i).getName());
                if (i < toppings.size() - 1) sb.append(", ");
            }
            sb.append(")");
        } else {
            sb.append(" (No toppings)");
        }

        sb.append(" -> $").append(String.format("%.2f", calculatePrice()));
        return sb.toString();
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}
