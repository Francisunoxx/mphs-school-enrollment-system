
package dao;

import java.util.List;
import model.Section;
import model.Student;


public interface ISection{
    boolean addSection(Section aSection);
    List<Section> getSectionsBySchoolYear(int aSchoolYearId);
    List<Section> getSectionsByGradeLevel(int aGradeLevelId);
    List<Section> getSectionsBySchoolYearAndGradeLevel(int aSchoolYearId, int aGradeLevelId);
    List<Student> getSectionStudents(int aSectionId);
    List<Section> getAllSections();
    Integer getSectionIdByName(String aSectionName);
}
