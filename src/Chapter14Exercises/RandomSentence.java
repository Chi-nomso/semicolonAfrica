package Chapter14Exercises;

import java.util.Random;

public class RandomSentence {
    /* -> Declare 4Arrays (articles, nouns, verbs, prepositions) with 5 elements each.
       -> Initialize a for loop to run 20 times to print randomly selected sentences.
       -> in the loop, declare 6 string variables and assign them to the index of the random value generated.
       -> Each sentence printed should have spaces and be in the order : articles, nouns, verbs, prepositions,articles, nouns.
       -> first sentence starts with a capital letter and end with a period.
    * */
    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[]nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};


        for (int i = 0; i < 20; i++) {
            String firstWord = (articles[new Random().nextInt(articles.length)]);
            String secondWord = (nouns[new Random().nextInt(nouns.length)]);
            String thirdWord = (verbs[new Random().nextInt(verbs.length)]);
            String fourthWord = (prepositions[new Random().nextInt(prepositions.length)]);
            String fifthWord = (articles[new Random().nextInt(articles.length)]);
            String sixthWord = (nouns[new Random().nextInt(nouns.length)]);

            System.out.println(firstWord.toUpperCase() + " " + secondWord + " " + thirdWord + " " + fourthWord + " " + fifthWord + " "+ sixthWord + "!");
        }


    }
}
