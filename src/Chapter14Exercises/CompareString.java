package Chapter14Exercises;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there, Kindly tell me your name:");
        String name1 = input.nextLine();
        System.out.println("And your Surname?");
        String name2 = input.nextLine();
        System.out.println(name1.compareTo(name2));
        if(name1.compareTo(name2) == 0){
            System.out.println("The names are equal");
        }else if(name1.compareTo(name2) < 0){
            System.out.println("The word " + name1 + " is greater than the word " + name2 );
        }else{
            System.out.println("The word " + name2 + " is greater than the word " + name1);
        }

    }
}
