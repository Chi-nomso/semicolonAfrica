package MyAssignment;

import java.util.Arrays;

public class Question22 {
/**>>>Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
 * */

public static int[] getTwoSum(int[]values, int target){
   // values = new int[]{20,23,43,34,67,87,44,56,90,76};
    int []answer = new int[2];
    for (int i = 0; i < values.length-1; i++){
        for (int j = i+1; j < values.length; j++) {
            if(values[i] + values[j] == target){
                answer[0] = i;
                answer[1] = j;
            }
        }
        //first++;
    }
    return answer;

}

public static void main(String[] args) {
    int[] numbers = {20,23,43,34,67,87,44,56,90,76};
    int target =  130;
    System.out.println(Arrays.toString(getTwoSum(numbers, target)));
}
}
