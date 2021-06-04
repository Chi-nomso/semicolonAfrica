package Chapter5Exercises;

import java.util.Scanner;

public class TuitionFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tuition = 10000;
        double rate = 0.05;
        double sum = 0;



        for(int counter = 1; counter <= 14; counter++){
            tuition = tuition + (tuition * rate);
            if(counter == 10){
                System.out.printf("The Tuition in 10 years is $%.2f%n", tuition);
            }
            if(counter > 10) {
                sum = sum + tuition;
            }
        }
        System.out.printf("The Tuition sum 4yrs after 10yrs is $%.2f%n", sum);
    }
}

