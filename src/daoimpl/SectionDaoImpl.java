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
import model.Curriculum;

public class SectionDaoImpl implements ISection {

    @Override
    public List<Section> getAllSections() {
        List<Section> list = new ArrayList<>();
        String SQL = "{call getAllSections()}";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Section section = new Section();

                    section.setSectionId(rs.getInt(1));
                    section.setSectionName(rs.getString(2));
                    section.setIsActive(rs.getInt(3));
                    section.setDateCreated(rs.getString(4));
                    section.setCategory(rs.getString(5));
                    section.setGradeFrom(rs.getInt(6));
                    section.setGradeTo(rs.getInt(7));
                    section.session.setCapacity(rs.getInt(8));
                    section.schoolYear.setYearFrom(rs.getInt(9));
                    section.schoolYear.setYearTo(rs.getInt(10));
                    section.session.setSessionTitle(rs.getString(11));

                    list.add(section);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public Integer getSectionIdByName(String aSectionName) {
        String SQL = "{CALL getSectionIdByName(?)}";
        Integer aSectionId = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, aSectionName);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    aSectionId = rs.getInt("aSectionId");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return aSectionId;
    }

    public boolean createSection(Section aSection) {
        boolean isSuccesful;
        String sql = "{call createSection(?,?,?,?,?,?)}";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql)) {
            cs.setString(1, aSection.getSectionName());
            cs.setString(2, aSection.getCategory());
            cs.setInt(3, aSection.getGradeFrom());
            cs.setInt(4, aSection.getGradeTo());
            cs.registerOutParameter(5, java.sql.Types.INTEGER);
            cs.registerOutParameter(6, java.sql.Types.INTEGER);

            cs.executeUpdate();

            aSection.setSectionId(cs.getInt(5));
            aSection.setSectionCategoryId(cs.getInt(6));

            isSuccesful = true;
        } catch (SQLException ex) {
            isSuccesful = false;
            System.err.println("Error at createSection " + ex);
        }

        return isSuccesful;
    }

    @Override
    public boolean createSectionSettings(Section aSection, SchoolYear aSchoolYear, GradeLevel aGradeLevel, Session aSession) {
        boolean isSuccesful;
        String sql = "call createSectionSettings(?,?,?,?,?,?)";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setInt(1, aSection.getSectionId());
            cs.setInt(2, aSchoolYear.getSchoolYearId());
            cs.setInt(3, aGradeLevel.getId());
            cs.setInt(4, aSection.getSectionCategoryId());
            cs.setInt(5, aSession.getCapacity());
            cs.setInt(6, aSession.getSessionId());

            cs.executeUpdate();

            isSuccesful = true;
        } catch (SQLException ex) {
            isSuccesful = false;
            System.err.println("Error at createSectionSettings " + ex);
        }

        return isSuccesful;
    }

    @Override
    public List<Section> getAllSectionsByGradeLevelId(GradeLevel aGradeLevel) {
        List<Section> list = new ArrayList();
        String sql = "call getAllSectionsByGradeLevelId(?)";

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setInt(1, aGradeLevel.getId());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    Section section = new Section();

                    section.setSectionId(rs.getInt(1));
                    section.setSectionName(rs.getString(2));
                    section.setIsActive(rs.getInt(3));
                    section.setDateCreated(rs.getString(4));
                    section.setCategory(rs.getString(5));
                    section.setGradeFrom(rs.getInt(6));
                    section.setGradeTo(rs.getInt(7));
                    section.session.setCapacity(rs.getInt(8));
                    section.schoolYear.setYearFrom(rs.getInt(9));
                    section.schoolYear.setYearTo(rs.getInt(10));
                    section.session.setSessionTitle(rs.getString(11));

                    list.add(section);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getAllSectionsByGradeLevel " + ex);
        }

        return list;
    }

    @Override
    public List<Student> getAllStudentsBySection(Session aSession, Section aSection, GradeLevel aGradeLevel) {
        String sql = "call getAllStudentsBySection(?,?,?)";
        List<Student> list = new ArrayList();

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setInt(1, aSession.getSessionId());
            cs.setString(2, aSection.getSectionName());
            cs.setInt(3, aGradeLevel.getId());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    Student student = new Student();
                    student.setStudentId(rs.getInt(1));
                    student.setFirstName(rs.getString(2));
                    student.setMiddleName(rs.getString(3));
                    student.setLastName(rs.getString(4));
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setLevel(rs.getInt(5));
                    student.setGradeLevel(gradeLevel);
                    
//                    student.gradeLevel.setLevel(rs.getInt(5));
                    list.add(student);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getAllStudentsBySection " + ex);
        }
        return list;
    }

    @Override
    public int getSectionCapacity(Section aSection) {
        String sql = "call getSectionCapacity(?)";
        int capacity = 0;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setString(1, aSection.getSectionName());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    capacity = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getSectionCapacity " + ex);
        }
        return capacity;
    }

    @Override
    public boolean createStudentSection(Section aSection, Student aStudent, SchoolYear aSchoolYear) {
        String sql = "call createStudentSection(?,?,?)";
        boolean isSuccessful;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setInt(1, aSection.getSectionId());
            cs.setInt(2, aStudent.getStudentId());
            cs.setInt(3, aSchoolYear.getSchoolYearId());
            cs.executeUpdate();

            isSuccessful = true;
        } catch (SQLException ex) {
            isSuccessful = false;
            System.err.println("Error at createStudentSection " + ex);
        }
        return isSuccessful;
    }

    @Override
    public int getSectionId(Section aSection) {
        String sql = "call getSectionId(?)";
        int id = 0;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setString(1, aSection.getSectionName());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getSectionId" + ex);
        }

        return id;
    }

    @Override
    public int getSectionSchoolYearId(Section aSection) {
        String sql = "call getSectionSchoolYearId(?)";
        int schoolYearId = 0;

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setString(1, aSection.getSectionName());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    schoolYearId = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getSectionSchoolYearId " + ex);
        }

        return schoolYearId;
    }

    @Override
    public List<Section> getCreatedSectionById(Section aSection) {
        String sql = "call getCreatedSectionById(?)";

        List<Section> list = new ArrayList<>();

        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(sql);) {
            cs.setInt(1, aSection.getSectionId());

            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    Section section = new Section();

                    section.setSectionName(rs.getString(1));
                    section.gradeLevel.setLevel(rs.getInt(2));
                    section.schoolYear.setYearFrom(rs.getInt(3));
                    section.schoolYear.setYearTo(rs.getInt(4));
                    section.setGradeFrom(rs.getInt(5));
                    section.setGradeTo(rs.getInt(6));
                    section.setCategory(rs.getString(7));
                    section.session.setCapacity(rs.getInt(8));
                    section.session.setSessionTitle(rs.getString(9));
                    list.add(section);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error at getCreatedSectionById " + ex);
        }

        return list;
    }

    
    
    
    //////////////////////////
    
    @Override
    public boolean addSection(Section aSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Section> getSectionsBySchoolYear(int aSchoolYearId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Section> getSectionsByGradeLevel(int aGradeLevelId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Section> getSectionsBySchoolYearAndGradeLevel(int aSchoolYearId, int aGradeLevelId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getSectionStudents(int aSectionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
