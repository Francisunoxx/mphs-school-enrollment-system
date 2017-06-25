package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PermissionDaoImpl {

    public String username;
    
    public PermissionDaoImpl (String aUsername){
        this.username = aUsername;
    }
    
    public Boolean hasHomeTab() {
        Boolean homeTabAccess = null;
        String sql = "SELECT HOME FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    homeTabAccess = rs.getBoolean("HOME");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return homeTabAccess;
    }
    
    public Boolean hasAdministrationTab() {
        Boolean adminTabAccess = null;
        String sql = "SELECT ADMINISTRATION FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    adminTabAccess = rs.getBoolean("ADMINISTRATION");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return adminTabAccess;
    }
    
    public Boolean hasPaymentTab() {
        Boolean paymentTabAccess = null;
        String sql = "SELECT PAYMENT FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    paymentTabAccess = rs.getBoolean("PAYMENT");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return paymentTabAccess;
    }
    
    public Boolean hasRegistrationTab() {
        Boolean registrationTabAccess = null;
        String sql = "SELECT REGISTRATION FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    registrationTabAccess = rs.getBoolean("REGISTRATION");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return registrationTabAccess;
    }
    
    public Boolean hasFacultyTab() {
        Boolean facultyTabAccess = null;
        String sql = "SELECT FACULTY FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    facultyTabAccess = rs.getBoolean("FACULTY");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return facultyTabAccess;
    }
    
    public Boolean hasReportsTab() {
        Boolean reportsTabAccess = null;
        String sql = "SELECT REPORTS FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    reportsTabAccess = rs.getBoolean("REPORTS");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return reportsTabAccess;
    }
    
    public Boolean hasStudentsTab() {
        Boolean studentsTabAccess = null;
        String sql = "SELECT STUDENTS FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    studentsTabAccess = rs.getBoolean("STUDENTS");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return studentsTabAccess;
    }
    
    public Boolean hasSectionsTab() {
        Boolean sectionsTabAccess = null;
        String sql = "SELECT SECTIONS FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    sectionsTabAccess = rs.getBoolean("SECTIONS");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return sectionsTabAccess;
    }
    
    public Boolean hasGradesTab() {
        Boolean gradesTabAccess = null;
        String sql = "SELECT GRADES FROM homepermission WHERE USERNAME =?";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    gradesTabAccess = rs.getBoolean("GRADES");
                }//end of while
            }
        } catch (SQLException e) {
            String errorInfo = "Error message: " + e.getMessage() + "\n" + "Error code: " + e.getErrorCode() + "\n"
                    + "SQL State: " + e.getSQLState();
            JOptionPane.showMessageDialog(null, errorInfo);
        }
        return gradesTabAccess;
    }
}
