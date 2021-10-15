package MyAssignment;

public class Question17 {
    /**>>>Write a Java program to find the largest element in an array.
     * */

    public static int getSecondLargest(int[]numbers, int secMax){
        numbers = new int[]{20,23,43,34,67,87,44,56,90,76};
        int Max = 1;

        for (int i = 0; i < numbers.length; i++) {
             Max = Math.max(numbers[i], Max);
        }
        return Max;
    }


    public static void main(String[] args) {
        int[]values = {20,23,43,34,67,87,44,56,90,76};
        int Max =1;

        System.out.println("The Second Largest number is: ");
        System.out.println(getSecondLargest(values,Max));
    }
}
