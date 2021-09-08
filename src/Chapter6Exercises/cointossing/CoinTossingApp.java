package Chapter6Exercises.cointossing;

import javax.swing.*;
import java.util.Scanner;

public class CoinTossingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headCount = 0;
        int tailCount = 0;
        String message = """
                This Is CoinToss game. 
                press 1 to Toss a coin.
                """;
        System.out.println(message);
        int userInput;

        do{
        userInput = scanner.nextInt();

            if (userInput == 1) {
                if (CoinTossing.flip() == Coin.HEADS) {
                    headCount++;
                } else {
                    tailCount++;
                }

            }

      String question = """
                Do you want to toss again 
                 if yes press 1 
                 if no press 2
                    """;
            System.out.println(question);

        }while(userInput != 2);

        System.out.println("the total head appearance = " + headCount);
        System.out.println("the total tail appearance = " + tailCount);

    }
}
