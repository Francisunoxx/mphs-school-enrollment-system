/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

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
public class JTableRenderer_SchoolYear extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int col)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        if(row%2 == 0){
//            cellComponent.setBackground(Color.YELLOW);
//            ((JLabel)cellComponent).setForeground(Color.BLACK);
        }
        else{
//            cellComponent.setBackground(new Color(20, 190, 214));
//            ((JLabel)cellComponent).setForeground(Color.BLACK);
        }
        
        if(table.getSelectedRow()==row){
            int tColCount = table.getColumnCount();
            for(int i=0; i<tColCount; i++){
                ((JLabel)cellComponent).setFont(new Font("Helvetica",Font.BOLD,12));
                cellComponent.setBackground(Color.BLACK);
                ((JLabel)cellComponent).setForeground(Color.YELLOW);
            }
        }
        
        
        this.setHorizontalAlignment(SwingConstants.CENTER);
        for(int colIndex=1; colIndex < table.getModel().getColumnCount(); colIndex++){
            table.getColumnModel().getColumn(colIndex).setCellRenderer(this);
        }
        
        return cellComponent;
    }
}
