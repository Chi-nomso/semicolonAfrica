package Chapter4Exercises;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE + 2;

        for(count = 0; count <= 10; count++){
            System.out.println("Enter Number");
            number = input.nextInt();
            if(number > firstLargest){
                firstLargest = number;
            }else
                secondLargest = number;
            }
            System.out.println("This is the First Largest Number " + firstLargest);
            System.out.println("This is the Second Largest Number " + secondLargest);

        }

    }
