/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import calendar_utility.CalendarUtil;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Acer
 */
public class CalendarML {
    
    public static DefaultComboBoxModel getDaysOfMonth(int aMonth, int aYear) {
        DefaultComboBoxModel daysModel = new DefaultComboBoxModel();
        int[] daysOfMonth = CalendarUtil.getDaysOfMonth(aMonth, aYear);
        for (int day : daysOfMonth) {
            daysModel.addElement(day);
        }
        return daysModel;
    }
    
    public static DefaultComboBoxModel getCurrentYearToNYears(int aNYears){
        DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
        for (int i = CalendarUtil.getCurrentYear(); i <= CalendarUtil.getCurrentYear()+aNYears; i++) {
            yearModel.addElement(i);
        }
        return yearModel;
    }
    
    public static DefaultComboBoxModel getNYearToNYears(int aYearFrom, int aYearTo){
        DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
        for (int i = aYearFrom; i <= aYearTo; i++) {
            yearModel.addElement(i);
        }
        return yearModel;
    }
    
    public static DefaultComboBoxModel getMonthsOfYear(){
        DefaultComboBoxModel monthModel = new DefaultComboBoxModel();
        for(int month=0;month<=11; month++){
            monthModel.addElement(month);
        }
        return monthModel;
    }
}
