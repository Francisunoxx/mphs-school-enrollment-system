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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class EducationalStageDaoImpl {
    public static int getId(String aEducationStage ){
        String SQL = "{CALL getEducationalStageId(?)}";
        int id = 0;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aEducationStage);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    id = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error :\n"+e.getMessage()+"\n"+e.getCause());
        }
        return id;
    }
    
    public static DefaultComboBoxModel getStages(){
        DefaultComboBoxModel myModel = new DefaultComboBoxModel();
        String SQL = "{CALL getEducationalStages()}";
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String educationStage = rs.getString("educationstage");
                    myModel.addElement(educationStage);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error :\n"+e.getMessage()+"\n"+e.getCause());
        }
        
        return myModel;
    }
}
