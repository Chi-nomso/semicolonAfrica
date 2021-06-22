package Chapter7Exercises;
/* This is used to print out all the values of the array
in an incremental order
 */
public class DisplayArray {
    public static void main(String[] args) {
        int[] scores = {34, 56, 75, 34, 65};
        int counter = 0;
        //you can also write while(counter < scores.length)
        while (counter<5){
            System.out.println(scores[counter]);
            counter++;
        }
        /*System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
    }*/
}
}
