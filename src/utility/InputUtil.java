package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputUtil {

    public static boolean isInteger(String s) {
        boolean isInt = true;
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            isInt = false;
        }
        return isInt;
    }//end of isInteger block

    public static boolean isDouble(String s){
        boolean isDouble = true;
        try{
            Double.parseDouble(s);
        }catch(Exception e){
            isDouble = false;
        }
        return isDouble;
    }
    
    public static boolean hasSpecialCharacters(String aString) {
        Boolean result;

        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE); //patter for letters and numbers only
        Matcher m = p.matcher(aString);
        result = m.find();

        if (result) {
        } else if (result == false) {
        }
        return result;
    }
}
