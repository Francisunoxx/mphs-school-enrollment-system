
package dao;

import java.util.List;
import model.GradeLevel;
import model.SchoolYear;
import model.Student;


public interface IStudent {
    List<Student> getActiveOfCurrentSchoolYear (); //Always Current School Year
    List<Student> getInactive(); //applies to all school year
    List<Student> getInactive(SchoolYear aSchoolYear);
    List<Student> get(SchoolYear aSchoolYear);
    List<Student> get();
    List<Student> get(String aKeyword);
    
    Integer getRegistrationId(Integer aStudentId);
    Integer getAdmissionGradeLevelByRegistrationId(Integer aRegistrationId);
    Integer getPresentGradeLevelByStudentId(Integer aStudentId);
    Integer getRecommendedGradeLevel(Integer aStudentId);
    
    boolean isAlreadyEnrolledInCurrentSchoolYear(Student aStudent); 
    Student getStudentRecordById(Student aStudent);
    Student getStudentById(int aStudentId);
    
    boolean isEnrolledInSchoolYear(Integer aStudentId, Integer aSchoolYearId);
    
    
    Integer getRegistrationIdByStudentId(Integer aStudentId);
    List<Student> getAllRegisteredStudentsByGradeId(GradeLevel aGradeLevel);
}
