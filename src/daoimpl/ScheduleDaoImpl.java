
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


public class ScheduleDaoImpl {
    private int startTime;
    private int endTime;
    private String day;
    private String roomNameOrNum;
    private String subjectCode;
    private String sectionName;
    private String gradeLevel;
    private int syYearFrom;
    private int syYearTo;
    
    public ScheduleDaoImpl(int aStartTime, int aEndTime, String aDay, String aRoomNameOrNum, 
            String aSubjectName, String aSectionName, String aGradeLevel, int aSyYearFrom, 
            int aSyYearTo)
    {
        startTime = aStartTime;
        endTime = aEndTime;
        gradeLevel = aGradeLevel;
        day = aDay;
        roomNameOrNum = aRoomNameOrNum;
        String[] subjectNameParts = aSubjectName.split(",");
        subjectCode = subjectNameParts[0].trim();
        sectionName = aSectionName;
        syYearFrom = aSyYearFrom;
        syYearTo = aSyYearTo;
    }
    
    public static DefaultTableModel getGradeLevelsWith(JTable aJTable){
        DefaultTableModel myModel = (DefaultTableModel) aJTable.getModel();
        String SQL = "{CALL getGradeLevelsAndSectionsWithSchedule()}";
        Object gradeLevel;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    int myGradeLevel = rs.getInt("gradeLevel");
                    if(myGradeLevel == 0){
                        gradeLevel = "Kindergarten";
                    }else{gradeLevel = myGradeLevel; }
                    String mySectionName = rs.getString("sectionName");
                    String mySchoolYear = rs.getString("schoolYear");
                    String myAddedBy = rs.getString("addedBy");
                    String myDateAdded = rs.getString("dateAdded");
                    myModel.addRow(new Object[] {gradeLevel,mySectionName,mySchoolYear,myAddedBy,myDateAdded});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myModel;
        
    }
    
    public Boolean add(){
        boolean isSuccessful = true;
        String SQL = "{CALL addSchedule(?,?,?,?,?,?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,startTime);
            cs.setInt(2,endTime);
            cs.setInt(3,Days.getId(day));
            cs.setInt(4,RoomDaoImpl.getId(roomNameOrNum));
            cs.setInt(6,LoginDaoImpl.getUserId());
//            cs.setInt(7,GradeLevelDaoImpl.getId(gradeLevel));
            cs.setInt(8,SectionDaoImpl_OLD.getId(sectionName));
            JOptionPane.showMessageDialog(null, SectionDaoImpl_OLD.getId(sectionName));
            JOptionPane.showMessageDialog(null, sectionName);
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    public static class Days{
        public static DefaultComboBoxModel getAll(){
            DefaultComboBoxModel myModel = new DefaultComboBoxModel();
            String SQL = "{CALL getDaysOfWeek()}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        String day = rs.getString("days");
                        myModel.addElement(day);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            }
            return myModel;
        }
        
        public static int getId(String aDay){
            int myId = 0;
            String SQL = "{CALL getDayOfWeekId(?)}";
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                cs.setString(1, aDay);
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                        myId = rs.getInt("id");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            }
            return myId;
        }
    }
}
