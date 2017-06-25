/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.DiscountDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import model.Discount;

public class DiscountML {

    DiscountDaoImpl ddi = new DiscountDaoImpl();

    public DefaultListModel getListOfDiscountNames() {
        DefaultListModel listModel = new DefaultListModel();
        Object[] discounts = ddi.getActive().toArray();
        for(Object o : discounts){
            Discount d = (Discount)o;
            listModel.addElement(d.getDiscountName());
        }
        return listModel;
    }   
    
    public DefaultComboBoxModel getListOfDiscountNamesAsComboBoxModel() {
        DefaultComboBoxModel jComboBoxModel = new DefaultComboBoxModel();
        Object[] discounts = ddi.getActive().toArray();
        for(Object o : discounts){
            Discount d = (Discount)o;
            jComboBoxModel.addElement(d.getDiscountName().trim());
        }
        jComboBoxModel.setSelectedItem(null);
        return jComboBoxModel;
    } 
}
