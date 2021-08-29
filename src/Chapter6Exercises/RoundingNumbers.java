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

    public  double firstRound(double number){
        double integerValue = Math.floor(number);
        return integerValue;
    }

    public  double secondRound(double number2){
        double tenthValue = Math.floor(number2 * 10 + 0.5)/10;
        return tenthValue;
    }

    public  double thirdRound(double number3){
        double hundredthValue = Math.floor(number3 * 100 + 0.5)/100;
        return hundredthValue;
    }

    public double fourthRound(double number4){
        double thousandthsValue = Math.floor(number4 * 1000 + 0.5)/1000;
        return thousandthsValue;
    }
}
