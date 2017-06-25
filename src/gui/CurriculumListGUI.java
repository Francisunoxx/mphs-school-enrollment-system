package gui;

import daoimpl.CurriculumDaoImpl_OLD;
import java.awt.Dimension;
import daoimpl.SchoolYearDaoImpl;
import component_model_loader.CurriculumML;
import component_model_loader.SchoolYearML;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;

public class CurriculumListGUI extends javax.swing.JPanel {

    //HAS - A
    SchoolYearML schoolYearUtil = new SchoolYearML();
    CurriculumML curriculumUtil = new CurriculumML();
    Curriculum curriculum = new Curriculum();
    SchoolYear schoolYear = new SchoolYear();
    public CurriculumListGUI() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        initComponents();
        setSchoolYearJComboBox();
        curriculumListJtbl.setModel(curriculumUtil.getAllCurriculum());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        curriculumListPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        curriculumListJtbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchJbtn = new javax.swing.JButton();
        searchJtf = new javax.swing.JTextField();
        schoolYearGUIPanel = new javax.swing.JPanel();
        schoolYearJlbl = new javax.swing.JLabel();
        jcmbSchoolYearYearFrom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcmbSchoolYearYearTo = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        curriculumListPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        curriculumListPanel.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Curriculum List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jLabel2, gridBagConstraints);

        curriculumListJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "School Year", "Grade Level", "Description", "Date Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        curriculumListJtbl.getTableHeader().setReorderingAllowed(false);
        curriculumListJtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculumListJtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(curriculumListJtbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        searchJbtn.setText("Go");
        searchJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(searchJbtn, gridBagConstraints);

        searchJtf.setColumns(10);
        searchJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJtfActionPerformed(evt);
            }
        });
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

        schoolYearGUIPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        schoolYearGUIPanel.setLayout(new java.awt.GridBagLayout());

        schoolYearJlbl.setText("School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolYearGUIPanel.add(schoolYearJlbl, gridBagConstraints);

        jcmbSchoolYearYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolYearGUIPanel.add(jcmbSchoolYearYearFrom, gridBagConstraints);

        jLabel5.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolYearGUIPanel.add(jLabel5, gridBagConstraints);

        jcmbSchoolYearYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolYearGUIPanel.add(jcmbSchoolYearYearTo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(schoolYearGUIPanel, gridBagConstraints);

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
        curriculumListPanel.add(jPanel3, gridBagConstraints);

        add(curriculumListPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setSchoolYearJComboBox(){
        jcmbSchoolYearYearFrom.setModel(schoolYearUtil.getAllSchoolYearStart());
        jcmbSchoolYearYearFrom.setSelectedIndex(-1);
        jcmbSchoolYearYearTo.setModel(schoolYearUtil.getAllSchoolYearEnd());
        jcmbSchoolYearYearTo.setSelectedIndex(-1);
    }
    
    private void curriculumListJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculumListJtblMouseClicked
        int clickCount = evt.getClickCount();
        int rowSelected = curriculumListJtbl.getSelectedRow();
        if (clickCount == 2) {
            //open updatecurriculumgui
        }
    }//GEN-LAST:event_curriculumListJtblMouseClicked

    private void searchJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJbtnActionPerformed
        schoolYear.setYearFrom((int) jcmbSchoolYearYearFrom.getSelectedItem());
        curriculum.setCurriculumDescription(searchJtf.getText());
        
        curriculumUtil.getEachCurriculum(curriculum, schoolYear);
        curriculumListJtbl.setModel(curriculumUtil.getEachCurriculum(curriculum, schoolYear));
        
        if(searchJtf.getText().isEmpty())
        {
            curriculumListJtbl.setModel(curriculumUtil.getAllCurriculum());
        }
    }//GEN-LAST:event_searchJbtnActionPerformed

    private void jcmbSchoolYearYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearYearFromItemStateChanged
        if(jcmbSchoolYearYearFrom.getSelectedIndex()>-1){
            int selectedYearFromIndex = jcmbSchoolYearYearFrom.getSelectedIndex();
            jcmbSchoolYearYearTo.setSelectedIndex(selectedYearFromIndex);
        }
    }//GEN-LAST:event_jcmbSchoolYearYearFromItemStateChanged

    private void searchJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJtfActionPerformed
       
    }//GEN-LAST:event_searchJtfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable curriculumListJtbl;
    private javax.swing.JPanel curriculumListPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbSchoolYearYearFrom;
    private javax.swing.JComboBox<String> jcmbSchoolYearYearTo;
    private javax.swing.JPanel schoolYearGUIPanel;
    private javax.swing.JLabel schoolYearJlbl;
    private javax.swing.JButton searchJbtn;
    private javax.swing.JTextField searchJtf;
    // End of variables declaration//GEN-END:variables
}
