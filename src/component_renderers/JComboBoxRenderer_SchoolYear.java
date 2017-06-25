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
import javax.swing.ListCellRenderer;
import model.SchoolYear;

/**
 *
 * @author Acer
 */
public class JComboBoxRenderer_SchoolYear extends JLabel implements ListCellRenderer<Object> {

    public JComboBoxRenderer_SchoolYear() {
        this.setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        //selection formatting
        if (isSelected) {
            //if user points or selects an item on the list 
            this.setBackground(Color.BLACK);
            this.setForeground(Color.YELLOW);
        } else {
            this.setBackground(list.getBackground()); //default bg color
            this.setForeground(list.getForeground()); //default fg color
            
        }
        return this;
    }

}
