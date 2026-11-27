package com.pluralsight;
/**
 * THIS IS A TEMP TEST RUNNER
 */
public class Main {
    public static void main(String[] args){
        /**
         * Loop through sizes 1, 2, and 3 to test every size-based price and name getter in Menu.
         * Because all Menu methods are static, we call them directly on the menu class name.
         */
        for (int size = 1; size <= 3; size++){
            System.out.println(Menu.getItemSizeNames(size)
                    + " base= " + Menu.getBasePrice(size)
                    + " meat= " + Menu.getMeatPrice(size)
                    + " extraMeat= " + Menu.getExtraMeatPrice(size)
                    + " premium= " + Menu.getPremiumPrice(size)
                    + " extraPremium= " + Menu.getExtraPremiumPrice(size)
                    + " | drink " + Menu.getDrinkSizeNames(size) + "= " + Menu.getDrinkPrice(size));
        }
        //Test the single flat-rate main side price (no size parameter needed)
        System.out.println("Main Side = " + Menu.getMainSidePrice());

        /**
         * Store the BASES array returned by Menu.getBases() and loop through it by index.
         * Prints (i + 1) so the customer-facing list starts at 1 instead of 0.
         */
        String[] bases = Menu.getBases();
        for (int i = 0; i < bases.length; i++){
            System.out.println((i + 1) + ") " + bases[i]);
        }
    }
}