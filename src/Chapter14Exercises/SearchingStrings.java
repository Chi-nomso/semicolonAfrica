package Chapter14Exercises;

public class SearchingStrings {
    /** --> input a line of texts or sentence
     * --> find the number of a character occurrence in the sentence
     * --> using the method indexOf
     * */
    public static void main(String[] args) {
       String sentence = "Peter piper picked pepper";
        System.out.println("Letter \"p\" is located at index " + sentence.indexOf('p',1));
        System.out.println("Letter \"e\" is located at index " + sentence.indexOf('e',4));
        System.out.println("Letter \"i\" is located at index " + sentence.indexOf('i'));
    }

}
