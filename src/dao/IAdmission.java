
package dao;

import model.Admission;

/**
 *
 * @author Acer
 */
public interface IAdmission {
    Admission getAdmissionInfoByRegistrationId(int aRegistrationId);
    Admission getAdmissionInfoByStudentId(int aStudentId);
    boolean completeAdmission(int aRegistrationId);
}
