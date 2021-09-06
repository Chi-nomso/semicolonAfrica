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

//    public static void main(String[] args) {
//        ReverseNumber riri = new ReverseNumber();
//        System.out.println(riri.numberReversed(2345));
//    }

//    public static void main(String[] args) {
//        int num = 7654321, reversed = 0;
//
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num = num / 10;
//        }

}
