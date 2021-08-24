package Chapter14Exercises;

import java.util.Scanner;

public class ReversedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence here: ");
        String sentence = input.nextLine();
//        StringBuilder anotherReversed = new StringBuilder();
//        anotherReversed.append(sentence);
//        anotherReversed = anotherReversed.reverse();

        for(int count = sentence.length() -1; count >= 0;count--){
            System.out.print(sentence.charAt(count));
        }
        //String reverse = new StringBuilder(sentence).reverse().toString();
        //System.out.println(anotherReversed);
    }
}
