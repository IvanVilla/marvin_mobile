/*
 * MAGRATHEA - DAM
 */
package model.utils;

import java.util.Calendar;

/**
 * Almacena un día, mes, año
 * @author Iván Villa
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    /**
     * Constructor with parameters
     * @param Day day
     * @param Month month
     * @param Year year
     */
    public MyDate(int Day, int Month, int Year) {
        this.day = Day;
        this.month = Month;
        this.year = Year;
    }

    /**
     * Constructor without parameters: we take actual day
     */
    public MyDate() {
        Calendar rightNow = Calendar.getInstance();
        this.day = rightNow.get(Calendar.DAY_OF_MONTH);
        this.month = rightNow.get(Calendar.MONTH)+1;
        this.year = rightNow.get(Calendar.YEAR);
    }
    
    //GETTERS y SETTERS

    /**
     * Returns the day
     * @return Day
     */
    public int getDay() {
        return day;
    }

    /**
     * Set the day
     * @param Day
     */
    public void setDay(int Day) {
        this.day = Day;
    }

    /**
     * Returns the month
     * @return Month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Set the mont
     * @param Month
     */
    public void setMonth(int Month) {
        this.month = Month;
    }

    /**
     * Returns the year
     * @return Year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the Year
     * @param Year Year
     */
    public void setYear(int Year) {
        this.year = Year;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
