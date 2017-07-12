/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.paymentschedule;

import daoimpl.PaymentTermDaoImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Division;

/**
 *
 * @author John Ferdinand Antonio
 */
public class CreateController implements ActionListener{

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
    private final JTextField semestralLateFee;
    private final JTextField quarterlyLateFee;
    private final JTextField monthlyLateFee;
    
    public CreateController(
            JComboBox syFromSelected, JComboBox syToSelected,
            JComboBox sem1Year, JComboBox sem2Year,
            JComboBox q1Year, JComboBox q2Year, JComboBox q3Year, JComboBox q4Year,
            JComboBox mo1Year, JComboBox mo2Year, JComboBox mo3Year, JComboBox mo4Year, JComboBox mo5Year,
            JComboBox mo6Year, JComboBox mo7Year, JComboBox mo8Year, JComboBox mo9Year, 
            JComboBox mo10Year,
            
            JComboBox sem1Month, JComboBox sem2Month,
            JComboBox q1Month, JComboBox q2Month, JComboBox q3Month, JComboBox q4Month,
            JComboBox mo1Month,JComboBox mo2Month,JComboBox mo3Month,JComboBox mo4Month,JComboBox mo5Month,
            JComboBox mo6Month,JComboBox mo7Month,JComboBox mo8Month,JComboBox mo9Month,
            JComboBox mo10Month,
            
            JComboBox sem1Day, JComboBox sem2Day,
            JComboBox q1Day, JComboBox q2Day, JComboBox q3Day, JComboBox q4Day,
            JComboBox mo1Day,JComboBox mo2Day,JComboBox mo3Day,JComboBox mo4Day,JComboBox mo5Day,
            JComboBox mo6Day,JComboBox mo7Day,JComboBox mo8Day,JComboBox mo9Day,
            JComboBox mo10Day,
            
            JTextField semestralLateFee, JTextField quarterlyLateFee, JTextField monthlyLateFee) {
        
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
        
        this.semestralLateFee = semestralLateFee;
        this.quarterlyLateFee = quarterlyLateFee;
        this.monthlyLateFee = monthlyLateFee;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int choice = JOptionPane.showConfirmDialog(null, "Create Payment Schedule?", "Create", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            if(create()){
                JOptionPane.showMessageDialog(null,"Successfully created.");
            }else{
                JOptionPane.showMessageDialog(null,"Creation failed. Error encountered.");
            }
        }
    }
    
    private boolean create(){
       boolean isCreated = false;
       
       PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
       
       
       
       
       return isCreated;
    }
    
}
