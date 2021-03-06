
package daoimpl;
import constants.SchoolYearTable;
import database_utility.DBType;
import database_utility.DBUtil;
//import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.SchoolYear;
import model.Quarter;
import dao.ISchoolYear;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class SchoolYearDaoImpl implements ISchoolYear{

    public static int getCurrentSchoolYearFrom() {
        int aYearFrom = 0;
        String SQL = "{CALL getCurrentSchoolYearFrom()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aYearFrom = rs.getInt(SchoolYearTable.YEARFROM);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return aYearFrom;
    }

    @Override
    public int getCurrentSchoolYearId() {
        int idOfCurrentSchoolYear = 0;
        String SQL = "{CALL getCurrentSchoolYearId()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    idOfCurrentSchoolYear = rs.getInt(SchoolYearTable.SCHOOLYEARID);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return idOfCurrentSchoolYear;
    }

    public static void setCurrentSchoolYear(){
        String SQL = "{CALL setCurrentSchoolYear()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
    }
    
    public static SchoolYear getCurrentSchoolYear(){
        String SQL = "{CALL getCurrentSchoolYear()}";
        SchoolYear schoolYear = new SchoolYear();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    schoolYear.setYearFrom(rs.getInt(SchoolYearTable.YEARFROM));
                    schoolYear.setYearTo(rs.getInt(SchoolYearTable.YEARTO));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return schoolYear;
    }
    
    @Override
    public boolean isCurrent(SchoolYear schoolyear) {
        boolean isCurrent = false;
        int rowCount = 0;
        String SQL = "{CALL isCurrentSchoolYear(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return isCurrent;
    }

    @Override
    public List<SchoolYear> get() {
        List<SchoolYear> list = new ArrayList<>();
        String SQL = "{CALL  getAllSchoolYearInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setSchoolYearId(rs.getInt(SchoolYearTable.SCHOOLYEARID));
                    schoolYear.setYearFrom(rs.getInt(SchoolYearTable.YEARFROM));
                    schoolYear.setYearTo(rs.getInt(SchoolYearTable.YEARTO));
                    schoolYear.setIsActive(rs.getBoolean(SchoolYearTable.ISACTIVE));
                    schoolYear.setStart_date(rs.getDate(SchoolYearTable.STARTDATE));
                    schoolYear.setEnd_date(rs.getDate(SchoolYearTable.ENDDATE));
                    list.add(schoolYear);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return list;
    }

    @Override
    public List<SchoolYear> getAllStart() {
        List<SchoolYear> list = new ArrayList<>();
        
        String SQL = "{CALL getAllSchoolYearInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearFrom(rs.getInt(SchoolYearTable.YEARFROM));
                    //JOptionPane.showMessageDialog(null,rs.getInt("yearFrom"));
                    list.add(schoolYear);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }

    @Override
    public List<SchoolYear> getAllEnd() {
        List<SchoolYear> list = new ArrayList<>();
        
        String SQL = "{CALL getAllSchoolYearInfo()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    SchoolYear schoolYear = new SchoolYear();
                    schoolYear.setYearTo(rs.getInt(SchoolYearTable.YEARTO));
                    //JOptionPane.showMessageDialog(null,"@StudentDaoImpl->getAllEnd()"+rs.getInt("yearTo"));
                    list.add(schoolYear);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }

    @Override
    public SchoolYear getById(int aSchoolYearId) {
        String SQL = "{CALL getSchoolYearById(?)}";
        SchoolYear schoolYear = new SchoolYear();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYearId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    schoolYear.setSchoolYearId(rs.getInt("schoolyear_id"));
                    schoolYear.setYearFrom(rs.getInt("yearFrom"));
                    schoolYear.setYearTo(rs.getInt("yearTo"));
                    schoolYear.setStart_date(rs.getDate("start_date"));
                    schoolYear.setEnd_date(rs.getDate("end_date"));
                    schoolYear.setIsActive((rs.getBoolean("isActive")));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return schoolYear;
    }

    @Override
    public int getId(int aSchoolYearStart) {
        int schoolYearId = 0;
        String SQL = "{CALL getSchoolYearIdByYearFrom(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aSchoolYearStart);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    schoolYearId = rs.getInt(SchoolYearTable.SCHOOLYEARID);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return schoolYearId;
    }

    @Override
    public boolean add(SchoolYear aSchoolYear) {
        List<Quarter> list = aSchoolYear.getQuarters();
        int quarterCount = 4;
        String SQLa = "{CALL addSchoolYear(?,?,?,?,?,?,?,?)}";
        String SQLb = "{CALL addQuarter(?,?,?,?,?)}";
        String SQLc = "{CALL addSchoolYearHoliday(?,?)}";
        String SQLd = "{CALL addSchoolYearSummerSchedule(?,?,?)}";
        int schoolYearId;
        boolean isAdded;
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);) {
            try (CallableStatement csa = con.prepareCall(SQLa);
                    CallableStatement csb = con.prepareCall(SQLb);
                    CallableStatement csc = con.prepareCall(SQLc);
                    CallableStatement csd = con.prepareCall(SQLd);) {
                con.setAutoCommit(false);

                //Add School Year
                String syStartDate = aSchoolYear.getStart_date().toString();
                String syEndDate = aSchoolYear.getEnd_date().toString();
                String enrollmentOpenDate = aSchoolYear.getEnrollment().getOpeningDate().toString();
                String enrollmentClosingDate = aSchoolYear.getEnrollment().getClosingDate().toString();

                System.out.println("@addSchoolYear StartDate :  " + syStartDate);
                System.out.println("@addSchoolYear EndDate :  " + syEndDate);
                System.out.println("@addSchoolYear enrollmentOpenDate :  " + enrollmentOpenDate);
                System.out.println("@addSchoolYear enrollmentClosingDate :  " + enrollmentClosingDate);

                csa.setInt(1, aSchoolYear.getYearFrom());
                csa.setInt(2, aSchoolYear.getYearTo());
                csa.setDate(3, java.sql.Date.valueOf(syStartDate));
                csa.setDate(4, java.sql.Date.valueOf(syEndDate));
                csa.setDate(5, java.sql.Date.valueOf(enrollmentOpenDate));
                csa.setDate(6, (java.sql.Date.valueOf(enrollmentClosingDate)));
                csa.setInt(7, aSchoolYear.getClassHours());
                csa.registerOutParameter(8, java.sql.Types.INTEGER); //schoolyear id of added sy
                csa.executeUpdate();
                schoolYearId = csa.getInt(8);
                
                //Add Semesters of SchoolYear
                for (int i = 0; i < quarterCount; i++) {
                    Quarter s = list.get(i);
                    String quarterStartDate = s.getStartDate().toString().trim();
                    String quarterEndDate = s.getEndDate().toString().trim();

                    csb.setInt(1, s.getQuarterNo());
                    csb.setString(2, s.getDescription());
                    csb.setDate(3, java.sql.Date.valueOf(quarterStartDate));
                    csb.setDate(4, java.sql.Date.valueOf(quarterEndDate));
                    csb.setInt(5, schoolYearId);
                    csb.executeUpdate();
                }
                
                for(int i = 0; i<aSchoolYear.getHolidays().size(); i++){
                    csc.setInt(1, schoolYearId);
                    csc.setInt(2, aSchoolYear.getHolidays().get(i).getId());
                    System.out.println("ID: "+aSchoolYear.getHolidays().get(i).getId());
                    csc.executeUpdate();
                }
                
                String summerStartDate = aSchoolYear.getSummerClassSchedule().getStartDate().toString().trim();
                String summerEndDate = aSchoolYear.getSummerClassSchedule().getEndDate().toString().trim();
                
                csd.setInt(1,schoolYearId);
                csd.setDate(2,java.sql.Date.valueOf(summerStartDate));
                csd.setDate(3,java.sql.Date.valueOf(summerEndDate));
                csd.executeUpdate();
                
                con.commit();
                isAdded = true;
            } catch (SQLException e) {
                isAdded = false;
                con.rollback();
                JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
            isAdded = false;
        }
        return isAdded;
    }

    

    

    


}
