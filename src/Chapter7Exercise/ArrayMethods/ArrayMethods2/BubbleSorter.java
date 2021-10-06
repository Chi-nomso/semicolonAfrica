package Chapter7Exercise.ArrayMethods.ArrayMethods2;

import Chapter7Exercises.exception.ArraySorterException;

public class BubbleSorter implements ArraySorter {


    @Override
    public int[] sortAscending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int temp=-1;

        for(int i=0; i<arrayToSort.length-1; i++){
            for (int j = i+1; j < arrayToSort.length; j++) {
                if(arrayToSort[i]> arrayToSort[j]){
                   temp = arrayToSort[i];
                   arrayToSort[i]=arrayToSort[j];
                   arrayToSort[j]= temp;
                }
            }

        }
        return arrayToSort;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraySorterException {
        validateArray(arrayToSort);
        int temp=-1;
        for(int i=0; i<arrayToSort.length-1; i++){
            for (int j = i+1; j < arrayToSort.length; j++) {
                if(arrayToSort[i]< arrayToSort[j]){
                    temp = arrayToSort[i];
                    arrayToSort[i]=arrayToSort[j];
                    arrayToSort[j]= temp;
                }
            }

        }
        return arrayToSort;
    }


}
