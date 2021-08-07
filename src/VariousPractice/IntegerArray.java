package Chapter7Exercises;

public class IntegerArray {
    public void c(){
        //int [] c = new int[12]; //declaring an array
        //int [] c = {12,20,23,34,45,56,87,76,65,54,43,32};
        //the above means, declaring and initializing elements to an array.
        int[]c = new int[12];
        System.out.printf("%8s%8s\n", "Index", "Value"); //this is the column heading
        for(int counter =0; counter< c.length;counter++){
            c[counter] = 2 + 2 * counter; //this is to assign values(even numbers) into the array declared
        }
        //using a for loop to display the index values(0-11) and default index element.
        for(int counter = 0; counter < c.length;counter++){
            System.out.printf("%4d%8d\n", counter, c[counter]);
        }
    }

    public static void main(String[] args) {
        new IntegerArray().c();
    }

}
