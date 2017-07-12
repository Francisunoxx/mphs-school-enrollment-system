/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.SchoolYearDaoImpl;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.SchoolYear;

/**
 *
 * @author Acer
 */
public class SchoolYearML {

    // HAS A
    SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();

    public DefaultComboBoxModel getCurrentSchoolYearFrom() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        SchoolYear schoolYear = SchoolYearDaoImpl.getCurrentSchoolYear();
        dcm.addElement(schoolYear.getYearFrom());
        dcm.setSelectedItem(null);
        return dcm;
    }

    public DefaultComboBoxModel getCurrentSchoolYearTo() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        SchoolYear schoolYear = SchoolYearDaoImpl.getCurrentSchoolYear();
        dcm.addElement(schoolYear.getYearTo());
        dcm.setSelectedItem(null);
        return dcm;
    }

    public DefaultComboBoxModel getAllSchoolYearStart() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        List<SchoolYear> syList = schoolYearDaoImpl.getAllStart();
        Object[] oArr = syList.toArray();
        for (Object o : oArr) {
            SchoolYear s = (SchoolYear) o;
            dcm.addElement(s.getYearFrom());
        }
        return dcm;
    }

    public DefaultComboBoxModel getAllSchoolYearEnd() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        List<SchoolYear> syList = schoolYearDaoImpl.getAllEnd();
        Object[] oArr = syList.toArray();
        for (Object o : oArr) {
            SchoolYear s = (SchoolYear) o;
            dcm.addElement(s.getYearTo());
        }
        return dcm;
    }
}
