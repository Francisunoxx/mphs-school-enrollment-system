package daoimpl;

import dao.IUser;
import database_utility.DBType;
import database_utility.DBUtil;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.User;

public class UserDaoImpl implements IUser{

    @Override
    public User getById(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getUserRole(String aUsername) {
        String SQL = "SELECT Role FROM user WHERE USERNAME = ?";
        String userType = null;
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(SQL);){
            ps.setString(1, aUsername);
            try(ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                    userType = rs.getString("Role");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode()+" "+e.getMessage()+" @ "+e.getClass().getSimpleName());
        }
        return userType;
    }
    
    public String getFullName(String aUsername){
        
        String SQL = "{CALL getCompleteNameByUserName(?)}";
        String fullname;
        String lastname = null;
        String firstname = null;
        String middlename = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, aUsername);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    lastname = rs.getString("LastName");
                    firstname = rs.getString("FirstName");
                    middlename = rs.getString("MiddleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error@ " + getClass() + " " + e.getMessage());
        }
        fullname = lastname + ", " + firstname + " " + middlename;

        return fullname;
    }
    
    public String getFirstName(String aUsername){
        
        String SQL = "SELECT FirstName FROM user WHERE USERNAME = ?";
        String firstname = null;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aUsername);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    firstname = rs.getString("FirstName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error@ " + getClass() + " " + e.getMessage());
        }
        return firstname;
    }
    
    public String getMiddleName(String aUsername){
        
        String SQL = "SELECT MiddleName FROM user WHERE USERNAME = ?";
        String middleName = null;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aUsername);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    middleName = rs.getString("MiddleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error@ " + getClass() + " " + e.getMessage());
        }
        return middleName;
    }
    
    public String getLastName(String aUsername){
        
        String SQL = "SELECT LastName FROM user WHERE USERNAME = ?";
        String lastName = null;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aUsername);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    lastName = rs.getString("LastName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error@ " + getClass() + " " + e.getMessage());
        }
        return lastName;
    }
    
    public String getPassword(String aUsername){
        
        String SQL = "SELECT Password FROM user WHERE USERNAME = ?";
        String password = null;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aUsername);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    password = rs.getString("Password");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: " + getClass() + " " + e.getMessage());
        }
        return password;
    }
    
    public ImageIcon getProfilePicture(String aUsername, JLabel anImageHolder) {
        String SQL = "SELECT PROFILE_PIC from users_profile_picture WHERE USERNAME =?";
        ImageIcon finalImage = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aUsername);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    byte[] img = rs.getBytes("PROFILE_PIC");
                    ImageIcon myImageIcon = new ImageIcon(img);
                    Image image = myImageIcon.getImage();
                    Image myImage = image.getScaledInstance(anImageHolder.getWidth(), anImageHolder.getHeight(), Image.SCALE_SMOOTH);
                    finalImage = new ImageIcon(myImage);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: "+e.getClass()+ " " + e.getMessage());
        }
        return finalImage;
    }
    
    public Boolean updatePassword(String aUsername, String aNewPassword) {
        Boolean result;
        String SQL = "UPDATE user SET Password = ? WHERE Username = ?";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);) {
            ps.setString(1, aNewPassword);
            ps.setString(2, aUsername);
            ps.executeUpdate();
            result = true;
        } catch (SQLException e) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error at: " + getClass() + "\n" + e.getMessage());
        }
        return result;
    }
    
    public Boolean updateUserName(int aUserId, String aUsername){
        Boolean result;
        String SQL = "{CALL updateUserName(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aUserId); //assign value to 1st ?
            cs.setString(2, aUsername); //assign value to 2nd ?
            cs.executeUpdate();
            result = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: " + getClass() + "\n" + e.getMessage());
            result = false;
        }
        return result;
    }
    
    public int getUserId(String aUsername){
        int userId = 0;
        String SQL = "SELECT UserId FROM user WHERE USERNAME = ?";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL);){
                ps.setString(1, aUsername);
            try(ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                    userId = rs.getInt("USERID");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: " + e.getClass() + " " + e.getErrorCode());
        }
        return userId;
    }
    
    public Boolean updateProfilePicture(String aUsername, String imageFilePath) {
        String SQL = "UPDATE users_profile_picture SET PROFILE_PIC = ? WHERE USERNAME = ?";
        Boolean result;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(SQL)) {
            InputStream myInputStream = new FileInputStream(new File(imageFilePath));
            ps.setBlob(1, myInputStream);
            ps.setString(2, LoginDaoImpl.getUsername());
            ps.executeUpdate();
            result = true;  
            JOptionPane.showMessageDialog(null, "Successfully uploaded image");
        } catch (SQLException | FileNotFoundException e) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error uploading the file\n" + e.getMessage());
        }
        
        return result;
    }
}
