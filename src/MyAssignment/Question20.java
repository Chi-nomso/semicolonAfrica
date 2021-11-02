package MyAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question20 {
    /**>>> Write a Java program to convert an array to ArrayList.
     * */
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5};

        List<Integer> list = new ArrayList<>();
        for (int number : array){
            list.add(number);
        }

        //This method below converts the array straight to a list.
         System.out.println(Arrays.asList(array));
        //This method below prints out the list in the logic.
        System.out.println(list);
    }
}
