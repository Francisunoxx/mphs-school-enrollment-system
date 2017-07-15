/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.penaltysetting;

import component_model_loader.PaymentTermML;
import daoimpl.PaymentTermDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.PaymentTerm;
import static view.penalty.PenaltySettings.jlstSchoolYearFilter;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SaveNewController{
    private JComboBox syFrom;
    private JComboBox syTo;
    private JComboBox ptSemestral;
    private JComboBox ptQuarterly;
    private JComboBox ptMonthly;
    private JTextField semestralPenalty;
    private JTextField quarterlyPenalty;
    private JTextField monthlyPenalty;
    private JButton savePenalty;
    private JDialog mainWindow;
    
    private ActionListener save;
    
    SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
    
    public SaveNewController(JComboBox syFrom,JComboBox syTo,JComboBox ptSemestral,JComboBox ptQuarterly,
            JComboBox ptMonthly,JTextField semestralPenalty,JTextField quarterlyPenalty,JTextField monthlyPenalty,
            JButton savePenalty,
            JDialog mainWindow){
        this.syFrom = syFrom;
        this.syTo = syTo;
        this.ptSemestral = ptSemestral;
        this.ptQuarterly = ptQuarterly;
        this.ptMonthly = ptMonthly;
        this.semestralPenalty = semestralPenalty;
        this.quarterlyPenalty = quarterlyPenalty;
        this.monthlyPenalty = monthlyPenalty;
        this.savePenalty = savePenalty;
        this.mainWindow = mainWindow;
    }

    public void control() {
        save = (ActionEvent e) -> {
            int choice = JOptionPane.showConfirmDialog(null, "Save?", "Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(choice == JOptionPane.YES_OPTION){
                boolean isSuccessful = false;
                
                List<PaymentTerm> list = getPaymentTerms();
                isSuccessful = ptdi.addPaymentTermPenalty(list);
                if(isSuccessful){
                    JOptionPane.showMessageDialog(null,"Successfully added new record.");
                    updatePenaltyList();
                    mainWindow.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Error encountered while adding record.");
                }
            }
        };
        savePenalty.addActionListener(save);
        
    }
    
    private List<PaymentTerm> getPaymentTerms(){
        int schoolYearId = sydi.getId(Integer.parseInt(syFrom.getSelectedItem().toString()));
        int semestralId = ptdi.getId(ptSemestral.getSelectedItem().toString().trim());
        int quarterlyId = ptdi.getId(ptQuarterly.getSelectedItem().toString().trim());
        int monthlyId = ptdi.getId(ptMonthly.getSelectedItem().toString().trim());
        double semestralAmount = Double.parseDouble(semestralPenalty.getText().trim());
        double quarterlyAmount = Double.parseDouble(quarterlyPenalty.getText().trim());
        double monthlyAmount = Double.parseDouble(monthlyPenalty.getText().trim());
        
        PaymentTerm s = new PaymentTerm();
        s.setSchoolYearId(schoolYearId);
        s.setPaymentTermId(semestralId);
        s.setPenaltyAmount(semestralAmount);
        
        PaymentTerm q = new PaymentTerm();
        q.setSchoolYearId(schoolYearId);
        q.setPaymentTermId(quarterlyId);
        q.setPenaltyAmount(quarterlyAmount);
        
        PaymentTerm m = new PaymentTerm();
        m.setSchoolYearId(schoolYearId);
        m.setPaymentTermId(monthlyId);
        m.setPenaltyAmount(monthlyAmount);
        
        List<PaymentTerm> listOfPaymentTerms = new ArrayList<>();
        listOfPaymentTerms.add(s);
        listOfPaymentTerms.add(q);
        listOfPaymentTerms.add(m);
        
        return listOfPaymentTerms;
    }
    
    private void updatePenaltyList(){
        PaymentTermML paymentTermML = new PaymentTermML();
        DefaultListModel newModel = paymentTermML.getSchoolYearsWithPenalty();
        jlstSchoolYearFilter.setModel(newModel);
    }
}
