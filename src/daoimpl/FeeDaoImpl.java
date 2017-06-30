package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fee;
import model.FeeCategory;
import model.GradeLevel;
import model.SchoolYear;
import dao.IFee;
import java.util.Map;

public class FeeDaoImpl implements IFee {

    GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    FeeCategoryDaoImpl fcdi = new FeeCategoryDaoImpl();

    @Override
    public double getSumOfTuitionFeesByGradeLevelId(Integer aGradeLevelId) {
        double tuitionFee = 0.00;
        String SQL = "{CALL getSumOfTuitionFeesByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aGradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    tuitionFee = rs.getDouble("sumOfTuitionFee");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return tuitionFee;
    }

    @Override
    public double getSumOfOtherFeesByGradeLevelId(Integer aGradeLevelId) {
        double sumOfOtherFees = 0.00;
        String SQL = "{CALL getSumOfOtherFeesByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aGradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    sumOfOtherFees = rs.getDouble("sumOfOtherFees");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return sumOfOtherFees;
    }

    @Override
    public double getSumOfMiscellaneousFeesByGradeLevelId(Integer aGradeLevelId) {
        double sumOfMiscellaneousFees = 0.00;
        String SQL = "{CALL getSumOfMiscellaneousFeesByGradeLevelId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aGradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    sumOfMiscellaneousFees = rs.getDouble("sumOfMiscellaneousFees");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return sumOfMiscellaneousFees;
    }

    @Override
    public boolean delete(int feeId) {
        boolean isDeleted;
        String SQL = "{CALL deleteFee(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, feeId);
            cs.executeUpdate();
            isDeleted = true;
        } catch (SQLException e) {
            isDeleted = false;
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return isDeleted;
    }

    @Override
    public double getDownpaymentFeeByGradeLevel(GradeLevel aGradeLevel) {
        double amountOfDownpayment = 0;
        int gradeLevel = aGradeLevel.getLevel();
        String SQL = "{CALL getDownpaymentFeeByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, gradeLevel);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    amountOfDownpayment = rs.getDouble("fee_amount");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return amountOfDownpayment;
    }

    @Override
    public List<Fee> getFeesByGradeLevelAndCategory(GradeLevel aGradeLevel, FeeCategory aFeeCategory) {
        String feeCategory = aFeeCategory.getCategory();
        int gradeLevel = aGradeLevel.getLevel();

        List<Fee> list = new ArrayList<>();
        String SQL = "{CALL getFeesByGradeLevelAndCategory(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, gradeLevel);
            cs.setString(2, feeCategory);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Fee fee = new Fee();
                    FeeCategory fc = new FeeCategory();
                    GradeLevel gl = new GradeLevel();
                    SchoolYear sy = new SchoolYear();

                    fc.setId(rs.getInt("fee_category_id"));
                    fc.setCategory(rs.getString("fee_category"));

                    gl.setId(rs.getInt("gradelevel_id"));
                    gl.setLevel(rs.getInt("grade_level"));
                    sy.setYearFrom(rs.getInt("year_created"));

                    fee.setFeeCategory(fc);
                    fee.setGradeLevel(gl);
                    fee.setSchoolYear(sy);

                    fee.setId(rs.getInt("fee_id"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setIsActive(rs.getBoolean("isActive"));

                    list.add(fee);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean exists(String aFeeName) {
        String SQL = "{CALL feeExists(?)}";
        boolean exists = false;
        int rowCount = 0;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, aFeeName);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    rowCount++;
                }
            }
            exists = rowCount > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return exists;
    }

    @Override
    public List<String> getNames() {
        List<String> feeNames = new ArrayList<>();
        String SQL = "{CALL getAllFeeNames()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    feeNames.add(rs.getString("fee_name"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return feeNames;
    }

