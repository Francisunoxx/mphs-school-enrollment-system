
package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.FacultyDaoImpl;
import javax.swing.DefaultComboBoxModel;
import model.Faculty;


public class CreateSection extends javax.swing.JPanel {

    ImageIcon addIcon;
    ImageIcon removeIcon;
    
    public CreateSection() {
        UIManager.put( "ComboBox.disabledBackground", new Color(212,212,210) );
        UIManager.put( "ComboBox.disabledForeground", Color.BLACK );
        initComponents();
        
        SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
        DefaultComboBoxModel schoolYearStartModel = new DefaultComboBoxModel(sydi.getAllStart().toArray());
        DefaultComboBoxModel schoolYearEndModel = new DefaultComboBoxModel(sydi.getAllEnd().toArray());
        GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
        DefaultComboBoxModel gradeLevelModel = new DefaultComboBoxModel(gldi.getAllGradeLevelsInfo().toArray());
        
        syYearFromJcbx.setModel(schoolYearStartModel);
        syYearToJcbx.setModel(schoolYearEndModel);
        syYearToJcbx.setSelectedIndex(-1);
        
        gradeLevelJcbx.setModel(gradeLevelModel);
        gradeLevelJcbx.setSelectedIndex(-1);
        sessionJcbx.setSelectedIndex(-1);
        
       
        adviserJcbx.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sectionNameJtf = new javax.swing.JTextField();
        gradeLevelJlbl = new javax.swing.JLabel();
        gradeLevelJcbx = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        syYearFromJcbx = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        syYearToJcbx = new javax.swing.JComboBox<>();
        adviserJlbl = new javax.swing.JLabel();
        adviserJcbx = new javax.swing.JComboBox<>();
        sessionJlbl = new javax.swing.JLabel();
        sessionJcbx = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cancelCreateSectionJbtn = new javax.swing.JButton();
        saveSectionJbtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Create Curriculum Panel"));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Create New Section");
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Section Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel3, gridBagConstraints);

        sectionNameJtf.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(sectionNameJtf, gridBagConstraints);

        gradeLevelJlbl.setText("Year Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(gradeLevelJlbl, gridBagConstraints);

        gradeLevelJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gradeLevelJcbxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(gradeLevelJcbx, gridBagConstraints);

        jLabel6.setText("School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel6, gridBagConstraints);

        syYearFromJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                syYearFromJcbxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(syYearFromJcbx, gridBagConstraints);

        jLabel7.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel7, gridBagConstraints);

        syYearToJcbx.setEnabled(false);
        syYearToJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                syYearToJcbxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(syYearToJcbx, gridBagConstraints);

        adviserJlbl.setText("Adviser :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(adviserJlbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(adviserJcbx, gridBagConstraints);

        sessionJlbl.setText("Session :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(sessionJlbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(sessionJcbx, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        cancelCreateSectionJbtn.setText("Cancel");
        cancelCreateSectionJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCreateSectionJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(cancelCreateSectionJbtn, gridBagConstraints);

        saveSectionJbtn.setText("Create");
        saveSectionJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSectionJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(saveSectionJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel4, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelCreateSectionJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreateSectionJbtnActionPerformed
        
    }//GEN-LAST:event_cancelCreateSectionJbtnActionPerformed

    private void gradeLevelJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gradeLevelJcbxItemStateChanged
        
    }//GEN-LAST:event_gradeLevelJcbxItemStateChanged

    private void saveSectionJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSectionJbtnActionPerformed
        String  mySectionName   = sectionNameJtf.getText().trim();
        String  myGradeLevel    = gradeLevelJcbx.getSelectedItem().toString();
        int     mySyYearFrom    = Integer.parseInt((syYearFromJcbx.getSelectedItem().toString()));
        int     mySyYearTo      = Integer.parseInt(syYearToJcbx.getSelectedItem().toString());
        String  facultyName     = adviserJcbx.getSelectedItem().toString().trim();
        String  mySession         = sessionJcbx.getSelectedItem().toString().trim();
        
                 
    }//GEN-LAST:event_saveSectionJbtnActionPerformed

    private void syYearFromJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_syYearFromJcbxItemStateChanged
        int syStartIndex = syYearFromJcbx.getSelectedIndex();
        syYearToJcbx.setSelectedIndex(syStartIndex);
        syYearToJcbx.setEnabled(false);
    }//GEN-LAST:event_syYearFromJcbxItemStateChanged

    private void syYearToJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_syYearToJcbxItemStateChanged
        
    }//GEN-LAST:event_syYearToJcbxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adviserJcbx;
    private javax.swing.JLabel adviserJlbl;
    private javax.swing.JButton cancelCreateSectionJbtn;
    private javax.swing.JComboBox<String> gradeLevelJcbx;
    private javax.swing.JLabel gradeLevelJlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton saveSectionJbtn;
    private javax.swing.JTextField sectionNameJtf;
    private javax.swing.JComboBox<String> sessionJcbx;
    private javax.swing.JLabel sessionJlbl;
    private javax.swing.JComboBox<String> syYearFromJcbx;
    private javax.swing.JComboBox<String> syYearToJcbx;
    // End of variables declaration//GEN-END:variables
}
