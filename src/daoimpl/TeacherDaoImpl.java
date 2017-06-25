
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class TeacherDaoImpl {
    String firstName;
    String middleName;
    String lastName;
    
    public TeacherDaoImpl(String p_fname, String p_mname, String p_lname){
        firstName = p_fname;
        middleName = p_mname;
        lastName = p_lname;
    }
    
    public static DefaultComboBoxModel getAllTeacher(){
        String SQL = "{CALL getAllTeacher()}";
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        comboModel.addElement( rs.getString("Adviser") );
                    }
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return comboModel;
    }
}
