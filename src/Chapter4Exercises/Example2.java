package Chapter4Exercises;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int userInput = input.nextInt();
        int number = 0;
        while(userInput != -1){
            number= number +1;
            System.out.println("give me a number");
            userInput = input.nextInt();
        }
        System.out.println("user entered number " + number + "times");
    }
}

