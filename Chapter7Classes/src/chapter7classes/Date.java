
package chapter7classes;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    public Date(int day, int month){
        setDay(day);
        setMonth(month);
        setYear(2021); // this is ugly, don't do this in real life
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if ( day < 1 || day > 31 ){
            this.day = 0;
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if ( day < 1 || day > 12 ){
            this.month = 0;
        }
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getPrettyDate(){
        return month + "-" + day + "-" + year;
    }
    
    public String getPrettyDate(String format){
       
        if ( format.equalsIgnoreCase("UK")){
            return day + "-" + month + "-" + year;
        }
        else if( format.equalsIgnoreCase("iso")){
            return year + "-" + month + "-" + day;
        } else{
            return getPrettyDate();
        }
    }
    
}
