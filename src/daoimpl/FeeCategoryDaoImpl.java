/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import database_utility.DBType;
import database_utility.DBUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FeeCategory;
import dao.IFeeCategory;

/**
 *
 * @author Acer
 */
public class FeeCategoryDaoImpl implements IFeeCategory{

    @Override
    public List<FeeCategory> getAllFeeCategory() {
        List<FeeCategory> list = new ArrayList<>();
        String SQL = "{CALL getAllFeeCategory()}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while (rs.next()) {
                    FeeCategory feeCategory = new FeeCategory();
                    feeCategory.setCategory(rs.getString("fee_category"));
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    list.add(feeCategory);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return list;
    }

    @Override
    public FeeCategory getFeeCategoryById(int aFeeCategoryId) {
        FeeCategory feeCategory = new FeeCategory();
        String SQL = "{CALL getFeeCategoryById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aFeeCategoryId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    feeCategory.setId(rs.getInt("fee_category_id"));
                    feeCategory.setCategory(rs.getString("fee_category"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return feeCategory;
    }

    @Override
    public int getFeeCategoryId(FeeCategory aFeeCategory) {
        int aFeeCategoryId = 0;
        String SQL = "{CALL getFeeCategoryId(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aFeeCategory.getCategory());
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    aFeeCategoryId = rs.getInt("fee_category_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return aFeeCategoryId;
    }
    
    
    
}
