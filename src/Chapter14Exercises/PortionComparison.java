package Chapter14Exercises;

import java.util.Scanner;

public class PortionComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Oya enter a word");
        String firstWord = input.nextLine();
        System.out.println("Enter another word");
        String secondWord = input.nextLine();
        System.out.println(firstWord.regionMatches(true,0,secondWord,0,7));
        if(firstWord.regionMatches(true,0,secondWord,0,7) == true){
            System.out.println("The words in this range are actually the same!");
        }else {
            System.out.println("The words in these indices are not the same sha.");
        }
    }
}
