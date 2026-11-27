package com.pluralsight;
import java.math.BigDecimal;

/**
 * Valuable is the core interface that enables polymorphism in our POS system.
 * Because Item, Drink, and MainSide all implement Valuable, our Order class
 * can store all of them in a single ArrayList<Valuable> and calculate the total
 * without needing to know what specific type of food or drink each line is.
 */
public interface Valuable {
    //Gets the price of this product as an exact BigDecimal amount
    BigDecimal getPrice();

    //Gets a short, customer-readable description for the screen and receipt
    String getDescription();
}