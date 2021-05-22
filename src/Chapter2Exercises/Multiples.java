package Chapter2Exercises;

public class Multiples {
    public static void main(String[] args) {

        int figure = 72;
        int number = 10;
        int result = figure % number;

        System.out.println(figure);
        System.out.println(number);
        System.out.println(result);

        if(result == 0) {
            System.out.printf("%n%d is a multiple of %d%n", figure, number);
        }else
            if(result != 0){
                System.out.printf("%n%d is not a multiple of %d%n", figure, number);
            }



    }
}
