package Chapter14Exercises;

import java.util.Random;

public class ProjectLimerick {
    /* -> Declare 5 String Arrays (Poem Verses) with 5 elements each.
        -> Initialize a for loop to run 20 times to print randomly selected sentences(poems).
        -> in the loop, declare 5 string variables and assign them to the index of the random value generated.
        -> Each sentence printed should have spaces and be in the order : verse1, verse2, verse3, verse4, verse5.
        -> first sentence starts with a capital letter and end with a period.
     * */
    public static void main(String[] args) {
        String[] verse1 = {"Her", "Husband", "cried", "aloud", "Cease"};
        String[]verse2 = {"With a", "toasting", "fork", "gained", "his release" };
        String[] verse3 = {"And", "he", "popped", "every", "tire"};
        String[]verse4 = {"and", "then", "said", "I", "perspire"};
        String[] verse5 = {"joined", "his", "wife", "in the", "grease"};

        for (int i = 0; i < 20; i++) {
            String one = verse1[new Random().nextInt(verse1.length)];
            String two = verse2[new Random().nextInt(verse2.length)];
            String three = verse3[new Random().nextInt(verse3.length)];
            String four = verse4[new Random().nextInt(verse4.length)];
            String five = verse5[new Random().nextInt(verse5.length)];

            System.out.println(one.toUpperCase() + " " + two + " " + three + " " + four + " " + five + "!");

        }

    }
}
