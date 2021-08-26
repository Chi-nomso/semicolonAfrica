package Chapter6Exercises;

import java.security.SecureRandom;

public class RandomValues {
    public static void main(String[] args) {
        SecureRandom randNum = new SecureRandom();
        for (int count = 0; count <= 20 ; count++) {
            int face = 1 + randNum.nextInt(6);
            System.out.printf("%d  ", face);
            if(count % 5 == 0){
                System.out.println();
            }
        }
    }
}
