package Chapter4Exercises;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int numberCount = 1;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        while (numberCount <= 10) {

            System.out.println("Enter a number");
            number = input.nextInt();
            if (highest < number) {
                highest = number;
            } else if (lowest > number) {
                lowest = number;
            }
            numberCount++;
        }
        System.out.println("The Highest Number is" + highest);
        System.out.println("The Lowest Number is" + lowest);
    }

}