package Chapter7Exercise.ArrayMethods.ArrayMethods2;

import Chapter7Exercises.exception.ArraySorterException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySorterTest {
    private ArraySorter sorter;
    @BeforeEach
    void setUp() {
        sorter = new BinarySorter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortWithoutAnArray(){
        assertThrows(ArraySorterException.class, () -> sorter.sortAscending(null));
    }

    @Test
    void sortDescendingWithoutAnArray(){
        assertThrows(ArraySorterException.class, () -> sorter.sortDescending(null));
    }

    @Test
    void sortArrayAscending(){
        int[]scores ={10,8,5,3,7,9,2,1,6,4};
        int[] expectedScores = {1,2,3,4,5,6,7,8,9,10};
        try{
            int[]sortedScores= sorter.sortAscending(scores);
            assertArrayEquals(expectedScores,sortedScores);
        }catch(ArraySorterException ex){
            ex.printStackTrace();
        }
    }
    /**for binary sorting>> array{10,0,5,3,2}
     * startIndex= 0;
     * endIndex=4;
     * endIndex = lengthof array/2;
     * startIndex = endIndex;
     * endIndex = lengthof array - 1;
     * */
}