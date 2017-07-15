/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.penaltysetting;

import daoimpl.PaymentTermDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.PaymentTermPenalty;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolYearPenaltyListController{

    private JComboBox syFrom;
    private JComboBox syTo;
    private JComboBox ptSemestral;
    private JComboBox ptQuarterly;
    private JComboBox ptMonthly;
    private JTextField semestralPenalty;
    private JTextField quarterlyPenalty;
    private JTextField monthlyPenalty;
    private JList schoolYearPenaltyList;
    
    private ListSelectionListener schoolYearSelectedItemChange;
    
    public SchoolYearPenaltyListController(
            JComboBox syFrom, JComboBox syTo,
            JComboBox ptSemestral,
            JComboBox ptQuarterly,
            JComboBox ptMonthly, 
            JTextField semestralPenalty, 
            JTextField quarterlyPenalty, 
            JTextField monthlyPenalty,
            JList schoolYearPenaltyList) {

        this.syFrom = syFrom;
        this.syTo = syTo;
        this.ptSemestral = ptSemestral;
        this.ptQuarterly = ptQuarterly;
        this.ptMonthly = ptMonthly;
        this.semestralPenalty = semestralPenalty;
        this.quarterlyPenalty = quarterlyPenalty;
        this.monthlyPenalty = monthlyPenalty;
        this.schoolYearPenaltyList = schoolYearPenaltyList;
        
    }
    
    public void control(){
        schoolYearSelectedItemChange = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
                PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
                String selected = schoolYearPenaltyList.getSelectedValue().toString().trim();
                int syInt = Integer.parseInt(selected);
                
                List<PaymentTermPenalty> list = ptdi.getPenaltyInformationBySchoolYearId(sydi.getId(syInt));
                for(PaymentTermPenalty p : list){
                    if(p.getPaymentTerm().getName().equals("Semestral")){
                        semestralPenalty.setText(p.getPenaltyAmount()+"");
                        ptSemestral.setSelectedItem(p.getPaymentTerm().getName());
                    }
                    if(p.getPaymentTerm().getName().equals("Quarterly")){
                        quarterlyPenalty.setText(p.getPenaltyAmount()+"");
                        ptQuarterly.setSelectedItem(p.getPaymentTerm().getName());
                    }
                    if(p.getPaymentTerm().getName().equals("Monthly")){
                        monthlyPenalty.setText(p.getPenaltyAmount()+"");
                        ptMonthly.setSelectedItem(p.getPaymentTerm().getName());
                    }
                }
            }
        };
        
        schoolYearPenaltyList.addListSelectionListener(schoolYearSelectedItemChange);
    }
    
    
    
}
