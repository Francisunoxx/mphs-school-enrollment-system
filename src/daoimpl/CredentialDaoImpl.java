
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Credential;
import model.GradeLevel;
import model.SchoolYear;
import dao.ICredential;

public class CredentialDaoImpl implements ICredential{

    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();

    @Override
    public boolean removeCredentialById(int aCredentialId) {
        boolean isAdded;
        String SQL = "{CALL removeCredentialById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aCredentialId);
            cs.executeUpdate();
            isAdded = true;
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isAdded;
    }
    
    
    
    @Override
    public List<Credential> getCredentialByGradeLevelId(int aGradeLevelId) {
        List<Credential> credentialList = new ArrayList<>();
        String SQL = "{CALL getCredentialByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aGradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    
                    SchoolYear yearCreated = new SchoolYear();
                    yearCreated.setSchoolYearId(rs.getInt("schoolyear_id"));
                    yearCreated.setYearFrom(rs.getInt("yearFrom"));
                    yearCreated.setYearTo(rs.getInt("yearTo"));
                    
                    Credential credential = new Credential();
                    credential.setCredentialId(rs.getInt("credential_id"));
                    credential.setCredentialName(rs.getString("credential_name"));
                    credential.setDateAdded(rs.getDate("date_added"));
                    credential.setSchoolYearCreated(yearCreated);
                    credential.setGradeLevelsAssigned(getGradeLevelsAssignedToCredentialById(rs.getInt("credential_id")));
                    
                    credentialList.add(credential);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return credentialList;
    }

    @Override
    public boolean addCredential(Credential aCredential) {
        Integer countOfGradeLevels = aCredential.getGradeLevelsAssigned().size();
        boolean isAdded;
        String SQLa = "{CALL addCredential(?,?,?)}";
        String SQLb = "{CALL assignCredential(?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);){
            try (CallableStatement csa = con.prepareCall(SQLa);
                    CallableStatement csb = con.prepareCall(SQLb);){
                con.setAutoCommit(false);
                csa.setString(1,aCredential.getCredentialName());
                csa.setString(2, aCredential.getCredentialDescription());
                csa.registerOutParameter(3, Types.INTEGER);
                csa.executeUpdate();
                Integer aCredentialId = csa.getInt(3);// credential_id returned after adding credential by csa
                
                for (int index=0; index<countOfGradeLevels; index++ ) {
                    Integer aGradeLevelId = aCredential.getGradeLevelsAssigned().get(index).getId();
                    csb.setInt(1, aCredentialId);
                    csb.setInt(2, aGradeLevelId);
//                    JOptionPane.showMessageDialog(null,"GradeLevelId: "+aGradeLevelId);
                    csb.setInt(3, aCredential.getSchoolYearCreated().getSchoolYearId());
                    csb.executeUpdate();
                }
                isAdded = true;
                con.commit();
            } catch (SQLException e) {
                con.rollback();
                isAdded = false;
                JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
            }
            
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isAdded;
    }

    @Override
    public Integer getCredentialIdByName(String aCredentialName) {
        Integer aCredentialId = null;
        String SQL = "{CALL getCredentialIdByName(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aCredentialName);
            try(ResultSet rs = cs.executeQuery();){
                while (rs.next()) {
                    aCredentialId = rs.getInt("credential_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aCredentialId;
    }

    @Override
    public boolean alreadyExists(String aCredentialName) {
        int rowCount = 0;
        boolean exists = false;
        String SQL = "{CALL credentialAlreadyExists(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aCredentialName);
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        rowCount++;
                    }
                    exists = rowCount>0;
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return exists;
    }

    
    
    @Override
    public List<Credential> getAllCredentials() {
        List<Credential> credentialList = new ArrayList<>();
        String SQL = "{CALL getAllCredentials()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Credential credential = new Credential();
                    SchoolYear yearCreated = new SchoolYear();
                    yearCreated.setSchoolYearId(rs.getInt("schoolyear_id"));
                    yearCreated.setYearFrom(rs.getInt("yearFrom"));
                    yearCreated.setYearTo(rs.getInt("yearTo"));
                    
                    credential.setCredentialId(rs.getInt("credential_id"));
                    credential.setCredentialName(rs.getString("credential_name"));
                    credential.setDateAdded(rs.getDate("date_added"));
                    credential.setCredentialDescription(rs.getString("credential_description"));
                    credential.setGradeLevelsAssigned(getGradeLevelsAssignedToCredentialById(rs.getInt("credential_id")));
                    credential.setSchoolYearCreated(yearCreated);
                    
                    credentialList.add(credential);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return credentialList;
    }

    @Override
    public List<GradeLevel> getGradeLevelsAssignedToCredentialById(int aCredentialId) {
        List<GradeLevel> gradeLevelList = new ArrayList<>();
        String SQL = "{CALL getGradeLevelsAssignedToCredentialById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aCredentialId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    gradeLevelList.add(gradeLevel);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return gradeLevelList;
    }
    
}
