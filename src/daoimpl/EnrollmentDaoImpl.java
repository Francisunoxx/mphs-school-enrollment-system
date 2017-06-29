/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import constants.EnrollmentTable;
import constants.SchoolYearTable;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Enrollment;
import model.SchoolYear;
import model.Student;
import dao.IEnrollment;
import java.io.IOException;
import model.GradeLevel;

/**
 *
 * @author John Ferdinand Antonio
 */
public class EnrollmentDaoImpl implements IEnrollment{

    private GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    
    @Override
    public boolean isEnrollmentClosedForSchoolYear(SchoolYear aSchoolYear) {
        String SQL = "{CALL isEnrollmentClosedForSchoolYear(?)}";
        int schoolYearId = aSchoolYear.getSchoolYearId();
        boolean isClosed = false;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, schoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    isClosed = rs.getBoolean("is_enrollment_closed"); //alias 
                }
            }
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        
        return isClosed;
    }

    @Override
    public boolean isEnrollmentClosedForCurrentSchoolYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enrollStudent(Student student) {
        boolean isSuccessfullyEnrolled;
        String SQL = "{CALL enrollStudent(?,?,?)}";
        int recommendedGradeLevelId = studentDaoImpl.getRecommendedGradeLevel(student.getStudentId());
        
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, student.getSchoolYearEnrolled().getSchoolYearId());
            cs.setInt(2, student.getStudentId());
            cs.setInt(3, recommendedGradeLevelId);
            JOptionPane.showMessageDialog(
                    null, "Enrolled SchoolYear Id: " + student.getSchoolYearEnrolled().getSchoolYearId()
                    + "\nStudent Id: " + student.getStudentId()
                    + "\nRecommended GradeLevelt Id: " + student.getRecommendedGradeLevelToEnroll().getId());
            cs.executeUpdate();
            isSuccessfullyEnrolled = true;
        } catch (SQLException e) {
            isSuccessfullyEnrolled = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isSuccessfullyEnrolled;
    }

    @Override
    public List<Enrollment> getAllEnrollmentSchedulesOfAllSchoolYears() {
        String SQL = "{CALL getAllEnrollmentSchedulesOfAllSchoolYears()}";
        List<Enrollment> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while(rs.next()){
                    Enrollment enrollment = new Enrollment();
                    SchoolYear schoolYear = new SchoolYear();
                    enrollment.setEnrollmentId(rs.getInt(EnrollmentTable.ENROLLMENTID));
                    enrollment.setOpeningDate(rs.getDate(EnrollmentTable.OPENINGDATE));
                    enrollment.setClosingDate(rs.getDate(EnrollmentTable.CLOSINGDATE));
                    enrollment.setDateCreated(rs.getDate(EnrollmentTable.DATECREATED));
                    enrollment.setIsClosed(rs.getBoolean("isClosed")); //alias
                    
                    schoolYear.setSchoolYearId(rs.getInt(EnrollmentTable.SCHOOLYEARID));
                    schoolYear.setYearFrom(rs.getInt(SchoolYearTable.YEARFROM));
                    schoolYear.setYearTo(rs.getInt(SchoolYearTable.YEARTO));
                    
                    enrollment.setSchoolYear(schoolYear);
                    list.add(enrollment);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public Enrollment getEnrollmentScheduleBySchoolYear(SchoolYear aSchoolYear) {
        String SQL = "{CALL getEnrollmentScheduleBySchoolYear(?)}";
        Enrollment enrollment = new Enrollment(); //Parent Table
        SchoolYear schoolYear = new SchoolYear(); //Child Table
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYear.getSchoolYearId());
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    enrollment.setEnrollmentId(rs.getInt(EnrollmentTable.ENROLLMENTID));
                    enrollment.setOpeningDate(rs.getDate(EnrollmentTable.OPENINGDATE));
                    enrollment.setClosingDate(rs.getDate(EnrollmentTable.CLOSINGDATE));
                    enrollment.setDateCreated(rs.getDate(EnrollmentTable.DATECREATED));
                    schoolYear.setSchoolYearId(rs.getInt(EnrollmentTable.SCHOOLYEARID));
                    schoolYear.setYearFrom(rs.getInt(SchoolYearTable.YEARFROM));
                    schoolYear.setYearTo(rs.getInt(SchoolYearTable.YEARTO));
                    schoolYear.setStart_date(rs.getDate(SchoolYearTable.STARTDATE));
                    schoolYear.setEnd_date(rs.getDate(SchoolYearTable.ENDDATE));
                    schoolYear.setIsActive(rs.getBoolean(SchoolYearTable.ISACTIVE));
                    schoolYear.setIsCurrentSchoolYear(rs.getBoolean(SchoolYearTable.ISCURRENTSCHOOLYEAR));
                    enrollment.setSchoolYear(schoolYear);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return enrollment;
    }
    
    
}
