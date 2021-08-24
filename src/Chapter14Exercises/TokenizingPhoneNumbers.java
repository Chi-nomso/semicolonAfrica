package Chapter14Exercises;

import java.util.Scanner;

public class TokenizingPhoneNumbers {
    /** --> input a phone-number as a string
     * --> create a code token...by
     * --> using the split method, take out the first 3 and last 4 digits
     * --> concatenate the split code
     * --> print out both the initial phone number and the split code.
    **/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your phone number");
        String number = input.nextLine();

        String[] tokens = number.split(" ");
        System.out.printf("The Phone Number you inputed is %d%n The token is %n ", tokens.length);

        for(String token : tokens){
            System.out.println(token);
        }
    }
}
