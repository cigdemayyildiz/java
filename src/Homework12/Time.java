package Homework12;

public class Time {

    int hour, minute, second, month, year;

    public Time(){
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int month, int year){
        this.month = month;
        this.year = year;
    }

    public Time(int hour, int minute, int second, int month, int year){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour < 0 && hour >= 24){
            this.hour = 0;
        }
    }

    public void setMinute(int minute){
        this.minute = minute;
        if (minute <0 && minute >= 60){
            this.hour = 0;
        }
    }

    public void  setSecond(int second){
        this.second = second;
        if (second <= 0 && second > 60){
            this.second = 0;

        }
    }

    public void setMonth(int month){
        this.month = month;
        if (month < 0 && month >= 12){
            this.month = 0;
        }
    }

    public void setYear(int year){
        this.year = year;
        if (year < 0){
            this.year = 0;
        }
    }

    public void amPm(int hour){
        if (hour >=0 && hour < 12){
            System.out.println(hour+"am");
        }else{
            System.out.println(hour+"pm");
        }
    }

    public void season(int month){
        if (month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
        }
        if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        }
        if (month == 3 || month == 4 || month == 5){
            System.out.println("Autumn");
        }
    }

    /*
        public String season(String month){
        if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
                || month.equalsIgnoreCase("February")) {
            return "Winter";
        }
        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
                || month.equalsIgnoreCase("May")) {
            return "Spring";
        }
        if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
                || month.equalsIgnoreCase("August")) {
            return "Summer";
        }
            return "Autumn";
    }
    */

    public void printTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void printDate(){
        System.out.println(month + "/" + year);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second + " - " + month + "/" + year;
    }



    public void getInstructions(int input) {
        switch (input){
            case 9:
                System.out.println("Press 1 to create Time");
                System.out.println("Press 2 to create Date");
                System.out.println("Press 3 to create Date and Time");
                System.out.println("Press 4 to update Time");
                System.out.println("Press 5 to update Date");
                System.out.println("Press 6 to print Time Information");
                System.out.println("Press 7 to print Date Information");
                System.out.println("Press 8 to print Date and Time information");
            default:
                System.out.println("Press 9 to Exit");
        }
    }


}
