/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.IPeriod;
import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Period;

/**
 *
 * @author John Ferdinand Antonio
 */
public class PeriodDaoImpl implements IPeriod{

    @Override
    public int getId(String aPeriodDescription) {
        int periodId = 0;
        String SQL = "{CALL getPeriodIdByDescription(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, aPeriodDescription.trim());
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    periodId = rs.getInt("period_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return periodId;
    }

    @Override
    public List<Period> get(int aPaymentTermId) {
        List<Period> list = new ArrayList<>();
        String SQL = "{CALL `getPeriodsByPaymentTermId`(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Period period = new Period();
                    period.setPeriodId(rs.getInt("period_id"));
                    period.setCode(rs.getString("period_code"));
                    period.setDescription(rs.getString("description"));
                    
                    list.add(period);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    
}
