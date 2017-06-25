package gui;

import javax.swing.JOptionPane;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl_OLD;
import daoimpl.GradeLevelDaoImpl;
import java.awt.Color;
import javax.swing.UIManager;
import daoimpl.SubjectDaoImpl_OLD;
import component_model_loader.GradeLevelML;
import javax.swing.DefaultComboBoxModel;
import component_renderers.JComboBoxRenderer_GradeLevel;

public class CreateSubjectForm_Orig extends javax.swing.JPanel {

    //HAS-A
    GradeLevelML gradeLevelUtil = new GradeLevelML();

    public CreateSubjectForm_Orig() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        initComponents();

        jcmbGradeLevelCreateSubject.setModel(gradeLevelUtil.getAllGradeLevels());
        jcmbGradeLevelCreateSubject.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevelCreateSubject.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpnlTopPanel = new javax.swing.JPanel();
        jpnlCreateSubject = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblSubjectName = new javax.swing.JLabel();
        jtfSubjectName = new javax.swing.JTextField();
        jlblSubjectCode = new javax.swing.JLabel();
        jtfSubjectCode = new javax.swing.JTextField();
        jlblGradeLevel = new javax.swing.JLabel();
        jcmbGradeLevelCreateSubject = new javax.swing.JComboBox<>();
        jpnlSubjectDescription = new javax.swing.JPanel();
        jspSubjectDescription = new javax.swing.JScrollPane();
        jtaSubjectDescription = new javax.swing.JTextArea();
        jlblSubjectDescription = new javax.swing.JLabel();
        jpnlControl = new javax.swing.JPanel();
        jbtnClearFields = new javax.swing.JButton();
        jbtnSaveSubject = new javax.swing.JButton();
        jpnlAllSubjectsCreated = new javax.swing.JPanel();
        jspSubjectList = new javax.swing.JScrollPane();
        jlstAllSubjects = new javax.swing.JList<>();
        jpnlFilter = new javax.swing.JPanel();
        jlblGradeLevel1 = new javax.swing.JLabel();
        jcmbGradeLevelFilterSubject = new javax.swing.JComboBox<>();
        jpnlSubjectInformation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlblSubjectName1 = new javax.swing.JLabel();
        jtfSubjectName1 = new javax.swing.JTextField();
        jlblSubjectCode1 = new javax.swing.JLabel();
        jtfSubjectCode1 = new javax.swing.JTextField();
        jlblGradeLevel2 = new javax.swing.JLabel();
        jcmbGradeLevel2 = new javax.swing.JComboBox<>();
        jpnlSubjectDescription1 = new javax.swing.JPanel();
        jspSubjectDescription1 = new javax.swing.JScrollPane();
        jtaSubjectDescription1 = new javax.swing.JTextArea();
        jlblSubjectDescription1 = new javax.swing.JLabel();
        jpnlControl1 = new javax.swing.JPanel();
        jbtnClearFields1 = new javax.swing.JButton();
        jbtnSaveSubject1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jpnlTopPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlTopPanel.setLayout(new java.awt.GridBagLayout());

        jpnlCreateSubject.setBorder(javax.swing.BorderFactory.createTitledBorder("Subject Creation"));
        jpnlCreateSubject.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jlblSubjectName.setText("Subject Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblSubjectName, gridBagConstraints);

        jtfSubjectName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jtfSubjectName, gridBagConstraints);

        jlblSubjectCode.setText("Subject Code :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblSubjectCode, gridBagConstraints);

        jtfSubjectCode.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jtfSubjectCode, gridBagConstraints);

        jlblGradeLevel.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblGradeLevel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jcmbGradeLevelCreateSubject, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSubject.add(jPanel2, gridBagConstraints);

        jpnlSubjectDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlSubjectDescription.setLayout(new java.awt.GridBagLayout());

