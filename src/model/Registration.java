/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


public class Registration {
    //STUDENT REGISTRATION ONLY APPLIES TO NEW STUDENTS & TRANSFEREES
    
    private Integer registrationId;
    private String registeredStudentType; //NEW or TRANSFEREE ONLY OLD STUDENTS proceed to Enrollment
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String placeOfBirth;
    private String nationality;
    private String religion;
    private String gender;
    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String fatherOccupation;
    private String fatherOfficePhoneNo;
    private String fatherMobileNo;
    private boolean isFatherContactInCaseEmergency;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;
    private String motherOccupation;
    private String motherOfficePhoneNo;
    private String motherMobileNo;
    private boolean isMotherContactInCaseEmergency;
    private String guardianLastName;
    private String guardianMiddleName;
    private String guardianFirstName;
    private String guardianOccupation;
    private String guardianOfficePhoneNo;
    private String guardianMobileNo;
    private String guardianRelationToStudent;
    private boolean isGuardianContactInCaseEmergency;
    private String schoolLastAttended;
    private String schoolLastAttendedAddress;
    boolean isAdmissionComplete;
    boolean isDownpaymentPaid;
    private String addressRoomOrHouseNo;
    private String addressStreet;
    private String addressBrgyOrSubd;
    private String addressCity;
    private String province;
    private int gradeLevel;
    private SchoolYear schoolYear;
    private String paymentTerm;
    private Date registrationDate;
    private boolean exists; 

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    
    public boolean getIsFatherContactInCaseEmergency() {
        return isFatherContactInCaseEmergency;
    }

    public void setIsFatherContactInCaseEmergency(boolean isFatherContactInCaseEmergency) {
        this.isFatherContactInCaseEmergency = isFatherContactInCaseEmergency;
    }

    public boolean getIsMotherContactInCaseEmergency() {
        return isMotherContactInCaseEmergency;
    }

    public void setIsMotherContactInCaseEmergency(boolean isMotherContactInCaseEmergency) {
        this.isMotherContactInCaseEmergency = isMotherContactInCaseEmergency;
    }

    public boolean getIsAdmissionComplete() {
        return isAdmissionComplete;
    }

    public void setIsAdmissionComplete(boolean isAdmissionComplete) {
        this.isAdmissionComplete = isAdmissionComplete;
    }

    public boolean getIsDownpaymentPaid() {
        return isDownpaymentPaid;
    }

    public void setIsDownpaymentPaid(boolean isDownpaymentPaid) {
        this.isDownpaymentPaid = isDownpaymentPaid;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegisteredStudentType() {
        return registeredStudentType;
    }

    public void setRegisteredStudentType(String registeredStudentType) {
        this.registeredStudentType = registeredStudentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getFatherOfficePhoneNo() {
        return fatherOfficePhoneNo;
    }

    public void setFatherOfficePhoneNo(String fatherOfficePhoneNo) {
        this.fatherOfficePhoneNo = fatherOfficePhoneNo;
    }

    public String getFatherMobileNo() {
        return fatherMobileNo;
    }

    public void setFatherMobileNo(String fatherMobileNo) {
        this.fatherMobileNo = fatherMobileNo;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getMotherOfficePhoneNo() {
        return motherOfficePhoneNo;
    }

    public void setMotherOfficePhoneNo(String motherOfficePhoneNo) {
        this.motherOfficePhoneNo = motherOfficePhoneNo;
    }

    public String getMotherMobileNo() {
        return motherMobileNo;
    }

    public void setMotherMobileNo(String motherMobileNo) {
        this.motherMobileNo = motherMobileNo;
    }

    public String getGuardianLastName() {
        return guardianLastName;
    }

    public void setGuardianLastName(String guardianLastName) {
        this.guardianLastName = guardianLastName;
    }

    public String getGuardianFirstName() {
        return guardianFirstName;
    }

    public void setGuardianFirstName(String guardianFirstName) {
        this.guardianFirstName = guardianFirstName;
    }

    
    public String getGuardianMiddleName() {
        return guardianMiddleName;
    }

    public void setGuardianMiddleName(String guardianMiddleName) {
        this.guardianMiddleName = guardianMiddleName;
    }

    public String getGuardianOccupation() {
        return guardianOccupation;
    }

    public void setGuardianOccupation(String guardianOccupation) {
        this.guardianOccupation = guardianOccupation;
    }

    public String getGuardianOfficePhoneNo() {
        return guardianOfficePhoneNo;
    }

    public void setGuardianOfficePhoneNo(String guardianOfficePhoneNo) {
        this.guardianOfficePhoneNo = guardianOfficePhoneNo;
    }

    public String getGuardianMobileNo() {
        return guardianMobileNo;
    }

    public void setGuardianMobileNo(String guardianMobileNo) {
        this.guardianMobileNo = guardianMobileNo;
    }

    public String getGuardianRelationToStudent() {
        return guardianRelationToStudent;
    }

    public void setGuardianRelationToStudent(String guardianRelationToStudent) {
        this.guardianRelationToStudent = guardianRelationToStudent;
    }

    public boolean getIsGuardianContactInCaseEmergency() {
        return isGuardianContactInCaseEmergency;
    }

    public void setIsGuardianContactInCaseEmergency(boolean isGuardianContactInCaseEmergency) {
        this.isGuardianContactInCaseEmergency = isGuardianContactInCaseEmergency;
    }

    public String getSchoolLastAttended() {
        return schoolLastAttended;
    }

    public void setSchoolLastAttended(String schoolLastAttended) {
        this.schoolLastAttended = schoolLastAttended;
    }

    public String getSchoolLastAttendedAddress() {
        return schoolLastAttendedAddress;
    }

    public void setSchoolLastAttendedAddress(String schoolLastAttendedAddress) {
        this.schoolLastAttendedAddress = schoolLastAttendedAddress;
    }

    public String getAddressRoomOrHouseNo() {
        return addressRoomOrHouseNo;
    }

    public void setAddressRoomOrHouseNo(String addressRoomOrHouseNo) {
        this.addressRoomOrHouseNo = addressRoomOrHouseNo;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressBrgyOrSubd() {
        return addressBrgyOrSubd;
    }

    public void setAddressBrgyOrSubd(String addressBrgyOrSubd) {
        this.addressBrgyOrSubd = addressBrgyOrSubd;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }
    
    
}
