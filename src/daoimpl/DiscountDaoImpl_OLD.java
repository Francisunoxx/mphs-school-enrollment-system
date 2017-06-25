/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class DiscountDaoImpl_OLD {
    private double percentage;
    private String discountName;
    private String description;

    public static double getPercentage(String aDiscountName) {
        double myPercentage = 0;
        String SQL = "{CALL getDiscountPercentage(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aDiscountName);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myPercentage = rs.getDouble("percentage");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myPercentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }
    
    public boolean addDiscount(){
        String SQL = "{CALL addNewDiscount(?,?,?)}";
        boolean isSuccessful = true;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, discountName);
            cs.setDouble(2, percentage);
            cs.setString(3, description);
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    public static int getId(String aDiscountName){
        int myDiscountId = 0;
        String SQL = "{CALL getDiscountId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aDiscountName);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myDiscountId = rs.getInt("discount_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myDiscountId;
    }
    
    public static DefaultListModel getNames(){
        String SQL = "{CALL getDiscountNames}";
        DefaultListModel discountNames = new DefaultListModel();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String name = rs.getString("discountType");
                    discountNames.addElement(name);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return discountNames;
    }

    public static String getDescription(String aDiscountName ) {
        String myDescription = "";
        String SQL = "{CALL getDiscountDescription(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aDiscountName);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   myDescription = rs.getString("description");
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static DefaultComboBoxModel getAll(){
        DefaultComboBoxModel myModel = new DefaultComboBoxModel();
        String SQL = "{CALL getAllDiscounts()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String myDiscount = rs.getString("discountType");
                    myModel.addElement(myDiscount);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getErrorCode());
        }
        return myModel;
    }

    public static boolean delete(String aDiscountName){
        boolean isDeleteSuccessful = true;
        String SQL = "{CALL deleteDiscount(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            //JOptionPane.showMessageDialog(null, "discountId: "+getId(aDiscountName));
            cs.setInt(1,getId(aDiscountName));
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error.\n"+e.getMessage()+"\n"+e.getErrorCode());
            isDeleteSuccessful = false;
        }
        return isDeleteSuccessful;
    }
}
