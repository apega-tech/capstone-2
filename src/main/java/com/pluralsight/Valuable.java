package com.pluralsight;
import java.math.BigDecimal;

/**
 * Anything on a order that has a price and can describe itself
 * Item, Topping, Drink and MainSide will all implement this interface
 * so the Order can treat them all at the same time
 */
public interface Valuable {
    //Gets the price of this product as an exact BigDecimal amount
    BigDecimal getPrice();

    //Gets a short, customer-readable description for the screen and receipt
    String getDescription();
}