    @Override
    public List<Fee> getAll() {
        List<Fee> list = new ArrayList<>();
        String SQL = "{CALL getAllFeesInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Fee fee = new Fee();

                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("year_created"));
                    fee.setSchoolYear(schoolYear);

                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    fee.setFeeCategory(feeCategory);

                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    fee.setGradeLevel(gradeLevel);

                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setFeeCategory(feeCategory);
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setId(rs.getInt("fee_id"));
                    fee.setIsActive(rs.getBoolean("isActive"));
                    list.add(fee);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }

    @Override
    public List<Fee> getByGradeLevel(GradeLevel aGradeLevel) {
        List<Fee> list = new ArrayList<>();
        String SQL = "{CALL getFeesByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, aGradeLevel.getLevel());

            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Fee fee = new Fee();

                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("year_created"));
                    fee.setSchoolYear(schoolYear);

                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    fee.setFeeCategory(feeCategory);

                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    fee.setGradeLevel(gradeLevel);

                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setFeeCategory(feeCategory);
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setId(rs.getInt("fee_id"));
                    fee.setIsActive(rs.getBoolean("isActive"));
                    list.add(fee);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }

    @Override
    public double getSumByGradeLevel(GradeLevel aGradeLevel) {
        int gradeLevelId = gldi.getId(aGradeLevel);
        double sumOfFees = 0;
        String SQL = "{CALL getSumOfFeeByGradeLevel(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setInt(1, gradeLevelId);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    sumOfFees = rs.getDouble("sumOfFees");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return sumOfFees;
    }

    @Override
    public List<Fee> getFeesBySchoolYear(SchoolYear aSchoolYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fee> getByCategory(String feeCategory) {
        List<Fee> list = new ArrayList<>();
        String SQL = "{CALL getFeesByCategory(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, feeCategory);

            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    Fee fee = new Fee();

                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt("year_created"));
                    fee.setSchoolYear(schoolYear);

                    FeeCategory fc = new FeeCategory();
                    fc.setCategory(rs.getString("fee_category"));
                    fee.setFeeCategory(fc);

                    GradeLevel gradeLevel = new GradeLevel();
                    gradeLevel.setLevel(rs.getInt("grade_level"));
                    fee.setGradeLevel(gradeLevel);

                    fee.setAmount(rs.getDouble("fee_amount"));
                    fee.setFeeCategory(fc);
                    fee.setDescription(rs.getString("fee_description"));
                    fee.setName(rs.getString("fee_name"));
                    fee.setId(rs.getInt("fee_id"));
                    fee.setIsActive(rs.getBoolean("isActive"));
                    list.add(fee);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }

    @Override
    public Fee getById(int aFeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId(String feeName) {
        String SQL = "{CALL getFeeIdByName(?)}";
        int aFeeId = 0;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, feeName);
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    aFeeId = rs.getInt("fee_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return aFeeId;
    }

    @Override
    public boolean add(Fee fee) {
        boolean isAdded = true;
        String SQLa = "{CALL addFee(?,?,?,?)}";
        String SQLb = "{CALL assignFee(?,?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try (CallableStatement csa = con.prepareCall(SQLa);
                    CallableStatement csb = con.prepareCall(SQLb);) {
                con.setAutoCommit(false);

                FeeCategory feeCategory = fee.getFeeCategory();
                int feeCategoryId = fcdi.getFeeCategoryId(feeCategory);
                csa.setString(1, fee.getName());
                csa.setString(2, fee.getDescription());
                csa.setInt(3, feeCategoryId);
                csa.registerOutParameter(4, Types.INTEGER);
                csa.executeUpdate();

                int feeId = csa.getInt(4);

                for (Map.Entry<Integer, Double> entry : fee.getGradeLevelAmountPair().entrySet()) {
                    Integer level = entry.getKey();
                    Double feeAmount = entry.getValue();

                    int aGradeLevelId = gldi.getId(level);
                    System.out.println(aGradeLevelId + "," + feeAmount);
                    csb.setInt(1, feeId);
                    csb.setDouble(2, feeAmount);
                    csb.setInt(3, aGradeLevelId);
                    csb.setInt(4, fee.getSchoolYear().getSchoolYearId());
                    csb.executeUpdate();
                }

//                for(int i = 0; i<fee.getGradeLevelAmount().size(); i++){
//                    GradeLevel g = fee.getAssignedGradeLevels().get(i);
//                    int gradeLevelId = gldi.getId(g);
//                    csb.setInt(1,feeId);
//                    csb.setDouble(2,fee.getAmount());
//                    csb.setInt(3,gradeLevelId);
//                    csb.setInt(4, fee.getSchoolYear().getSchoolYearId());
//                    csb.executeUpdate();
//                }
                con.commit();
            } catch (SQLException e) {
                con.rollback();
                isAdded = false;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isAdded;
    }

    @Override
    public List<GradeLevel> getGradeLevelAssignment(int aFeeId) {
        List<GradeLevel> gradeLevelList = new ArrayList<>();
        String SQL = "{CALL getFeeGradeLevelAssignment(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aFeeId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    GradeLevel g = new GradeLevel();
                    g.setLevel(rs.getInt("grade_level"));
                    g.setId(rs.getInt("gradelevel_id"));
                    g.setIsActive(rs.getBoolean("isActive"));
                    gradeLevelList.add(g);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return gradeLevelList;
    }

    
}
