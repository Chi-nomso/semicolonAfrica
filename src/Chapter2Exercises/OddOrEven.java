package Chapter2Exercises;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 60;

        if(number % 2 == 0) {
            System.out.printf("%n%d is an even number", number);
        }else
                if(number % 2 != 0){
                    System.out.printf("%n%d is an odd number", number);
                }
    }
}

