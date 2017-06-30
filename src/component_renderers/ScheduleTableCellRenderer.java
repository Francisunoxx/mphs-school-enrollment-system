/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Acer
 */
public class ScheduleTableCellRenderer extends DefaultTableCellRenderer {

    static int conflict = 0;

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int col) {

        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        if (conflict > 0) {
            c.setBackground(Color.RED);
        }else{
            c.setBackground(table.getBackground());
        }

        return c;
    }

    public static void setConflict(int aConflict) {
        conflict = aConflict;
    }

}
