/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.SchoolYear;

/**
 *
 * @author Acer
 */
public interface ISchoolYear {
    List<SchoolYear> getAllSchoolYearInfo();
    List<SchoolYear> getAllSchoolYearStart();
    List<SchoolYear> getAllSchoolYearEnd();
    SchoolYear getSchoolYearById(int aSchoolYearId);
    int getSchoolYearId(int aSchoolYearStart);
    int getCurrentSchoolYearId();
    boolean addSchoolYear(SchoolYear schoolyear);
    boolean isCurrentSchoolYear(SchoolYear schoolyear);
}
