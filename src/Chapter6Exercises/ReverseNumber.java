package Chapter6Exercises;

public class ReverseNumber{
    public int numberReversed(int givenDigits){
        int reversedNumber = 0;
        int number = 0;
        while (givenDigits != 0) {
             number = givenDigits % 10;
            reversedNumber = reversedNumber * 10 + number;
            givenDigits = givenDigits / 10;
        }
        return reversedNumber;
    }
}
