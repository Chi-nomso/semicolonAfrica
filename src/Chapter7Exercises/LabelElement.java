package Chapter7Exercises;

import java.util.Arrays;

public class LabelElement {
    /**>>> label the 3 by 5 2dimensional array Sales
     * >>> Indicate the order in which they're set to zero.
     * */

    public static void main(String[] args) {
        int [][]sales = new int [3][5];
        for (int row = 0; row <sales.length; row++){
            for (int column = row; column < sales[row].length; column++) {
                sales[row][column] = 0;
            }
    }
        System.out.println(Arrays.deepToString(sales));
    }
}
