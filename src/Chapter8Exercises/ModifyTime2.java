package Chapter8Exercises;

public class ModifyTime2 {
    /** >>> Modify the Time2 class
     * >>> implement the time as number of seconds since midnight
     * >>> show that no change is visible to the clients of the class
     * */

    private int hour;
    private int minute;
    private int secondsSinceMidnight;

    public ModifyTime2() {
        this(0,0,0);
    }

    public ModifyTime2(int hour, int minute, int secondsSinceMidnight) {
    }

    public ModifyTime2(int hour, int minute) {
        this(hour,minute,0);
    }

    public ModifyTime2(int hour) {
        this(hour,0,0);
    }
}
