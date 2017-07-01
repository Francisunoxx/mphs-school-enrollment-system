/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;

/**
 *
 * @author Acer
 */
public interface ISubject {
    List<Subject> getAllSubjects();
    List<Subject> getAllSubjectsByGradeLevelId(GradeLevel aGradeLevel);
    List<Subject> getSubjectsByCurriculum(Curriculum aCurriculum);
    List<Subject> getSubjectsBySchoolYear(SchoolYear aSchoolYear);
    List<Subject> getEachSubjectByGradeLevelForCurriculum(GradeLevel aGradeLevel);
    boolean updateSubjectAndGradeLevel(Subject aSubject, GradeLevel aGradeLevel);
    boolean createSubject(Subject aSubject, GradeLevel aGradeLevel);
    boolean editSubject(Subject aSubject, GradeLevel aGradeLevel);
    int getSubjectId(Subject aSubject);
    boolean subjectExists(Subject aSubject);
    List <Subject> getCreatedSubjectInfoById(Subject aSubject, GradeLevel aGradeLevel);
    boolean updateCreatedSubjectById(Subject aSubject, GradeLevel aGradeLevel);
    boolean checkSubjectExists(Subject aSubject);
    List <Subject> checkSubjectChanges(Subject aSubject);
}
