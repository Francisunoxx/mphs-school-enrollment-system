/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;
import model.FeeCategory;
import model.GradeLevel;
import model.PaymentTerm;
import model.SchoolYear;

/**
 *
 * @author Acer
 */
public class JComboBoxRenderer_Master extends JLabel implements ListCellRenderer<Object> {

    public JComboBoxRenderer_Master() {
        this.setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        //Class value conversion to getString value using getter

        if (value instanceof SchoolYear) {
            this.setText("" + ((SchoolYear) value).getYearFrom());
        }
        else if (value instanceof GradeLevel) {
            this.setText("" + ((GradeLevel) value).getLevel());
        }
        else if (value instanceof PaymentTerm) {
            this.setText("" + ((PaymentTerm) value).getPaymentTerm());
        }
        else if (value instanceof FeeCategory) {
            this.setText("" + ((FeeCategory) value).getCategory());
        }
        else{
            this.setText("--");
        }
        

        //selection formatting
        if (isSelected) {
            //this.setBackground(Color.YELLOW);
            this.setBackground(list.getSelectionBackground());
            this.setForeground(list.getSelectionForeground());
        } else {
            this.setBackground(list.getBackground());
            this.setForeground(list.getForeground());
        }

        return this;
    }

}
