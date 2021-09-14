package Chapter7Exercises;

public class DisplayArrayExample5 {
    /**---> create an array of 10 elements{87,68,94,100,83,78,85,91,76,87}
     * ---> 1 grade in range 100
            2 grades in 90s
            4 grades in 80s
            2 grades in 70s
            1 grade in 60s
            none below 60s
     * ---> create an array of 11 elements that contains the ranges values of the grades.
     * ---> display the header "Grade Distribution"
     * ---> using a for loop, create a range display: 10-19,20-29...90-100, with an if statement in the loop;
     * --> use a for loop to create an asterisk in front of the grades from 60>above
     * */

    public static void main(String[] args) {
        //int []grades = {87,68,94,100,83,78,85,91,76,87};
        int[] range = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Grade Distribution");
        for (int count = 0; count < range.length; count++) {
          if(count == 10) {
              System.out.printf("%d%n", 100);
          }else{
              System.out.printf("%02d-%02d:%n ", count * 10, count*10+9);
          }
            for (int hash = 0; hash < range[count]; hash++) {
                System.out.print("* ");
                // System.out.println();
            }

        }
    }
}
