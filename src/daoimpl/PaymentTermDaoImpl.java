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
import model.PaymentTermPenalty;
import model.Period;
import model.SchoolYear;

/**
 *
 * @author Acer
 */
public class PaymentTermDaoImpl implements IPaymentTerm{
    
    private PeriodDaoImpl periodDaoImlp = new PeriodDaoImpl();

    @Override
    public List<PaymentTerm> getAll() {
        List<PaymentTerm> list = new ArrayList<>();
        String SQLa = "{CALL getAllPaymentTermsInfo()}";
        String SQLb = "{CALL getPeriodsByPaymentTermId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement csa = con.prepareCall(SQLa);
                CallableStatement csb = con.prepareCall(SQLb);) {

            try (ResultSet rsa = csa.executeQuery();) {
                while (rsa.next()) {
                    PaymentTerm paymentTerm = new PaymentTerm();
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
    public boolean addPaymentDeadline(List<PaymentTerm> paymentTerms) {
        boolean isAdded = false;
        String SQL = "{CALL addPaymentTermDeadline(?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {

            for (PaymentTerm pt : paymentTerms) {
                List<Period> periods = pt.getPeriods();
                for (Period p : periods) {
                    int periodId = periodDaoImlp.getId(p.getDescription().trim());
                    
                    cs.setInt(1, pt.getSchoolYearId());
                    cs.setInt(2, pt.getPaymentTermId());
                    cs.setInt(3, periodId);
                    cs.setDate(4, java.sql.Date.valueOf(p.getPaymentDeadline().toString()));
                    cs.executeUpdate();
                }
            }
            isAdded = true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return isAdded;
    }

    @Override
    public boolean addPaymentTermPenalty(List<PaymentTerm> paymentTerms) {
        boolean isAdded = true;
        String SQL = "{CALL addPaymentTermPenalty(?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL)){
            con.setAutoCommit(false);
            try(CallableStatement cs = con.prepareCall(SQL);){
                for(PaymentTerm p : paymentTerms){
                    cs.setInt(1,p.getSchoolYearId());
                    cs.setInt(2, p.getPaymentTermId());
                    cs.setDouble(3, p.getPenaltyAmount());
                    cs.executeUpdate();
                }
            }catch(SQLException e){
                isAdded = false;
                con.rollback();
                con.setAutoCommit(true);
                throw e;
            }
            con.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public List<SchoolYear> getSchoolYearsWithPenalty() {
        List<SchoolYear> list = new ArrayList<>();
        String SQL = "{CALL getSchoolYearsWithPenalty()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear s = new SchoolYear();
                    s.setSchoolYearId(rs.getInt("schoolyear_id"));
                    s.setYearFrom(rs.getInt("yearFrom"));
                    s.setYearTo(rs.getInt("yearTo"));
                    s.setIsActive(rs.getBoolean("isActive"));
                    s.setStart_date(rs.getDate("start_date"));
                    s.setEnd_date(rs.getDate("end_date"));
                    s.setIsCurrentSchoolYear(rs.getBoolean("isCurrentSchoolYear"));
                    
                    list.add(s);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<PaymentTermPenalty> getPenaltyInformationBySchoolYearId(int schoolYearId) {
        List<PaymentTermPenalty> list = new ArrayList<>();
        
        String SQL = "{CALL getPenaltyInformationBySchoolYearId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,schoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    PaymentTerm paymentTerm = new PaymentTerm();
                    paymentTerm.setPaymentTermId(rs.getInt("paymentterm_id"));
                    paymentTerm.setName(rs.getString("paymentterm"));
                    paymentTerm.setDivisor(rs.getInt("divisor"));
                    paymentTerm.setIsActive(rs.getBoolean("isActive"));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    PaymentTermPenalty penalty = new PaymentTermPenalty();
                    penalty.setDateAdded(rs.getDate("date_added"));
                    penalty.setPenaltyId(rs.getInt("penalty_id"));
                    penalty.setPenaltyAmount(rs.getDouble("penalty_amount"));
                    penalty.setSchoolYear(schoolYear);
                    penalty.setPaymentTerm(paymentTerm);
                    
                    list.add(penalty);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    
}
