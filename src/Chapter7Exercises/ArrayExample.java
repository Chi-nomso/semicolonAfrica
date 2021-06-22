package Chapter7Exercises;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int [] nomso = new int[5];
        nomso[2]= 20;
        nomso [3]= 10;
        System.out.println(Arrays.toString(nomso));
        int jane = nomso[3];
        System.out.println(jane);
    }
}
