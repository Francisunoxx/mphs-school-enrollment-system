
package daoimpl;

import constants.AdmissionTable;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Admission;
import dao.IAdmission;

public class AdmissionDaoImpl implements IAdmission{


    @Override
    public boolean completeAdmission(int aRegistrationId) {
        boolean isSuccessful;
        String SQL = "{CALL completeAdmission(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            cs.executeUpdate();
            isSuccessful = true;
        } catch (SQLException e) {
            isSuccessful = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isSuccessful;
    }
    
    
    
    @Override
    public Admission getAdmissionInfoByRegistrationId(int aRegistrationId) {
        String SQL = "{CALL getAdmissionInfoByRegistrationId(?)}";
        Admission admission = new Admission();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setRegistrationId(rs.getInt(AdmissionTable.REGISTRATIONID));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return admission;
    }

    @Override
    public Admission getAdmissionInfoByStudentId(int aStudentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
