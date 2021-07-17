package Chapter4Exercises;

import java.util.Scanner;

public class CheckerBoard {
    public static void main(String[] args) {
        for (int parent = 1; parent <= 8; parent++) {
            if(parent % 2 == 0){
                System.out.print(" ");
            }
            for (int i = 1; i <= 8; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
