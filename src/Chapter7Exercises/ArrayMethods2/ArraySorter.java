package Chapter7Exercises.ArrayMethods2;

import Chapter7Exercises.exception.ArraySorterException;

public interface ArraySorter {
    public int[] sortAscending(int[]arrayToSort) throws ArraySorterException;
    public int[] sortDescending(int[]arrayToSort) throws ArraySorterException;

default void validateArray(int[] arrayToCheck) throws ArraySorterException{
    if(arrayToCheck == null){
        throw new ArraySorterException("Array to sort cannot be null");
    }
    }
}
