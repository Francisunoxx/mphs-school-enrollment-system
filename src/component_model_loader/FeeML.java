/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.FeeCategoryDaoImpl;
import daoimpl.FeeDaoImpl;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Fee;
import model.FeeCategory;
import model.GradeLevel;


public class FeeML {

    private static final DecimalFormat DECIMAL_FORMATTER = new DecimalFormat("#.00");
    FeeDaoImpl fdi = new FeeDaoImpl();
    FeeCategoryDaoImpl fcdi = new FeeCategoryDaoImpl();
    
    public DefaultTableModel getDownpaymentFeesAsModel(JTable jTable,int aGradeLevel){
        DefaultTableModel jTableModel = (DefaultTableModel)jTable.getModel();
        jTableModel.setRowCount(0);
        
        FeeCategory feeCategory = new FeeCategory();
        feeCategory.setCategory("Downpayment");
        
        GradeLevel gradeLevel = new GradeLevel();
        gradeLevel.setLevel(aGradeLevel);
        
        Object[] data = fdi.getFeesByGradeLevelAndCategory(gradeLevel,feeCategory).toArray();
        for(Object o : data){
            Fee f = (Fee)o;
            Object [] rowData = {f.getName(),DECIMAL_FORMATTER.format(f.getAmount()) };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getTuitionFeesAsModel(JTable jTable,int aGradeLevel){
        DefaultTableModel jTableModel = (DefaultTableModel)jTable.getModel();
        jTableModel.setRowCount(0);
        FeeCategory feeCategory = new FeeCategory();
        feeCategory.setCategory("Tuition");
        
        GradeLevel gradeLevel = new GradeLevel();
        gradeLevel.setLevel(aGradeLevel);
        
        Object[] data = fdi.getFeesByGradeLevelAndCategory(gradeLevel,feeCategory).toArray();
        for(Object o : data){
            Fee f = (Fee)o;
            Object [] rowData = {f.getName(),DECIMAL_FORMATTER.format(f.getAmount()) };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getMiscellaneousFeesAsModel(JTable jTable, int aGradeLevel){
        DefaultTableModel jTableModel = (DefaultTableModel)jTable.getModel();
        jTableModel.setRowCount(0);
        FeeCategory feeCategory = new FeeCategory();
        feeCategory.setCategory("Miscellaneous");
        GradeLevel gradeLevel = new GradeLevel();
        gradeLevel.setLevel(aGradeLevel);
        
        Object[] data = fdi.getFeesByGradeLevelAndCategory(gradeLevel,feeCategory).toArray();
        for(Object o : data){
            Fee f = (Fee)o;
            Object [] rowData = {f.getName(),DECIMAL_FORMATTER.format(f.getAmount()) };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getOtherFeesAsModel(JTable jTable, int aGradeLevel){
        DefaultTableModel jTableModel = (DefaultTableModel)jTable.getModel();
        jTableModel.setRowCount(0);
        
        FeeCategory feeCategory = new FeeCategory();
        feeCategory.setCategory("Others");
        
        GradeLevel gradeLevel = new GradeLevel();
        gradeLevel.setLevel(aGradeLevel);
        
        Object[] data = fdi.getFeesByGradeLevelAndCategory(gradeLevel,feeCategory).toArray();
        for(Object o : data){
            Fee f = (Fee)o;
            Object [] rowData = {f.getName(),DECIMAL_FORMATTER.format(f.getAmount()) };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
 
    public DefaultComboBoxModel getAllFeeCategoriesAsModel(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        List<FeeCategory> feeCategoryList = fcdi.getAllFeeCategory();
        Object[] data = feeCategoryList.toArray();
        for(Object o : data){
            FeeCategory feeCategory = (FeeCategory) o;
            comboBoxModel.addElement(feeCategory.getCategory());
        }
        comboBoxModel.setSelectedItem(null);
        return comboBoxModel;
    }
    
    public DefaultListModel getAllFeeNamesAsModel(){
        DefaultListModel listModel = new DefaultListModel();
        Object [] feeNames = fdi.getNames().toArray();
        for(Object o : feeNames){
            listModel.addElement(o);
        }
        return listModel;
    }
}
