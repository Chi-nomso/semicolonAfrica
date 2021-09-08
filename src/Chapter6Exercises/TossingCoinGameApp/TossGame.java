package Chapter6Exercises.TossingCoinGameApp;

import java.util.Scanner;

import static java.awt.SystemColor.info;

public class TossGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headCount = 0;
        int tailCount = 0;
        String info = """
                Welcome!!
                Wanna Play?
                Press 1 --> To Toss a Coin
                Press2 --> To Exit the Game               
                """;
        System.out.println(info);
        int choice;

        do{
            choice = input.nextInt();
            if(choice == 1){
                if(TossMethod.flip() == CoinEnum.HEADS){
                    headCount++;
                }else{
                    tailCount++;
                }
            }

            String newInfo = """
                play again?
                Press 1 --> To Toss a Coin
                Press2 --> To Exit the Game               
                """;
            System.out.println(newInfo);
        }
        while (choice!= 2);
        System.out.println("The Number of Heads that appeared is " + headCount);
        System.out.println("The Number of Tails that appeared is " + tailCount);
    }
}
