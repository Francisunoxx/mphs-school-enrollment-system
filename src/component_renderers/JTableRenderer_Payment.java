/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

import component_utility.JTableGUIUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Acer
 */
public class JTableRenderer_Payment extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int col)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        JTableGUIUtil.setCellsAlignment(table, SwingConstants.CENTER);
        
//        this.setHorizontalAlignment(SwingConstants.CENTER);
//        for(int colIndex=1; colIndex < table.getModel().getColumnCount(); colIndex++){
//            table.getColumnModel().getColumn(colIndex).setCellRenderer(this);
//        }
        return cellComponent;
    }
}
