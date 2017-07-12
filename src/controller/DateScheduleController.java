/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import component_model_loader.CalendarML;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author John Ferdinand Antonio
 */
public class DateScheduleController{

    
    private JComboBox month;
    private JComboBox day;
    private JComboBox year;
    
    private ItemListener monthItemListener;
    private ItemListener dayItemListener;
    private ItemListener yearItemListener;
    
    public DateScheduleController(JComboBox month, JComboBox day, JComboBox year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public void control() {
        monthItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int y = Integer.parseInt(year.getSelectedItem().toString());
                int m = Integer.parseInt(month.getSelectedItem().toString());
                DefaultComboBoxModel dcm = CalendarML.getDaysOfMonth(m, y);
                day.setModel(dcm);
            }
        };
        month.addItemListener(monthItemListener);
        
        dayItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        yearItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int y = Integer.parseInt(year.getSelectedItem().toString());
                int m = Integer.parseInt(month.getSelectedItem().toString());
                DefaultComboBoxModel dcm = CalendarML.getDaysOfMonth(m, y);
                day.setModel(dcm);
            }
        };
        year.addItemListener(yearItemListener);
    }
    
    
    

    
}
