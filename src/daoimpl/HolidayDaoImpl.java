/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.IHoliday;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Holiday;

/**
 *
 * @author John Ferdinand Antonio
 */
public class HolidayDaoImpl implements IHoliday{

    @Override
    public int getId(String holidayName) {
        Integer holidayId = null;
        String SQL = "{CALL getHolidayIdByName(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, holidayName.trim());
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    holidayId = rs.getInt("holiday_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return holidayId;
    }

    @Override
    public boolean add(Holiday holiday) {
        boolean isAdded;
        String SQL = "{CALL addHoliday(?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, holiday.getName());
            cs.setString(2, holiday.getDescription());
            cs.executeUpdate();
            isAdded = true;
        } catch (SQLException e) {
            e.printStackTrace();
            isAdded = false;
        }
        return isAdded;
    }

    @Override
    public boolean update(Holiday holiday) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Holiday> get() {
        List<Holiday> holidays = new ArrayList<>();
        String SQL = "{CALL getHolidays()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Holiday h = new Holiday();
                    h.setName(rs.getString("holiday_name"));
                    h.setDescription(rs.getString("description"));
                    h.setDateCreated(rs.getDate("date_created"));
                    h.setIsActive(rs.getBoolean("isActive"));
                    holidays.add(h);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return holidays;
    }
    
}
