package com.pluralsight;
import java.math.BigDecimal;

/**
 * Holds every menu option and every price for my shop in one place.
 * Keeps prices out of the other classes so updates only happen here.
 *
 * Sizes are numbers: 1 = first size(SMALL/PEQUENO), = 2 second size(MEDIUM/MEDIANO), 3 = third size(LARGE/GRANDE).
 * while Java arrays start at index 0, so lookups use [size -1]
 */
public class Menu {
    /**
     * Arrays hold fixed lists of name and prices.
     * 'static' means the data belongs to the Menu Class itself, not a single object.
     * 'final' prevents accidentally reassigning the array reference later.
     */

    //Size names
    private static final String[] ITEM_SIZE_NAMES = {
            "PEQUEÑA", //SMALL
            "MEDIANA", //MEDIUM
            "GRANDE"   //LARGE
    };
    private static final String[] DRINK_SIZE_NAMES = {
            "PEQUEÑA", //SMALL
            "MEDIANA", //MEDIUM
            "GRANDE"   //LARGE
    };

    //Option lists
    private static final String[] BASES = {
            "Tostones", // FRIED GREEN PLANTAINS
            "Papas Fritas", //POTATOES FRIES
            "Yuca Frita", //CASSAVA FRIES
            "Plátanos Maduros" //SWEET FRIED PLANTAINS
    };
    private static final String[] MEATS = {
            "Pica Pollo", //FRIED CHICKEN
            "Chicharrón de Pollo", //BONELESS FRIED CHICKEN BITES
            "Longaniza Frita", //DOMINICAN CHORIZO
            "Chicharrón de Cerdo", //FRIED PORK BELLY
            "Salami Frito", //FRIED SALAMI
            "Alitas de Pollo" //CHICKEN WINGS
    };
    private static final String[] PREMIUM_TOPPINGS = {
            "Bofe Frito", //FRIED BEEF LUNG
            "Queso Frito", //FRIED CHEESE
            "Costillitas Fritas", //FRIED PORK RIBS
            "Huevo Frito" //FRIED EGGS
    };
    private static final String[] REGULAR_TOPPINGS = {
            "Ensalada de Repollo", // SHREDDED CABBAGE/CABBAGE SLAW
            "Tomate Fresco", // FRESH TOMATO
            "Cebolla Roja", // RED ONIONS
            "Pepino", // SLICED CUCUMBERS
            "Aguacate", // AVOCADO
            "Guineo", // GREEN BANANAS
            "Empanadas (Pollo / Res / Queso)", // (CHICKEN / BEEF / CHEESE)
            "Quipes", // DOMINICAN BULGUR WHEAT CROQUETTES
            "Lechuga" // LETTUCE
    };
    private static final String[] CONDIMENTS = {
            "Salsa Rosada", // MAYOKETCHUP/PINK SAUCE
            "Picante", // HOT SAUCE
            "Kétchup",
            "Mayonesa",
            "Wasakaka", //DOMINICAN HERB VINAIGRETTE
            "Chimichurri"
    };
    private static final String[] DRINK_FLAVORS = {
            "Morir Soñando", // ORANGE JUICE WITH MILK
            "Jugo de Chinola", // PASSION FRUIT
            "Jugo de Limón", // LIME JUICE
            "Soda",
            "Agua" // WATER
    };
    private static final String[] MAIN_SIDES = {
            "Arroz Blanco", // WHITE RICE
            "Moro de Guandules", // PIGEON PEAS AND RICE
            "Chofán" // DOMINICAN-CHINESE FRIED RICE
    };

    //Prices
    /**
     * Uses BigDecimal created from String Values instead of double.
     * so dollar-and-cent math stays exact without floating-point rounding errors.
     */
    private static final BigDecimal[] BASE_PRICES = {
            new BigDecimal("3.50"),
            new BigDecimal("7.50"),
            new BigDecimal("9.50")
    };
    private static final BigDecimal[] MEAT_PRICES = {
            new BigDecimal("1.00"),
            new BigDecimal("2.00"),
            new BigDecimal("3.00")
    };
    private static final BigDecimal[] EXTRA_MEAT_PRICES = {
            new BigDecimal("0.50"),
            new BigDecimal("1.00"),
            new BigDecimal("1.50")
    };
    private static final BigDecimal[] PREMIUM_PRICES = {
            new BigDecimal("0.75"),
            new BigDecimal("1.50"),
            new BigDecimal("2.25")
    };
    private static final BigDecimal[] EXTRA_PREMIUM_PRICES = {
            new BigDecimal("0.30"),
            new BigDecimal("0.60"),
            new BigDecimal("0.90")
    };
    private static final BigDecimal[] DRINK_PRICES = {
            new BigDecimal("2.00"),
            new BigDecimal("2.50"),
            new BigDecimal("3.00")
    };
    private static final BigDecimal[] MAIN_SIDE_PRICE = {
            new BigDecimal("1.50")
    };

    private Menu(){
        /**
         * Private constructor so nobody creates a Menu object with 'new Menu()'.
         * Everything in Menu is static and called directly on the class name.
         */
    }

    //Option Lists
    /**
     *Public static getters let other classes (like screens and order logic) read the options.
     */

    public static String[] getBases() {
        return BASES;
    }
    public static String[] getMeats() {
        return MEATS;
    }
    public static String[] getPremiumToppings() {
        return PREMIUM_TOPPINGS;
    }
    public static String[] getRegularToppings() {
        return REGULAR_TOPPINGS;
    }
    public static String[] getCONDIMENTS() {
        return CONDIMENTS;
    }
    public static String[] getDrinkFlavors() {
        return DRINK_FLAVORS;
    }
    public static String[] getMainSides() {
        return MAIN_SIDES;
    }

    //Size name getters (size must be 1, 2, or 3)
    /**
     *Subtracts 1 from 'size' so 1 -> index 0, 2 -> index 1, and 3 -> index 2.
     */

    public static String getItemSizeNames(int size) {
        return ITEM_SIZE_NAMES[size - 1];
    }
    public static String getDrinkSizeNamesSizeNames(int size) {
        return DRINK_SIZE_NAMES[size - 1];
    }

    //Price getters (size must be 1, 2, or 3)
    /**
     * Returns the matching BigDecimal price for the chosen size (1, 2, or 3)
     */

    public static BigDecimal getBasePrice(int size){
        return BASE_PRICES[size - 1];
    }
    public static BigDecimal getMeatPrices(int size) {
        return MEAT_PRICES[size - 1];
    }
    public static BigDecimal getExtraMeatPrice(int size) {
        return EXTRA_MEAT_PRICES[size - 1];
    }
    public static BigDecimal getPremiumPrice(int size) {
        return PREMIUM_PRICES[size - 1];
    }
    public static BigDecimal getExtraPremiumPrice(int size) {
        return EXTRA_PREMIUM_PRICES[size - 1];
    }
    public static BigDecimal getDrinkPrice(int size) {
        return DRINK_PRICES[size - 1];
    }
    // Main sides have a single flat price so no size parameter is needed
    public static BigDecimal[] getMainSidePrice() {
        return MAIN_SIDE_PRICE;
    }
}