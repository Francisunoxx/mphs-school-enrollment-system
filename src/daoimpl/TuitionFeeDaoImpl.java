/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.ITuitionFee;
import database_utility.DBType;
import database_utility.DBUtil;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.derby.client.am.Types;
import model.BalanceBreakDownFee;
import model.Discount;
import model.PaymentTerm;
import model.SchoolYear;
import model.Student;
import model.TuitionFee;

/**
 *
 * @author John Ferdinand Antonio
 */
public class TuitionFeeDaoImpl implements ITuitionFee {

    private final StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    private final SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();

    @Override
    public boolean add(TuitionFee tuitionFee) {
        boolean isAdded = true;
        PaymentTerm paymentTerm = tuitionFee.getPaymentTerm();
        int paymentTermId = paymentTerm.getId();

        Discount discount = tuitionFee.getDiscount();
        int studentId = tuitionFee.getStudent().getStudentId();
        int schoolYearId = tuitionFee.getSchoolYear().getSchoolYearId();

        String SQLa = "{CALL addBalanceBreakDownFee(?,?,?)}";
        String SQLb = "{CALL addTuitionFee(?,?,?)}";
        String SQLc = "{CALL addStudentDiscount(?,?,?,?)}";
        String SQLd = "{CALL addStudentPaymentTerm(?,?,?)}";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try (CallableStatement csA = con.prepareCall(SQLa);
                    CallableStatement csB = con.prepareCall(SQLb);
                    CallableStatement csC = con.prepareCall(SQLc);
                    CallableStatement csD = con.prepareCall(SQLd);) {
                con.setAutoCommit(false);
                if (!tuitionFee.exists()) {
                    for (BalanceBreakDownFee bbf : tuitionFee.getBalanceBreakDownFees()) {
                        csA.setString(1, bbf.getDescription());
                        csA.setDouble(2, bbf.getAmount());
                        csA.registerOutParameter(3, Types.INTEGER);
                        csA.executeUpdate(); // executes addBalanceBreakDownFee() sp
                        int balanceBreakDownFeeId = csA.getInt(3);

                        csB.setInt(1, balanceBreakDownFeeId);
                        csB.setInt(2, studentId);
                        csB.setInt(3, schoolYearId);
                        csB.executeUpdate();
                    }
                    if (discount != null) {
                        csC.setInt(1, studentId);
                        csC.setInt(2, discount.getDiscountId());
                        csC.setInt(3, schoolYearId);
                        csC.setDouble(4,discount.getAmount());
                        csC.executeUpdate();
                    }

                    csD.setInt(1, studentId);
                    csD.setInt(2, paymentTermId);
                    csD.setInt(3, schoolYearId);
                    csD.executeUpdate();
                }
                con.commit();
            } catch (SQLException e) {
                isAdded = false;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isAdded;
    }

    @Override
    public TuitionFee get(int studentId, int schoolyearId) {
        TuitionFee tuitionFee = new TuitionFee();
        
        List<BalanceBreakDownFee> balanceBreakDownFeeList = new ArrayList<>();
        boolean exists = false;
        SchoolYear schoolYear = schoolYearDaoImpl.getSchoolYearById(schoolyearId);
        Student student = studentDaoImpl.getStudentById(studentId);
        PaymentTerm paymentTerm = new PaymentTerm();
        Discount discount = new Discount();

        String SQLa = "{CALL tuitionFeeExists(?,?)}";
        String SQLb = "{CALL getTuitionFee(?,?)}";
        String SQLc = "{CALL getTuitionFeeSum(?,?)}";
        String SQLd = "{CALL getStudentPaymentTerm(?,?)}";
        String SQLe = "{CALL getStudentDiscount(?,?)}";
        String SQLf = "{CALL getTuitionFeeTotalPaid(?,?)}";
        String SQLg = "{CALL hasTuitionFeeDiscount(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try (CallableStatement csA = con.prepareCall(SQLa);
                    CallableStatement csB = con.prepareCall(SQLb);
                    CallableStatement csC = con.prepareCall(SQLc);
                    CallableStatement csD = con.prepareCall(SQLd);
                    CallableStatement csE = con.prepareCall(SQLe);
                    CallableStatement csF = con.prepareCall(SQLf);
                    CallableStatement csG = con.prepareCall(SQLg)) {
                csA.setInt(1, studentId);
                csA.setInt(2, schoolyearId);
                try (ResultSet rsa = csA.executeQuery();) {
                    while (rsa.next()) {
                        exists = rsa.getBoolean("tuitionFeeExists");
                    }
                    tuitionFee.setExists(exists);
                }

                csB.setInt(1, studentId);
                csB.setInt(2, schoolyearId);
                try (ResultSet rsb = csB.executeQuery();) {
                    while (rsb.next()) {
                        BalanceBreakDownFee balanceBreakDownFee = new BalanceBreakDownFee();
                        balanceBreakDownFee.setAmount(rsb.getDouble("amount"));
                        balanceBreakDownFee.setBalance(rsb.getDouble("balance"));
                        balanceBreakDownFee.setBalanceBreakDownFeeId(rsb.getInt("balance_breakdown_fee_id"));
                        balanceBreakDownFee.setDateAssigned(rsb.getTimestamp("date_assigned"));
                        balanceBreakDownFee.setIsPaid(rsb.getBoolean("isPaid"));
                        balanceBreakDownFee.setSchoolYearId(rsb.getInt("schoolyear_id"));
                        balanceBreakDownFee.setDescription(rsb.getString("description"));
                        balanceBreakDownFee.setStudentId(rsb.getInt("student_id"));

                        balanceBreakDownFeeList.add(balanceBreakDownFee);
                    }
                    tuitionFee.setBalanceBreakDownFees(balanceBreakDownFeeList);
                }

                csC.setInt(1, studentId);
                csC.setInt(2, schoolyearId);
                try (ResultSet rsc = csC.executeQuery();) {
                    while (rsc.next()) {
                        tuitionFee.setSum(rsc.getDouble("tuitionFeeSum"));
                    }
                }

                csD.setInt(1, studentId);
                csD.setInt(2, schoolyearId);
                try(ResultSet rsD = csD.executeQuery();){
                    while(rsD.next()){
                        paymentTerm.setId(rsD.getInt("paymentterm_id"));
                        paymentTerm.setPaymentTerm(rsD.getString("paymentterm"));
                        paymentTerm.setIsActive(rsD.getBoolean("isActive"));
                    }
                }
                
                csE.setInt(1,studentId);
                csE.setInt(2,schoolyearId);
                try(ResultSet rsE = csE.executeQuery();){
                    while(rsE.next()){
                        discount.setAmount(rsE.getInt("amount"));
                        discount.setDiscountId(rsE.getInt("discount_id"));
                        discount.setDiscountName(rsE.getString("discount_name"));
                        discount.setPercentOfDiscount(rsE.getInt("percentage"));
                        discount.setDescription(rsE.getString("description"));
                        discount.setDateCreated(rsE.getDate("date_created"));
                        discount.setIsActive(rsE.getBoolean("isActive"));
                    }
                }
                
                csF.setInt(1,studentId);
                csF.setInt(2,schoolyearId);
                try(ResultSet rsF = csF.executeQuery();){
                    while(rsF.next()){
                        tuitionFee.setTotalPaid(rsF.getDouble("totalTuitionPaid"));
                    }
                }
                
                csG.setInt(1, studentId);
                csG.setInt(2, studentId);
                try(ResultSet rsG = csG.executeQuery();){
                    while(rsG.next()){
                        tuitionFee.setHasDiscount(rsG.getBoolean("hasDiscount"));
                    }
                }
                
                tuitionFee.setDiscount(discount);
                tuitionFee.setPaymentTerm(paymentTerm);
                tuitionFee.setStudent(student);
                tuitionFee.setSchoolYear(schoolYear);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tuitionFee;
    }

    @Override
    public boolean pay(TuitionFee tuitionFee) {
        boolean isSuccessfullyPaid = false;
        String SQLa = "{CALL addTransaction(?,?)}";
        String SQLb = "{CALL payTuitionFee(?,?,?)}";
        String SQLc = "{CALL addTransactionPayment(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try (CallableStatement csA = con.prepareCall(SQLa);
                    CallableStatement csB = con.prepareCall(SQLb);
                    CallableStatement csC = con.prepareCall(SQLc);) {
                con.setAutoCommit(false);

                csA.setInt(1, tuitionFee.getStudent().getStudentId());
                csA.registerOutParameter(2, Types.INTEGER);
                csA.executeUpdate();
                int aTransactionId = csA.getInt(2);
                
                for(BalanceBreakDownFee b: tuitionFee.getPayment().getParticulars().getBalanceBreakDownFees()){
                    JOptionPane.showMessageDialog(null,"Balance BreakDown Id: "+b.getBalanceBreakDownFeeId());
                    csB.setInt(1, b.getBalanceBreakDownFeeId());
                    csB.setDouble(2,tuitionFee.getPayment().getAmountTendered());
                    csB.registerOutParameter(3, Types.INTEGER);
                    csB.executeUpdate();
                    int aPaymentId = csB.getInt(3);
                    
                    csC.setInt(1, aTransactionId);
                    csC.setInt(2, aPaymentId);
                    csC.executeUpdate();
                }
                
                con.commit();
                isSuccessfullyPaid = true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isSuccessfullyPaid;
    }


    
}
