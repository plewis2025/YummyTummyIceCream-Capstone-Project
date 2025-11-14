![28947874_441428889610980_7300557977463824173_o](https://github.com/user-attachments/assets/f26fd7d8-1fa9-4147-8328-56d6b9f190ee)
Yummy Tummy Ice Cream Shop

<img width="645" height="968" alt="YummyTummyDiagram" src="https://github.com/user-attachments/assets/17ff589d-69af-4158-b547-cb579c6bfe01" />

The system allows users to build custom ice cream sandwiches, manage orders, and interact through a console-based menu.

 Class Breakdown
 IceCreamSandwich
Attributes:

cookieType: String

iceCreamFlavor: String

toppings: List<Topping>

price: double

Methods:

calculatePrice(): Adds base price + topping prices

getSummary(): Returns a formatted description of the sandwich

 Topping
Attributes:

name: String

price: double

Methods:

getName(): Returns topping name

getPrice(): Returns topping price

 Order
Attributes:

sandwiches: List<IceCreamSandwich>

totalPrice: double

Methods:

addSandwich(IceCreamSandwich): Adds a sandwich to the order

getTotal(): Calculates the total cost of all sandwiches

getSummary(): Returns a summary of the full order

 UserInterface
Methods:

showHomeMenu(): Displays main menu

showOrderMenu(): Guides user through sandwich creation

promptForCookieType(): Asks user to choose a cookie

promptForIceCreamFlavor(): Asks user to choose a flavor

promptForToppings(): Lets user select multiple toppings

 Main
Purpose: Entry point of the application

Method:

main(String[] args): Starts the app and calls UserInterface.display()

 Relationships
Order contains multiple IceCreamSandwiches

IceCreamSandwich contains multiple Toppings

UserInterface interacts with all other classes to build and display orders

Screenshot Of An Example of Me Running The Program To Generate A Receipt Order From Yummy Tummy Ice Cream Shop
<img width="1909" height="1017" alt="Screenshot 2025-11-13 163012" src="https://github.com/user-attachments/assets/1c819fba-5c15-4c47-9ccf-75a83ce31030" />
1.
<img width="1911" height="1011" alt="Screenshot 2025-11-13 163024" src="https://github.com/user-attachments/assets/fa328b4d-4671-4bcd-9bdf-fc7635aac5f0" />
2.
<img width="1913" height="1000" alt="Screenshot 2025-11-13 163034" src="https://github.com/user-attachments/assets/7a1ae4d3-e8bb-4c55-a85d-6fd507fda1e0" />
3.
<img width="1899" height="1018" alt="Screenshot 2025-11-13 163043" src="https://github.com/user-attachments/assets/2c81c5ed-22a9-4c73-b46f-6856f40d20d2" />
4.
<img width="1919" height="889" alt="Screenshot 2025-11-13 165031" src="https://github.com/user-attachments/assets/4a280428-04be-4d5d-9702-33a9fc4ae604" />
5.
Interesting Piece of Code 

    public Topping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra = isExtra;
    }
Why?

I booked a tutoring session to review what I was missing in my project, specifically in the Topping class. During the session, we discovered that the boolean field isExtra was missing. This field is important because the system needs to ask the customer whether they want extra toppings, and if they do, it should add 50 cents to the order total. That option was missing from my Topping class file, but I’ve now added it. Funny thing is, I actually knew how to write it — I just needed that second confirmation from the tutor to make sure I was doing it correctly and using the proper approach to add it to the class.
