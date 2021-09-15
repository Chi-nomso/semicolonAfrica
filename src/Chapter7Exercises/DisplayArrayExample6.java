package Chapter7Exercises;

import java.util.Arrays;

public class DisplayArrayExample6 {
    /**---> the method "Arrays.fill", fills in values into the a declared array.
     * */
    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.printf("%s%10s%n","Index","Names");
        Arrays.fill(names, "ada");
        System.out.println(Arrays.toString(names));
    }

}
