package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import daoimpl.EducationalStageDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import daoimpl.LoginDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl_OLD;

/**
 *
 * @author Acer
 */
public class CurriculumDaoImpl_OLD {

    private String educationalStage;
    private String curriculumDescription;
    private int curriculumGradeLevelId;
    private int curriculumSchoolYearId;

    /**
     *
     * @param aEducationalStage
     * @param aCurriculumDescription
     * @param aCurriculumGradeLevel
     * @param aSyYearFrom
     * @param aSyYearTo
     */
    public CurriculumDaoImpl_OLD(String aEducationalStage, String aCurriculumDescription, String aCurriculumGradeLevel, int aSyYearFrom, int aSyYearTo) {
        educationalStage = aEducationalStage;
        curriculumDescription = aCurriculumDescription;
//       curriculumGradeLevelId   = GradeLevelDaoImpl.getId(aCurriculumGradeLevel);
        //JOptionPane.showMessageDialog(null,"SchoolYearDaoImpl: "+ curriculumSchoolYearId);
    }

    /**
     *
     * @param aJtable
     */
    public void addWithSubjects(JTable aJtable) {
        String SQLa = "{CALL addCurriculum(?,?,?,?,?,?)}";
        String SQLb = "{CALL addCurriculumSubject(?,?,?,?,?)}";

        int rows = aJtable.getRowCount();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL)) {

            try (CallableStatement csA = con.prepareCall(SQLa);
                    CallableStatement csB = con.prepareCall(SQLb);) {

                con.setAutoCommit(false);

                csA.setInt(1, EducationalStageDaoImpl.getId(educationalStage));
                csA.setString(2, curriculumDescription);
                csA.setInt(3, curriculumGradeLevelId);
                csA.setInt(4, curriculumSchoolYearId);
                csA.setInt(5, LoginDaoImpl.getUserId());
                csA.setInt(6, LoginDaoImpl.getUserId());

                // JOptionPane.showMessageDialog(null,"Education Stage: "+educationalStage+"\n"+"Educational Stage Id: "+ EducationalStageDaoImpl.getId(educationalStage));
                csA.executeUpdate();

                for (int i = 0; i < rows; i++) {
                    String subjCode = aJtable.getValueAt(i, 0).toString();
                    csB.setInt(1, EducationalStageDaoImpl.getId(educationalStage));
                    csB.setInt(2, curriculumGradeLevelId);
                    csB.setInt(3, curriculumSchoolYearId);
                    csB.setInt(4, SubjectDaoImpl_OLD.getId(subjCode));
                    csB.setInt(5, LoginDaoImpl.getUserId());
                    csB.executeUpdate();
                }

                con.commit();

            } catch (SQLException e) {
                con.rollback();
                JOptionPane.showMessageDialog(null, "Error at: " + e.getClass().getSimpleName() + "\n" + e.getErrorCode() + "\n" + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: " + e.getClass().getSimpleName() + "\n" + e.getErrorCode() + "\n" + e.getMessage());
        }
    }

    /**
     *
     * @param aJtable
     * @param aCurriculumId
     * @param aEducationalStage
     * @param aCurriculumDescription
     * @param aGradeLevel
     * @param aSyYearFrom
     * @param aSyYearTo
     * @return
     */
    public Boolean updateDetails(JTable aJtable, int aCurriculumId, String aEducationalStage, String aCurriculumDescription, String aGradeLevel, int aSyYearFrom, int aSyYearTo) {

        //JOptionPane.showMessageDialog(null,"@updateDetails(): "+p_yearFrom+"-"+p_yearTo);
        Boolean myBool = true;
        String SQLa = " { CALL deleteAllCurriculumSubjectsOf(?) }";
        String SQLb = " { CALL updateCurriculumDetails(?,?,?,?,?,?) }";
        String SQLc = " { CALL updateCurriculumSubjects(?,?,?) }";

        int myJtableRows = aJtable.getRowCount();

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {

            try (CallableStatement csA = con.prepareCall(SQLa);
                    CallableStatement csB = con.prepareCall(SQLb);
                    CallableStatement csC = con.prepareCall(SQLc);) {
                con.setAutoCommit(false);

                csA.setInt(1, aCurriculumId);
                csA.executeUpdate();

                csB.setInt(1, EducationalStageDaoImpl.getId(aEducationalStage));
                csB.setString(2, aCurriculumDescription);
//                csB.setInt(3, GradeLevelDaoImpl.getId(aGradeLevel));
                csB.setInt(4, aCurriculumId);
                csB.setInt(6, LoginDaoImpl.getUserId());
                csB.executeUpdate();

                for (int i = 0; i < myJtableRows; i++) {
                    String subjCode = aJtable.getValueAt(i, 0).toString();
                    csC.setInt(1, aCurriculumId);
                    csC.setInt(2, SubjectDaoImpl_OLD.getId(subjCode)); // subjectId
                    csC.setInt(3, LoginDaoImpl.getUserId()); //editedByUserId
                    csC.executeUpdate();
                }

                con.commit();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error at: " + e.getClass().getSimpleName() + "\n" + e.getErrorCode() + "\n" + e.getMessage());
                myBool = false;
                con.rollback();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error at: " + e.getClass().getSimpleName() + "\n" + e.getErrorCode() + "\n" + e.getMessage());
            myBool = false;
        }
        return myBool;
    }

    /**
     *
     * @param aCurriculumId
     */
    public void deleteSubjects(int aCurriculumId) {
        String SQL = "{CALL deleteAllCurriculumSubjects(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aCurriculumId);
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "@Curriculum class > deleteSubjects()\n" + e.getMessage() + " " + e.getErrorCode() + e.getClass());
        }
    }

    /**
     *
     * @param aJtable
     * @return
     */

    /**
     *
     * @param aCurriculumId
     * @return
     */

    /**
     * getSubjects() is used to get all the subjects and information of a
     * CurriculumDaoImpl_OLD matching the aCurriculumId received
     *
     * @param aCurriculumId parameter that takes a curriculum ID argument
     * @param aJtable parameter that takes a JTable argument
     * @return
     */

    /**
     *
     * @param aNewCurriculumName
     * @param aCurriculumId
     */

    /**
     *
     * @param aCurriculumId
     * @param aNewSyYearFrom
     * @param aNewSyYearTo
     * @param aNewGradeLevel
     */

    /**
     * getId() gets the id of the curriculum matching the parameter values
     * (aCurriculumName,aCurriculumGradeLevel,aSyYearFrom, aSyYearTo
     *
     * @param aEducationalStage
     * @param aGradeLevelId
     * @param aSyYearFrom
     * @param aSyYearTo
     * @return
     */
}//end of class
