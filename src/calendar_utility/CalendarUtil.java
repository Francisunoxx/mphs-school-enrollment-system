/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar_utility;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Years;

/**
 *
 * @author Acer
 */
public class CalendarUtil {
    public static int[] getDaysOfMonth(int aMonth, int aYear){
        Calendar calendar = new GregorianCalendar(aYear, aMonth, 1);
        int countOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int[] daysOfMonth = new int[countOfDays];
        System.out.println("Count of days of : "+aMonth+" " + countOfDays);
        for (int i = 0; i < countOfDays; i++) {
            daysOfMonth[i] = i+1;
        }
        return daysOfMonth;
    }
    
    public static String getMonthName(int aMonth) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (aMonth >= 0 && aMonth <= 11 ) {
            month = months[aMonth];
        }
        return month;
    }
    
    public static int getAgeByBirthday(int aYear, int aMonth, int aDay){
        LocalDate birthdate = new LocalDate(aYear, aMonth, aMonth);
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);
        String strAge = age.toString().replaceAll("\\D+", "");
        int finalAge = Integer.parseInt(strAge);
        return finalAge;
    }
    
    public static int getCurrentYear(){
        LocalDateTime now = LocalDateTime.now();
        int currentYear = now.getYear();
        return currentYear;
    }
    
    public static String getDateToday(){
        LocalDateTime now = LocalDateTime.now();
        DateFormatSymbols dfs = new DateFormatSymbols();
        int d = now.getDayOfMonth();
        int m = now.getMonthOfYear();
        String month = "";
        switch (m) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        
        int y = now.getYear();
        String date = month+" "+d+", "+y;
        return date;
    }
    
    public static String getDayToday(){
        String dayToday = "";
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch(day){
            
            case 1:
                dayToday = "Sunday";
                break;
            case 2:
                dayToday = "Monday";
                break;
            case 3:
                dayToday = "Tuesday";
                break;
            case 4:
                dayToday = "Wednesday";
                break;
            case 5:
                dayToday = "Thursday";
                break;
            case 6:
                dayToday = "Friday";
                break;
            case 7:
                dayToday = "Saturday";
    }
        return dayToday;
    }
    
    public static String getDateTimeToday(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

