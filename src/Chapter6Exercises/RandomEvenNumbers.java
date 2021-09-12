package Chapter6Exercises;

import java.security.SecureRandom;

public class RandomEvenNumbers {
    /** ---> Generate a random number within the range of 5Hthousand to 1.5Million
     * ---> if the generated number is an odd number, generate again and return the even 5numbers
     * ---> they must fall within the range above
     * */

    public static int genNum(){
        SecureRandom numGen = new SecureRandom();
        int figureGen = 500_000 + numGen.nextInt(1_500_000);
        if(figureGen % 2 != 0){
            figureGen = 500_000 + numGen.nextInt(1_5000_000);
        }
        return figureGen;
    }

    public static void main(String[] args) {
        System.out.println(genNum());
    }
}