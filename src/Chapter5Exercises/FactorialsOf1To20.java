package Chapter5Exercises;

public class FactorialsOf1To20 {
    public Long getFactorialsOfNumbers(long n){
        long count;
        long factorial = 1;
        for(count = 1; count <= n; count++){
            factorial = factorial * count;
        }
        return  factorial;
    }

    public static void main(String[] args) {
        FactorialsOf1To20 factors = new FactorialsOf1To20();
        System.out.printf("%s|%20s\n", "Numbers","Factorials");
        for(long i = 1; i<= 20; i++){
            System.out.println(i +" ".repeat(20)+ factors.getFactorialsOfNumbers(i));
        }
    }
}
