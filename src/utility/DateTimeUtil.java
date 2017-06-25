package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {
    
    public static String getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
    
     public static String getCurrentTime(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
    
    public static int getCurrentYear(){
        
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }
    
   
}
