package MyAssignment;

public class Question18 {
    /**>>> Write a Java program to find the second smallest element in an array.
     * */

    public static int secondSmallest(int [] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] < numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length-2];
    }

    public static void main(String[] args) {
        int [] numbers = {20,23,43,34,67,87,44,56,90,76};
        System.out.println(secondSmallest(numbers));
    }
}
