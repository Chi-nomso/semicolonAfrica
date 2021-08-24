package VariousPractice;

public class MaximumNumber {
    public void findWinner(){
        int []number = {20,34,32,45,12,34,50,35,23,46,78,54,98,76,89,67,83,15,38,70};
        int largest = number[0];
        int smallest = number[0];
        for (int j : number) {
            if (largest < j) {
                largest = j;
            } else if (smallest > j) {
                smallest = j;
            }
        }
        System.out.println(largest + " is the Largest of these numbers");
        System.out.println(smallest + " is the Smallest of these numbers");
    }


    public static void main(String[] args) {
        new MaximumNumber().findWinner();
    }
}
