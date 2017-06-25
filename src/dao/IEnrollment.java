/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Enrollment;
import model.SchoolYear;
import model.Student;

/**
 *
 * @author John Ferdinand Antonio
 */
public interface IEnrollment {
    List<Enrollment> getAllEnrollmentSchedulesOfAllSchoolYears();
    Enrollment getEnrollmentScheduleBySchoolYear(SchoolYear aSchoolYear);
    boolean enrollStudent(Student student);
    boolean isEnrollmentClosedForSchoolYear(SchoolYear aSchoolYear);
    boolean isEnrollmentClosedForCurrentSchoolYear();
}
