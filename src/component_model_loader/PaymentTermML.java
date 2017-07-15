/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.PaymentTermDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.PaymentTerm;
import model.SchoolYear;

/**
 *
 * @author John Ferdinand Antonio
 */
public class PaymentTermML {
    PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
    SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    
    public DefaultComboBoxModel getNames() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        List<PaymentTerm> paymentTerms = ptdi.getAll();
        Object[] pt = paymentTerms.toArray();
        for (Object o : pt) {
            PaymentTerm p = (PaymentTerm) o;
            String name = p.getName();
            if (!name.equals("Cash")) {
                dcm.addElement(name);
            }
        }
        dcm.setSelectedItem(null);
        return dcm;
    }
    
    public DefaultListModel getSchoolYearsWithPenalty(){
        DefaultListModel dlm = new DefaultListModel();
        List<SchoolYear> syList = ptdi.getSchoolYearsWithPenalty();
        Object[] pt = syList.toArray();
        for (Object o : pt) {
            SchoolYear sy = (SchoolYear) o;
                int schoolYearId = sy.getSchoolYearId();
                int penaltySchoolYear = sydi.getById(schoolYearId).getYearFrom();
                dlm.addElement(penaltySchoolYear);
        }
        return dlm;
    }
}
