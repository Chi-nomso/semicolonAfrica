package Chapter14Exercises;

public class CharacterExamples{
    public static void main(String[] args) {
        Character letter = 'A';
        char primitiveLetter = letter;
        //**this method above unboxes the value 'A' back to the character value

        System.out.println(Character.digit(letter,16));
        //this
        System.out.println(Character.forDigit(10,16));


        String value = "A";
        System.out.println(value.matches("A-Z"));
    }
}
