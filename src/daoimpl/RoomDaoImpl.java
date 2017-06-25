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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import daoimpl.LoginDaoImpl;
import daoimpl.SchoolYearDaoImpl;

/**
 *
 * @author Acer
 */

public class RoomDaoImpl {
    private String roomName_No;
    private String buildingName_No;
    private int capacity;
    private int syYearFrom;
    private int syYearTo;
    
    public RoomDaoImpl(String aRoomName_No, String aBldgName_No, int aCapacity, int aSyYearFrom, int aSyYearTo){
        roomName_No = aRoomName_No;
        buildingName_No = aBldgName_No;
        capacity = aCapacity;
        syYearFrom = aSyYearFrom;
        syYearTo = aSyYearTo;
    }
    
    public Boolean add(){
        boolean isSuccessful = true;
        String SQL = "{CALL addRoom(?,?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString( 1,roomName_No);
            cs.setString( 2,buildingName_No);
            cs.setInt( 3,capacity);
            cs.setInt(5,LoginDaoImpl.getUserId() );
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. \n"+e.getMessage()+"\n"+e.getCause());
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    public static DefaultTableModel getAll(JTable aJTable){
        DefaultTableModel myModel = (DefaultTableModel) aJTable.getModel();
        myModel.setRowCount(0);
        String SQL = "{CALL getAllRoomInformation()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String myRoomNameOrNum = rs.getString("room_name_or_num");
                    String myBldgNameOrNo = rs.getString("bldg_name_or_num");
                    int myCapacity = rs.getInt("capacity");
                    String myAddedBy = rs.getString("addedBy");
                    String myDateAdded = rs.getString("dateAdded");
                    String myLastEditedBy = rs.getString("lastEditedBy");
                    String myDateLastEdited = rs.getString("dateLastEdited");
                    
                    myModel.addRow(new Object[]{myRoomNameOrNum,myBldgNameOrNo,myCapacity,myAddedBy,myDateAdded,myLastEditedBy,myDateLastEdited} );
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. \n"+e.getMessage()+"\n"+e.getCause());
        }
        return myModel;
    }
    
    public static DefaultComboBoxModel getAll(){
        DefaultComboBoxModel myModel = new DefaultComboBoxModel();
        String SQL = "{CALL getAllRoomInformation()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String myRoomNameOrNum = rs.getString("room_name_or_num");
                    String myBldgNameOrNo = rs.getString("bldg_name_or_num");
                    int myCapacity = rs.getInt("capacity");
                    String myAddedBy = rs.getString("addedBy");
                    String myDateAdded = rs.getString("dateAdded");
                    String myLastEditedBy = rs.getString("lastEditedBy");
                    String myDateLastEdited = rs.getString("dateLastEdited");
                    
                    myModel.addElement( myRoomNameOrNum);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. \n"+e.getMessage()+"\n"+e.getCause());
        }
        return myModel;
    }
    
    public static int getId(String aRoomNameOrNum){
        int myRoomId = 0;
        String SQL = "{CALL getRoomId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aRoomNameOrNum);
            try(ResultSet rs  = cs.executeQuery();){
                while(rs.next()){
                    myRoomId = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. \n"+e.getMessage()+"\n"+e.getCause());
        }
        return myRoomId;
    }
}
