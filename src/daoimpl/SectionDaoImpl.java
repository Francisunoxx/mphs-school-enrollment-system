
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import model.Student;
import dao.ISection;


public class SectionDaoImpl implements ISection{

    @Override
    public List<Section> getSectionsBySchoolYearAndGradeLevel(int aSchoolYearId, int aGradeLevelId) {
        List<Section> sectionList = new ArrayList<>();
        String SQL = "{CALL getSectionsBySchoolYearAndGradeLevel(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYearId);
            cs.setInt(2, aGradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Section section = new Section();
                    List<Session> sessionList = new ArrayList<>();
                    Session session = new Session();
                    session.setCapacity(rs.getInt("capacity"));
                    session.setSessionTitle(rs.getString("title"));
                    session.setSessionId(rs.getInt("session_id"));
                    sessionList.add(session);
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    section.setSectionId(rs.getInt("section_id"));
                    section.setSectionName(rs.getString("sectionName"));
                    section.setIsActive(rs.getBoolean("isActive"));
                    section.setSessionList(sessionList);
                    section.setGradeLevel(gradeLevel);
                    section.setSchoolYear(schoolYear);
                    
                    sectionList.add(section);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return sectionList;
    }

    
    
    @Override
    public List<Section> getSectionsBySchoolYear(int aSchoolYearId) {
        List<Section> sectionList = new ArrayList<>();
        String SQL = "{CALL getSectionsBySchoolYear(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Section section = new Section();
                    List<Session> sessionList = new ArrayList<>();
                    Session session = new Session();
                    session.setCapacity(rs.getInt("capacity"));
                    session.setSessionTitle(rs.getString("title"));
                    session.setSessionId(rs.getInt("session_id"));
                    sessionList.add(session);
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    section.setSectionId(rs.getInt("section_id"));
                    section.setSectionName(rs.getString("sectionName"));
                    section.setIsActive(rs.getBoolean("isActive"));
                    section.setSessionList(sessionList);
                    section.setGradeLevel(gradeLevel);
                    section.setSchoolYear(schoolYear);
                    
                    sectionList.add(section);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return sectionList;
    }

    @Override
    public List<Section> getSectionsByGradeLevel(int aGradeLevelId) {
        List<Section> sectionList = new ArrayList<>();
        String SQL = "{CALL getSectionsByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aGradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Section section = new Section();
                    List<Session> sessionList = new ArrayList<>();
                    Session session = new Session();
                    session.setCapacity(rs.getInt("capacity"));
                    session.setSessionTitle(rs.getString("title"));
                    session.setSessionId(rs.getInt("session_id"));
                    sessionList.add(session);
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    section.setSectionId(rs.getInt("section_id"));
                    section.setSectionName(rs.getString("sectionName"));
                    section.setIsActive(rs.getBoolean("isActive"));
                    section.setSessionList(sessionList);
                    section.setGradeLevel(gradeLevel);
                    section.setSchoolYear(schoolYear);
                    
                    sectionList.add(section);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return sectionList;
    }

    
    
    @Override
    public boolean addSection(Section aSection) {
        Integer aSessionCount = aSection.getSessionList().size();
        Integer aSchoolYearId = aSection.getSchoolYear().getSchoolYearId();
        Integer aGradeLevelId = aSection.getGradeLevel().getId();
        boolean isAdded = false;
        String SQLa = "{CALL addSection(?,?)}";
        String SQLb = "{CALL addSectionDetails(?,?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);){
            try (CallableStatement csa = con.prepareCall(SQLa);
                    CallableStatement csb = con.prepareCall(SQLb);){
                con.setAutoCommit(false);
                
                csa.setString(1,aSection.getSectionName());
                csa.registerOutParameter(2, java.sql.Types.INTEGER);
                csa.executeUpdate();
                Integer aSectionId = csa.getInt(2);//section id
                
                System.out.println("Session Objects Count : "+aSessionCount);
                System.out.println("School Year Id : "+aSchoolYearId);
                System.out.println("Grade Level Id : "+aGradeLevelId);
                System.out.println("Section Name: "+aSection.getSectionName());
                System.out.println("Section Id : "+csa.getInt(2));
                System.out.println("Section Id : "+aSectionId);
                System.out.println();
                System.out.println();
                
                
                for(int i=0; i<aSessionCount; i++){
                    csb.setInt(1, aSectionId);
                    csb.setInt(2, aSection.getSessionList().get(i).getSessionId());
                    csb.setInt(3, aSchoolYearId);
                    csb.setInt(4, aGradeLevelId);
                    csb.setInt(5, aSection.getSessionList().get(i).getCapacity());
                    csb.executeUpdate();
                }
                
                con.commit();
                isAdded = true;
            } catch (SQLException e) {
                con.rollback();
                isAdded = false;
                JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return isAdded;
    }

    @Override
    public List<Student> getSectionStudents(int aSectionId) {
        List<Student> aStudentList = new ArrayList<>();
        String SQL = "{CALL getSectionStudents(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Student student = new Student();
                    aStudentList.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aStudentList;
    }

    @Override
    public List<Section> getAllSections() {
        List<Section> aSectionList = new ArrayList<>();
        String SQL = "{CALL getAllSections()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Section section = new Section();
                    List<Session> sessionList = new ArrayList<>();
                    Session session = new Session();
                    session.setCapacity(rs.getInt("capacity"));
                    session.setSessionTitle(rs.getString("title"));
                    session.setSessionId(rs.getInt("session_id"));
                    sessionList.add(session);
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    section.setSectionId(rs.getInt("section_id"));
                    section.setSectionName(rs.getString("sectionName"));
                    section.setIsActive(rs.getBoolean("isActive"));
                    section.setSessionList(sessionList);
                    section.setGradeLevel(gradeLevel);
                    section.setSchoolYear(schoolYear);
                    
                    aSectionList.add(section);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aSectionList;
    }

    @Override
    public Integer getSectionIdByName(String aSectionName) {
        String SQL = "{CALL getSectionIdByName(?)}";
        Integer aSectionId = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aSectionName);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aSectionId = rs.getInt("aSectionId");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aSectionId;
    }
    
}
