package Chapter6Exercises;

import java.security.SecureRandom;

public class RollingDie {
    public static void main(String[] args) {
        SecureRandom randNum = new SecureRandom();

        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;

        for (int count = 0; count <= 6000000; count++) {
            int roll = 1 + randNum.nextInt(6);

            switch (roll){
                case 1:
                    ++roll1;
                    break;
                case 2:
                    ++roll2;
                    break;
                case 3:
                    ++roll3;
                    break;
                case 4:
                    ++roll4;
                    break;
                case 5:
                    ++roll5;
                    break;
                case 6:
                    ++roll6;
                    break;
            }
        }
        System.out.println("Face\tRolls");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", roll1,roll2,roll3,roll4,roll5,roll6);
        //System.out.println("1\t\n" + roll1 + "2\t\n" + roll2+ "3\t\n" + roll3+ "4\t\n" + roll4+ "5\t\n" + roll5+ "6\t" + roll6);
    }
}
