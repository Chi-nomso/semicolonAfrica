package Chapter8Exercises;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* A program that requires 3-4 integers from user and
            prints out the next expected number.

            *** PSEUDOCODE ****
            --->Ask user for integer impute
            --->while user doesnt input -1
            --->initialize count, increment and keep Asking user for integers
            --->save input
            --->Last Impute + previous impute - first impute
            --->Initialize the above into variable "next" and print next.

         */
          String info = """
                Hi Nomso, I'd like you to impute 3 integers
                as in sequence  of Mathematics. Any 3-5numbers of your choice
                """;

        System.out.println(info);
        int number = input.nextInt();
        System.out.println("Enter second Number: ");
        int numberTwo = input.nextInt();
        System.out.println("Enter the third number ");
        int numberThree = input.nextInt();
        int next = numberThree + numberTwo -number;
        System.out.println("The next number is "+ next);
}
}
