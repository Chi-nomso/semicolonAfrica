package Chapter14Exercises;

import java.util.Scanner;

public class StringCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("where do you live?");
        String response = input.nextLine();
        System.out.println("In upper case " +  "---> " +response.toUpperCase());
        System.out.println("In lower case also " + "---> " + response.toLowerCase());
    }
}
