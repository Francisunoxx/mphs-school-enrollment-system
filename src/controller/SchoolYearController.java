/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

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
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
        this.yearTo.setEnabled(false);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == yearFrom) {
            int selectedIndex = yearFrom.getSelectedIndex();
            yearTo.setSelectedIndex(selectedIndex);
        }
    }
}
