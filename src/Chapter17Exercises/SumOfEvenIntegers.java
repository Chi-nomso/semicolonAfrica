package Chapter17Exercises;

import java.util.stream.IntStream;

public class SumOfEvenIntegers {
    /** this for loop below is using external iteration to sum up the even numbers from 2 - 20;
     * --> the IntStream operation after the for loop is an internal iteration that sums up even numbers from 2-20;
     * */
    public static void main(String[] args) {
//        int sum = 0;
//        for (int count =1; count <= 20; count++){
//            if (count % 2 ==0){
//                sum+= count;
//            }
//        }
//        System.out.println("sum of even numbers is: " + sum);


        System.out.printf("The Sum of the even ints from 2 - 20 is: %d%n",IntStream.rangeClosed(1,10)
                .map((int x) -> {return x * 2;}).sum());
    }
}
