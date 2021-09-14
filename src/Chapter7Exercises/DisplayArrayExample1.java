package Chapter7Exercises;
/** This is used to print out all the values of the array
in an incremental order
 */
public class DisplayArrayExample1 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        int counter ;
        System.out.printf("%s%10s%n", "Index", "Value");
        for (counter = 0; counter < scores.length; counter++) {
            System.out.printf("%d%10d%n",counter,scores[counter]);
        }
}
}
