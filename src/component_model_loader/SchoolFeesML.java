/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.SchoolFeesDaoImpl;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.BasicFee;
import model.DownPaymentFee;
import model.Fee;
import model.MiscellaneousFees;
import model.OtherFees;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolFeesML {
    private final DecimalFormat decimalFormatter = new DecimalFormat("#.00");
    private final SchoolFeesDaoImpl schoolFeesDaoImpl = new SchoolFeesDaoImpl();
    
    public DefaultTableModel getMiscellaneous(JTable jTable, int gradeLevelId){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        defaultTableModel.setRowCount(0);
        try {
            String[] columns = {"Fee Name", "Amount"};
            MiscellaneousFees miscellaneousFees = schoolFeesDaoImpl.getMiscellaneous(gradeLevelId);
            if (miscellaneousFees != null) {
                List<Fee> feeList = miscellaneousFees.getFees();
                for (Fee fee : feeList) {
                    Object[] rowData = {fee.getName(),decimalFormatter.format(fee.getAmount()) };
                    defaultTableModel.addRow(rowData);
                }
            }
            defaultTableModel.setColumnIdentifiers(columns);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return defaultTableModel;
    }
    
    public DefaultTableModel getOther(JTable jTable,int gradeLevelId){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        defaultTableModel.setRowCount(0);
        try {
            String[] columns = {"Fee Name", "Amount"};
            OtherFees otherFees = schoolFeesDaoImpl.getOther(gradeLevelId);
            List<Fee> feeList = otherFees.getFees();
            for (Fee fee : feeList) {
                Object[] rowData = {fee.getName(),decimalFormatter.format(fee.getAmount()) };
                defaultTableModel.addRow(rowData);
            }
            defaultTableModel.setColumnIdentifiers(columns);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return defaultTableModel;
    }
    
    public DefaultTableModel getDownPayment(JTable jTable,int gradeLevelId) {
        DefaultTableModel defaultTableModel = (DefaultTableModel)jTable.getModel();
        defaultTableModel.setRowCount(0);
        try {
            DownPaymentFee downPaymentFee = schoolFeesDaoImpl.getDownPayment(gradeLevelId);
            String[] columns = {"Fee Name", "Amount"};
            String name = downPaymentFee.getName();
            double amount = downPaymentFee.getAmount();
            Object[] rowData = {name, decimalFormatter.format(amount)};
            defaultTableModel.addRow(rowData);
            defaultTableModel.setColumnIdentifiers(columns);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Error\n"+ e.getMessage());
        }
        return defaultTableModel;
    }
    
    public DefaultTableModel getBasic(JTable jTable, int gradeLevelId){
        DefaultTableModel defaultTableModel = (DefaultTableModel)jTable.getModel();
        defaultTableModel.setRowCount(0);
        try {
            BasicFee basicFee = schoolFeesDaoImpl.getBasicFee(gradeLevelId);
            String[] columns = {"Fee Name","Amount"};
            String name = basicFee.getName();
            double amount = basicFee.getAmount();
            Object[] rowData = {name,decimalFormatter.format(amount)};
            defaultTableModel.addRow(rowData);
            defaultTableModel.setColumnIdentifiers(columns);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Error\n"+e.getMessage());
        }
        return defaultTableModel;
    }
}
