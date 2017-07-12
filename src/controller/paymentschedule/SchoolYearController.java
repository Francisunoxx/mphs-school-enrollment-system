/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.paymentschedule;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolYearController implements ItemListener {

    private final JComboBox syFromSelected;
    private final JComboBox syToSelected;
    private final JComboBox sem1Year;
    private final JComboBox sem2Year;
    private final JComboBox q1Year;
    private final JComboBox q2Year;
    private final JComboBox q3Year;
    private final JComboBox q4Year;
    private final JComboBox mo1Year;
    private final JComboBox mo2Year;
    private final JComboBox mo3Year;
    private final JComboBox mo4Year;
    private final JComboBox mo5Year;
    private final JComboBox mo6Year;
    private final JComboBox mo7Year;
    private final JComboBox mo8Year;
    private final JComboBox mo9Year;
    private final JComboBox mo10Year;

    public SchoolYearController(
            JComboBox syFromSelected, JComboBox syToSelected, 
            JComboBox sem1Year, JComboBox sem2Year,
            JComboBox q1Year, JComboBox q2Year, JComboBox q3Year, JComboBox q4Year,
            JComboBox mo1Year, JComboBox mo2Year, JComboBox mo3Year, JComboBox mo4Year, JComboBox mo5Year,
            JComboBox mo6Year, JComboBox mo7Year, JComboBox mo8Year, JComboBox mo9Year, JComboBox mo10Year) {
        
        this.syFromSelected = syFromSelected;
        this.syToSelected = syToSelected;
        
        this.sem1Year = sem1Year;
        this.sem2Year = sem2Year;
        
        this.q1Year = q1Year;
        this.q2Year = q2Year;
        this.q3Year = q3Year;
        this.q4Year = q4Year;
        
        this.mo1Year = mo1Year;
        this.mo2Year = mo2Year;
        this.mo3Year = mo3Year;
        this.mo4Year = mo4Year;
        this.mo5Year = mo5Year;
        this.mo6Year = mo6Year;
        this.mo7Year = mo7Year;
        this.mo8Year = mo8Year;
        this.mo9Year = mo9Year;
        this.mo10Year = mo10Year;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == syFromSelected){
            int yearFromIndex = syFromSelected.getSelectedIndex();
            syToSelected.setSelectedIndex(yearFromIndex);
            
            int index = syFromSelected.getSelectedIndex();
            sem1Year.setSelectedIndex(index);
            sem2Year.setSelectedIndex(index);
            
            q1Year.setSelectedIndex(index);
            q2Year.setSelectedIndex(index);
            q3Year.setSelectedIndex(index);
            q4Year.setSelectedIndex(index);
            
            mo1Year.setSelectedIndex(index);
            mo2Year.setSelectedIndex(index);
            mo3Year.setSelectedIndex(index);
            mo4Year.setSelectedIndex(index);
            mo5Year.setSelectedIndex(index);
            mo6Year.setSelectedIndex(index);
            mo7Year.setSelectedIndex(index);
            mo8Year.setSelectedIndex(index);
            mo9Year.setSelectedIndex(index);
            mo10Year.setSelectedIndex(index);
        }
    }

}
