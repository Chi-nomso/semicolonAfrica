package Chapter5Exercises;

public class ChristmasSong {
    public static void main(String[] args) {

        int userPrompt = 1;
        String day = "";

        do{
            switch (userPrompt){

                case 1:
                    day = "first day";
                    break;
                case 2:
                    day = "second day";
                    break;
                case 3:
                    day = "Third day";
                    break;
                case 4:
                    day = "fourth day";
                    break;
                case 5:
                    day = "fifth day";
                    break;
                case 6:
                    day = "sixth day";
                    break;
                case 7:
                    day = "seventh day";
                    break;
                case 8:
                    day = "Eighth day";
                    break;
                case 9:
                    day = "ninth day";
                    break;
                case 10:
                    day = "tenth day";
                    break;
                case 11:
                    day = "eleventh day";
                    break;
                case 12:
                    day = "twelfth day";
                    break;
            }
            System.out.printf("on the %s of christmas, my true love gave to me%n", day);

            switch (userPrompt){
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords are Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight maids are Milking");
                case 7:
                    System.out.println("Seven Swans are Swimming");
                case 6:
                    System.out.println("SIx Goose are Laying");
                case 5:
                    System.out.println("FIve Golden rings");
                case 4:
                    System.out.println("FoUR Calling birds");
                case 3:
                    System.out.println("Three French Hen");
                case 2:
                    System.out.println("Two Turtlle doves");
                case 1:
                    System.out.println("And a partridge in a pear tree");
            }
            System.out.println();
            userPrompt++;
        }while (userPrompt <= 12);
    }
}
