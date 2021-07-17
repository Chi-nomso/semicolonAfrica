package Chapter2Exercises;

public class SquaresAndCubes {
    public static void main(String[] args) {
        int number;
        int square;
        int cube;
        System.out.print("number\t\tsquare\t\tcube");
        System.out.println();
        for(number = 0; number <= 10; number++){
            square = number * number;
            cube = square * number;
            System.out.println(number + "\t\t\t" + square + "\t\t\t"+ cube);
        }

    }
}
