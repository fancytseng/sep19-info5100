package Assignment4;

public class DessertShop {

        public final static double TAX_RATE = 6.5;
        public final static String STORE_NAME = "M & M Dessert Shop";

        public static String cents2dollarsAndCents(int cents){
            //initialize string to empty
            String s = "";

            if(cents < 0){
                s += "-";
                cents *= -1;
            }

        /*
        The DessertShop class also contains the ​cents2dollarsAndCentsmethod​ which takes an integer number of cents and
        returns it as a String formatted in dollars and cents. For example, 105 cents would be returned as "1.05".
         */

            //1 dollar = 100 cents
            int dollars = cents / 100;
            //get the remainder. Ex: 105 % 100 = 5, so cents = 5
            cents = cents % 100;

            //Ex: if dollar = 1 (>0)
            if(dollars > 0) {
                //s = s + dollar, which means s = (empty)+ 1 = 1
                s += dollars;
                //s = s + ., which means s = 1 + . = 1.
                s += ".";
            }

            //Ex: if cents = 5 (<10)
            if(cents < 10) {
                //s = s + 0, which means s = 1. + 0 = 1.0
                s += "0";
                //s = s + cents, which means s = 1.0 + 5 = 1.05
                s += cents;
            }
            //return s = 1.05
            return s;
        }

    }
