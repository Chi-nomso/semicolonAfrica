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


    public void setDateMonth(int June) {
        month = June;
    }
    public int getDateMonth() {
        return month;
    }


    public void setDateDayNumber(int Eighteenth) {
        day = Eighteenth;
    }
    public int getDateDayNumber() {
        return day;
    }


    public void setDateYear(int Year) {
        year = Year;
    }
    public int getDateYear() {
        return year;
    }

    public String displayDate(){
        return String.format("%02d/%02d/%d", month,day,year);
    }
}



