package Chapter4Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mystery {
    public static void main(String[] args) {
//        int x = 1;
//        int total = 0;
//
//        while( x <= 10){
//            int y = x * x;
//            System.out.println(y);
//            total = total + y;
//            x++;
//        }
//        System.out.printf("Total is %d%n", total);
        int[] confidence = {2, 3, 1, 34, 23, 12, 56};
        System.out.println(Arrays.toString(sortInDescendingOrder(confidence)));

    }


//    public static int[] sortInAscendingOrder(int[] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array.length; j++){
//                if(array[i] < array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//
//        return array;
//    }


    public static int[] sortInDescendingOrder(int[]array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tempor = array[i];
                    array[i] = array[j];
                    array[j] = tempor;
                }
            }
        }
        return array;
    }
}
