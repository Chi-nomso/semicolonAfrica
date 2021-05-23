package Chapter2Exercises;

public class SquareTable {
    public static void main(String[] args) {

        int numberZero = 0;
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;
        int numberSix = 6;
        int numberSeven = 7;
        int numberEight = 8;
        int numberNine = 9;
        int numberTen = 10;

        int squareZero = numberZero * numberZero;
        int cubeZero  = numberZero * squareZero;

        int squareOne = numberOne * numberOne;
        int cubeOne = numberOne * squareOne;

        int squareTwo = numberTwo * numberTwo;
        int cubeTwo = numberTwo * squareTwo;

        int squareThree = numberThree * numberThree;
        int cubeThree = numberThree * squareThree;

        int squareFour = numberFour * numberFour;
        int cubeFour = numberFour * squareFour;

        int squareFive = numberFive * numberFive;
        int cubeFive = numberFive * squareFive;

        int squareSix = numberThree * numberSix;
        int cubeSix = numberThree * squareSix;

        int squareSeven = numberSeven * numberSeven;
        int cubeSeven = numberSeven * squareSeven;

        int squareEight = numberEight * numberEight;
        int cubeEight = numberEight * squareEight;

        int squareNine = numberNine * numberNine;
        int cubeNine = numberNine * squareNine;

        int squareTen = numberTen * numberTen;
        int cubeTen = numberTen * squareTen;

        System.out.println("number      square          cube");
        System.out.printf ("%d           %d               %d%n", numberZero, squareZero, cubeZero );
        System.out.printf ("%d           %d               %d%n", numberOne, squareOne, cubeOne);
        System.out.printf ("%d           %d               %d%n", numberTwo, squareTwo, cubeTwo);
        System.out.printf ("%d           %d               %d%n", numberThree, squareThree, cubeThree);
        System.out.printf ("%d           %d              %d%n", numberFour, squareFour, cubeFour);
        System.out.printf ("%d           %d              %d%n", numberFive, squareFive, cubeFive);
        System.out.printf ("%d           %d              %d%n", numberSix, squareSix, cubeSix);
        System.out.printf ("%d           %d              %d%n", numberSeven, squareSeven, cubeSeven);
        System.out.printf ("%d           %d              %d%n", numberEight, squareEight, cubeEight);
        System.out.printf ("%d           %d              %d%n", numberNine, squareNine, cubeNine);
        System.out.printf ("%d          %d            %d%n", numberTen, squareTen, cubeTen);
    }
}
