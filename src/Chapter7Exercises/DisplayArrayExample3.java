package Chapter7Exercises;

public class DisplayArrayExample3 {
    /** ---> Create a 10 element Array with even numbers 2-20;
     * ---> using a for loop, calculate (find) the array element's value by:
     * ---> multiply the counter value by 2 and add 2
     * */

    public static void main(String[] args) {
        int [] points = new int[10];
        for (int counter = 0; counter < points.length; counter++){
            points[counter] = counter * 2 + 2;
        }
        System.out.printf("%s%10s%n", "Index", "Value");
        for (int counter = 0; counter < points.length; counter++){
            System.out.printf("%d%10d%n", counter, points[counter]);
        }
    }
}
