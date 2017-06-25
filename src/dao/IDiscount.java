/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Discount;

/**
 *
 * @author Acer
 */
public interface IDiscount {
    boolean add(Discount aDiscount);
    List<Discount> get(); //both active and inactive
    List<Discount> getActive(); //active only
    List<Discount> getInactive(); //inactive only
    Discount get(int aDiscountId);
    int getId(String aDiscountName);
}
