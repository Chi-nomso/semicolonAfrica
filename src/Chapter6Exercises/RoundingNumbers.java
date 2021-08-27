package Chapter6Exercises;

import java.util.Scanner;

public class RoundingNumbers {
    /** --> y = Math.floor(value * 10+ 0.5)/10 <--value == 1st after the point on the right
     *  --> y = Math.floor(value * 100 + 0.5)/100 <--value == 2nd after the point on the right
     *  --> write an application that rounds to:
     *  --Integer Value: = Math.floor(value)
     *  --Tenths value: = Math.floor(value * 10 + 0.5)/10
     *  --Hundredth value:  = Math.floor(value * 100 + 0.5)/100
     *  --Thousandths value: = y = Math.floor(value * 1000 + 0.5)/1000
     *  --> Display the original number and the rounded figure.
     * */

    public static double firstRound(double number){
        double integerValue = Math.floor(number);
        return integerValue;
    }

    public static double secondRound(double number2){
        double tenthValue = Math.floor(number2 * 10 + 0.5)/10;
        return tenthValue;
    }

    public static double thirdRound(double number3){
        double hundredthValue = Math.floor(number3 * 100 + 0.5)/100;
        return hundredthValue;
    }

    public static double fourthRound(double number4){
        double thousandthsValue = Math.floor(number4 * 1000 + 0.5)/1000;
        return thousandthsValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me your first decimal number");
        double decimalNumber1 = input.nextDouble();
        System.out.println("Give me your second decimal number");
        double decimalNumber2 = input.nextDouble();
        System.out.println("Give me your third decimal number");
        double decimalNumber3 = input.nextDouble();
        System.out.println("Give me your fourth decimal number");
        double decimalNumber4 = input.nextDouble();
        System.out.printf("The first Number you imputed was %.0f, the integer value is %.0f%n",decimalNumber1,RoundingNumbers.firstRound(decimalNumber1));
        System.out.printf("The second Number you imputed was %.1f, the rounded to tenth  value is %.1f%n ",decimalNumber2, RoundingNumbers.firstRound(decimalNumber2));
        System.out.printf("The third Number you imputed was %.2f, the rounded to hundredth value is %.2f%n ",decimalNumber3, RoundingNumbers.firstRound(decimalNumber3));
        System.out.printf("The fourth Number you imputed was %.3f, the rounded to thousandth  value is %.3f%n ",decimalNumber4, RoundingNumbers.firstRound(decimalNumber4));
    }
}
