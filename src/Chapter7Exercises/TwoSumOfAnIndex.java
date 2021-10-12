package Chapter7Exercises;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOfAnIndex {
    public static  int[]solution(int[] array, int target){
        int [] result = {-1,-1};

        //THIS SOLVES USING THE DOUBLE FOR LOOP (ALSO CALLED SLIDING WINDOW ALGORITHM)  WHICH IS SLOW AND TAKES LESS SPACE:

//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i] + array[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//
//        }

        //THIS SOLVES USING THE HASH MAP LIST WHICH IS FAST AND TAKES MORE SPACE:

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int remainder = target - array[i];
            if(map.containsKey(remainder)){
                result[0] = map.get(remainder);
                result[1] = i;
            }else{
                map.put(array[i], i);
            }
        }
        return result;
    }
}
