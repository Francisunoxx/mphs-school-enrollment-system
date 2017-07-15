/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.GradeLevel;
import model.Student;

/**
 *
 * @author Acer
 */
public interface IGradeLevel {
    int getId(int level);
    int getId(GradeLevel aGradeLevel);
    GradeLevel getById(int aGradeLevelId);
    
    List<GradeLevel> getAllGradeLevelsInfo();
    List<GradeLevel> getAllActiveGradeLevels();
    List<GradeLevel> getAllInactiveGradeLevels();
    List<GradeLevel> getAllRegisteredSubjectGradeLevel();
    
    
    boolean addGradeLevel(GradeLevel aGradeLevel);
    boolean isGradeLevelActive(GradeLevel aGradeLevel);
    boolean deactivateGradeLevel(GradeLevel aGradeLevel);
    
    List<Student> getStudentNameByGradeLevelId(GradeLevel aGradeLevel);
}
