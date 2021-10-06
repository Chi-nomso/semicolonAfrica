package Chapter7Exercises;

public class VariableLengthArgumentList {
    /**>>> Create a method that takes in array
     * >>> Calculate the product of series of integers passed into it.
     * >>> user inputs into the array
     * >>> Test your method with several calls.
     * */

    public int product(int ...product){
        int total=1;
        for (int i = 0; i < product.length; i++) {
             total *= product[i];
        }
            return total;
    }

    public static void main(String[] args) {
        VariableLengthArgumentList list = new VariableLengthArgumentList();
        System.out.println(list.product(5, 7, 8, 12, 67, 3));
    }
}
