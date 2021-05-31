package Chapter3Exercises;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setdateMonth(6) {
        month = 6;
    }
    public int getdateMonth() {
        return month;
    }


    public void setdateDayNumber(18) {
        day = 18;
    }
    public int getdateDayNumber() {
        return day;
    }


    public void setdateYear(int Year) {
        year = Year;
    }
    public int getdateYear() {
        return year;
    }

    public String displayDate(){
        return String.format("%02d/%02d/%d", month,day,year);
    }
}



