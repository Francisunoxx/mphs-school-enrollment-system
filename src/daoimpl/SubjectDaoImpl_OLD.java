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
import daoimpl.SchoolYearDaoImpl;

/**
 *
 * @author Antonio, John Ferdinand
 */
public class SubjectDaoImpl_OLD {

    
    private final String    subjectName;
    private final String    subjectCode;
    private final int       subjectUnits;
    private final String    subjectDescription;
    private final int       GradeLevelId;
    private final int       SchoolYearId;

    /**
     *
     * @param aName is used as constructor parameter to hold the subject name of a subject object.
     * @param aCode 
     * @param aUnits
     * @param aDescription
     * @param aGradeLevel
     * @param aSyYearFrom
     * @param aSyYearTo
     */
    public SubjectDaoImpl_OLD(String aName, String aCode, int aUnits, String aDescription, String aGradeLevel, int aSyYearFrom, int aSyYearTo) {
        subjectName = aName;
        subjectCode = aCode;
        subjectUnits = aUnits;
        subjectDescription = aDescription;
//        GradeLevelId = GradeLevelDaoImpl.getId(aGradeLevel);
        SchoolYearId = 0;
        
        GradeLevelId=0;
        
        JOptionPane.showMessageDialog
        (null,"@Subject class\n"+"Subject: "+subjectName+"\n"+"Code: "+subjectCode+"\n"+"Units: "+subjectUnits+"\nDescription: "
                + subjectDescription+"\n"+"Grade Level Id: "+GradeLevelId+"\n"+"School Year ID: "+
                "\nLogin Id: "+LoginDaoImpl.getUserId());
    }

    /**
     *
     * @return
     */
    public Boolean add() {
        Boolean success = null;
        String SQL = "{CALL addSubject(?,?,?,?,?,?,?)}";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            con.setAutoCommit(false); // start of transaction

            try (CallableStatement cs = con.prepareCall(SQL);) {

                cs.setString(1, subjectName);
                cs.setString(2, subjectCode);
                cs.setInt(3, subjectUnits);
                cs.setString(4, subjectDescription);
                cs.setInt(5, GradeLevelId);
                cs.setInt(6, SchoolYearId);
                cs.setInt(7, LoginDaoImpl.getUserId());
                
                cs.executeUpdate();

                con.commit(); // end of transaction
                success = true;
            } catch (SQLException e) {
                success = false;
                JOptionPane.showMessageDialog
                (null,"@Subject Class -> add() method -> catch block 2 "+ e.getClass() + " " + e.getMessage());
                con.rollback();
                throw e;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog
            (null,"@Subject Class -> add() method -> catch block 2 "+ e.getClass() + " " + e.getMessage());
        }
        return success;
    }
    
    /**
     * getName() returns the subject name of an instance created from SubjectDaoImpl_OLD class.
     * 
     * @return
     */
    public String getName(){
        return subjectName;
    }

    /**
     *
     * @return
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     *
     * @return
     */
    public int getSubjectUnits() {
        return subjectUnits;
    }

    /**
     *
     * @return
     */
    public String getSubjectDescription() {
        return subjectDescription;
    }

