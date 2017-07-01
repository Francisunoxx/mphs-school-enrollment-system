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

public class SubjectDaoImpl implements ISubject{

    GradeLevel gl = new GradeLevel();
    Subject subject = new Subject();
    
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
                    
                    subject.setSubjectId(rs.getInt("subject_id"));
                    subject.setSubjectTitle(rs.getString("title"));
                    subject.setSubjectCode(rs.getString("code"));
                    subject.setSubjectDescription(rs.getString("description"));
                    subject.setIsActive(rs.getBoolean("isActive"));
                    
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
    public List<Subject> getAllSubjectsByGradeLevelId(GradeLevel aGradeLevel) 
    {
        List<Subject> list = new ArrayList();
        String sql = "{call getAllSubjectsByGradeLevelId(?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getId());
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Subject s = new Subject();
                    s.setSubjectId(rs.getInt("subject_id"));
                    s.setSubjectTitle(rs.getString("title"));
                    s.setSubjectCode(rs.getString("code"));
                    s.setSubjectDescription(rs.getString("description"));
                    s.setIsActive(rs.getBoolean(rs.getString("isActive")));
                    
                    list.add(s);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getAllSubjectsByGradeLevel "+ex);
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
    public boolean createSubject(Subject aSubject, GradeLevel aGradeLevel) 
    {
        boolean isSuccesful;
        String sql = "{call createSubject(?,?,?,?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aSubject.getSubjectCode());
            cs.setString(2, aSubject.getSubjectTitle());
            cs.setString(3, aSubject.getSubjectDescription());
            cs.registerOutParameter(4, java.sql.Types.INTEGER);
            cs.setInt(5, aGradeLevel.getId());
            
            cs.executeUpdate();
            
            subject.setSubjectId(cs.getInt(4));
            
            isSuccesful = true;
        }
        catch(SQLException ex)
        {
            isSuccesful = false;
            System.err.println("Error at createSubject "+ex);
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
    public int getSubjectId(Subject aSubject) 
    {
        int id = 0;
        String sql = "{call getSubjectId(?)}";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aSubject.getSubjectTitle());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    id = rs.getInt(1);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getSubjectId "+ex);
        }
        
        return id;
    }

    
   

    @Override
    public List<Subject> getCreatedSubjectInfoById(Subject aSubject, GradeLevel aGradeLevel) 
    {
        String sql = "{call getCreatedSubjectInfoById(?)}";
        List <Subject> list = new ArrayList();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aSubject.getSubjectId());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Subject subject = new Subject();
                    
                    subject.setSubjectTitle(rs.getString("title"));
                    subject.setSubjectCode(rs.getString("code"));
                    subject.setSubjectDescription(rs.getString("description"));
                    subject.gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    list.add(subject);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at getCreatedSubjectInfoById "+ex);
        }
        
        return list;
    }

    @Override
    public boolean updateCreatedSubjectById(Subject aSubject, GradeLevel aGradeLevel) 
    {
        String sql = "{call updateCreatedSubjectById(?,?,?,?,?)}";
        boolean isSuccessful;
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aSubject.getSubjectId());
            cs.setInt(2, aGradeLevel.getId());
            cs.setString(3, aSubject.getSubjectCode());
            cs.setString(4, aSubject.getSubjectTitle());
            cs.setString(5, aSubject.getSubjectDescription());
            
            cs.executeUpdate();
            
            isSuccessful = true;
        }
        catch(SQLException ex)
        {
            isSuccessful = false;
            System.err.println("Error at updateCreatedSubjectById "+ex);
        }
        
        return isSuccessful;
    }

    @Override
    public boolean checkSubjectExists(Subject aSubject) 
    {
        String sql = "{call checkSubjectExists(?)}";
        boolean isSuccessful = false;
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setString(1, aSubject.getSubjectCode());
            
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
            System.err.println("Error at checkSubjectExists" +ex);
        }
        
        return isSuccessful;
    }

    @Override
    public List <Subject> checkSubjectChanges(Subject aSubject) 
    {
        String sql = "call checkSubjectChanges(?)";
        List <Subject> list = new ArrayList();
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aSubject.getSubjectId());
            
            try(ResultSet rs = cs.executeQuery())
            {
                while(rs.next())
                {
                    Subject subject = new Subject();
                    
                    subject.setSubjectCode(rs.getString("code"));
                    subject.setSubjectTitle(rs.getString("title"));
                    subject.setSubjectDescription(rs.getString("description"));
                    subject.gradeLevel.setLevel(rs.getInt("grade_level"));
                    
                    list.add(subject);
                }
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error at checkSubjectChanges "+ex);
        }
        
        return list;
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
    
    @Override
    public List<Subject> getEachSubjectByGradeLevelForCurriculum(GradeLevel aGradeLevel) 
    {
        String sql = "{call getEachSubjectByGradeLevelForCurriculum(?)}";
        List <Subject> listSubject = new ArrayList();
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            CallableStatement cs = con.prepareCall(sql);)
        {
            cs.setInt(1, aGradeLevel.getLevel());
            try(ResultSet rs = cs.executeQuery();)
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
            System.err.println("Error "+e);
        }
        
        return listSubject;
    }
    
    
    
}