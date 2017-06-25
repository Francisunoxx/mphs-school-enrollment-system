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
import model.Discount;
import dao.IDiscount;

/**
 *
 * @author Acer
 */
public class DiscountDaoImpl implements IDiscount {

    @Override
    public List<Discount> getActive() {
        String SQL = "{CALL getAllActiveDiscounts()}";
        List<Discount> listOfDiscounts = new ArrayList<>();
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    Discount discount = new Discount();
                    discount.setDateCreated(rs.getDate("date_created"));
                    discount.setDescription(rs.getString("description"));
                    discount.setDiscountId(rs.getInt("discount_id"));
                    discount.setDiscountName(rs.getString("discount_name"));
                    discount.setIsActive(rs.getBoolean("isActive"));
                    discount.setPercentOfDiscount(rs.getInt("percentage"));
                    listOfDiscounts.add(discount);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getErrorCode()+"\n"+e.getMessage());
        }
        return listOfDiscounts;
    }

    @Override
    public boolean add(Discount aDiscount) {
        boolean isAdded;
        String SQL = "{CALL addDiscount(?,?,?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setString(1, aDiscount.getDiscountName());
            cs.setInt(2,aDiscount.getPercentOfDiscount());
            cs.setString(3, aDiscount.getDescription());
            cs.executeUpdate();
            isAdded = true;
        } catch (SQLException e) {
            isAdded = false;
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return isAdded;
    }

    @Override
    public List<Discount> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Discount> getInactive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Discount get(int aDiscountId) {
        Discount discount = new Discount();
        String SQL = "{CALL getDiscountById(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);){
            cs.setInt(1, aDiscountId);
            try(ResultSet rs = cs.executeQuery();){
                while(rs.next()){
                    discount.setDateCreated(rs.getDate("date_created"));
                    discount.setDescription(rs.getString("description"));
                    discount.setDiscountId(rs.getInt("discount_id"));
                    discount.setDiscountName(rs.getString("discount_name"));
                    discount.setIsActive(rs.getBoolean("isActive"));
                    discount.setPercentOfDiscount(rs.getInt("percentage"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return discount;
    }

    @Override
    public int getId(String aDiscountName) {
        int aDiscountId = 0;
        String SQL = "{CALL getDiscountIdByName(?)}";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
                CallableStatement cs = con.prepareCall(SQL);) {
            cs.setString(1, aDiscountName.trim());
            try (ResultSet rs = cs.executeQuery();) {
                while (rs.next()) {
                    aDiscountId = rs.getInt("discount_id");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode() + "\n" + e.getMessage());
        }
        return aDiscountId;
    }

}