        jtaSubjectDescription.setColumns(20);
        jtaSubjectDescription.setLineWrap(true);
        jtaSubjectDescription.setRows(5);
        jtaSubjectDescription.setWrapStyleWord(true);
        jspSubjectDescription.setViewportView(jtaSubjectDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectDescription.add(jspSubjectDescription, gridBagConstraints);

        jlblSubjectDescription.setText("Subject Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectDescription.add(jlblSubjectDescription, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSubject.add(jpnlSubjectDescription, gridBagConstraints);

        jpnlControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlControl.setLayout(new java.awt.GridBagLayout());

        jbtnClearFields.setText("Clear");
        jbtnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearFieldsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlControl.add(jbtnClearFields, gridBagConstraints);

        jbtnSaveSubject.setText("Save");
        jbtnSaveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveSubjectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlControl.add(jbtnSaveSubject, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSubject.add(jpnlControl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jpnlTopPanel.add(jpnlCreateSubject, gridBagConstraints);

        jpnlAllSubjectsCreated.setBorder(javax.swing.BorderFactory.createTitledBorder("All Subjects"));
        jpnlAllSubjectsCreated.setLayout(new java.awt.GridBagLayout());

        jspSubjectList.setViewportView(jlstAllSubjects);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlAllSubjectsCreated.add(jspSubjectList, gridBagConstraints);

        jpnlFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jpnlFilter.setLayout(new java.awt.GridBagLayout());

        jlblGradeLevel1.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilter.add(jlblGradeLevel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilter.add(jcmbGradeLevelFilterSubject, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlAllSubjectsCreated.add(jpnlFilter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlTopPanel.add(jpnlAllSubjectsCreated, gridBagConstraints);

        jpnlSubjectInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Subject Information"));
        jpnlSubjectInformation.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jlblSubjectName1.setText("Subject Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jlblSubjectName1, gridBagConstraints);

        jtfSubjectName1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jtfSubjectName1, gridBagConstraints);

        jlblSubjectCode1.setText("Subject Code :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jlblSubjectCode1, gridBagConstraints);

        jtfSubjectCode1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jtfSubjectCode1, gridBagConstraints);

        jlblGradeLevel2.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jlblGradeLevel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jcmbGradeLevel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectInformation.add(jPanel5, gridBagConstraints);

        jpnlSubjectDescription1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlSubjectDescription1.setLayout(new java.awt.GridBagLayout());

        jtaSubjectDescription1.setColumns(20);
        jtaSubjectDescription1.setLineWrap(true);
        jtaSubjectDescription1.setRows(5);
        jtaSubjectDescription1.setWrapStyleWord(true);
        jspSubjectDescription1.setViewportView(jtaSubjectDescription1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectDescription1.add(jspSubjectDescription1, gridBagConstraints);

        jlblSubjectDescription1.setText("Subject Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectDescription1.add(jlblSubjectDescription1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectInformation.add(jpnlSubjectDescription1, gridBagConstraints);

        jpnlControl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlControl1.setLayout(new java.awt.GridBagLayout());

        jbtnClearFields1.setText("Clear");
        jbtnClearFields1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearFields1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlControl1.add(jbtnClearFields1, gridBagConstraints);

        jbtnSaveSubject1.setText("Update");
        jbtnSaveSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveSubject1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlControl1.add(jbtnSaveSubject1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectInformation.add(jpnlControl1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlTopPanel.add(jpnlSubjectInformation, gridBagConstraints);

        add(jpnlTopPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveSubjectActionPerformed
    }//GEN-LAST:event_jbtnSaveSubjectActionPerformed

    private void jbtnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearFieldsActionPerformed

    }//GEN-LAST:event_jbtnClearFieldsActionPerformed

    private void jbtnClearFields1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearFields1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClearFields1ActionPerformed

    private void jbtnSaveSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveSubject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSaveSubject1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnClearFields;
    private javax.swing.JButton jbtnClearFields1;
    private javax.swing.JButton jbtnSaveSubject;
    private javax.swing.JButton jbtnSaveSubject1;
    private javax.swing.JComboBox<String> jcmbGradeLevel2;
    private javax.swing.JComboBox<String> jcmbGradeLevelCreateSubject;
    private javax.swing.JComboBox<String> jcmbGradeLevelFilterSubject;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblGradeLevel1;
    private javax.swing.JLabel jlblGradeLevel2;
    private javax.swing.JLabel jlblSubjectCode;
    private javax.swing.JLabel jlblSubjectCode1;
    private javax.swing.JLabel jlblSubjectDescription;
    private javax.swing.JLabel jlblSubjectDescription1;
    private javax.swing.JLabel jlblSubjectName;
    private javax.swing.JLabel jlblSubjectName1;
    private javax.swing.JList<String> jlstAllSubjects;
    private javax.swing.JPanel jpnlAllSubjectsCreated;
    private javax.swing.JPanel jpnlControl;
    private javax.swing.JPanel jpnlControl1;
    private javax.swing.JPanel jpnlCreateSubject;
    private javax.swing.JPanel jpnlFilter;
    private javax.swing.JPanel jpnlSubjectDescription;
    private javax.swing.JPanel jpnlSubjectDescription1;
    private javax.swing.JPanel jpnlSubjectInformation;
    private javax.swing.JPanel jpnlTopPanel;
    private javax.swing.JScrollPane jspSubjectDescription;
    private javax.swing.JScrollPane jspSubjectDescription1;
    private javax.swing.JScrollPane jspSubjectList;
    private javax.swing.JTextArea jtaSubjectDescription;
    private javax.swing.JTextArea jtaSubjectDescription1;
    private javax.swing.JTextField jtfSubjectCode;
    private javax.swing.JTextField jtfSubjectCode1;
    private javax.swing.JTextField jtfSubjectName;
    private javax.swing.JTextField jtfSubjectName1;
    // End of variables declaration//GEN-END:variables
}
