package Chapter6Exercises.cointossing;

import java.security.SecureRandom;

public class CoinTossing {
    /** --> Program should have a welcome message with the Menu Option
     * -->  Menu has 2 options>> 1: Toss a coin, 2: exit
     * -->  Toss a coin: invokes a method flip(no argument); and returns the value whether its HEAD > 0.5 or TAIL < 0.5
     * -->
     */



    public static Coin flip(){
       SecureRandom secureRandom = new SecureRandom();
       int choice = secureRandom.nextInt(2);

       if (choice == 0){
           return Coin.HEADS;
       }else
           return Coin.TAILS;
    }
}
