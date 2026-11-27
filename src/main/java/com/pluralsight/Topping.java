package com.pluralsight;
/**
 * One serving of a topping or condiment on a platter.
 * A Topping only knows its name and its category.
 * The Item decides the price, because the price depends on their platter size
 * and on whether this is the first serving of that kind or an extra one.
 */

public class Topping {
    // The four categories. Using constants avoids typing the same text in many places.
    public static final String MEAT = "MEAT";
    public static final String PREMIUM = "PREMIUM";
    public static final String REGULAR = "REGULAR";
    public static final String CONDIMENT = "CONDIMENT";

    private String name;
    private String category;

    public Topping(String name, String category){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public  String getCategory(){
        return category;
    }
}