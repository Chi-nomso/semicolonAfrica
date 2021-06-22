package Chapter8Exercises;

public class Time {
    private  int hour;
    private int minute;
    private int second;

    public void setTimeWith(int hour, int minute, int second){
        //IllegalArgumentException exception = new IllegalArgumentException()
        boolean hourIsInvalid = hour < 0 || hour >= 24;
//        if(hourIsInvalid) System.out.println("Bad Hour");
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour.\nEnter hours between 0 and 23");

        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        //if(minuteIsInvalid) System.out.println("Bad Minute");
        if(minuteIsInvalid) throw new IllegalArgumentException("Invalid minute.\nEnter minute between 0 and 59");

        boolean secondIsInvalid = second < 0 || second >= 60;
        //if(secondIsInvalid) System.out.println("Bad Second");
        if(secondIsInvalid) throw new IllegalArgumentException("Invalid second.\nEnter seconds between 0 and 59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    }
