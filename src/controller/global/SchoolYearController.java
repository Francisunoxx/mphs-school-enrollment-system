/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.global;

import daoimpl.SchoolYearDaoImpl;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.UIManager;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolYearController implements ItemListener{

    private final JComboBox yearFrom;
    private final JComboBox yearTo;
    
    public SchoolYearController(
            JComboBox yearFrom,
            JComboBox yearTo) {
        
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        UIManager.put("TextField.disabledBackground", new Color(255, 255, 255));
        UIManager.put("TextField.inactiveForeground", Color.BLACK);
        
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
        this.yearTo.setEnabled(false);
        setCurrentSchoolYear();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == yearFrom) {
            int selectedIndex = yearFrom.getSelectedIndex();
            yearTo.setSelectedIndex(selectedIndex);
        }
    }
    
    private void setCurrentSchoolYear(){
        int current = SchoolYearDaoImpl.getCurrentSchoolYear().getYearFrom();
        this.yearFrom.setSelectedItem(current);
        
        int yearFromIndex = this.yearFrom.getSelectedIndex();
        this.yearTo.setSelectedIndex(yearFromIndex);
    }
}
