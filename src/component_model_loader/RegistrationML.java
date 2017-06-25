/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.RegistrationDaoImpl;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Registration;

/**
 *
 * @author Jordan
 */
public class RegistrationML {
    private final RegistrationDaoImpl REGISTRATION_DAO_IMPL = new RegistrationDaoImpl();
    
    public DefaultTableModel getAllRegisteredApplicants(JTable jTable){
        DefaultTableModel aJtableModel = (DefaultTableModel) jTable.getModel();
        aJtableModel.setRowCount(0);
        
        Object[] registrationList = REGISTRATION_DAO_IMPL.getAllRegistrationInfo().toArray();
        for (Object o : registrationList) {
            Registration r = (Registration) o;

            Object[] rowData = {
                r.getRegistrationId(),
                r.getLastName(),
                r.getFirstName(),
                r.getMiddleName(),
                r.getGradeLevel() == 0 ? "Kindergarten" : "Grade " + r.getGradeLevel(),
                r.getSchoolYear().getYearFrom() + "-" + r.getSchoolYear().getYearTo(),
                r.getRegistrationDate(),
                r.getIsAdmissionComplete() == true ? "Yes" : "No",
                r.getIsDownpaymentPaid() == true ? "Yes" : "No"
            };
            aJtableModel.addRow(rowData);
        }
        return aJtableModel;
    }
    
    public DefaultTableModel getAllRegisteredApplicantsByKeyword(JTable jTable,String aKeyword){
        DefaultTableModel aJtableModel = (DefaultTableModel) jTable.getModel();
        aJtableModel.setRowCount(0);
        
        Object[] registrationList = REGISTRATION_DAO_IMPL.getAllRegistrationInfoByKeyword(aKeyword).toArray();
        for (Object o : registrationList) {
            Registration r = (Registration) o;

            Object[] rowData = {
                r.getRegistrationId(),
                r.getLastName(),
                r.getFirstName(),
                r.getMiddleName(),
                r.getGradeLevel() == 0 ? "Kindergarten" : "Grade " + r.getGradeLevel(),
                r.getSchoolYear().getYearFrom() + "-" + r.getSchoolYear().getYearTo(),
                r.getRegistrationDate(),
                r.getIsAdmissionComplete() == true ? "Yes" : "No",
                r.getIsDownpaymentPaid() == true ? "Yes" : "No"
            };
            aJtableModel.addRow(rowData);
        }
        return aJtableModel;
    }
}
