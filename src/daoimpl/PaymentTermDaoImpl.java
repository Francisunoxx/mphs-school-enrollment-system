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
import model.Period;

/**
 *
 * @author Acer
 */
public class PaymentTermDaoImpl implements IPaymentTerm{

    @Override
    public List<PaymentTerm> getAll() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQLa = "{CALL getAllPaymentTermsInfo()}";
        String SQLb = "{CALL getPaymentTermPeriodsById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement csa = con.prepareCall(SQLa);
                CallableStatement csb = con.prepareCall(SQLb);){
            
            try(ResultSet rsa = csa.executeQuery();){
                while(rsa.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setPaymentTermId(rsa.getInt("paymentterm_id"));
                        paymentTerm.setName(rsa.getString("paymentterm"));
                        paymentTerm.setIsActive(rsa.getBoolean("isActive"));
                        paymentTerm.setDivisor(rsa.getInt("divisor"));
                        
                        List<Period> periods = new ArrayList<>();
                        
                        csb.setInt(1,rsa.getInt("paymentterm_id"));
                        try(ResultSet rsb = csb.executeQuery();){
                            while(rsb.next()){
                                Period p = new Period();
                                p.setPeriodId(rsb.getInt("period_id"));
                                p.setCode(rsb.getString("period_code"));
                                p.setDescription(rsb.getString("description"));
                                
                                periods.add(p);
                            }
                        }
                        paymentTerm.setPeriods(periods);
                        
                    list.add(paymentTerm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }

    @Override
    public List<PaymentTerm> getAllActive() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQLa = "{CALL getAllActivePaymentTerms()}";
        String SQLb = "{CALL getPaymentTermPeriodsById(?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement csa = con.prepareCall(SQLa);
                CallableStatement csb = con.prepareCall(SQLb);){
            try(ResultSet rsa = csa.executeQuery();){
                while(rsa.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setPaymentTermId(rsa.getInt("paymentterm_id"));
                        paymentTerm.setName(rsa.getString("paymentterm"));
                        paymentTerm.setIsActive(rsa.getBoolean("isActive"));
                        paymentTerm.setDivisor(rsa.getInt("divisor"));
                        
                        List<Period> periods = new ArrayList<>();
                        
                        csb.setInt(1,rsa.getInt("paymentterm_id"));
                        try(ResultSet rsb = csb.executeQuery();){
                            while(rsb.next()){
                                Period p = new Period();
                                p.setPeriodId(rsb.getInt("period_id"));
                                p.setCode(rsb.getString("period_code"));
                                p.setDescription(rsb.getString("description"));
                                
                                periods.add(p);
                            }
                        }
                        paymentTerm.setPeriods(periods);
                        
                    list.add(paymentTerm);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }
    
    @Override
    public List<PaymentTerm> getAllInactive() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQLa = "{CALL getAllInActivePaymentTerms()}";
        String SQLb = "{CALL getPaymentTermPeriodsById(?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement csa = con.prepareCall(SQLa);
                CallableStatement csb = con.prepareCall(SQLb);){
            try(ResultSet rsa = csa.executeQuery();){
                while(rsa.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                        paymentTerm.setPaymentTermId(rsa.getInt("paymentterm_id"));
                        paymentTerm.setName(rsa.getString("paymentterm"));
                        paymentTerm.setIsActive(rsa.getBoolean("isActive"));
                        paymentTerm.setDivisor(rsa.getInt("divisor"));
                        
                        List<Period> periods = new ArrayList<>();
                        
                        csb.setInt(1,rsa.getInt("paymentterm_id"));
                        try(ResultSet rsb = csb.executeQuery();){
                            while(rsb.next()){
                                Period p = new Period();
                                p.setPeriodId(rsb.getInt("period_id"));
                                p.setCode(rsb.getString("period_code"));
                                p.setDescription(rsb.getString("description"));
                                periods.add(p);
                            }
                        }
                        paymentTerm.setPeriods(periods);
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
        String SQLa = "{CALL getPaymentTermById(?)}";
        String SQLb = "{CALL getPaymentTermPeriodsById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement csa = con.prepareCall(SQLa);
                CallableStatement csb = con.prepareCall(SQLb);) {
            csa.setInt(1, aPaymentTermId);
            try (ResultSet rsa = csa.executeQuery();) {
                while (rsa.next()) {
                    paymentTerm.setPaymentTermId(rsa.getInt("paymentterm_id"));
                    paymentTerm.setName(rsa.getString("paymentterm"));
                    paymentTerm.setIsActive(rsa.getBoolean("isActive"));
                    paymentTerm.setDivisor(rsa.getInt("divisor"));

                    List<Period> periods = new ArrayList<>();

                    csb.setInt(1, rsa.getInt("paymentterm_id"));
                    try (ResultSet rsb = csb.executeQuery();) {
                        while (rsb.next()) {
                            Period p = new Period();
                            p.setPeriodId(rsb.getInt("period_id"));
                            p.setCode(rsb.getString("period_code"));
                            p.setDescription(rsb.getString("description"));
                            periods.add(p);
                        }
                    }
                    paymentTerm.setPeriods(periods);
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

    @Override
    public boolean addPaymentDeadline(PaymentTerm aPaymentTerm) {
        boolean isAdded = false;
        String SQL = "{CALL addPaymentTermDeadline(?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1,aPaymentTerm.getSchoolYearId());
            cs.setInt(2,aPaymentTerm.getPaymentTermId());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    
    
    
    
}
