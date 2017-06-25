package daoimpl;

import constants.AdmissionTable;
import constants.RegistrationTable;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Registration;
import org.apache.derby.client.am.Types;
import model.GradeLevel;
import model.PaymentTerm;
import model.SchoolYear;
import dao.IRegistration;

public class RegistrationDaoImpl implements IRegistration{

    PaymentTermDaoImpl paymentTermDaoImpl = new PaymentTermDaoImpl();
    
    @Override
    public List<Registration> getAllRegistrationInfoBySchoolYearId(Integer aSchoolYearId) {
        List<Registration> registrationList = new ArrayList<>();
        String SQL = "{CALL getAllRegistrationInfoBySchoolYearId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aSchoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Registration aRegistration = new Registration();
                    aRegistration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    aRegistration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    aRegistration.setLastName(rs.getString(RegistrationTable.LASTNAME) );
                    aRegistration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME)); 
                    aRegistration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    aRegistration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    aRegistration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    aRegistration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    aRegistration.setReligion(rs.getString(RegistrationTable.RELIGION));
                    aRegistration.setGender(rs.getInt(RegistrationTable.GENDER)==1?"Male":"Female");
                    aRegistration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    aRegistration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    aRegistration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    aRegistration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    aRegistration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    aRegistration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    aRegistration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    aRegistration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    aRegistration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    aRegistration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    aRegistration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    aRegistration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    aRegistration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    aRegistration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    aRegistration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    aRegistration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    aRegistration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    aRegistration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    aRegistration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    aRegistration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    aRegistration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    aRegistration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    aRegistration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    aRegistration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    aRegistration.setIsAdmissionComplete(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    aRegistration.setIsDownpaymentPaid(rs.getBoolean(RegistrationTable.ISDOWNPAYMENTPAID));
                    aRegistration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    aRegistration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    aRegistration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    aRegistration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    aRegistration.setSchoolYear(schoolYear);
                    
                    int gradeLevel = Integer.parseInt( rs.getString(RegistrationTable.GRADELEVEL) );
                    aRegistration.setGradeLevel(gradeLevel);
                    
                    registrationList.add(aRegistration);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return registrationList;
    }

    @Override
    public List<Registration> getAllRegistrationInfoByKeyword(String aKeyword) {
        String SQL = "{CALL getAllRegistrationInfoByWildCard(?)}";
        List<Registration> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aKeyword);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Registration aRegistration = new Registration();
                    aRegistration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    aRegistration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    aRegistration.setLastName(rs.getString(RegistrationTable.LASTNAME) );
                    aRegistration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME)); 
                    aRegistration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    aRegistration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    aRegistration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    aRegistration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    aRegistration.setReligion(rs.getString(RegistrationTable.RELIGION));
                    aRegistration.setGender(rs.getInt(RegistrationTable.GENDER)==1?"Male":"Female");
                    aRegistration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    aRegistration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    aRegistration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    aRegistration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    aRegistration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    aRegistration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    aRegistration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    aRegistration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    aRegistration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    aRegistration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    aRegistration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    aRegistration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    aRegistration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    aRegistration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    aRegistration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    aRegistration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    aRegistration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    aRegistration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    aRegistration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    aRegistration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    aRegistration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    aRegistration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    aRegistration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    aRegistration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    aRegistration.setIsAdmissionComplete(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    aRegistration.setIsDownpaymentPaid(rs.getBoolean(RegistrationTable.ISDOWNPAYMENTPAID));
                    aRegistration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    aRegistration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    aRegistration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    aRegistration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    aRegistration.setSchoolYear(schoolYear);
                    
                    int gradeLevel = Integer.parseInt( rs.getString(RegistrationTable.GRADELEVEL) );
                    aRegistration.setGradeLevel(gradeLevel);
                    
                    aRegistration.setRegistrationDate(rs.getDate("date_registered"));
                    
                    list.add(aRegistration);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return list;
    }

    
    
    @Override
    public List<Registration> getAllRegistrationInfo() {
        List<Registration> list = new ArrayList<>();
        String SQL = "{CALL getAllRegistrationInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Registration aRegistration = new Registration();
                    aRegistration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    aRegistration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    aRegistration.setLastName(rs.getString(RegistrationTable.LASTNAME) );
                    aRegistration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME)); 
                    aRegistration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    aRegistration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    aRegistration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    aRegistration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    aRegistration.setReligion(rs.getString(RegistrationTable.RELIGION));
                    aRegistration.setGender(rs.getInt(RegistrationTable.GENDER)==1?"Male":"Female");
                    aRegistration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    aRegistration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    aRegistration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    aRegistration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    aRegistration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    aRegistration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    aRegistration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    aRegistration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    aRegistration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    aRegistration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    aRegistration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    aRegistration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    aRegistration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    aRegistration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    aRegistration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    aRegistration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    aRegistration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    aRegistration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    aRegistration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    aRegistration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    aRegistration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    aRegistration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    aRegistration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    aRegistration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    aRegistration.setIsAdmissionComplete(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    aRegistration.setIsDownpaymentPaid(rs.getBoolean(RegistrationTable.ISDOWNPAYMENTPAID));
                    aRegistration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    aRegistration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    aRegistration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    aRegistration.setAddressCity(rs.getString(RegistrationTable.CITY));
                    
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    
                    aRegistration.setSchoolYear(schoolYear);
                    
                    int gradeLevel = Integer.parseInt( rs.getString(RegistrationTable.GRADELEVEL) );
                    aRegistration.setGradeLevel(gradeLevel);
                    
                    aRegistration.setRegistrationDate(rs.getDate("date_registered"));
                    
                    list.add(aRegistration);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"getAllRegistrationInfo(): \n"+ e.getMessage());
        }
        return list;
    }

    @Override
    public Registration getRegistrationInfoById(int aRegistrationId) {
        String SQL = "{CALL getRegistrationInfoById(?)}";
        Registration aRegistration = new Registration();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aRegistrationId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    aRegistration.setRegistrationId(rs.getInt(RegistrationTable.REGISTRATION_ID));
                    aRegistration.setRegisteredStudentType(rs.getString(RegistrationTable.STUDENT_TYPE));
                    aRegistration.setLastName(rs.getString(RegistrationTable.LASTNAME));
                    aRegistration.setFirstName(rs.getString(RegistrationTable.FIRSTNAME));
                    aRegistration.setMiddleName(rs.getString(RegistrationTable.MIDDLENAME));
                    aRegistration.setDateOfBirth(rs.getString(RegistrationTable.DOB));
                    aRegistration.setPlaceOfBirth(rs.getString(RegistrationTable.POB));
                    aRegistration.setNationality(rs.getString(RegistrationTable.NATIONALITY));
                    aRegistration.setReligion(rs.getString(RegistrationTable.RELIGION));
                    aRegistration.setGender(rs.getInt(RegistrationTable.GENDER) == 1 ? "Male" : "Female");
                    aRegistration.setFatherFirstName(rs.getString(RegistrationTable.FATHER_FIRSTNAME));
                    aRegistration.setFatherMiddleName(rs.getString(RegistrationTable.FATHER_MIDDLENAME));
                    aRegistration.setFatherLastName(rs.getString(RegistrationTable.FATHER_LASTNAME));
                    aRegistration.setFatherOccupation(rs.getString(RegistrationTable.FATHER_OCCUPATION));
                    aRegistration.setFatherOfficePhoneNo(rs.getString(RegistrationTable.FATHER_OFFICEPHONE_NO));
                    aRegistration.setFatherMobileNo(rs.getString(RegistrationTable.FATHER_MOBILE_NO));
                    aRegistration.setIsFatherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISFATHERCONTACTINCASEEMERGENCY));
                    aRegistration.setMotherFirstName(rs.getString(RegistrationTable.MOTHER_FIRSTNAME));
                    aRegistration.setMotherMiddleName(rs.getString(RegistrationTable.MOTHER_MIDDLENAME));
                    aRegistration.setMotherLastName(rs.getString(RegistrationTable.MOTHER_LASTNAME));
                    aRegistration.setMotherOccupation(rs.getString(RegistrationTable.MOTHER_OCCUPATION));
                    aRegistration.setMotherOfficePhoneNo(rs.getString(RegistrationTable.MOTHER_OFFICEPHONE_NO));
                    aRegistration.setMotherMobileNo(rs.getString(RegistrationTable.MOTHER_MOBILE_NO));
                    aRegistration.setIsMotherContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISMOTHERCONTACTINCASEEMERGENCY));
                    aRegistration.setGuardianLastName(rs.getString(RegistrationTable.GUARDIAN_LASTNAME));
                    aRegistration.setGuardianFirstName(rs.getString(RegistrationTable.GUARDIAN_FIRSTNAME));
                    aRegistration.setGuardianMiddleName(rs.getString(RegistrationTable.GUARDIAN_MIDDLENAME));
                    aRegistration.setGuardianOccupation(rs.getString(RegistrationTable.GUARDIAN_OCCUPATION));
                    aRegistration.setGuardianOfficePhoneNo(rs.getString(RegistrationTable.GUARDIAN_OFFICEPHONE_NO));
                    aRegistration.setGuardianMobileNo(rs.getString(RegistrationTable.GUARDIAN_MOBILE_NO));
                    aRegistration.setGuardianRelationToStudent(rs.getString(RegistrationTable.GUARDIAN_RELATION_TO_STUDENT));
                    aRegistration.setIsGuardianContactInCaseEmergency(rs.getBoolean(RegistrationTable.ISGUARDIANCONTACTINCASEEMERGENCY));
                    aRegistration.setSchoolLastAttended(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED));
                    aRegistration.setSchoolLastAttendedAddress(rs.getString(RegistrationTable.SCHOOL_LAST_ATTENDED_ADDRESS));
                    aRegistration.setIsAdmissionComplete(rs.getBoolean(AdmissionTable.ISCOMPLETE));
                    aRegistration.setIsDownpaymentPaid(rs.getBoolean(RegistrationTable.ISDOWNPAYMENTPAID));
                    aRegistration.setAddressRoomOrHouseNo(rs.getString(RegistrationTable.ROOM_OR_HOUSE_NO));
                    aRegistration.setAddressStreet(rs.getString(RegistrationTable.STREET));
                    aRegistration.setAddressBrgyOrSubd(rs.getString(RegistrationTable.BRGY_OR_SUBD));
                    aRegistration.setAddressCity(rs.getString(RegistrationTable.CITY));

                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));

                    aRegistration.setSchoolYear(schoolYear);

                    int gradeLevel = Integer.parseInt(rs.getString(RegistrationTable.GRADELEVEL));
                    aRegistration.setGradeLevel(gradeLevel);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return aRegistration;

    }//end of method

    @Override
    public String getRegistrationPaymentTermByStudentId(Integer aStudentId) {
        String SQL = "{CALL getRegistrationPaymentTermByStudentId(?)}";
        String paymentTerm = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aStudentId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    paymentTerm = rs.getString("paymentterm");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return paymentTerm;
    }
    

    
    
    @Override
    public boolean addRegistration(Registration aRegistration) {
        boolean isAdded;
        String SQL = "{CALL addRegistration(?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?) }" ;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aRegistration.getRegisteredStudentType());
            cs.setString(2, aRegistration.getLastName());
            cs.setString(3, aRegistration.getFirstName());
            cs.setString(4, aRegistration.getMiddleName());
            cs.setObject(5, aRegistration.getDateOfBirth());
            cs.setString(6, aRegistration.getPlaceOfBirth());
            cs.setString(7, aRegistration.getNationality());
            cs.setString(8, aRegistration.getReligion());
            cs.setInt(9, "Male".equals(aRegistration.getGender())? 1:0);
            cs.setString(10, aRegistration.getFatherFirstName());
            cs.setString(11, aRegistration.getFatherMiddleName());
            cs.setString(12, aRegistration.getFatherLastName());
            cs.setString(13, aRegistration.getFatherOccupation());
            cs.setString(14, aRegistration.getFatherOfficePhoneNo());
            cs.setString(15, aRegistration.getFatherMobileNo());
            cs.setInt(16, aRegistration.getIsFatherContactInCaseEmergency()==true? 1:0);
            cs.setString(17, aRegistration.getMotherFirstName());
            cs.setString(18, aRegistration.getMotherMiddleName());
            cs.setString(19, aRegistration.getMotherLastName());
            cs.setString(20, aRegistration.getMotherOccupation());
            cs.setString(21, aRegistration.getMotherOfficePhoneNo());
            cs.setString(22, aRegistration.getMotherMobileNo());
            cs.setInt(23, aRegistration.getIsMotherContactInCaseEmergency()==true? 1:0);
            cs.setString(24, aRegistration.getGuardianLastName());
            cs.setString(25, aRegistration.getGuardianFirstName());
            cs.setString(26, aRegistration.getGuardianMiddleName());
            cs.setString(27, aRegistration.getGuardianOccupation());
            cs.setString(28, aRegistration.getGuardianOfficePhoneNo());
            cs.setString(29, aRegistration.getGuardianMobileNo());
            cs.setString(30, aRegistration.getGuardianRelationToStudent());
            cs.setInt(31, aRegistration.getIsGuardianContactInCaseEmergency()==true? 1:0);
            cs.setString(32, aRegistration.getSchoolLastAttended());
            cs.setString(33, aRegistration.getSchoolLastAttendedAddress());
            cs.setString(34, aRegistration.getAddressRoomOrHouseNo());
            cs.setString(35, aRegistration.getAddressStreet());
            cs.setString(36, aRegistration.getAddressBrgyOrSubd());
            cs.setString(37, aRegistration.getAddressCity());
            cs.setString(38, aRegistration.getProvince());
            
            GradeLevel gradeLevel = new GradeLevel();
            gradeLevel.setLevel(aRegistration.getGradeLevel());
            int gradeLevelId = new GradeLevelDaoImpl().getGradeLevelId(gradeLevel);
