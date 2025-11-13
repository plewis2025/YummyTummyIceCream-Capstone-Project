package com.yummytummy.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<IceCreamSandwich> sandwiches = new ArrayList<>();

    public void addSandwich(IceCreamSandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public double getTotal() {
        double total = 0;
        for (IceCreamSandwich s : sandwiches)
            total += s.calculatePrice();
        return total;
    }

    public String getSummary() {
        if (sandwiches.isEmpty()) return "No items in order.";
        StringBuilder sb = new StringBuilder();
        sb.append("Yummy Tummy Ice Cream Sandwich Order:\n");
        int idx = 1;
        for (IceCreamSandwich s : sandwiches) {
            sb.append(idx++).append(") ").append(s.getSummary()).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", getTotal())).append("\n");
        return sb.toString();
    }

    public List<IceCreamSandwich> getSandwiches() { return sandwiches; }
}

