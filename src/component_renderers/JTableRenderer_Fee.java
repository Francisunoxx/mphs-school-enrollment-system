/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import model.Fee;

/**
 *
 * @author Acer
 */
public class JTableRenderer_Fee extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int col)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        if(row%2 == 0){
            cellComponent.setBackground(Color.YELLOW);
            ((JLabel)cellComponent).setForeground(Color.BLACK);
        }
        else{
            cellComponent.setBackground(new Color(20, 190, 214));
            ((JLabel)cellComponent).setForeground(Color.BLACK);
        }
        
        
//        for (int tRow = 0; tRow < table.getRowCount(); tRow++) {
//            for (int tColumn = 0; tColumn < table.getColumnCount(); tColumn++) {
//                if (table.getValueAt(tRow, tColumn) instanceof Fee) {
//                    Fee aFeeObject = (Fee) table.getValueAt(tRow, tColumn);
//                    switch (tColumn) {
//                        case 0:
//                            table.setValueAt(aFeeObject.getId(), tRow, tColumn);
//                            break;
//                        case 1:
//                            table.setValueAt(aFeeObject.getName(), tRow, tColumn);
//                            break;
//                        case 2:
//                            table.setValueAt(aFeeObject.getAmount(), tRow, tColumn);
//                            break;
//                        case 3:
//                            table.setValueAt(aFeeObject.getDescription(), tRow, tColumn);
//                            break;
//                        case 4:
//                            table.setValueAt(aFeeObject.getFeeCategory().getCategory(), tRow, tColumn);
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//        }
//        
        
        return cellComponent;
    }
}
    

