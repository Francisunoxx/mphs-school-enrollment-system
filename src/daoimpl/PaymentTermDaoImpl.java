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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PaymentTerm;
import dao.IPaymentTerm;

/**
 *
 * @author Acer
 */
public class PaymentTermDaoImpl implements IPaymentTerm{

    @Override
    public List<PaymentTerm> getAllPaymentTermsInfo() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQL = "{CALL getAllPaymentTermsInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setId(rs.getInt("paymentterm_id"));
                        paymentTerm.setName(rs.getString("paymentterm"));
                        paymentTerm.setIsActive(rs.getBoolean("isActive"));
                    list.add(paymentTerm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }

    @Override
    public List<PaymentTerm> getAllActivePaymentTerms() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQL = "{CALL getAllActivePaymentTerms()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setId(rs.getInt("paymentterm_id"));
                        paymentTerm.setName(rs.getString("paymentterm"));
                        paymentTerm.setIsActive(rs.getBoolean("isActive"));
                    list.add(paymentTerm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }
    
    @Override
    public List<PaymentTerm> getAllInActivePaymentTerms() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQL = "{CALL getAllInActivePaymentTerms()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setId(rs.getInt("paymentterm_id"));
                        paymentTerm.setName(rs.getString("paymentterm"));
                        paymentTerm.setIsActive(rs.getBoolean("isActive"));
                    list.add(paymentTerm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }

    @Override
    public PaymentTerm getById(int aPaymentTermId) {
        PaymentTerm paymentTerm = new PaymentTerm();
        String SQL = "{CALL getPaymentTermById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aPaymentTermId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    paymentTerm.setId(rs.getInt("paymentterm_id"));
                    paymentTerm.setName(rs.getString("paymentterm"));
                    paymentTerm.setIsActive(rs.getBoolean("isActive"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return paymentTerm;
    }

    @Override
    public int getId(String aPaymentTerm) {
        int paymentTermId = 0;
        String SQL = "{CALL getPaymentTermId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aPaymentTerm);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    paymentTermId = rs.getInt("paymentterm_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return paymentTermId;
    }

    @Override
    public boolean add(PaymentTerm aPaymentTerm) {
        boolean isAdded = false;
        String SQL = "{addNewPaymentTerm(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aPaymentTerm.getName());
            isAdded = cs.executeUpdate() == 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return isAdded;
    }
    
    
    
}
