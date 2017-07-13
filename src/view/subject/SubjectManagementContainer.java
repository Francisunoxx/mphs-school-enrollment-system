 
package view.subject;

import view.subject.UpdateSubject;
import component_model_loader.GradeLevelML;
import component_model_loader.SubjectML;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.SubjectDaoImpl;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import layout_utility.SubjectUtility;
import model.GradeLevel;
import model.Subject;

public class SubjectManagementContainer extends javax.swing.JPanel {
    
    GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    SubjectDaoImpl sdi = new SubjectDaoImpl();
    
    GradeLevelML gl = new GradeLevelML();
    SubjectML sml = new SubjectML();
    
    GradeLevel gradeLevel = new GradeLevel();
    Subject subject = new Subject();
    
    SubjectUtility subjectUtility = new SubjectUtility();
    
    public SubjectManagementContainer() {
        initComponents();
        
        //Set model
        cbGradeLevelList.setModel(gl.getAllGradeLevels());
        
        jcmbGradeLevel.setModel(gl.getAllGradeLevels());
        jcmbGradeLevel.setSelectedIndex(-1);
        
        tblSubjectList.setModel(sml.getAllSubjects());
        
        //Hide first column
        tblSubjectList.getColumnModel().getColumn(0).setMinWidth(0);
        tblSubjectList.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnlExisting = new javax.swing.JPanel();
        jpnlNorth = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbGradeLevelList = new javax.swing.JComboBox<>();
        jpnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubjectList = new javax.swing.JTable();
        jpnlSouth = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpnlNew = new javax.swing.JPanel();
        jpnlSubjectDetails = new javax.swing.JPanel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        jlblGradeLevel = new javax.swing.JLabel();
        jlblSubjectName = new javax.swing.JLabel();
        jtfSubjectName = new javax.swing.JTextField();
        jtfSubjectCode = new javax.swing.JTextField();
        jlblSubjectCode = new javax.swing.JLabel();
        jlblSubjectDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfDescription = new javax.swing.JTextArea();
        jpnlControl = new javax.swing.JPanel();
        jbtnClearFields = new javax.swing.JButton();
        jbtnSaveSubject = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jpnlExisting.setLayout(new java.awt.BorderLayout());

        jpnlNorth.setBorder(javax.swing.BorderFactory.createTitledBorder("FIlter Control"));
        jpnlNorth.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jpnlNorth.add(jLabel2, gridBagConstraints);

        cbGradeLevelList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeLevelListItemStateChanged(evt);
            }
        });
        cbGradeLevelList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGradeLevelListActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jpnlNorth.add(cbGradeLevelList, gridBagConstraints);

        jpnlExisting.add(jpnlNorth, java.awt.BorderLayout.NORTH);

        jpnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Subject List"));
        jpnlCenter.setLayout(new java.awt.BorderLayout());

        tblSubjectList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Subject Title", "Subject Code", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSubjectList.setRowHeight(25);
        jScrollPane1.setViewportView(tblSubjectList);
        if (tblSubjectList.getColumnModel().getColumnCount() > 0) {
            tblSubjectList.getColumnModel().getColumn(0).setResizable(false);
            tblSubjectList.getColumnModel().getColumn(1).setResizable(false);
            tblSubjectList.getColumnModel().getColumn(2).setResizable(false);
            tblSubjectList.getColumnModel().getColumn(3).setResizable(false);
            tblSubjectList.getColumnModel().getColumn(4).setResizable(false);
        }

        jpnlCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jpnlExisting.add(jpnlCenter, java.awt.BorderLayout.CENTER);

        jpnlSouth.setBorder(javax.swing.BorderFactory.createTitledBorder("Control"));
        jpnlSouth.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.weightx = 1.0;
        jpnlSouth.add(jButton1, gridBagConstraints);

        jpnlExisting.add(jpnlSouth, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Existing", jpnlExisting);

        jpnlNew.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Subject"));
        jpnlNew.setLayout(new java.awt.BorderLayout());

        jpnlSubjectDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Subject Details"));
        jpnlSubjectDetails.setLayout(new java.awt.GridBagLayout());

        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpnlSubjectDetails.add(jcmbGradeLevel, gridBagConstraints);

        jlblGradeLevel.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        jpnlSubjectDetails.add(jlblGradeLevel, gridBagConstraints);

        jlblSubjectName.setText("Subject Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        jpnlSubjectDetails.add(jlblSubjectName, gridBagConstraints);

        jtfSubjectName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpnlSubjectDetails.add(jtfSubjectName, gridBagConstraints);

        jtfSubjectCode.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpnlSubjectDetails.add(jtfSubjectCode, gridBagConstraints);

        jlblSubjectCode.setText("Subject Code:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        jpnlSubjectDetails.add(jlblSubjectCode, gridBagConstraints);

        jlblSubjectDescription.setText("Subject Description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        jpnlSubjectDetails.add(jlblSubjectDescription, gridBagConstraints);

        jtfDescription.setColumns(20);
        jtfDescription.setRows(5);
        jScrollPane2.setViewportView(jtfDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 10);
        jpnlSubjectDetails.add(jScrollPane2, gridBagConstraints);

        jpnlNew.add(jpnlSubjectDetails, java.awt.BorderLayout.CENTER);

        jpnlControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Controls"));
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

        jpnlNew.add(jpnlControl, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("New", jpnlNew);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
        if(jcmbGradeLevel.getSelectedIndex() > -1)
        {
            gradeLevel.setLevel((int) jcmbGradeLevel.getSelectedItem());
        }
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged

    private void jbtnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearFieldsActionPerformed

    }//GEN-LAST:event_jbtnClearFieldsActionPerformed

    private void jbtnSaveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveSubjectActionPerformed
        //Setter call from GradeLevel & Getting the gradelevel id
        gradeLevel.setId(gldi.getId(gradeLevel));
        
        //Setter call from Subject
        subject.setSubjectId(subject.getSubjectId());
        subject.setSubjectCode(jtfSubjectCode.getText());
        subject.setSubjectTitle(jtfSubjectName.getText());
        subject.setSubjectDescription(jtfDescription.getText());
        
        if(sdi.createSubject(subject, gradeLevel) == true)
        {
            JOptionPane.showMessageDialog(null, "Successfully creating " +jtfSubjectName.getText() + " subject");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Code "+jtfSubjectCode.getText() + " already exist");
        }
    }//GEN-LAST:event_jbtnSaveSubjectActionPerformed

    private void cbGradeLevelListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGradeLevelListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGradeLevelListActionPerformed

    private void cbGradeLevelListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeLevelListItemStateChanged
        //Setter call from Grade Level
        gradeLevel.setLevel((Integer) cbGradeLevelList.getSelectedItem());
        
        //Set model on tblSubjectList
        tblSubjectList.setModel(sml.getAllSubjectsByGradeLevelId(gradeLevel));
    }//GEN-LAST:event_cbGradeLevelListItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UpdateSubject updateSubject = new UpdateSubject();
        
        //Setter call from Subject & Getting the id at selected row at column 0
        subject.setSubjectId((int) tblSubjectList.getValueAt(tblSubjectList.getSelectedRow(), 0));
        
        //Set text on jtextfield and jtextarea
        updateSubject.getTfSubjectName().setText((String) subjectUtility.getCreatedSubjectInfoById(subject, gradeLevel).get(0));
        updateSubject.getTfSubjectCode().setText((String) subjectUtility.getCreatedSubjectInfoById(subject, gradeLevel).get(1));
        updateSubject.getTaSubjectDescription().setText((String) subjectUtility.getCreatedSubjectInfoById(subject, gradeLevel).get(2));
        
        //Set selected item on jcombobox
        updateSubject.getCbGradeLevel().setSelectedItem(subjectUtility.getCreatedSubjectInfoById(subject, gradeLevel).get(3));
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void flipToSubjectsList(){
//        CardLayoutUtil.fjpnlNorthTo(subjectsCardContainer, new SubjectsListGUI());
    }
    
    public static JTable getTblSubjectList()
    {
        return tblSubjectList;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGradeLevelList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnClearFields;
    private javax.swing.JButton jbtnSaveSubject;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblSubjectCode;
    private javax.swing.JLabel jlblSubjectDescription;
    private javax.swing.JLabel jlblSubjectName;
    private javax.swing.JPanel jpnlCenter;
    private javax.swing.JPanel jpnlControl;
    private javax.swing.JPanel jpnlExisting;
    private javax.swing.JPanel jpnlNew;
    private javax.swing.JPanel jpnlNorth;
    private javax.swing.JPanel jpnlSouth;
    private javax.swing.JPanel jpnlSubjectDetails;
    private javax.swing.JTextArea jtfDescription;
    private javax.swing.JTextField jtfSubjectCode;
    private javax.swing.JTextField jtfSubjectName;
    private static javax.swing.JTable tblSubjectList;
    // End of variables declaration//GEN-END:variables
}
