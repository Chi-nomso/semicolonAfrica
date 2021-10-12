package Chapter7Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumOfAnIndexTest {
    @Test
    void testTwoSum(){
        //given
        int[] array= {2,7,11,13};
        int target= 9;
        //when
        int[] actual = TwoSumOfAnIndex.solution(array, target);
        int[] expected = {0,1};
        //assert
        assertArrayEquals(expected, actual);
    }
}