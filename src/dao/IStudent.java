
package dao;

import java.util.List;
import model.SchoolYear;
import model.Student;


public interface IStudent {
    List<Student> getAllActiveStudentsOfCurrentSchoolYear (); //Always Current School Year
    List<Student> getAllInactiveStudents(); //applies to all school year
    List<Student> getAllInactiveStudentsBySchoolYear(SchoolYear aSchoolYear);
    List<Student> getStudentsBySchoolYear(SchoolYear aSchoolYear);
    List<Student> getAllStudents();
    List<Student> getAllStudentsByKeyword(String aKeyword);
    
    Integer getRegistrationIdByStudentId(Integer aStudentId);
    Integer getAdmissionGradeLevelByRegistrationId(Integer aRegistrationId);
    Integer getPresentGradeLevelByStudentId(Integer aStudentId);
    Integer getRecommendedGradeLevel(Integer aStudentId);
    
    boolean isAlreadyEnrolledInCurrentSchoolYear(Student aStudent); 
    Student getStudentRecordById(Student aStudent);
    Student getStudentById(int aStudentId);
    
    boolean isAlreadyStudent(Student aStudent);
    boolean isEnrolledInSchoolYear(Integer aStudentId, Integer aSchoolYearId);
}
