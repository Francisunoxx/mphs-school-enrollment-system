package component_utility;

import java.awt.Component;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class JTableGUIUtil {

    public static void deleteAllRows(final DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    public void copyTableData(JTable aSourceJTable, JTable aDestinationRowTable) {
        int selectedRow = aSourceJTable.getSelectedRow(); //selected row whic has the data to be added
        Object selectedSubjCode = aSourceJTable.getValueAt(selectedRow, 0);
        DefaultTableModel curriculumSubjectsModel = null;

        int rows = aDestinationRowTable.getRowCount();
        Object[] curriculumSubjects = new Object[rows];

        for (int j = 0; j < rows; j++) {
            curriculumSubjects[j] = aDestinationRowTable.getValueAt(j, 0);
        }

        if (Arrays.asList(curriculumSubjects).contains(selectedSubjCode)) {
            JOptionPane.showMessageDialog(null, selectedSubjCode + " is already on the list.");
        } else {
            curriculumSubjectsModel = (DefaultTableModel) aDestinationRowTable.getModel();

            Object[] rowData = new Object[aSourceJTable.getColumnCount()];
            int selectedRowIndex = aSourceJTable.getSelectedRow();
            for (int i = 0; i < aSourceJTable.getColumnCount(); i++) {
                rowData[i] = aSourceJTable.getValueAt(selectedRowIndex, i);
            }
            curriculumSubjectsModel.addRow(rowData);
            aDestinationRowTable.setModel(curriculumSubjectsModel);
        }

    }

    public static void setCellsAlignment(JTable table, int alignment) {

        //Usage:
        // JTableGUIUtil.setCellsAlignment(table, SwingConstants.CENTER);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }

    public static void resizeColumnWidth(JTable table, int minimumCellWidth) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}
