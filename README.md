# Java Polymorphic Store

A simple Java console application that simulates a store, allowing customers to purchase different products in various quantities. The project focuses on Object-Oriented Programming concepts, especially inheritance and polymorphism.

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Inheritance
- Polymorphism
- Abstract Classes
- Arrays
- Scanner

## Features

- Display a welcome message and available products.
- Purchase five different product categories:
    - Television
    - Radio
    - Video Game
    - Tablet
    - Cell Phone
- Select products and specify purchase quantities.
- Store purchased items in a `Product[]` array.
- Validate user input and handle invalid options.
- Display a purchase summary with product quantities and subtotals.
- Calculate and display the final purchase price.

## Project Structure

```text
src/
├── Product.java
├── Television.java
├── Radio.java
├── VideoGame.java
├── Tablet.java
├── CellPhone.java
├── ShoppingCart.java
└── Store.java
```

## How to Run

1. Clone this repository:

   ```bash
   git clone <repository-url>
   ```

2. Open the project in your preferred Java IDE.

3. Compile and run `Store.java`.

4. Follow the console instructions to select products, enter quantities, and finalize your purchase.

## Concepts Practiced

- **Inheritance:** Specialized product classes inherit common attributes and behaviors from the abstract `Product` class.
- **Polymorphism:** Different product objects are handled through the common `Product` type.
- **Encapsulation:** Product attributes are private and accessed through getter methods.
- **Abstract Classes:** The `Product` class defines a common structure for all product types.
- **Final Modifier:** Prevents product names and prices from being changed after initialization.
- **Arrays:** Stores purchased products and supports dynamic capacity expansion.
- **Input Validation:** Handles invalid menu options and non-numeric input without interrupting the program.

## Author

João Sales