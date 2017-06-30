package daoimpl;

import dao.IFaculty;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Faculty;

public class FacultyDaoImpl implements IFaculty  {  

    @Override
    public int getSpecializationID(String lName, String fName, String mName) {
           int facultyId = 0;
        String SQL = "{CALL getFacultyId(?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,lName.trim());
            cs.setString(2, fName.trim());
            cs.setString(3, mName.trim());
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   facultyId = rs.getInt("faculty_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return facultyId;
    }
    
    

    
    
    @Override
    public Faculty getFacultyByID(int aFacultyID) {
        
        String SQL = "{CALL getFacultyByID(?)}";
        Faculty aFaculty = new Faculty();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(SQL);){
            
            cs.setInt(1, aFacultyID);
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next()){
                
                aFaculty.setFacultyID(rs.getInt("faculty_id"));
                aFaculty.setFirstName(rs.getString("firstName"));
                aFaculty.setLastName(rs.getString("lastName"));
                aFaculty.setMiddleName(rs.getString("middleName"));
                aFaculty.setCivilStatus(rs.getString("civilStatus"));
                aFaculty.setEmailAddress(rs.getString("email"));
                aFaculty.setContact(rs.getString("contact"));
                aFaculty.setDegree(rs.getString("degree"));
                
                }
            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return aFaculty;
    }
     
    @Override
    public List<Faculty> getAllSpecializationInfo() {
        
        List<Faculty>list = new ArrayList();
        String SQL = "{CALL getSpecialization()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
            while(rs.next())
            {
            
                Faculty faculty = new Faculty();
                faculty.setSpecializationID(rs.getInt("specialization_id"));
                faculty.setSpecializationTitle(rs.getString("specialization_title"));
                faculty.setSpecializationDescription(rs.getString("description"));
                faculty.setDateCreated(rs.getString("date_created"));
                list.add(faculty);
                
            }
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"getAllSpecializationInfo()\n"+e.getMessage());
        }
        return list;
    }   

    @Override
    public boolean addSpecialization(Faculty aFaculty) {
        
        boolean isAdded;
        String SQL = "{CALL addSpecialization(?,?,?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            
            cs.setInt(1, aFaculty.getSpecializationID());
            cs.setString(2, aFaculty.getSpecializationTitle());
            cs.setString(3, aFaculty.getSpecializationDescription());
              cs.setString(4, aFaculty.getDateCreated());
           
  
            
            cs.executeUpdate();
            isAdded = true;
            
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isAdded;
    }
    
    

    @Override
    public List<Faculty> getAllFaculty() {
     
        List<Faculty> list = new ArrayList();
        String SQL = "{CALL getFaculty()}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
            while(rs.next())
            {
                Faculty faculty = new Faculty();
                faculty.setFacultyID(rs.getInt("faculty_ID"));
                faculty.setFirstName(rs.getString("firstName"));
                faculty.setLastName(rs.getString("lastName"));
                faculty.setMiddleName(rs.getString("middleName"));
                faculty.setContact(rs.getString("contact"));
                faculty.setCivilStatus(rs.getString("civilStatus"));
                faculty.setEmailAddress(rs.getString("email"));
                faculty.setDegree(rs.getString("degree"));
                faculty.setStatus(rs.getBoolean("Status"));
                list.add(faculty);         
            }  
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"getFaculty()\n"+e.getMessage());
        }
            return list;
            
    }

    @Override
    public List<Faculty> findByID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Faculty> findByName() {
         List<Faculty>list = new ArrayList();
        String SQL = "{CALL searchFaculty()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
             CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
            while(rs.next())
            {
                Faculty faculty = new Faculty();
                faculty.setFacultyID(rs.getInt("faculty_ID"));
                faculty.setFirstName(rs.getString("firstName"));
                faculty.setLastName(rs.getString("lastName"));
                faculty.setMiddleName(rs.getString("middleName"));
                faculty.setCivilStatus(rs.getString("civilStatus"));
                faculty.setContact(rs.getString("contact"));
                faculty.setEmailAddress(rs.getString("email"));
                faculty.setStatus(rs.getBoolean("status"));
                list.add(faculty);  
            }
            
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"getFaculty()\n"+e.getMessage());
        }
        return list;
        
    }

    @Override
    public boolean addFaculty(Faculty aFaculty) {
        
        boolean isAdded;
        String SQl = "{CALL addFaculty(?,?,?,?,?,?,?,?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQl);){
            
            cs.setInt(1, aFaculty.getFacultyID());
            cs.setString(2, aFaculty.getFirstName());
            cs.setString(3, aFaculty.getLastName());
            cs.setString(4, aFaculty.getMiddleName());
            cs.setString(5, aFaculty.getEmailAddress());
            cs.setString(6, aFaculty.getContact());
            cs.setString(7, aFaculty.getCivilStatus());
            cs.setString(8, aFaculty.getDegree());
            
            cs.executeUpdate();
            isAdded = true;
            
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isAdded;
    }
        
    @Override
    public boolean updateFaculty(Faculty aFaculty) {
        
    boolean isUpdated;
        String SQl = "{CALL updateFaculty(?,?,?,?,?,?,?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQl);){
            
            cs.setInt(1, aFaculty.getFacultyID());
            cs.setString(2, aFaculty.getFirstName());
            cs.setString(3, aFaculty.getLastName());
            cs.setString(4, aFaculty.getMiddleName());
            cs.setString(5, aFaculty.getContact());
            cs.setString(6, aFaculty.getEmailAddress());
             cs.setString(7, aFaculty.getCivilStatus());
           
            
            cs.executeUpdate();
            isUpdated = true;
            
        } catch (SQLException e) {
            isUpdated = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isUpdated;
        
    }
}
