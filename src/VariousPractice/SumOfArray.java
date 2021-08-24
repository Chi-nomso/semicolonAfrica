package VariousPractice;

public class SumOfArray {
    public void sum() {
        int[] all = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        double average = 0;
        // to add all and find the average of all the elements in this array using for loop:
        for (int count = 0; count < all.length; count++) {
            total = total + all[count];
            average = (double)total / all.length;
        }
        System.out.println("The total of this array is "+ total +" and the average is "+ average);
    }

    public static void main(String[] args) {
        new SumOfArray().sum();
    }
}
