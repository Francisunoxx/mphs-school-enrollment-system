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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;
import dao.ISubject;

/**
 *
 * @author Acer
 */
public class SubjectDaoImpl implements ISubject{

    GradeLevel gl = new GradeLevel();
    @Override
    public boolean subjectExists(Subject aSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subject> getAllSubjects() 
    {
        List <Subject> list = new ArrayList();
        String sql = "{call getAllSubjects()}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql))
        {
            try(ResultSet rs = cs.executeQuery();)
            {
                while(rs.next())
                {
                    Subject subject = new Subject();
                    subject.setSubjectTitle(rs.getString("title"));
                    list.add(subject);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error "+ex);
        }
        
        return list;
    }

    @Override
    public List<Subject> getSubjectsByGradeLevel(GradeLevel aGradeLevel) 
    {
        List<Subject> list = new ArrayList();
        String sql = "{call getAllSubjectsByGradeLevel(?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getLevel());
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Subject s = new Subject();
                    s.setSubjectTitle(rs.getString("title"));
                    list.add(s);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error "+ex);
        }
        
        return list;
    }

    @Override
    public List<Subject> getSubjectsByCurriculum(Curriculum aCurriculum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subject> getSubjectsBySchoolYear(SchoolYear aSchoolYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean addSubject(Subject aSubject, GradeLevel aGradeLevel) 
    {
        boolean isSuccesful;
        String sql = "{call createSubject(?,?,?,?,?,?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aSubject.getSubjectCode());
            cs.setString(2, aSubject.getSubjectTitle());
            cs.setString(3, aSubject.getSubjectDescription());
            cs.setBoolean(4, aSubject.getIsActive());
            cs.registerOutParameter(5, java.sql.Types.INTEGER);
            cs.registerOutParameter(6, java.sql.Types.INTEGER);
            cs.setInt(7, aGradeLevel.getLevel());
            cs.executeUpdate();
            isSuccesful = true;
            JOptionPane.showMessageDialog(null, "Successful!");
        }
        catch(SQLException ex)
        {
            isSuccesful = false;
            JOptionPane.showMessageDialog(null, "Subject code already exists");
            System.err.println("Error "+ex);
        }
        return isSuccesful;
    }

    @Override
    public boolean editSubject(Subject aSubject, GradeLevel aGradeLevel) 
    {
        boolean isSuccessful;
        String sql = "{call getEachSubjectByGradeLevel(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aSubject.getSubjectTitle());
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    aSubject.setSubjectTitle(rs.getString("title"));
                    aSubject.setSubjectCode(rs.getString("code"));
                    aSubject.setSubjectDescription(rs.getString("description"));
                    aGradeLevel.setLevel(rs.getInt("grade_level"));
                    aSubject.setSubjectId(rs.getInt("subject_id"));
                    aGradeLevel.setId(rs.getInt("gradelevel_id"));
                }
            }
            isSuccessful = true;
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error "+ex);
        }
        
        return isSuccessful;
    }

    @Override
    public int getSubjectId(Subject aSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateSubjectAndGradeLevel(Subject aSubject, GradeLevel aGradeLevel) 
    {
        boolean isSuccessful;
        String sql = "{call updateSubjectAndGradeLevel(?,?,?,?,?,?,?)}"; 
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setInt(2, aGradeLevel.getLevel());
            cs.setInt(3, aGradeLevel.getId());
            cs.setString(4, aSubject.getSubjectCode());
            cs.setString(5, aSubject.getSubjectTitle());
            cs.setString(6, aSubject.getSubjectDescription());
            cs.setInt(7, aSubject.getSubjectId());
            cs.executeUpdate();
            isSuccessful = true;
            
            JOptionPane.showMessageDialog(null, "Succesful!");
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error "+ex);
        }
        
        return isSuccessful;
    }
    
    
    
}