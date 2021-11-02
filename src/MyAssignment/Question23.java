package MyAssignment;

public class Question23 {
    /** >>> Write a Java program to test the equality of two arrays.
     * >>> This means writing an application to find out if two arrays are equal.
     * */

    public boolean checkEquality(int[]numbers1, int[]numbers2){
        numbers1 = new int[numbers1.length];
        numbers2 = new int[numbers2.length];

        for (int j : numbers1) {
            for (int k : numbers2) {
                if (j == k) {
                    return true;
                }

            }
        }
        return true;
    }
}
