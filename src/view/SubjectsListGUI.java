package view;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl_OLD;
import component_model_loader.JTableGUIUtil;
import javax.swing.DefaultComboBoxModel;

public class SubjectsListGUI extends javax.swing.JPanel {

    public SubjectsListGUI() {
        initComponents();
        SchoolYearDaoImpl sy = new SchoolYearDaoImpl();
        
        subjectsListJtbl.setModel(SubjectDaoImpl_OLD.getAll(subjectsListJtbl));
//        schoolYearStartJcb.setModel(sy.getAllStart());
//        schoolYearEndJcb.setModel(sy.getAllEnd());
        JTableGUIUtil.setCellsAlignment(subjectsListJtbl, SwingConstants.LEFT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        subjectsListPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        subjectsListJsp = new javax.swing.JScrollPane();
        subjectsListJtbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchJbtn = new javax.swing.JButton();
        searchJtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        schoolYearStartJcb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        schoolYearEndJcb = new javax.swing.JComboBox<>();
        buttonControlsPanel = new javax.swing.JPanel();
        viewSubjectJbtn = new javax.swing.JButton();
        editSubjectJbtn = new javax.swing.JButton();
        deleteSubjectJbtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        subjectsListPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        subjectsListPanel.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        subjectsListJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Subject Name", "Units", "Description", "Grade Level", "School Year", "Added By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjectsListJtbl.getTableHeader().setReorderingAllowed(false);
        subjectsListJtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectsListJtblMouseClicked(evt);
            }
        });
        subjectsListJsp.setViewportView(subjectsListJtbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(subjectsListJsp, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        searchJbtn.setText("Go");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(searchJbtn, gridBagConstraints);

        searchJtf.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(searchJtf, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel2, gridBagConstraints);

        jLabel4.setText("School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(schoolYearStartJcb, gridBagConstraints);

        jLabel5.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(schoolYearEndJcb, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        subjectsListPanel.add(jPanel3, gridBagConstraints);

        buttonControlsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonControlsPanel.setLayout(new java.awt.GridBagLayout());

        viewSubjectJbtn.setText("View");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonControlsPanel.add(viewSubjectJbtn, gridBagConstraints);

        editSubjectJbtn.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonControlsPanel.add(editSubjectJbtn, gridBagConstraints);

        deleteSubjectJbtn.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonControlsPanel.add(deleteSubjectJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        subjectsListPanel.add(buttonControlsPanel, gridBagConstraints);

        add(subjectsListPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectsListJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsListJtblMouseClicked
        int clickCount  = evt.getClickCount();
        int rowSelected             = subjectsListJtbl.getSelectedRow();
        String subjCode             = (String) subjectsListJtbl.getValueAt(rowSelected, 0);
        String subjName             = (String) subjectsListJtbl.getValueAt(rowSelected, 1);
        int subjUnits               = (int) subjectsListJtbl.getValueAt(rowSelected, 2);
        String subjDescription      = (String) subjectsListJtbl.getValueAt(rowSelected, 3);
        String subjGradeLevel       = (String) subjectsListJtbl.getValueAt(rowSelected, 4);
        String schoolYear                = (String) subjectsListJtbl.getValueAt(rowSelected, 5);
        
        if (clickCount == 2) {
            UpdateSubjectGUI updateSubj;
            updateSubj = new UpdateSubjectGUI(subjCode,subjName,subjUnits,subjDescription,subjGradeLevel,schoolYear);
            updateSubj.setPreferredSize(new Dimension(450, 650));
            updateSubj.setTitle("Update Subject Information");
            updateSubj.setLocationRelativeTo(null);
            updateSubj.setVisible(true);
            updateSubj.pack();
        }
    }//GEN-LAST:event_subjectsListJtblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonControlsPanel;
    private javax.swing.JButton deleteSubjectJbtn;
    private javax.swing.JButton editSubjectJbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> schoolYearEndJcb;
    private javax.swing.JComboBox<String> schoolYearStartJcb;
    private javax.swing.JButton searchJbtn;
    private javax.swing.JTextField searchJtf;
    private javax.swing.JScrollPane subjectsListJsp;
    private javax.swing.JTable subjectsListJtbl;
    private javax.swing.JPanel subjectsListPanel;
    private javax.swing.JButton viewSubjectJbtn;
    // End of variables declaration//GEN-END:variables
}
