
package dao;

import java.util.List;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;

public interface ICurriculum {
    List<Subject> getCurriculumSubjects();
    GradeLevel getCurriculumGradeLevel();
    SchoolYear getCurriculumSchoolYear();
    List<Subject> getEachSubjectByGradeLevelForCurriculum(GradeLevel aGradeLevel);
    List<Subject> getAllSubjectForCurriculum();
    boolean addCurriculum(Curriculum aCurriculum, SchoolYear aSchoolYear, GradeLevel aGradeLevel);
    boolean addCurriculumWithSubjects(Curriculum aCurriculum);
    boolean curriculumExists(Curriculum aCurriculum); // to check for duplicates
    int getCurriculumId(Curriculum aCurriculum); 
    List<Curriculum> getAllCurriculum();
    List<Curriculum> getEachCurriculum(Curriculum aCurriculum, SchoolYear aSchoolYear);
}

