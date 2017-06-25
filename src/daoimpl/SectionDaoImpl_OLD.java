
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import daoimpl.GradeLevelDaoImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import daoimpl.LoginDaoImpl;
import daoimpl.SchoolYearDaoImpl;


public class SectionDaoImpl_OLD {
    
    private String  sectionName;
    private String  sectionGradeLevel;
    private int     syYearFrom;
    private int     syYearTo;
    private String  adviserName;
    private String  sectionSession;
    
    public SectionDaoImpl_OLD(String p_Name, String p_gradeLevel, int p_syStart, int p_syEnd, String p_Adviser, String p_Session){
        sectionName         = p_Name;
        sectionGradeLevel   = p_gradeLevel;
        syYearFrom            = p_syStart;
        syYearTo              = p_syEnd;
        adviserName         = p_Adviser;
        sectionSession      = p_Session;
    }
    
    public static DefaultTableModel getAll(JTable table){
        DefaultTableModel sectionTableModel = (DefaultTableModel)table.getModel();
        sectionTableModel.setRowCount(0);
        String SQL = "{CALL getAllSectionsInfo()}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String sectionName = rs.getString("sectionName");
                    String level = rs.getString("level");
                    String schoolYear = rs.getString("schoolYear");
                    String session = rs.getString("session");
                    String addedBy = rs.getString("addedBy");
                    String dateAdded = rs.getString("dateAdded");
                    String adviser = rs.getString("adviser");
                    sectionTableModel.addRow(new Object[]{sectionName,session,adviser,level,schoolYear,addedBy,dateAdded});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getClass()+" "+ e.getMessage());
        }
        return sectionTableModel;
    }
    
    public static DefaultComboBoxModel getAll(){
        DefaultComboBoxModel sectionComboBoxModel = new DefaultComboBoxModel();
        String SQL = "{CALL getAllSectionsInfo()}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    String sectionName = rs.getString("sectionName");
                    String level = rs.getString("level");
                    String schoolYear = rs.getString("schoolYear");
                    String session = rs.getString("session");
                    String addedBy = rs.getString("addedBy");
                    String dateAdded = rs.getString("dateAdded");
                    String adviser = rs.getString("adviser");
                    sectionComboBoxModel.addElement(sectionName);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getClass()+" "+ e.getMessage());
        }
        return sectionComboBoxModel;
    }
    
    public void addSection(){
        String regex = "\\(([^)]*)\\)\\s*([^,]+),\\s*(\\S+)\\s*(\\S*)";
        Matcher m = Pattern.compile(regex).matcher(adviserName);
        if (m.matches()) {
            System.out.println("empNo = " + m.group(1));
            System.out.println("lName = " + m.group(2));
            System.out.println("fName = " + m.group(3));
            System.out.println("mName = " + m.group(4));
        }// end of if
        
        String SQL = "{ CALL addSection(?,?,?,?,?,?) }";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString( 1, sectionName);
//            cs.setInt(2, GradeLevelDaoImpl.getId(sectionGradeLevel) );
            cs.setInt(3, LoginDaoImpl.getUserId() );
//            cs.setInt(4, SchoolYearDaoImpl.getId(syYearFrom, syYearTo) );
//            cs.setInt( 5, Faculty.getId(Integer.parseInt(m.group(1)) ) );
 //           JOptionPane.showMessageDialog(null,"Faculty Id: "+Faculty.getId( Integer.parseInt(m.group(1)) ));
            cs.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Successfully added " + sectionName);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getClass()+"\nError Code:"+e.getErrorCode()+"\nMessage: "+e.getMessage() );
        }
    }
    
    public static DefaultComboBoxModel getByGradeLevel(String aGradeLevel){
        DefaultComboBoxModel myModel = new DefaultComboBoxModel<>();
        aGradeLevel = aGradeLevel.trim();
//        int myGradeLevelId = GradeLevelDaoImpl.getId(aGradeLevel);
        String SQL = "{CALL getSectionByGradeLevelId(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
//            cs.setInt(1, myGradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                     myModel.addElement( rs.getString("sectionName") );
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
        }
        return myModel;
    }
    
    public static int getId(String aSectionName){
        int mySectionId = 0;
        String SQL = "{CALL getSectionId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aSectionName);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    mySectionId = rs.getInt("section_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause() );
        }
        return mySectionId;
    }
    
    public static DefaultTableModel getStudents(String aSectionName, int yearFrom, int yearTo, JTable aJtable){
        DefaultTableModel myModel = (DefaultTableModel) aJtable.getModel();
        myModel.setRowCount(0);
        String SQL = "{CALL getSectionStudents(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,SectionDaoImpl_OLD.getId(aSectionName.trim()) );
//            cs.setInt(2,SchoolYearDaoImpl.getId(yearFrom, yearTo));
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    int myStudentId = rs.getInt("student_id");
                    String myLastName = rs.getString("lastName");
                    String myFirstName = rs.getString("firstName");
                    String myMiddleName = rs.getString("middleName");
                    myModel.addRow(new Object[]{myStudentId,myLastName,myFirstName} );
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myModel;
    }
     
}