//            JOptionPane.showMessageDialog(null,"grade level id: "+gradeLevelId);
            
            cs.setInt(39, gradeLevelId );
            
            int schoolYearNo = aRegistration.getSchoolYear().getYearFrom();
            int schoolYearId = new SchoolYearDaoImpl().getSchoolYearId(schoolYearNo);
//            JOptionPane.showMessageDialog(null,"School Year Id: "+schoolYearId);
            cs.setInt(40, schoolYearId);
            
            
            String paymentTerm = aRegistration.getPaymentTerm();
            JOptionPane.showMessageDialog(null, "Payment Term : "+aRegistration.getPaymentTerm());
            Integer aPaymentTermId = paymentTermDaoImpl.getId(paymentTerm);
            JOptionPane.showMessageDialog(null, "Payment Term Id : "+aPaymentTermId);
            cs.setInt(41, aPaymentTermId);
            
            cs.executeUpdate();
            isAdded = true;
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isAdded;
    }

    @Override
    public boolean updateRegistration(Registration studentRegistration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteRegistration(Registration studentRegistration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
// OLD =================OLD ======================= OLD ===================== OLD =========================    
    
    public Boolean submit
        (String aStudentType, String aLastName, String aFirstName, String aMiddleName, int aDateOfBirth, String aPlaceOfBirth,
        String aNationality, String aReligion, int aGender, String aFatherFirstName, String aFatherMiddleName, String aFatherLastName,
        String aFatherOccupation, String aFatherOfficePhoneNo, String aMotherFirstName, String aMotherMiddleName, String aMotherLastName,
        String aMotherOccupation, String aMotherOfficePhoneNo, String aFatherMobileNo, String aMotherMobileNo, String aGuardianLastName,
        String aGuardianFirstName, String aGuardianMiddleName, String aGuardianOccupation, String aGuardianOfficePhoneNo, String aGuardianMobileNo,
        String aGuardianRelationToStudent, int isFatherContactEmergency, int isMotherContactEmergency, int isGuardianContactEmergency, int aSchoolYearId,
        int aGradeLevelId,String aSchoolLastAttended, String aSchoolAddress, String aRoomOrHouseNo, String aStreet, String aBrgySubd, String aCity, String aProvince,
        String aPaymentTerm)
        {
            
        
            
        Boolean isSuccessful;    
        String SQL = "{CALL register(?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?,?,"
                                  + "?,?,?,?) }";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1,aStudentType);
            cs.setString(2,aLastName);
            cs.setString(3,aFirstName);
            cs.setString(4,aMiddleName);
            cs.setObject(5,aDateOfBirth);
            cs.setString(6,aPlaceOfBirth);
            cs.setString(7,aNationality);
            cs.setString(8,aReligion);
            cs.setInt(9,aGender);
            cs.setString(10,aFatherFirstName);
            cs.setString(11,aFatherMiddleName);
            cs.setString(12,aFatherLastName);
            cs.setString(13,aFatherOccupation);
            cs.setString(14,aFatherOfficePhoneNo);
            cs.setString(15,aMotherFirstName);
            cs.setString(16,aMotherMiddleName);
            cs.setString(17,aMotherLastName);
            cs.setString(18,aMotherOccupation);
            cs.setString(19,aMotherOfficePhoneNo);
            cs.setString(20,aFatherMobileNo);
            cs.setString(21,aMotherMobileNo);
            cs.setString(22,aGuardianLastName);
            cs.setString(23,aGuardianFirstName);
            cs.setString(24,aGuardianMiddleName);
            cs.setString(25,aGuardianOccupation);
            cs.setString(26,aGuardianOfficePhoneNo);
            cs.setString(27,aGuardianMobileNo);
            cs.setString(28,aGuardianRelationToStudent);
            cs.setInt(29,isFatherContactEmergency);
            cs.setInt(30,isMotherContactEmergency);
            cs.setInt(31,isGuardianContactEmergency);
            cs.setInt(32,aSchoolYearId);
            cs.setInt(33,aGradeLevelId);
            cs.setString(34,aSchoolLastAttended);
            cs.setString(35,aSchoolAddress);
            cs.setInt(36, LoginDaoImpl.getUserId());
            cs.setString(37, aRoomOrHouseNo);
            cs.setString(38, aStreet);
            cs.setString(39, aBrgySubd);
            cs.setString(40, aCity);
            cs.setString(41, aProvince);
//            cs.setInt(42, myHasBirthCertificate);
//            cs.setInt(43, myHasBaptismalCertificate);
//            cs.setInt(44, myHasMedicalCertificate);
//            cs.setInt(45, myHasIdPicture);
//            cs.setInt(46, myHasReportCard);
//            cs.setInt(47, myHasCertificateOfGoodMoral);
            cs.setInt(48, PaymentDaoImpl_OLD.Term.getId(aPaymentTerm.trim()));
            cs.registerOutParameter(49, Types.INTEGER);
            
            cs.executeUpdate();
            
            int registrationId = cs.getInt("op_registrationId");
            
            JOptionPane.showMessageDialog(null,"Successfully registered.\nYou registration ID is: "+registrationId);
            isSuccessful = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            isSuccessful = false;
        }//end of catch
        return isSuccessful;
    }
        
      
    public static Boolean updateDetails
        (String aStudentType, String aLastName, String aFirstName, String aMiddleName, int aDateOfBirth, String aPlaceOfBirth,
        String aNationality, String aReligion, int aGender, String aFatherFirstName, String aFatherMiddleName, String aFatherLastName,
        String aFatherOccupation, String aFatherOfficePhoneNo, String aMotherFirstName, String aMotherMiddleName, String aMotherLastName,
        String aMotherOccupation, String aMotherOfficePhoneNo, String aFatherMobileNo, String aMotherMobileNo, String aGuardianLastName,
        String aGuardianFirstName, String aGuardianMiddleName, String aGuardianOccupation, String aGuardianOfficePhoneNo, String aGuardianMobileNo,
        String aGuardianRelationToStudent, int isFatherContactEmergency, int isMotherContactEmergency, int isGuardianContactEmergency, int aSchoolYearId,
        int aGradeLevelId,String aSchoolLastAttended, String aSchoolAddress, String aRoomOrHouseNo, String aStreet, String aBrgySubd, 
        String aCity, String aProvince, boolean hasBirthCertificate, boolean hasBaptismalCertificate, boolean hasMedicalCertificate, boolean hasIdPicture, boolean hasReportCard,
        boolean hasCertificateOfGoodMoral, String aPaymentTerm, int aRegistrationId)
        {
            
        int myHasBirthCertificate = (hasBirthCertificate)? 1:0;
        int myHasBaptismalCertificate = (hasBaptismalCertificate)? 1:0;
        int myHasMedicalCertificate = (hasMedicalCertificate)? 1:0;
        int myHasIdPicture = (hasIdPicture)? 1:0;
        int myHasReportCard = (hasReportCard)? 1:0;
        int myHasCertificateOfGoodMoral = (hasCertificateOfGoodMoral)? 1:0;    
            
        Boolean bool;
        String SQL = "{CALL updateRegistrationDetails("
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            
            
            cs.setString(1,aStudentType);
            cs.setString(2,aLastName);
            cs.setString(3,aFirstName);
            cs.setString(4,aMiddleName);
            cs.setObject(5,aDateOfBirth);
            cs.setString(6,aPlaceOfBirth);
            cs.setString(7,aNationality);
            cs.setString(8,aReligion);
            cs.setInt(9,aGender);
            cs.setString(10,aFatherFirstName);
            cs.setString(11,aFatherMiddleName);
            cs.setString(12,aFatherLastName);
            cs.setString(13,aFatherOccupation);
            cs.setString(14,aFatherOfficePhoneNo);
            cs.setString(15,aMotherFirstName);
            cs.setString(16,aMotherMiddleName);
            cs.setString(17,aMotherLastName);
            cs.setString(18,aMotherOccupation);
            cs.setString(19,aMotherOfficePhoneNo);
            cs.setString(20,aFatherMobileNo);
            cs.setString(21,aMotherMobileNo);
            cs.setString(22,aGuardianLastName);
            cs.setString(23,aGuardianFirstName);
            cs.setString(24,aGuardianMiddleName);
            cs.setString(25,aGuardianOccupation);
            cs.setString(26,aGuardianOfficePhoneNo);
            cs.setString(27,aGuardianMobileNo);
            cs.setString(28,aGuardianRelationToStudent);
            cs.setInt(29,isFatherContactEmergency);
            cs.setInt(30,isMotherContactEmergency);
            cs.setInt(31,isGuardianContactEmergency);
            cs.setInt(32,aSchoolYearId);
            cs.setInt(33,aGradeLevelId);
            cs.setString(34,aSchoolLastAttended);
            cs.setString(35,aSchoolAddress);
            cs.setInt(36, LoginDaoImpl.getUserId());
            cs.setString(37, aRoomOrHouseNo);
            cs.setString(38, aStreet);
            cs.setString(39, aBrgySubd);
            cs.setString(40, aCity);
            cs.setString(41, aProvince);
            cs.setInt(42,myHasBirthCertificate);
            cs.setInt(43,myHasBaptismalCertificate);
            cs.setInt(44,myHasMedicalCertificate);
            cs.setInt(45,myHasIdPicture);
            cs.setInt(46,myHasReportCard);
            cs.setInt(47,myHasCertificateOfGoodMoral);
            cs.setInt(48,PaymentDaoImpl_OLD.Term.getId(aPaymentTerm.trim()) );
            cs.setInt(49, aRegistrationId);
            
            cs.executeUpdate();
            bool = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            bool = false;
        }
        return bool;
    } 
        
    public static DefaultTableModel getRegistrationEntries(JTable aJtable){
        DefaultTableModel myModel = (DefaultTableModel) aJtable.getModel();
        String SQL = "{ CALL getRegistrationEntries() }";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    int registrationId = rs.getInt("registration_id");
                    String studentLastName = rs.getString("lastName");
                    String studentFirstName = rs.getString("firstName");
                    String studentMiddleName = rs.getString("middleName");
                    String myGradeLevel;
                    int gradeLevelRegistered = rs.getInt("level");
                    if(gradeLevelRegistered == 0){
                        myGradeLevel = "Kindergarten";
                    }else{
                        myGradeLevel = "Grade "+gradeLevelRegistered;
                    }
                    
                    String schoolYear = rs.getString("schoolYear");
                    String dateOfRegistration = rs.getString("dateRegistered");
                    
                    //used ternary operator (condition) ? valueIfTrue : valueIfFalse
                    String admissionStatus = ( rs.getInt("isAdmissionComplete") == 1 )? "Completed":"Pending";
                    String downPaymentStatus = ( rs.getInt("isDownPaymentPaid") == 1 )? "Paid":"Unpaid";
                    
                    myModel.addRow(new Object[]{registrationId,studentLastName,studentFirstName,studentMiddleName,myGradeLevel,schoolYear,dateOfRegistration,admissionStatus,downPaymentStatus});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return myModel;
    }
    
    public static String getStudentFirstName(int aRegistrationId){
        String firstName="";
        String SQL = "{CALL getRegistrationStudentFirstName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    firstName = rs.getString("firstName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return firstName;
    }
    
    public static String getStudentLastName(int aRegistrationId){
        String lastName="";
        String SQL = "{CALL getRegistrationStudentLastName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    lastName = rs.getString("lastName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return lastName;
    }
    
    public static String getStudentMiddleName(int aRegistrationId){
        String middleName="";
        String SQL = "{CALL getRegistrationStudentMiddleName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    middleName = rs.getString("middleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return middleName;
    }
    
    public static String getStudentGender(int aRegistrationId){
        String gender="";
        String SQL = "{CALL getRegistrationStudentGender(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    gender = (rs.getInt("gender") == 1)? "Male" : "Female";
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return gender;
    }
    
    public static String getStudentType(int aRegistrationId){
        String SQL = "{CALL getRegistrationStudentType(?)}";
        String myStudentType = null;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs  = cs.executeQuery();){
                while(rs.next()){
                    myStudentType = rs.getString("studentType");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myStudentType;
    }
    
    public static String getStudentReligion(int aRegistrationId){
        String religion="";
        String SQL = "{CALL getRegistrationStudentReligion(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   religion =  rs.getString("religion");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return religion;
    }
    
    public static String getStudentNationality(int aRegistrationId){
        String nationality="";
        String SQL = "{CALL getRegistrationStudentNationality(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    nationality = rs.getString("nationality");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return nationality;
    }
    
    public static String getStudentPlaceOfBirth(int aRegistrationId){
        String placeOfBirth="";
        String SQL = "{CALL getRegistrationStudentPlaceOfBirth(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    placeOfBirth = rs.getString("placeOfBirth");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return placeOfBirth;
    }
    
    public static String getStudentRoomHouseNumber(int aRegistrationId){
        String room_houseNo="";
        String SQL = "{CALL getRegistrationHouseNo(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    room_houseNo = rs.getString("room_or_houseNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return room_houseNo;
    }
    
    public static String getStudentStreet(int aRegistrationId){
        String street="";
        String SQL = "{CALL getRegistrationStreet(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   street  = rs.getString("street");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return street;
    }
    
    public static String getStudentCity(int aRegistrationId){
        String city="";
        String SQL = "{CALL getRegistrationCity(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   city = rs.getString("city");
                }
            }
        } catch (SQLException e) {
        }
        return city;
    }
    
    public static String getStudentBrgySubd(int aRegistrationId){
        String brgySubd ="";
        String SQL = "{CALL getRegistrationBrgySubd(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   brgySubd = rs.getString("brgy_subd");
                }
            }
        } catch (SQLException e) {
        }
        return brgySubd;
    }
    
    public static String getStudentProvince(int aRegistrationId){
        String province ="";
        String SQL = "{CALL getRegistrationProvince(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                   province = rs.getString("province");
                }
            }
        } catch (SQLException e) {
        }
        return province;
    }
    
    public static String getFatherLastName(int aRegistrationId){
        String fatherLastName="";
        String SQL = "{CALL getRegistrationFatherLastName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherLastName = rs.getString("father_lastName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherLastName;
    }
    
    public static String getFatherFirstName(int aRegistrationId){
        String fatherFirstName="";
        String SQL = "{CALL getRegistrationFatherFirstName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherFirstName = rs.getString("father_firstName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherFirstName;
    }
    
    public static String getFatherMiddleName(int aRegistrationId){
        String fatherMiddleName="";
        String SQL = "{CALL getRegistrationFatherMiddleName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherMiddleName = rs.getString("father_middleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherMiddleName;
    }
    
    public static String getFatherOccupation(int aRegistrationId){
        String fatherOccupation="";
        String SQL = "{CALL getRegistrationFatherOccupation(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherOccupation = rs.getString("father_occupation");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherOccupation;
    }
    
    public static String getFatherMobileNo(int aRegistrationId){
        String fatherMobileNo="";
        String SQL = "{CALL getRegistrationFatherMobileNo(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherMobileNo = rs.getString("father_mobileNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherMobileNo;
    }
    
    public static String getFatherOfficePhone(int aRegistrationId){
        String fatherOfficePhoneNo="";
        String SQL = "{CALL getRegistrationFatherOfficePhoneNo(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    fatherOfficePhoneNo = rs.getString("father_officePhoneNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return fatherOfficePhoneNo;
    }
    
    //
    
    public static String getMotherLastName(int aRegistrationId){
        String motherLastName="";
        String SQL = "{CALL getRegistrationMotherLastName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherLastName = rs.getString("mother_lastName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherLastName;
    }
    
    public static String getMotherFirstName(int aRegistrationId){
        String motherFirstName="";
        String SQL = "{CALL getRegistrationMotherFirstName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherFirstName = rs.getString("mother_firstName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherFirstName;
    }
    
    public static String getMotherMiddleName(int aRegistrationId){
        String motherMiddleName="";
        String SQL = "{CALL getRegistrationMotherMiddleName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherMiddleName = rs.getString("mother_middleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherMiddleName;
    }
    
    public static String getMotherOccupation(int aRegistrationId){
        String motherOccupation="";
        String SQL = "{CALL getRegistrationMotherOccupation(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherOccupation = rs.getString("mother_occupation");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherOccupation;
    }
    
    public static String getMotherMobileNo(int aRegistrationId){
        String motherMobileNo="";
        String SQL = "{CALL getRegistrationMotherMobileNo(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherMobileNo = rs.getString("mother_mobileNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherMobileNo;
    }
    
    public static String getMotherOfficePhone(int aRegistrationId){
        String motherOfficePhoneNo="";
        String SQL = "{CALL getRegistrationMotherOfficePhone(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    motherOfficePhoneNo = rs.getString("mother_officePhoneNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return motherOfficePhoneNo;
    }
    
    public static String getGuardianLastName(int aRegistrationId){
        String guardianLastName = "";
        String SQL = "{CALL getRegistrationGuardianLastName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianLastName = rs.getString("guardian_lastName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianLastName;
    }
    
    public static String getGuardianFirstName(int aRegistrationId){
        String guardianFirstName = "";
        String SQL = "{CALL getRegistrationGuardianFirstName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianFirstName = rs.getString("guardian_firstName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianFirstName;
    }
    
    public static String getGuardianMiddleName(int aRegistrationId){
        String guardianMiddleName = "";
        String SQL = "{CALL getRegistrationGuardianMiddleName(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianMiddleName = rs.getString("guardian_middleName");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianMiddleName;
    }
    
    public static String getGuardianOccupation(int aRegistrationId){
        String guardianOccupation = "";
        String SQL = "{CALL getRegistrationGuardianOccupation(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianOccupation = rs.getString("guardian_occupation");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianOccupation;
    }
    
    public static String getGuardianOfficePhoneNo(int aRegistrationId){
        String guardianOfficePhoneNo = "";
        String SQL = "{CALL getRegistrationGuardianOfficePhone(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianOfficePhoneNo = rs.getString("guardian_officePhoneNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianOfficePhoneNo;
    }
    
    
    public static String getGuardianMobileNo(int aRegistrationId){
        String guardianMobileNo = "";
        String SQL = "{CALL getRegistrationGuardianMobileNo(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianMobileNo = rs.getString("guardian_mobileNo");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianMobileNo;
    }
    
    public static String getGuardianRelationToStudent(int aRegistrationId){
        String guardianRelationToStudent = "";
        String SQL = "{CALL getRegistrationGuardianRelationToStudent(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    guardianRelationToStudent = rs.getString("guardian_relationToStudent");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return guardianRelationToStudent;
    }
    
    public static Boolean isFatherContactInCaseEmergency(int aRegistrationId){
        Boolean isContact = false;
        String SQL = "{CALL getRegistrationIsFatherContactInCaseEmergency(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    isContact = rs.getInt("isFatherContactInCaseEmergency") == 1;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at isFatherContactInCaseEmergency(): "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            JOptionPane.showMessageDialog(null,"isFatherContact: "+isContact);
        }
        return isContact;
    }
    
    public static Boolean isMotherContactInCaseEmergency(int aRegistrationId){
        Boolean isContact = false;
        String SQL = "{CALL getRegistrationIsMotherContactInCaseEmergency(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    isContact = rs.getInt("isMotherContactInCaseEmergency") == 1;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            //JOptionPane.showMessageDialog(null,"isMotherContact: "+isContact);
        }
        return isContact;
    }
    
    public static Boolean isGuardianContactInCaseEmergency(int aRegistrationId){
        Boolean isContact = false;
        String SQL = "{CALL getRegistrationIsGuardianContactInCaseEmergency(?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    isContact = rs.getInt("isGuardianContactInCaseEmergency") == 1;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            //JOptionPane.showMessageDialog(null,"isGuardianContact: "+isContact);
        }
        return isContact;
    }
    
    public static int getSchoolYearFrom(int aRegistrationId){
        int syYearFrom = 0;
        String SQL = "{CALL getRegistrationSchoolYearFrom(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    syYearFrom = rs.getInt("yearFrom");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return syYearFrom;
    }
    
    public static int getGradeLevel(int aRegistrationId){
        int gradeLevel = 0;
        String SQL = "{CALL getRegistrationGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    gradeLevel = rs.getInt("level");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        //JOptionPane.showMessageDialog(null,"Grade Level: "+gradeLevel);
        return gradeLevel;
    }
    
    public static String getSchoolLastAttended(int aRegistrationId){
        String schoolLastAttended = "";
        String SQL = "{CALL getRegistrationSchoolLastAttended(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    schoolLastAttended = rs.getString("schoolLastAttended");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return schoolLastAttended;
    }
    
    public static String getSchoolLastAttendedAddress(int aRegistrationId){
        String schoolLastAttendedAddress = "";
        String SQL = "{CALL getRegistrationSchoolLastAttendendAddress(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    schoolLastAttendedAddress = rs.getString("schoolAddress");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return schoolLastAttendedAddress;
    }
    
    public static Boolean isEnrolled(int aRegistrationId){
        Boolean isEnrolled = false;
        String SQL = "{}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    isEnrolled = ( rs.getInt("isEnrolled") == 1 );
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return isEnrolled;
    }
    
    public static int getDateOfBirthYear(int aRegistrationId){
        int year = 0 ;
        String SQL = "{CALL getRegistrationDateOfBirthYear(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    year = Integer.parseInt(rs.getObject("year").toString());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        
        //JOptionPane.showMessageDialog(null,"Year: "+year);
        return year;
    }
    
    public static Object getDateOfBirthDay(int aRegistrationId){
        Object day = null;
        String SQL = "{CALL getRegistrationDateOfBirthDay(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    day = rs.getObject("day").toString();
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return day;
    }
    
    
    public static Object getDateOfBirthMonth(int aRegistrationId){
        Object month = null;
        String SQL = "{CALL getRegistrationDateOfBirthMonth(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    month = rs.getObject("month");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return month;
    }
    
    public static String getAdmissionStatus(int aRegistrationId){
        String myStatus = null;
        String SQL = "{CALL getAdmissionStatus(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    int isComplete = rs.getInt("isAdmissionComplete");
                    if(isComplete == 1){
                        myStatus = "Completed";
                    }else{
                        myStatus = "Pending";
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
        }
        return myStatus;
    }
    
    public static Boolean updateAdmissionStatus(String aStatus, int aRegistrationId){
        int myAdmissionStatus = 0;
        Boolean isSuccessful;
        if(aStatus.equals("Completed")){ myAdmissionStatus = 1; }
        else if(aStatus.equals("Pending")){ myAdmissionStatus = 0; }
        
        String SQL = "{CALL updateAdmissionStatus(?,?)}";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, myAdmissionStatus);
            cs.setInt(2, aRegistrationId);
            cs.executeUpdate();
            isSuccessful = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error at: "+e.getClass().getSimpleName()+"\nError Message: "+e.getMessage()+"\n"+e.getErrorCode() );
            isSuccessful = false;
        }
        
        return isSuccessful;
    }
    
    public static boolean completeAdmission(int aRegistrationId){
        boolean isSuccessful;
        String SQL = "{CALL completeAdmission(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            cs.executeUpdate();
            isSuccessful = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    public static boolean hasBirthCertificate(int aRegistrationId){
        boolean myHasBirthCertificate = false ;
        String SQL = "{CALL getRegistrationHasBirthCertificate(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasBirthCertificate = rs.getBoolean("hasBirthCertificate");
                    //JOptionPane.showMessageDialog(null, myHasBirthCertificate);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasBirthCertificate;
    }
    
    public static boolean hasCertificateOfGoodMoral(int aRegistrationId){
        boolean myHasCertificateOfGoodMoral = false ;
        String SQL = "{CALL getRegistrationHasCertificateOfGoodMoral(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasCertificateOfGoodMoral = rs.getBoolean("hasCertificateOfGoodMoral");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasCertificateOfGoodMoral;
    }
    
    public static boolean hasBaptismalCertificate(int aRegistrationId){
        boolean myHasBaptismalCertificate = false ;
        String SQL = "{CALL getRegistrationHasBaptismalCertificate(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasBaptismalCertificate = rs.getBoolean("hasBaptismalCertificate");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasBaptismalCertificate;
    }
    
    public static boolean hasIdPicture(int aRegistrationId){
        boolean myHasIdPicture = false ;
        String SQL = "{CALL getRegistrationHasIdPicture(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasIdPicture = rs.getBoolean("hasIdPicture");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasIdPicture;
    }
    
     public static boolean hasMedicalCertificate(int aRegistrationId){
        boolean myHasMedicalCertificate = false ;
        String SQL = "{CALL getRegistrationHasMedicalCertificate(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasMedicalCertificate = rs.getBoolean("hasMedicalCertificate");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasMedicalCertificate;
    }
     
     public static boolean hasReportCard(int aRegistrationId){
        boolean myHasReportCard = false ;
        String SQL = "{CALL getRegistrationHasReportCard(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1,aRegistrationId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    myHasReportCard = rs.getBoolean("hasReportCard");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
        }
        return myHasReportCard;
    }

     public static boolean isStudentAlreadyRegistered
        (String aStudentType, String aLastName, String aFirstName, String aMiddleName, int aDateOfBirth ){
         String SQL = "{CALL isStudentApplicantExists(?,?,?,?,?)}";
         boolean isExists = false;
         int rowCount = 0;
         try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                 CallableStatement cs = con.prepareCall(SQL);){
             cs.setString(1,aStudentType.trim() );
             cs.setString(2, aLastName.trim() );
             cs.setString(3, aMiddleName.trim() );
             cs.setString(4, aFirstName.trim() );
             cs.setObject(5, aDateOfBirth);
             try(ResultSet rs = cs.executeQuery();){
                 while(rs.next()){
                     rowCount++;
                 }
                 isExists = rowCount > 0;
             }
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
         }
         return isExists;
     }
        
        
        public static String getPaymentTermSelected(int aRegistrationId){
            String SQL = "{CALL getRegistrationPaymentTermSelected(?)}";
            String myPaymentTerm = null;
            try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                    CallableStatement cs = con.prepareCall(SQL);){
                cs.setInt(1, aRegistrationId);
                try(ResultSet rs = cs.executeQuery();){
                    while(rs.next()){
                       myPaymentTerm = rs.getString("paymentterm");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error.\n"+e.getMessage()+"\n"+e.getCause());
            }
            return myPaymentTerm;
        }
        
     
}//end of class
