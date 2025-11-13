package com.yummytummy.ui;

import com.yummytummy.models.*;
import com.yummytummy.util.ReceiptWriter;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void start() {
        System.out.println("\u001B[35m🍦 Welcome to YUMMY TUMMY ICE CREAM! 🍦\u001B[0m");
        System.out.println("\u001B[33mPick your flavor of happiness!\u001B[0m");
        System.out.println("\u001B[36m------------------------------------\u001B[0m");

        boolean running = true;
        while (running) {
            System.out.println("\n1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");
            String line = scanner.nextLine();
            if (line.isBlank()) continue;
            switch (line) {
                case "1" -> startNewOrder();
                case "0" -> {
                    System.out.println("Thank you! Come again soon! 🍨");
                    running = false;
                }
                default -> System.out.println("Invalid option. Try again!");
            }
        }
    }

    private void startNewOrder() {
        currentOrder = new Order();
        boolean ordering = true;
        while (ordering) {
            System.out.println("\n1) Add Ice Cream Sandwich");
            System.out.println("2) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addIceCreamSandwich();
                case "2" -> {
                    checkout();
                    ordering = false;
                }
                case "0" -> {
                    System.out.println("Order canceled ❌");
                    ordering = false;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addIceCreamSandwich() {
        System.out.println("\n🍪 Choose your cookie base (type number):");
        System.out.println("1) Chocolate Chip");
        System.out.println("2) Vanilla Cookie");
        System.out.println("3) Strawberry Cookie");
        System.out.println("4) Oreo Cookie");
        System.out.println("5) Red Velvet Cookie");
        System.out.print("Choice: ");
        String cookie = switch (scanner.nextLine()) {
            case "1" -> "Chocolate Chip Cookie";
            case "2" -> "Vanilla Cookie";
            case "3" -> "Strawberry Cookie";
            case "4" -> "Oreo Cookie";
            case "5" -> "Red Velvet Cookie";
            default -> "Chocolate Chip Cookie";
        };

        System.out.println("\n🍨 Choose your ice cream flavor (type number):");
        System.out.println("1) Matcha");
        System.out.println("2) Pumpkin Cheesecake");
        System.out.println("3) Strawberry Swirl");
        System.out.println("4) Vanilla");
        System.out.println("5) Sherbert");
        System.out.println("6) Cinnamon & Caramel Swirl");
        System.out.print("Choice: ");
        String flavor = switch (scanner.nextLine()) {
            case "1" -> "Matcha";
            case "2" -> "Pumpkin Cheesecake";
            case "3" -> "Strawberry Swirl";
            case "4" -> "Vanilla";
            case "5" -> "Sherbert";
            case "6" -> "Cinnamon & Caramel Swirl";
            default -> "Vanilla";
        };

        IceCreamSandwich sandwich = new IceCreamSandwich(cookie, flavor);

        System.out.println("\n🍒 Add toppings (type 'done' when finished). Prices are $0.50 each.");
        System.out.println("Options: Rainbow Sprinkles, Cherries, Chocolate Chips, Brownie Crumbs, Fruity Pebbles Cereal");
        while (true) {
            System.out.print("Add topping (or 'done'): ");
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("done")) break;
            if (topping.isBlank()) {
                System.out.println("Type a topping name or 'done'.");
                continue;
            }
            sandwich.addTopping(new Topping(topping, 0.50));
            System.out.println("Added " + topping);
        }

        currentOrder.addSandwich(sandwich);
        System.out.println("✅ Added: " + sandwich.getSummary());
    }

    private void checkout() {
        System.out.println("\n🧾 Order Summary:");
        System.out.println(currentOrder.getSummary());
        System.out.print("Confirm order and save receipt? (y/n): ");
        String yn = scanner.nextLine();
        if (yn.equalsIgnoreCase("y")) {
            ReceiptWriter.saveReceipt(currentOrder);
            System.out.println("Receipt saved to src/main/resources/receipts/ (or created). Thank you! 🍦");
        } else {
            System.out.println("Checkout canceled. Returning to main menu.");
        }
    }
}
