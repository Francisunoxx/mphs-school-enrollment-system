/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Registration;

/**
 *
 * @author Acer
 */
public interface IRegistration {
    // INSERT UPDATE DELETE SELECT 
    List<Registration> getAllRegistrationInfo();
    List<Registration> getAllRegistrationInfoByKeyword(String aKeyword);
    List<Registration> getAllRegistrationInfoBySchoolYearId(Integer aSchoolYearId);
    Registration getRegistrationInfoById(int aRegistrationId);
    String getRegistrationPaymentTermByStudentId(Integer aStudentId);
    boolean addRegistration(Registration aRegistration); //Register student
    boolean updateRegistration(Registration aRegistration); // modify student registration info if necessary
    boolean deleteRegistration(Registration aRegistration); 
}
