/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import component_model_loader.GradeLevelML;
import component_model_loader.SchoolYearML;
import component_model_loader.SectionML;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SectionDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import model.Student;

/**
 *
 * @author francisunoxx
 */
public class UpdateSection extends javax.swing.JFrame {
    
    Object[] category = new Object[]{"FCFS","Grade Ranking"};
    Object[] sessionList = new Object[]{"AM", "PM"};
    
    DefaultComboBoxModel gradesFromModel = new DefaultComboBoxModel();
    DefaultComboBoxModel gradeToModel = new DefaultComboBoxModel();
    DefaultComboBoxModel categoryModel = new DefaultComboBoxModel(category);
    DefaultComboBoxModel sessionModel = new DefaultComboBoxModel(sessionList);
    
    private SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    private SectionDaoImpl sdi = new SectionDaoImpl();
    private GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    
    private GradeLevelML gl = new GradeLevelML();
    private SchoolYearML syml = new SchoolYearML();
    private SectionML sml = new SectionML();
    
    private SchoolYear schoolYear = new SchoolYear();
    
    private Section section = new Section();
    private GradeLevel gradeLevel = new GradeLevel();
    private Session session = new Session();
    private Student student = new Student();
    public UpdateSection() {
        initComponents();
        
        for(int i = 60; i < 100; i++)
        {
            gradesFromModel.addElement(i);
            gradeToModel.addElement(i);
        }
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
        cbGradeLevel.setModel(gl.getAllGradeLevels());
        cbSchoolYearFrom.setModel(syml.getAllSchoolYearStart());
        cbSchoolYearTo.setModel(syml.getAllSchoolYearEnd());
        cbGradeFrom.setModel(gradesFromModel);
        cbGradeTo.setModel(gradeToModel);
        cbCategory.setModel(categoryModel);
        cbSession.setModel(sessionModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfSubjectName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGradeFrom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbGradeTo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbGradeLevel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbSchoolYearFrom = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbSchoolYearTo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbSession = new javax.swing.JComboBox<>();
        chbBoth = new javax.swing.JCheckBox();
        tfCapacityAM = new javax.swing.JTextField();
        tfCapacityPM = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 350));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Section Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(tfSubjectName, gridBagConstraints);

        jLabel2.setText("Grades:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(cbGradeFrom, gridBagConstraints);

        jLabel3.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(cbGradeTo, gridBagConstraints);

        jLabel4.setText("Method:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        cbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(cbCategory, gridBagConstraints);

        jLabel5.setText("Capacity:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        cbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(cbGradeLevel, gridBagConstraints);

        jLabel7.setText("Year Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        cbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSchoolYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(cbSchoolYearFrom, gridBagConstraints);

        jLabel8.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel8, gridBagConstraints);

        cbSchoolYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel3.add(cbSchoolYearTo, gridBagConstraints);

        jLabel10.setText("Session:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel3.add(jLabel10, gridBagConstraints);

        cbSession.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSessionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(cbSession, gridBagConstraints);

        chbBoth.setText("Both");
        chbBoth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbBothItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        jPanel3.add(chbBoth, gridBagConstraints);

        tfCapacityAM.setText("AM");
        tfCapacityAM.setEnabled(false);
        tfCapacityAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCapacityAMMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(tfCapacityAM, gridBagConstraints);

        tfCapacityPM.setText("PM");
        tfCapacityPM.setEnabled(false);
        tfCapacityPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCapacityPMMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel3.add(tfCapacityPM, gridBagConstraints);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Section Details", jPanel2);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu2.setText("Actions");

        jMenuItem1.setText("Apply");
        jMenu2.add(jMenuItem1);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoryItemStateChanged
        //Setter call from Section
        //        section.setCategory((String) cbCategory.getSelectedItem());
        //        section.setSectionCategoryId(sdi.getSectionCategoryId(section));
    }//GEN-LAST:event_cbCategoryItemStateChanged

    private void cbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeLevelItemStateChanged
        
    }//GEN-LAST:event_cbGradeLevelItemStateChanged

    private void cbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSchoolYearFromItemStateChanged
        
    }//GEN-LAST:event_cbSchoolYearFromItemStateChanged

    private void cbSessionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSessionItemStateChanged
//        if(cbSession.getSelectedIndex() == 0)
//        {
//            session.setSessionId(1);
//
//            tfCapacityAM.setEnabled(true);
//            tfCapacityPM.setEnabled(false);
//        }
//        else
//        {
//            session.setSessionId(2);
//
//            tfCapacityAM.setEnabled(false);
//            tfCapacityPM.setEnabled(true);
//        }
    }//GEN-LAST:event_cbSessionItemStateChanged

    private void chbBothItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbBothItemStateChanged
//        if(chbBoth.isSelected())
//        {
//            tfCapacityAM.setEnabled(true);
//            tfCapacityPM.setEnabled(true);
//        }
//        else
//        {
//            tfCapacityAM.setEnabled(false);
//            tfCapacityPM.setEnabled(false);
//
//        }
    }//GEN-LAST:event_chbBothItemStateChanged

    private void tfCapacityAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCapacityAMMouseClicked

        tfCapacityAM.setText("");

    }//GEN-LAST:event_tfCapacityAMMouseClicked

    private void tfCapacityPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCapacityPMMouseClicked
        tfCapacityPM.setText("");
    }//GEN-LAST:event_tfCapacityPMMouseClicked
        
    public JTextField getTfSectionName()
    {
        return tfSubjectName;
    }
    
    public JTextField getTfAM()
    {
        return tfCapacityAM;
    }
    
    public JTextField getTfPM()
    {
        return tfCapacityPM;
    }
    
    public JComboBox getCbGradeLevel()
    {
        return cbGradeLevel;
    }
    
    public JComboBox getCbSchoolYearFrom()
    {
        return cbSchoolYearFrom;
    }
    
    public JComboBox getCbSchoolYearTo()
    {
        return cbSchoolYearTo;
    }
    
    public JComboBox getCbGradeLevelFrom()
    {
        return cbGradeFrom;
    }
    
    public JComboBox getCbGradeLevelTo()
    {
        return cbGradeTo;
    }
    
    public JComboBox getCbMethod()
    {
        return cbCategory;
    }
    
    public JComboBox getCbSession()
    {
        return cbSession;
    }
    
    public JCheckBox getChbBoth()
    {
        return chbBoth;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbGradeFrom;
    private javax.swing.JComboBox<String> cbGradeLevel;
    private javax.swing.JComboBox<String> cbGradeTo;
    private javax.swing.JComboBox<String> cbSchoolYearFrom;
    private javax.swing.JComboBox<String> cbSchoolYearTo;
    private javax.swing.JComboBox<String> cbSession;
    private javax.swing.JCheckBox chbBoth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfCapacityAM;
    private javax.swing.JTextField tfCapacityPM;
    private javax.swing.JTextField tfSubjectName;
    // End of variables declaration//GEN-END:variables
}
