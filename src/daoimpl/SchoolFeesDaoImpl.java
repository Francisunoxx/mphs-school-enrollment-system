/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.ISchoolFees;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.GradeLevel;
import model.SchoolYear;
import model.BasicFee;
import model.DownPaymentFee;
import model.Fee;
import model.FeeCategory;
import model.MiscellaneousFees;
import model.OtherFees;
import model.SchoolFees;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolFeesDaoImpl implements ISchoolFees{

    @Override
    public SchoolFees get(int gradeLevelId) {
        double sumOfFees = 0;
        String SQL = "{CALL getSchoolFeesSum(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, gradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    sumOfFees = rs.getDouble("sumOfFees");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        SchoolFees schoolFees = new SchoolFees();
        schoolFees.setBasicFee(getBasicFee(gradeLevelId));
        schoolFees.setDownPaymentFee(getDownPayment(gradeLevelId));
        schoolFees.setMiscellaneousFees(getMiscellaneous(gradeLevelId));
        schoolFees.setOtherFees(getOther(gradeLevelId));
        schoolFees.setSum(sumOfFees);
        return schoolFees;
    }

    @Override
    public MiscellaneousFees getMiscellaneous(int gradeLevelId) {
        MiscellaneousFees miscellaneousFees = new MiscellaneousFees();
        List<Fee> feeList = new ArrayList<>();
        
        String SQL = "{CALL getMiscellaneousFeesByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, gradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    schoolYear.setIsActive(rs.getBoolean("isActive"));
                    schoolYear.setStart_date(rs.getDate("start_date"));
                    schoolYear.setEnd_date(rs.getDate("end_date"));
                    schoolYear.setIsCurrentSchoolYear(rs.getBoolean("isCurrentSchoolYear"));
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    gradeLevel.setIsActive(rs.getBoolean("isActive"));
                    
                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    
                    Fee fee = new Fee();
                    fee.setId(rs.getInt("fee_id"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setFeeCategory(feeCategory);
                    fee.setGradeLevel(gradeLevel);
                    fee.setSchoolYear(schoolYear);
                    feeList.add(fee);
                }
                miscellaneousFees.setFees(feeList);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return miscellaneousFees;
    }

    @Override
    public DownPaymentFee getDownPayment(int gradeLevelId) {
        DownPaymentFee downPaymentFee = new DownPaymentFee();
        String SQL = "{CALL getDownPaymentFeeByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, gradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    schoolYear.setIsActive(rs.getBoolean("isActive"));
                    schoolYear.setStart_date(rs.getDate("start_date"));
                    schoolYear.setEnd_date(rs.getDate("end_date"));
                    schoolYear.setIsCurrentSchoolYear(rs.getBoolean("isCurrentSchoolYear"));
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    gradeLevel.setIsActive(rs.getBoolean("isActive"));
                    
                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    
                    downPaymentFee.setId(rs.getInt("fee_id"));
                    downPaymentFee.setName(rs.getString("fee_name"));
                    downPaymentFee.setDescription(rs.getString("fee_description"));
                    downPaymentFee.setAmount(rs.getDouble("fee_amount"));
                    downPaymentFee.setFeeCategory(feeCategory);
                    downPaymentFee.setGradeLevel(gradeLevel);
                    downPaymentFee.setSchoolYear(schoolYear);
                }
            }
        } catch (SQLException | NullPointerException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return downPaymentFee;
    }

    @Override
    public OtherFees getOther(int gradeLevelId) {
        OtherFees otherFees = new OtherFees();
        List<Fee> feeList = new ArrayList<>();
        
        String SQL = "{CALL getOtherFeesByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, gradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    schoolYear.setIsActive(rs.getBoolean("isActive"));
                    schoolYear.setStart_date(rs.getDate("start_date"));
                    schoolYear.setEnd_date(rs.getDate("end_date"));
                    schoolYear.setIsCurrentSchoolYear(rs.getBoolean("isCurrentSchoolYear"));
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    gradeLevel.setIsActive(rs.getBoolean("isActive"));
                    
                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    
                    Fee fee = new Fee();
                    fee.setId(rs.getInt("fee_id"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setFeeCategory(feeCategory);
                    fee.setGradeLevel(gradeLevel);
                    fee.setSchoolYear(schoolYear);
                    feeList.add(fee);
                }
                otherFees.setFees(feeList);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return otherFees;
    }

    @Override
    public BasicFee getBasicFee(int gradeLevelId) {
        BasicFee basicFee = new BasicFee();
        String SQL = "{CALL getBasicFeeByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, gradeLevelId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    schoolYear.setIsActive(rs.getBoolean("isActive"));
                    schoolYear.setStart_date(rs.getDate("start_date"));
                    schoolYear.setEnd_date(rs.getDate("end_date"));
                    schoolYear.setIsCurrentSchoolYear(rs.getBoolean("isCurrentSchoolYear"));
                    
                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setId(rs.getInt("gradelevel_id"));
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    gradeLevel.setIsActive(rs.getBoolean("isActive"));
                    
                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    
                    basicFee.setId(rs.getInt("fee_id"));
                    basicFee.setName(rs.getString("fee_name"));
                    basicFee.setDescription(rs.getString("fee_description"));
                    basicFee.setAmount(rs.getDouble("fee_amount"));
                    basicFee.setFeeCategory(feeCategory);
                    basicFee.setGradeLevel(gradeLevel);
                    basicFee.setSchoolYear(schoolYear);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return basicFee;
    }
    
    
}
