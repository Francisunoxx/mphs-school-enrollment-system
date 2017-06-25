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
    List<Subject> getSubjectsByGradeLevel(GradeLevel aGradeLevel);
    List<Subject> getSubjectsByCurriculum(Curriculum aCurriculum);
    List<Subject> getSubjectsBySchoolYear(SchoolYear aSchoolYear);
    boolean updateSubjectAndGradeLevel(Subject aSubject, GradeLevel aGradeLevel);
    boolean addSubject(Subject aSubject, GradeLevel aGradeLevel);
    boolean editSubject(Subject aSubject, GradeLevel aGradeLevel);
    int getSubjectId(Subject aSubject);
    boolean subjectExists(Subject aSubject);
}
