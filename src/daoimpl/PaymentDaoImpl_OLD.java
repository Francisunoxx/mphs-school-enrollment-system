
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import daoimpl.SchoolYearDaoImpl;

public class PaymentDaoImpl_OLD {
    
    public static void getId(){
        
    }
    
    public static class Term{
        
        public static DefaultComboBoxModel getAll(){
            DefaultComboBoxModel myModel = new DefaultComboBoxModel();
            String SQL = "{CALL getAllPaymentTerms()}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        String myPaymentTerm = rs.getString("paymentterm");
                        myModel.addElement(myPaymentTerm);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            }
            return myModel;
        }
        
        public static int getId(String aPaymentTerm){
            int myId = 0;
            String SQL = "{CALL getPaymentTermId(?)}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                cs.setString(1, aPaymentTerm);
                try(ResultSet rs = cs.executeQuery()){
                    while(rs.next()){
                        myId = rs.getInt("id");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog( null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
            }
            return myId;
        }
        
        public static Boolean setDownpayment(String aPaymentTerm, double aDownPaymentAmount, int aSyYearFrom, int aSyYearTo){
            int myPaymentTermId = Term.getId(aPaymentTerm);
            Boolean isSuccessful = true;
            String SQL = "{CALL setPaymentTermDownPayment(?,?,?)}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                cs.setInt(1,myPaymentTermId);
                cs.setDouble(2,aDownPaymentAmount);
//                cs.setInt(3, SchoolYearDaoImpl.getId(aSyYearFrom, aSyYearTo));
                cs.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog( null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
                isSuccessful = false;
            }
            return isSuccessful;
        }
        
        public static DefaultTableModel getDownPayments(JTable aJTable){
            DefaultTableModel myModel = (DefaultTableModel) aJTable.getModel();
            myModel.setRowCount(0);
            String  SQL = "{CALL getAllPaymentTermDownPayment()}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        String myPaymentTerm = rs.getString("paymentterm");
                        double myDownPayment = rs.getDouble("downpayment");
                        String mySchoolYear = rs.getString("schoolyear");
                        myModel.addRow(new Object[]{myPaymentTerm,myDownPayment,mySchoolYear});
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog( null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
            }
            return myModel;
        }
        
        public static double getDownPayment(String aPaymentTerm){
            String SQL = "{CALL getPaymentTermDownpayment(?)}";
            double myDownPayment = 0;
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                cs.setInt(1, getId(aPaymentTerm.trim()) );
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        myDownPayment = rs.getDouble("downpayment");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog( null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
            }
            return myDownPayment;
        }
        
    }
}
