package Chapter7Exercises;

public class DisplayArrayExample4 {
    /**---> Create a 10 element Array;
     * ---> using a for loop, calculate (get) the array index value by:
     * ---> multiplying the counter value by 2 and adding 2
     * ---> initializing the Total variable, calculating the total;
     * ---> Display the array Header and display the array elements and display the total;
     * */

    public static void main(String[] args) {
        int[]points = new int[10];
        int total =0;
        System.out.printf("%s%10s%n", "Index", "Value");
        for (int counter = 0; counter < points.length; counter++) {
            points[counter] = counter * 2 + 2;
        }
        for (int counter = 0; counter < points.length; counter++) {
            total += points[counter];
            System.out.printf("%d%10d%n", counter, points[counter]);
        }
        System.out.println("This is the Total " + total);
    }
}
