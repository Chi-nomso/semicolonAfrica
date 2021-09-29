package Chapter7Exercises.ArrayMethods2;

import Chapter7Exercises.exception.ArraySorterException;

public class BinarySorter implements ArraySorter {

    @Override
    public int[] sortAscending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int midPoint = arrayToSort.length/2;
        return new int[0];
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int midPoint = arrayToSort.length/2;
        return new int[0];
    }
}
