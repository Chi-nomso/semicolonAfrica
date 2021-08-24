package VariousPractice;

public class StudentsResponse {
    /** --> 20students
     * --> frequency of 1 - 5
     * --> find how many students rated for the quality of the food, 1 - 5
     * --> create a response Array of 20 elements
     * --> create a frequency array of length 6
     * -->loop through the frequency array to find each student's response
     * --> print out in table format using frequency and rating as header
     * */
    public static void main(String[] args) {
        int[] response = {1,2,3,4,5,4,3,2,1,2,3,4,5,4,3,2,1,2,3,4};
        int[] frequency = {1,2,3,4,5};

        for (int check = 0; check < response.length ; check++) {
            check = response[check];
            System.out.printf("%s%10s%n", "frequency", "Rating");
            System.out.println();
//            try {
//                ++frequency[response[check]];
//            }
//            catch (ArrayIndexOutOfBoundsException heyce){
//                System.out.println(heyce);
                System.out.printf("%d%15d%n", frequency[check], check);
         }
    }
}
