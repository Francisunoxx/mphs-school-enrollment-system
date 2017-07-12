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
    List<SchoolYear> get();
    List<SchoolYear> getAllStart();
    List<SchoolYear> getAllEnd();
    SchoolYear getById(int aSchoolYearId);
    int getId(int aSchoolYearStart);
    int getCurrentSchoolYearId();
    boolean add(SchoolYear schoolyear);
    boolean isCurrent(SchoolYear schoolyear);
}
