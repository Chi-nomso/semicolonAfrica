package VariousPractice;

public class SimilarCharacters {
    /**>>> given a string say "adrin".
     *  write a program that returns true, if all the characters in the string are similar and false if they are not.
     * */
    public class SameCharacter {
        public static void main(String[] args) {
            System.out.println(checkIfCharactersAreSimilar("aadrin"));

        }
        public static boolean checkIfCharactersAreSimilar(String letters) {

            for (int i = 1; i < letters.length(); i++) {

                if (letters.charAt(i) != letters.charAt(0)){
                    return false;
                }
            }
            return true;
        }















//        for (int i = 0; i < word.length(); i++) {
//            for (int j = i+1; j < word.length(); j++) {
//                if (word.charAt(i)==(word.charAt(j))) {
//                    System.out.println("true");
//                }else if (word.charAt(i) !=(word.charAt(j))){
//                    System.out.println("false");
//                }
//            }
//
//        }
    }
}
