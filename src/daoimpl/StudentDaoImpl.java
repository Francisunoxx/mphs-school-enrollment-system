package daoimpl;

import constants.AdmissionTable;
import constants.RegistrationTable;
import constants.SchoolYearTable;
import constants.StudentTable;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Admission;
import model.GradeLevel;
import model.PresentGradeLevel;
import model.PromotedGradeLevel;
import model.Registration;
import model.SchoolYear;
import model.Student;
import dao.IStudent;

public class StudentDaoImpl implements IStudent {

    @Override
    public List<Student> getAllStudentsByKeyword(String aKeyword) {
        List<Student> studentList = new ArrayList<>();
        String SQL = "{CALL getAllStudentsByWildCard(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aKeyword);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Admission admission = new Admission();
                    Registration registration = new Registration();
                    Student student = new Student();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setStudentType(rs.getInt("aStudentType"));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean(StudentTable.ISACTIVE));

                    student.setAdmission(admission);
                    student.setRegistration(registration);
                    
                    studentList.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode()+"\n"+e.getMessage());
        }
        return studentList;
    }

    @Override
    public boolean isAlreadyEnrolledInCurrentSchoolYear(Student aStudent) {
        int currentSchoolYearId = new SchoolYearDaoImpl().getCurrentSchoolYearId();
        boolean isAlreadyEnrolledInSchoolYear = false;
        String SQL = "{CALL isAlreadyEnrolledInCurrentSchoolYear(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aStudent.getStudentId());
            cs.setInt(2, currentSchoolYearId);
            int rowCount = 0;

            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    rowCount++;
                }
                isAlreadyEnrolledInSchoolYear = rowCount > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return isAlreadyEnrolledInSchoolYear;
    }

    @Override
    public Student getStudentById(int aStudentId) {
        String SQLa = "{CALL getStudentRecordById(?)}";
        String SQLb = "{CALL registrationExists(?)}";
        String SQLc = "{CALL getRegistrationPaymentTermByStudentId(?)}";
        
        Student student = new Student();
        Admission admission = new Admission();
        Registration registration = new Registration();
        GradeLevel admissionGradeLevel = new GradeLevel();
        GradeLevel lastGradeLevelEnrolled = new GradeLevel();
        PresentGradeLevel presentGradeLevel = new PresentGradeLevel();
        PromotedGradeLevel promotedGradeLevel = new PromotedGradeLevel();
        SchoolYear schoolYear = new SchoolYear();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try(CallableStatement csa = con.prepareCall(SQLa);
                    CallableStatement csb = con.prepareCall(SQLb);
                    CallableStatement csc = con.prepareCall(SQLc);){
                csa.setInt(1, aStudentId);
                csb.setInt(1,aStudentId);
                csc.setInt(1,aStudentId);
            try (ResultSet rsa = csa.executeQuery();) {
                while (rsa.next()) {
                    admission.setAdmissionId(rsa.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rsa.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rsa.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rsa.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rsa.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rsa.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rsa.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rsa.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rsa.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rsa.getString(RegistrationTable.POB));
                    registration.setNationality(rsa.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rsa.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rsa.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rsa.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rsa.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rsa.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rsa.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rsa.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rsa.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rsa.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rsa.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rsa.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rsa.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rsa.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rsa.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rsa.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rsa.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rsa.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rsa.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rsa.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rsa.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rsa.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rsa.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rsa.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rsa.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rsa.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rsa.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rsa.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rsa.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rsa.getString(RegistrationTable.CITY));
                    registration.setProvince(rsa.getString(RegistrationTable.PROVINCE));
                    registration.setRegistrationDate(rsa.getDate("date_registered"));
                    
                    registration.setGradeLevel(rsa.getInt("registeredGradeLevel"));
                    
                    student.setStudentId(rsa.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rsa.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rsa.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rsa.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rsa.getBoolean(StudentTable.ISACTIVE));
                    
                    student.setStudentType(rsa.getInt("studentType"));
                    
                    admissionGradeLevel.setLevel(rsa.getInt("admissionGradeLevel"));
                    if(rsa.getObject("aPassed")==null){
                        presentGradeLevel.setIsPassed(null);
                    }else{
                        presentGradeLevel.setIsPassed(rsa.getBoolean("aPassed"));
                    }
                    
                    
                    presentGradeLevel.setLevel(rsa.getInt("presentGradeLevel")); //ALIAS field
                    int pg = rsa.getInt("promotedGradeLevel");
                    if (rsa.wasNull()) {} 
                    else {
                        promotedGradeLevel.setLevel(pg);
                    }

                    int lastGLevel = rsa.getInt("last_gradelevel_enrolled");
                    if (rsa.wasNull()) {

                    } else {
                        lastGradeLevelEnrolled.setLevel(lastGLevel);
                    }
                    
                    schoolYear.setSchoolYearId(rsa.getInt("last_gradelevel_enrolled_schoolyear_id")); //ALIAS field
                    
                    int yFrom = rsa.getInt("last_gradelevel_enrolled_schoolyear_yearFrom");
                    if(rsa.wasNull()){
                        
                    }else{
                        schoolYear.setYearFrom(yFrom);
                    }
                    
                    int yTo = rsa.getInt("last_gradelevel_enrolled_schoolyear_yearTo");
                    if(rsa.wasNull()){
                        
                    }else{
                        schoolYear.setYearTo(yTo);
                    }
                    
                    SchoolYear registeredSchoolYear = new SchoolYear();
                    registeredSchoolYear.setSchoolYearId(rsa.getInt("schoolyear_id"));
                    registeredSchoolYear.setYearFrom(rsa.getInt("yearFrom"));
                    registeredSchoolYear.setYearTo(rsa.getInt("yearTo"));
                    registration.setSchoolYear(registeredSchoolYear);
                }
            }
            
            try(ResultSet rsb = csb.executeQuery();){
                while(rsb.next()){
                    registration.setExists(rsb.getBoolean("registrationExists"));
                }
            }
            
            try(ResultSet rsc = csc.executeQuery();){
                while(rsc.next()){
                    registration.setPaymentTerm(rsc.getString("paymentterm"));
                }
            }
            
                student.setAdmission(admission);
                student.setRegistration(registration);
                student.setAdmissionGradeLevel(admissionGradeLevel);
                student.setPresentGradeLevel(presentGradeLevel);
                student.setLastGradeLevelEnrolledSchoolYear(schoolYear);

                student.setPromotedGradeLevel(promotedGradeLevel); // int level only
            
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return student;
    }

    @Override
    public Student getStudentRecordById(Student aStudent) {
        int aStudentId = aStudent.getStudentId();
        String SQL = "{CALL getStudentRecordById(?)}";
        Student student = new Student();
        Admission admission = new Admission();
        Registration registration = new Registration();
        GradeLevel admissionGradeLevel = new GradeLevel();
        GradeLevel lastGradeLevelEnrolled = new GradeLevel();
        PresentGradeLevel presentGradeLevel = new PresentGradeLevel();
        PromotedGradeLevel promotedGradeLevel = new PromotedGradeLevel();
        SchoolYear schoolYear = new SchoolYear();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aStudentId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    
                    registration.setGradeLevel(rs.getInt("registeredGradeLevel"));
                    
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean(StudentTable.ISACTIVE));
                    
                    student.setStudentType(rs.getInt("studentType"));
                    
                    admissionGradeLevel.setLevel(rs.getInt("admissionGradeLevel"));
                    presentGradeLevel.setIsPassed(rs.getBoolean("has_passed_last_gradelevel"));
                    presentGradeLevel.setLevel(rs.getInt("presentGradeLevel")); //ALIAS field
                    promotedGradeLevel.setLevel(rs.getInt("promotedGradeLevel"));
                    lastGradeLevelEnrolled.setLevel(rs.getInt("last_gradelevel_enrolled"));
                    
                    schoolYear.setSchoolYearId(rs.getInt("last_gradelevel_enrolled_schoolyear_id")); //ALIAS field
                    schoolYear.setYearFrom(rs.getInt("last_gradelevel_enrolled_schoolyear_yearFrom")); //ALIAS field
                    schoolYear.setYearTo(rs.getInt("last_gradelevel_enrolled_schoolyear_yearTo")); //ALIAS field

                    student.setAdmission(admission);
                    student.setRegistration(registration);
                    student.setAdmissionGradeLevel(admissionGradeLevel);
                    student.setPresentGradeLevel(presentGradeLevel);
                    student.setLastGradeLevelEnrolledSchoolYear(schoolYear);
                    student.setPromotedGradeLevel(promotedGradeLevel); // int level only
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return student;
    }

    @Override
    public boolean isAlreadyStudent(Student aStudent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAllActiveStudentsOfCurrentSchoolYear() {
        List<Student> list = new ArrayList<>();
        String SQL = "{CALL getAllActiveStudentsOfCurrentSchoolYear()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Student student = new Student();
                    Registration registration = new Registration();
                    Admission admission = new Admission();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentType(rs.getInt("aStudentType"));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean("aStudentStatus"));
                    
                    student.setAdmission(admission);
                    student.setRegistration(registration);
                    list.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Student> getAllInactiveStudents() {
        List<Student> list = new ArrayList<>();
        String SQL = "{CALL getAllInactiveStudents()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Admission admission = new Admission();
                    Registration registration = new Registration();
                    Student student = new Student();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentType(rs.getInt("aStudentType"));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean("aStudentStatus"));
                    
                    student.setAdmission(admission);
                    student.setRegistration(registration);
                    
                    list.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Student> getAllInactiveStudentsBySchoolYear(SchoolYear aSchoolYear) {
        List<Student> list = new ArrayList<>();
        String SQL = "{CALL getAllInactiveStudentsBySchoolYear(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aSchoolYear.getSchoolYearId());
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Admission admission = new Admission();
                    Registration registration = new Registration();
                    PresentGradeLevel previousGradeLevel = new PresentGradeLevel();
                    Student student = new Student();
                    SchoolYear schoolYear = new SchoolYear();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean(StudentTable.ISACTIVE));

                    previousGradeLevel.setIsPassed(rs.getBoolean("has_passed_last_gradelevel"));
                    previousGradeLevel.setLevel(rs.getInt("last_gradelevel_enrolled")); //ALIAS field
                    schoolYear.setSchoolYearId(rs.getInt("last_gradelevel_enrolled_schoolyear_id")); //ALIAS field
                    schoolYear.setYearFrom(rs.getInt("last_gradelevel_enrolled_schoolyear_yearFrom")); //ALIAS field
                    schoolYear.setYearTo(rs.getInt("last_gradelevel_enrolled_schoolyear_yearTo")); //ALIAS field

                    student.setAdmission(admission);
                    student.setRegistration(registration);
                    student.setPresentGradeLevel(previousGradeLevel);
                    student.setLastGradeLevelEnrolledSchoolYear(schoolYear);

                    list.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Student> getStudentsBySchoolYear(SchoolYear aSchoolYear) {
        String SQL = "{CALL getStudentsBySchoolYear(?)}";
        List<Student> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYear.getSchoolYearId() );
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Admission admission = new Admission();
                    Registration registration = new Registration();
                    Student student = new Student();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean(StudentTable.ISACTIVE));

                    student.setAdmission(admission);
                    student.setRegistration(registration);

                    list.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return list;
    }

    @Override
    public List<Student> getAllStudents() {
        String SQL = "{CALL getAllStudents()}";
        List<Student> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Admission admission = new Admission();
                    Registration registration = new Registration();
                    Student student = new Student();

                    admission.setAdmissionId(rs.getInt(AdmissionTable.ADMISSIONID));
                    admission.setIsCompleted(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    admission.setCompletionDate(rs.getDate(AdmissionTable.COMPLETIONDATE));
                    registration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    registration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    registration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    registration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    registration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    registration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    registration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    registration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    registration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    registration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    registration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    registration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    registration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    registration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    registration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    registration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    registration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    registration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    registration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    registration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    registration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    registration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    registration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    registration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    registration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    registration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    registration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    registration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    registration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    registration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    registration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    registration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    registration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    registration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    registration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    registration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    registration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    registration.setProvince(rs.getString(RegistrationTable.PROVINCE));
                    student.setStudentId(rs.getInt(StudentTable.STUDENTID));
                    student.setStudentType(rs.getInt("aStudentType"));
                    student.setEntryDate(rs.getDate(StudentTable.ENTRYDATE));
                    student.setIsGraduated(rs.getBoolean(StudentTable.ISGRADUATED));
                    student.setDateGraduated(rs.getDate(StudentTable.DATEGRADUATED));
                    student.setIsActive(rs.getBoolean(StudentTable.ISACTIVE));

                    student.setAdmission(admission);
                    student.setRegistration(registration);

                    list.add(student);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return list;
    }

    @Override
    public boolean isEnrolledInSchoolYear(Integer aStudentId, Integer aSchoolYearId) {
        boolean isEnrolled = false;
        String SQL = "{CALL isEnrolledInSchoolYear(?,?)}";
        int rowCount = 0;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aStudentId);
            cs.setInt(2, aSchoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    rowCount++;
                }
                isEnrolled = rowCount > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isEnrolled;
    }

    @Override
    public Integer getPresentGradeLevelByStudentId(Integer aStudentId) {
        Integer aPresentGradeLevel = null;
        String SQL = "{CALL getPresentGradeLevelByStudentId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aStudentId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aPresentGradeLevel = rs.getInt("aPresentGradeLevel");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aPresentGradeLevel;
    }

    @Override
    public Integer getRecommendedGradeLevel(Integer aStudentId) {
        Integer aRecommendedGradeLevel = null;
        String SQL = "{CALL getRecommendedGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aStudentId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aRecommendedGradeLevel = rs.getInt("aRecommendedGradeLevel");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aRecommendedGradeLevel;
    }

    @Override
    public Integer getRegistrationIdByStudentId(Integer aStudentId) {
        Integer aRegistrationId = null;
        String SQL = "{CALL getRegistrationIdByStudentId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aStudentId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aRegistrationId = rs.getInt("aRegistrationId");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aRegistrationId;
    }

    @Override
    public Integer getAdmissionGradeLevelByRegistrationId(Integer aRegistrationId) {
        Integer admissionGradeLevel = null;
        String SQL = "{CALL getAdmissionGradeLevelByRegistrationId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aRegistrationId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    admissionGradeLevel = rs.getInt("admissionGradeLevel");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return admissionGradeLevel;
    }
    
}//end of class
