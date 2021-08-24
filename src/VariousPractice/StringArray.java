package VariousPractice;

public class StringArray {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        String[] names = {"Ada", "emma", "ayodele", "maryam","daniel","monkey", "gorilla","oshodi", "chidinma","parallel"};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = names[i].length();
            System.out.println(numbers[i]);

        }
    }

}
