package MyAssignment;

public class Question3 {
    /**  Write a Java program to print the following grid of dashes.
     * */
    public static void main(String[] args) {
        int[]dashGrid = new int[10];

        for (int i = 0; i < dashGrid.length; i++){
            for (int j = 0; j < dashGrid.length; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
