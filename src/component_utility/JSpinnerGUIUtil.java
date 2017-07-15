/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_utility;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;

/**
 *
 * @author Acer
 */
public class JSpinnerGUIUtil {

    public static SpinnerDateModel getADateModel() {
        Date myDate = new Date();
        SpinnerDateModel mySpinnerDateModel = new SpinnerDateModel(myDate, null, null, Calendar.HOUR_OF_DAY);
        return mySpinnerDateModel;
    }

    public static JSpinner.DateEditor getEditorInTimeFormat(JSpinner aJSpinner) {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(Calendar.HOUR_OF_DAY, 0);
        myCalendar.set(Calendar.MINUTE, 0);
        Date myDate = myCalendar.getTime();

        JSpinner.DateEditor myDateEditor = new JSpinner.DateEditor(aJSpinner, "HH:mm");
        aJSpinner.setValue(myDate);

        return myDateEditor;
    }
    
    public static void setEditorInDateFormat(JSpinner aJSpinner) {
        Date dateNow = Calendar.getInstance().getTime();
        SpinnerDateModel smb = new SpinnerDateModel(dateNow, null, null, Calendar.HOUR_OF_DAY);
        aJSpinner.setModel(smb);

        JSpinner.DateEditor d = new JSpinner.DateEditor(aJSpinner, "dd-MMM-yyyy");
        aJSpinner.setEditor(d);
    }

    public static void setDisabledForegroundColorTo(JSpinner aJSpinner, Color foregroundColor) {
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) aJSpinner.getEditor();
        JTextField tf = editor.getTextField();
        editor.getTextField().setForeground(foregroundColor);
        if (!tf.isEnabled()) {
            tf.setDisabledTextColor(UIManager.getColor("TextField.foreground"));
        }
    }
}
