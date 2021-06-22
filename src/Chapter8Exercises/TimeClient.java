package Chapter8Exercises;

public class TimeClient {
    public static void main(String[] args) {
        Time myTime = new Time();
        try{
        myTime.setTimeWith(10,120,142);
    }
        catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }
}
}
