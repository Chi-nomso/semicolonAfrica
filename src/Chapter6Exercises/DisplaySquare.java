package Chapter6Exercises;

import java.util.Scanner;

public class DisplaySquare {
    public char fillCharacter(char fill){
       int square = 5;

        for (int row = 1; row <= square; row++) {
            System.out.print("#");
            for(int column = 1; column < square; column++) {
                System.out.print("#");
            }
            System.out.println();
        }
        return (char) square;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char fill = input.next().charAt(0);
        System.out.println(new DisplaySquare().fillCharacter(fill));
    }
}
