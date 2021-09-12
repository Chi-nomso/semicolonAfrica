package Chapter6Exercises;

import java.security.SecureRandom;

public class RandomPrimeNumbers {
    /** ---> Generate a random number within the range of 5Hthousand to 1.5Million
     * ---> if the generated number is not a prime number, generate again and return the prime numbers
     * ---> they must fall within the range above
     * */

    public static int genPrime(){
        SecureRandom genNum = new SecureRandom();
        int numGen = 500_000 + genNum.nextInt(1_500_000);
        if(numGen / 2 != 0 && numGen /numGen != 0){
            numGen = 500_000 + genNum.nextInt(1_5000_000);
        }
        return numGen;
    }

    public static void main(String[] args) {
        System.out.println(genPrime());
    }
}
