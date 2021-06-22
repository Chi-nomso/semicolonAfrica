package Chapter5Exercises;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor= 2;

        System.out.println("Put in a number");
        int number = input.nextInt();

        while(number > 1){
            if(number % factor == 0){
                System.out.print(factor+" ");
                number = number/factor;
        }
            else
                factor++;
    }
}
}