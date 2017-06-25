/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Acer
 */
public class NumberGUIUtil {

    public static double setTwoDecimalPlaces(double aDecimalNumber) {
        double myNum = 0;
        if (aDecimalNumber > 0) {
            myNum = aDecimalNumber;
            myNum = Math.round(myNum * 100.0) / 100.0;
        }
        return myNum;
    }
}
