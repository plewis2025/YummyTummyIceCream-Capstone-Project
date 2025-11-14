![28947874_441428889610980_7300557977463824173_o](https://github.com/user-attachments/assets/f26fd7d8-1fa9-4147-8328-56d6b9f190ee)
 Yummy Tummy Ice Cream Capstone Project

Welcome to the Yummy Tummy Ice Cream ordering system! This Java console application lets users build custom ice cream sandwiches by selecting cookie types, ice cream flavors, and toppings — all while calculating prices dynamically. It's a fun, interactive way to demonstrate object-oriented programming, user input handling, and class design.

---

Project Description

This project was created as part of the Java Developer Learn to Code Academy at Year Up United. It combines everything I've learned so far — from class design and encapsulation to branching, commits, and UML diagrams.

Users can:
- Choose cookie types and ice cream flavors
- Add multiple toppings (with extra topping pricing)
- View sandwich summaries and order totals
- Interact with a colorful console menu

---

   Interesting Code Feature

 `isExtra` Boolean in `Topping.java`

One of the most interesting features is the `isExtra` boolean added to the `Topping` class. This allows the system to ask users if they want extra toppings, and if so, it adds $0.50 to the sandwich price.
Why?
I booked a tutoring session to review what I was missing in my project, specifically in the Topping class. During the session, we discovered that the boolean field isExtra was missing. This field is important because the system needs to ask the customer whether they want extra toppings, and if they do, it should add 50 cents to the order total. That option was missing from my Topping class file, but I’ve now added it. Funny thing is, I actually knew how to write it — I just needed that second confirmation from the tutor to make sure I was doing it correctly and using the proper approach to add it to the class.
```java
public class Topping {
    private String name;
    private double price;
    private boolean isExtra;

    public Topping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra = isExtra;
    }

    public double getPrice() {
        return isExtra ? price + 0.50 : price;
    }
}



