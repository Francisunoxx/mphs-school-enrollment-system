package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtil {
    
    public static String toString(char[] password){
        String stringPass; //serves as container of converted char[] password to String
        stringPass = String.valueOf(password); //converts char[] value of password to String value and stores it to stringPass
        return stringPass;
    }
    
    public static boolean hasSpecialCharacters(char[] password){
        Boolean result ; 
        String stringPassword; //placeholder of char[]array password converted to String
        stringPassword = toString(password); //converts the char[]array password to a String 
        
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(stringPassword);
        result = m.find();
        
        if(result != true){
            result = false;
        }   
        return result;
    }
    
    public static boolean hasSpecialCharacters(String password){
        Boolean result; 
               
        Pattern p = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE); //patter for letters and numbers only
        Matcher m = p.matcher(password);
        result=m.find();
        
        if(result){
        }else if(result == false){
        }
        return result;
    }
}
