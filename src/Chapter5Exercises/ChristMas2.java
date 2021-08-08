package Chapter5Exercises;

public class ChristMas2 {
    public static void main(String[] args) {
        int userInput = 1;
        do{
            switch (userInput){
                case 1:
                    System.out.println("On the First day of Christmas");
                    break;
                case 2:
                    System.out.println("On the Second day of Christmas");
                    break;
                case 3:
                    System.out.println("On the Third day of Christmas");
                    break;
                case 4:
                    System.out.println("On the Fourth day of Christmas");
                    break;
                case 5:
                    System.out.println("On the Fifth day of Christmas");
                    break;
                case 6:
                    System.out.println("On the Six day of Christmas");
                    break;
                case 7:
                    System.out.println("On the Seven day of Christmas");
                    break;
                case 8:
                    System.out.println("On the Eight day of Christmas");
                    break;
                case 9:
                    System.out.println("On the Ninth day of Christmas");
                    break;
                case 10:
                    System.out.println("On the Tenth day of Christmas");
                    break;
                case 11:
                    System.out.println("On the Eleventh day of Christmas");
                    break;
                case 12:
                    System.out.println("On the Twelfth day of Christmas");
            }
            System.out.println("My True love gave to me");

            switch (userInput){
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven Pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("Seven swans a-swimming");
                case 6:
                    System.out.println("Six Geese a-laying");
                case 5:
                    System.out.println("Five golden rings");
                case 4:
                    System.out.println("Four calling Birds");
                case 3:
                    System.out.println("Three french hens");
                case 2:
                    System.out.println("Two Turtles Doves");
                case 1:
                    System.out.print("and");
                    System.out.println(" A partridge in a pear tree.");
            }
//            if(userInput > 1)
//                System.out.println("and");

            System.out.println();
            userInput++;
        }while (userInput <= 12);
    }
}
