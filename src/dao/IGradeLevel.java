/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.GradeLevel;

/**
 *
 * @author Acer
 */
public interface IGradeLevel {
    List<GradeLevel> getAllGradeLevelsInfo();
    List<GradeLevel> getAllActiveGradeLevels();
    List<GradeLevel> getAllInactiveGradeLevels();
    List<GradeLevel> getAllRegisteredSubjectGradeLevel();
    int getGradeLevelId(GradeLevel aGradeLevel);
    GradeLevel getGradeLevelById(int aGradeLevelId);
    boolean addGradeLevel(GradeLevel aGradeLevel);
    boolean isGradeLevelActive(GradeLevel aGradeLevel);
    boolean deactivateGradeLevel(GradeLevel aGradeLevel);
}
