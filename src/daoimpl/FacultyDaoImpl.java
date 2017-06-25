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
import javax.swing.JOptionPane;
import model.Faculty;

public class FacultyDaoImpl implements IFaculty  {

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
                faculty.setFacultyId(rs.getInt("faculty_ID"));
                faculty.setFirstName(rs.getString("firstName"));
                faculty.setLastName(rs.getString("lastName"));
                faculty.setMiddleName(rs.getString("middleName"));
                faculty.setCivilStatus(rs.getString("civilStatus"));
                faculty.setContactNumber(rs.getString("contact"));
                faculty.setEmailAddress(rs.getString("email"));
                faculty.setStatus(rs.getBoolean("status"));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFaculty(Faculty aFaculty) {
        
        boolean isAdded;
        String SQl = "{CALL addFaculty(?,?,?,?,?,?,?,?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQl);){
            
            cs.setInt(1, aFaculty.getFacultyId());
            cs.setString(2, aFaculty.getFirstName());
            cs.setString(3, aFaculty.getLastName());
            cs.setString(4, aFaculty.getMiddleName());
            cs.setString(5, aFaculty.getCivilStatus());
            cs.setString(6, aFaculty.getContactNumber());
            cs.setString(7, aFaculty.getEmailAddress());
            cs.setBoolean(8, aFaculty.getStatus()); 
            
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
        String SQl = "{CALL updateFaculty(?,?,?,?,?,?,?,?)}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQl);){
            
            
            cs.setInt(1, aFaculty.getFacultyId());
            cs.setString(2, aFaculty.getFirstName());
            cs.setString(3, aFaculty.getLastName());
            cs.setString(4, aFaculty.getMiddleName());
            cs.setString(5, aFaculty.getCivilStatus());
            cs.setString(6, aFaculty.getContactNumber());
            cs.setString(7, aFaculty.getEmailAddress());
            cs.setBoolean(8, aFaculty.getStatus());
            
            cs.executeUpdate();
            isUpdated = true;
            
        } catch (SQLException e) {
            isUpdated = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isUpdated;
        
    }

    @Override
    public int getId(String lastname, String firstname, String middlename) {
        int facultyId = 0;
        String SQL = "{CALL getFacultyId(?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,lastname.trim());
            cs.setString(2, firstname.trim());
            cs.setString(3, middlename.trim());
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
    
    
}
