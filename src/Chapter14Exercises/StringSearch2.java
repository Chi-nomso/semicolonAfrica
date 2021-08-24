package Chapter14Exercises;

public class StringSearch2 {
    /**--> Search for the total index of:
     * --> letter p
     * --> letter e
     * --> letter t
     * --> letter r
     * --> letter i
     * --> letter c
     * --> letter k
     * --> letter d
     * */
    public static void main(String[] args) {
        String sentence = "peter piper picked pepper";
        char one = 'p';
        char two = 'e';
        char three = 't';
        char four = 'r';
        char five = 'i';
        char six = 'c';
        char seven = 'k';
        char eight = 'd';
        int count = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i)==one){

            //int index = sentence.indexOf('p','0');
           //if(index >= 0){
            count++;
            //index = index+1;
        }
        }
        System.out.println("The number of times letter \"p\" appears is " + count);


        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == two){
                count++;
        }
    }
        System.out.println("The number of times letter \"e\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == three){
                count++;
           }
    }
        System.out.println("The number of times letter \"t\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == four){
                count++;
            }
        }
        System.out.println("The number of times letter \"r\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == five){
                count++;
            }
        }
        System.out.println("The number of times letter \"i\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == six){
                count++;
            }
        }
        System.out.println("The number of times letter \"c\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == seven){
                count++;
            }
        }
        System.out.println("The number of times letter \"k\" appears is " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == eight){
                count++;
            }
        }
        System.out.println("The number of times letter \"d\" appears is " + count);
    }
}
