package Chapter6Exercises.TossingCoinGameApp;

import java.util.Random;

public class TossMethod {
    /** --> Program should have Main method with  welcome message and the Menu Option
     * -->  Menu has 2 options>> 1: Toss a coin, 2: exit
     * -->  Toss a coin: invokes a method flip(no argument); and returns the enum HEAD or enum TAIL
     * --> Method Flip uses a secure random method to generate decimal numbers
     * --> if the random number generated is > 0.5, display Head else display Tail.
     *
     */
    public static CoinEnum flip(){
        Random random = new Random();
        int selection = random.nextInt(2);

        if(selection == 1){
            return CoinEnum.HEADS;
        }else{
            return CoinEnum.TAILS;
        }

    }
}
