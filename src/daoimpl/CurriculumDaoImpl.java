/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import constants.CurriculumTable;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;
import dao.ICurriculum;

/**
 *
 * @author Acer
 */
public class CurriculumDaoImpl implements ICurriculum {

    // HAS - A
    // HAS the ff classes
    GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();

    @Override
    public int getCurriculumId(Curriculum aCurriculum) {
        int curriculumId = 0; //initial value

        String sql = "{call getCurriculumId(?)}";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) 
        {   
            cs.setString(1, aCurriculum.getCurriculumTitle());
            try (ResultSet rs = cs.executeQuery();) 
            {
                while (rs.next()) {
                    curriculumId = rs.getInt("curriculum_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return curriculumId;
    }

    @Override
    public List<Subject> getCurriculumSubjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GradeLevel getCurriculumGradeLevel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SchoolYear getCurriculumSchoolYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createCurriculum(Curriculum aCurriculum, SchoolYear aSchoolYear, GradeLevel aGradeLevel) 
    {
        boolean isSuccesful;
        String sql = "{call createCurriculum(?,?,?,?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getId());
            cs.setInt(2, aSchoolYear.getSchoolYearId());
            cs.setString(3, aCurriculum.getCurriculumTitle());
            cs.setString(4, aCurriculum.getCurriculumDescription());
            cs.registerOutParameter(5, java.sql.Types.INTEGER);
            
            cs.executeUpdate();
            
            //Setter call from Curriculum
            aCurriculum.setCurriculumId(cs.getInt(5));
            
            isSuccesful = true;
        }

        catch(SQLException e)
        {
            isSuccesful = false;
            System.out.println("Error at createCurriculum "+e);
        }
        
        return isSuccesful;
    }

    @Override
    public boolean curriculumExists(Curriculum aCurriculum) {
        boolean exists = false;
        int schoolYearId = sydi.getId(aCurriculum.getSchoolYear().getYearFrom());
        int gradelevelId = gldi.getId(aCurriculum.getGradeLevel());

        JOptionPane.showMessageDialog(null, "test: " + schoolYearId + " " + gradelevelId);
        String SQL = "{CALL curriculumExists(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, gradelevelId);
            cs.setInt(2, schoolYearId);
            try (ResultSet rs = cs.executeQuery()) {
                int rowCount = 0;
                while (rs.next()) {
                    rowCount++; //increment if record found
                }
                exists = rowCount > 0; // returns 0 or any number of rows > 1
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return exists;
    }

    

    @Override
    public List<Subject> getAllSubjectForCurriculum() 
    {
        String sql = "{call getAllSubjectForCurriculum()}";
        List<Subject> listSubject = new ArrayList();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Subject aSubject = new Subject();
                    aSubject.setSubjectCode(rs.getString("code"));
                    aSubject.setSubjectTitle(rs.getString("title"));
                    aSubject.setSubjectDescription(rs.getString("description"));
                    aSubject.gradeLevel.setLevel(rs.getInt("grade_level"));
                    listSubject.add(aSubject);
                }
            }
        }
        catch(SQLException e)
        {
             System.err.println("Error at getAllSubjectForCurriculum"+e);
        }
        
        return listSubject;
    }

    

