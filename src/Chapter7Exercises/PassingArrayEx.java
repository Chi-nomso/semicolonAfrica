package Chapter7Exercises;

public class PassingArrayEx {

    public static void modifyArray(int[]scores2){
        for (int count = 0; count < scores2.length; count++){
            scores2[count] *= 2;
        }
    }

    public static void modifyElement(int element){
        element *= 2;
        System.out.println("The passed element has been modified = "+ element);
    }

    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5};
        System.out.println("Wanna pass ref to an entire array");
        System.out.println("The values of the original array are: ");
        for (int value : scores)
        System.out.print(value + " ");

        modifyArray(scores);
        System.out.printf("%n%nThe values of the modified array are:%n");
        for (int value : scores)
            System.out.printf(" %d", value);
        System.out.println();
        System.out.println("The value of Score[3] before passing it to be modified was "+ scores[3]);
        modifyElement(scores[3]);
        System.out.println("That value of element in score[3] before it was modify was "+ scores[3]);
    }
}
