
package dao;

import java.util.List;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import model.Student;


public interface ISection{
    boolean addSection(Section aSection);
    List<Section> getSectionsBySchoolYear(int aSchoolYearId);
    List<Section> getSectionsByGradeLevel(int aGradeLevelId);
    List<Section> getSectionsBySchoolYearAndGradeLevel(int aSchoolYearId, int aGradeLevelId);
    List<Student> getSectionStudents(int aSectionId);
    List<Section> getAllSections();
    Integer getSectionIdByName(String aSectionName);
    boolean createSectionSettings(Section aSection, SchoolYear aSchoolYear, GradeLevel aGradeLevel, Session aSession);
    List<Section> getAllSectionsByGradeLevelId(GradeLevel aGradeLevel);
    List<Student> getAllStudentsBySection(Session aSession, Section aSection, GradeLevel aGradeLevel);
    int getSectionCapacity(Section aSection);
    boolean createStudentSection(Section aSection, Student aStudent, SchoolYear aSchoolYear);
    int getSectionId(Section aSection);
    int getSectionSchoolYearId(Section aSection);
    List<Section> getCreatedSectionById(Section aSection);
}