    @Override
    public List<Curriculum> getAllCurriculum() 
    {
        String sql = "{call getAllCurriculum()}";
        List<Curriculum> list = new ArrayList();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql))
        {
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum aCurriculum = new Curriculum();
                    aCurriculum.setCurriculumId(rs.getInt("curriculum_id"));
                    aCurriculum.schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    aCurriculum.schoolYear.setYearTo(rs.getInt("yearTo"));
                    aCurriculum.gradeLevel.setLevel(rs.getInt("grade_level"));
                    aCurriculum.setCurriculumDescription(rs.getString("description"));
                    aCurriculum.setDateCreated(rs.getString("date_created"));
                    aCurriculum.setIsActive(rs.getInt("isActive"));
//                    aCurriculum.s.setSubjectTitle(rs.getString("title"));
//                    aCurriculum.s.setSubjectCode(rs.getString("code"));
                    
                    list.add(aCurriculum);
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error at getAllCurriculum "+e);
        }
        
        return list;
    }

    @Override
    public List<Curriculum> getEachCurriculum(Curriculum aCurriculum, SchoolYear aSchoolYear) 
    {
        String sql = "{call getEachCurriculum(?,?)}";
        List<Curriculum> list = new ArrayList();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aSchoolYear.getYearFrom());
            cs.setString(2, aCurriculum.getCurriculumDescription());
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                    curriculum.schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    curriculum.schoolYear.setYearTo(rs.getInt("yearTo"));
                    curriculum.gradeLevel.setLevel(rs.getInt("grade_level"));
                    curriculum.setCurriculumDescription(rs.getString("description"));
                    curriculum.setDateCreated(rs.getString("date_created"));
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException e)
        {
            System.err.println("Error at getEachCurriculum"+e);
        }
        
        return list;
    }

    @Override
    public boolean createCurriculumSubjects(Curriculum aCurriculum, Subject aSubject) 
    {
        boolean isSuccesful;
        String sql = "{call createCurriculumSubjects(?,?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {

            cs.setInt(1, aCurriculum.getCurriculumId());
            cs.setInt(2, aSubject.getSubjectId());
            cs.executeUpdate();
            
            isSuccesful = true;
        }
        catch(SQLException ex)
        {
            System.err.println("Error at createCurriculumSubjects "+ex);
            
            isSuccesful = false;
        }
        
        return isSuccesful;
    }


    @Override
    public List<SchoolYear> getCurriculumYearStartEndByGradeLevel(GradeLevel aGradeLevel) 
    {
        String sql = "{call getCurriculumYearStartEndByGradeLevel(?)}";
        List <SchoolYear> list = new ArrayList<>();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getLevel());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    SchoolYear schoolYear = new SchoolYear();
                    
                    schoolYear.setYearFrom(rs.getInt(1));
                    schoolYear.setYearTo(rs.getInt(2));
                    
                    list.add(schoolYear);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getCurriculumYearStartEndByGradeLevel "+ex);
        }
        
        return list;
    }

    @Override
    public List<Curriculum> getAllCurriculumByStartYear(SchoolYear aSchoolYear) 
    {
        String sql = "call getAllCurriculumByStartYear(?)";
        List <Curriculum> list = new ArrayList<>();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aSchoolYear.getYearFrom());
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                    
                    curriculum.setCurriculumTitle(rs.getString(1));
                    
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getAllCurriculumByStartYear "+ex);
        }
        
        
        return list;
    }

    @Override
    public List<Curriculum> getAllSubjectsOfCurriculumByName(Curriculum aCurriculum) 
    {
        String sql = "call getAllSubjectsOfCurriculumByName(?)";
        List <Curriculum> list = new ArrayList<>();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aCurriculum.getCurriculumTitle());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                
                    curriculum.s.setSubjectCode(rs.getString(1));
                    curriculum.s.setSubjectTitle(rs.getString(2));
                    curriculum.s.setSubjectDescription(rs.getString(3));
                    curriculum.gradeLevel.setLevel(rs.getInt(4));
                
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getAllSubjectsOfCurriculumByName "+ex);
        }
        
        return list;
    }

    @Override
    public List<Curriculum> getCreatedCurriculumInfoById(Curriculum aCurriculum) 
    {
        String sql = "{call getCreatedCurriculumInfoById(?)}";
        
        List <Curriculum> list = new ArrayList();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aCurriculum.getCurriculumId());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                    
                    curriculum.setCurriculumId(rs.getInt("curriculum_id"));
                    curriculum.setCurriculumTitle(rs.getString("curriculum_title"));
                    curriculum.setCurriculumDescription(rs.getString("description"));
                    curriculum.s.setSubjectCode(rs.getString("code"));
                    curriculum.s.setSubjectTitle(rs.getString("title"));
                    curriculum.gradeLevel.setLevel(rs.getInt("grade_level"));
                    curriculum.schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    curriculum.schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getCreatedCurriculumById "+ex);
        }
        
        return list;
    }

    @Override
    public List<Curriculum> getAllCreatedCurriculumInfo() 
    {
        List <Curriculum> list = new ArrayList();
        String sql = "{call getAllCreatedCurriculumInfo()}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                    
                    curriculum.setCurriculumId(rs.getInt("curriculum_id"));
                    curriculum.s.setSubjectCode(rs.getString("code"));
                    curriculum.s.setSubjectTitle(rs.getString("title"));
                    curriculum.schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    curriculum.schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getAllCreatedCurriculumInfo() " +ex);
        }
        
        return list;
    }

    @Override
    public List<Curriculum> getAllCurriculumNameByGradeLevel(GradeLevel aGradeLevel) 
    {
        List <Curriculum> list = new ArrayList();
        String sql = "{call getAllCurriculumNameByGradeLevel(?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getLevel());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                
                    curriculum.setCurriculumTitle(rs.getString("curriculum_title"));
                
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getAllCurriculumNameByGradeLevel "+ex);
        }
        return list;
    }

    @Override
    public boolean updateCreatedCurriculumById(Curriculum aCurriculum, GradeLevel aGradeLevel, SchoolYear aSchoolYear, Subject aSubject) 
    {
        String sql = "{call updateCreatedCurriculumById(?,?,?,?,?,?)}";
        boolean isSuccessful;
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aCurriculum.getCurriculumId());
            /*************************************/
            // Id to be inserted
            cs.setInt(2, aSubject.getSubjectId());
            cs.setInt(3, aGradeLevel.getId());
            cs.setInt(4, aSchoolYear.getSchoolYearId());
            cs.setString(5, aCurriculum.getCurriculumTitle());
            cs.setString(6, aCurriculum.getCurriculumDescription());
            
            cs.executeUpdate();
            
            isSuccessful = true;
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error at updateCreatedCurriculumById "+ex);
        }
        
        return isSuccessful;
    }

    @Override
    public boolean checkCurriculumSubjectExists(Curriculum aCurriculum) 
    {
        String sql = "{call checkCurriculumSubjectExists(?)}";
        boolean isSuccessful = false;
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            
            cs.setInt(1, aCurriculum.getCurriculumId());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    isSuccessful = true;
                }
            }
            
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error at checkCurriculumSubjectExists "+ex);
        }
        
        return isSuccessful;
    }

    @Override
    public void deleteCreatedCurriculumById(Curriculum aCurriculum) 
    {
        String sql = "{call deleteCreatedCurriculumById(?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aCurriculum.getCurriculumId());
            
            cs.executeUpdate();
        }
        catch(SQLException ex)
        {
            System.out.println("Error at deleteCreatedCurriculumById "+ex);
        }
    }

    @Override
    public boolean checkCurriculumExists(Curriculum aCurriculum, GradeLevel aGradeLevel, SchoolYear aSchoolYear) 
    {
        String sql = "{call checkCurriculumExists(?,?,?)}";
        boolean isSuccessful = false;
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getId());
            cs.setInt(2, aSchoolYear.getSchoolYearId());
            cs.setString(3, aCurriculum.getCurriculumTitle());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    isSuccessful = true;
                }
            }
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error at checkCurriculumExists"+ex);
        }
        
        return isSuccessful;
    }
    
    @Override
    public List<Curriculum> checkCurriculumChanges(Curriculum aCurriculum)
    {
        String sql = "{call checkCurriculumChanges(?)}";
        List <Curriculum> list = new ArrayList();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql))
        {
            cs.setInt(1, aCurriculum.getCurriculumId());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Curriculum curriculum = new Curriculum();
                    
                    curriculum.gradeLevel.setLevel(rs.getInt("grade_level"));
                    curriculum.schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    curriculum.schoolYear.setYearTo(rs.getInt("yearTo"));
                    curriculum.setCurriculumTitle(rs.getString("curriculum_title"));
                    curriculum.setCurriculumDescription(rs.getString("description"));
                    curriculum.s.setSubjectCode(rs.getString("code"));
                    curriculum.s.setSubjectTitle(rs.getString("title"));
                    
                    list.add(curriculum);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at checkCurriculumChanges "+ex);
        }
        
        return list;
    }

}