    /**
     * Static method that returns all subjects and information. This method can be used to fill 
     * up another table to show as subject list
     * 
     * @param aJtable
     * @return
     */
    public static DefaultTableModel getAll(JTable aJtable) {
        DefaultTableModel myModel = (DefaultTableModel) aJtable.getModel();
        String mySQL = "{CALL getAllSubjectInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(mySQL)) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    String  mySubjectCode   = rs.getString("code");
                    String  mySubjectName   = rs.getString("name");
                    int     mySubjectUnits  = rs.getInt("units");
                    String  mySubjectDescription = rs.getString("description");
                    
                    String myGradeLevelStr = "";
                    int  myGradeLevelInt    = rs.getInt("level");
                    if(myGradeLevelInt == 0){
                        myGradeLevelStr = "Kindergarten";
                    }else{
                        myGradeLevelStr = myGradeLevelStr+" "+myGradeLevelInt;
                    }
                    
                    String  myAddedBy       = rs.getString("AddedBy");
                    int     mySyYearFrom    = rs.getInt("yearFrom");
                    int     mySyYearTo      = rs.getInt("yearTo");
                    
                    
                    myModel.addRow(new Object[]{mySubjectCode, mySubjectName, mySubjectUnits, mySubjectDescription, myGradeLevelStr,mySyYearFrom+"-"+mySyYearTo, myAddedBy});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getClass() + " " + e.getMessage());
        }
        return myModel;
    }

    /**
     * Gets all subjects and information of the grade level id supplied
     * @param aGradeLevelId takes the grade level id argument
     * @param aJtable takes the JTable argument
     * @return 
     */
    public static DefaultTableModel getAll(int aGradeLevelId, JTable aJtable) {
        DefaultTableModel myModel = (DefaultTableModel) aJtable.getModel();
        myModel.setRowCount(0); //this cleans up previous data of selected yearlevel subjects
        String mySQL = "{CALL getSubjectsByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(mySQL)) {
            cs.setInt(1, aGradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    String mySubjectCode = rs.getString("code");
                    String mySubjectName = rs.getString("name");
                    int mySubjectUnits = rs.getInt("units");
                    String mySubjectDescription = rs.getString("description");
                    String myGradeLevel = "Grade " + rs.getObject("level");
                    myModel.addRow(new Object[]{mySubjectCode, mySubjectName, mySubjectUnits, mySubjectDescription,myGradeLevel});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getClass() + " " + e.getMessage());
        }
        return myModel;
    }
    
    public static DefaultComboBoxModel getByGradeLevel(String aGradeLevel) {
//        int myGradeLevelId = GradeLevelDaoImpl.getId(aGradeLevel);
        DefaultComboBoxModel myModel = new DefaultComboBoxModel();
        String mySQL = "{CALL getSubjectsByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(mySQL)) {
//            cs.setInt(1, myGradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    String mySubjectCode = rs.getString("code");
                    String mySubjectName = rs.getString("name");
                    int mySubjectUnits = rs.getInt("units");
                    String mySubjectDescription = rs.getString("description");
                    String myGradeLevel = "Grade " + rs.getObject("level");
                    myModel.addElement( mySubjectCode+", "+ mySubjectName);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getClass() + " " + e.getMessage());
        }
        return myModel;
    }
    
    /**
     * gets the row id of a subject matching the subject code contained in the p_subjectCode parameter.
     * @param aSubjectCode takes a subject code string value received as argument
     * @return
     */
    public static int getId(String aSubjectCode){
        int mySubjectId = 0;
        String SQL = "{CALL getSubjectId (?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aSubjectCode.trim());
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    mySubjectId = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\n"+e.getErrorCode()+"\n"+e.getMessage() );
        }
        return mySubjectId;
    }

    
    public static void updateAllInformation
    (String aNewSubjectCode, String aNewSubjectName, int aNewSubjectUnit, String aNewSubjectDescription, 
            int aSubjectId, int aNewSubjectGradeLevelId, int aNewSubjectSchoolYearId, int aNewEditedByUserId){
        
        String SQL = "{ CALL updateSubjectDetails(?,?,?,?,?,?,?,?) }";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
                cs.setString(1,aNewSubjectCode);
                cs.setString(2,aNewSubjectName);
                cs.setInt(3,aNewSubjectUnit);
                cs.setString(4,aNewSubjectDescription);
                cs.setInt(5,aSubjectId);
                cs.setInt(6,aNewSubjectGradeLevelId);
                cs.setInt(7,aNewSubjectSchoolYearId);
                cs.setInt(8,aNewEditedByUserId);
                
                cs.executeUpdate();
                JOptionPane.showMessageDialog(null,"Successfully updated!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\n"+e.getErrorCode()+"\n"+e.getMessage() );
        }
    }
    
}
