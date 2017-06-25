
package gui;

import daoimpl.GradeLevelDaoImpl;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.UIManager;
import daoimpl.LoginDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl_OLD;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Antonio, John Ferdinand
 */
public class UpdateSubjectGUI extends javax.swing.JDialog {

    private Boolean isSubjectSchoolYearChanged = null;
    private int     subjectSyYearFrom;
    private int     subjectSyYearTo;
    private String  subjectCode;
    private String  subjectName;
    private int     subjectUnit;
    private String  subjectDescription;
    private String  subjectGradeLevel;
    
    
    /**
     * serves as constructor method.
     * @param aSubjectCode
     * @param aSubjectName
     * @param aSubjectUnit
     * @param aSubjectDescription
     * @param aSubjectGradeLevel
     * @param aSubjectSchoolYear
     */
    public UpdateSubjectGUI(String aSubjectCode, String aSubjectName, int aSubjectUnit, String aSubjectDescription, String aSubjectGradeLevel, String aSubjectSchoolYear) {
        super(null, ModalityType.APPLICATION_MODAL);
        initComponents();
        subjectCode = aSubjectCode;
        subjectName = aSubjectName;
        subjectUnit = aSubjectUnit;
        subjectDescription = aSubjectDescription;
        subjectGradeLevel = aSubjectGradeLevel;    
        
        SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();
        
        UIManager.put( "ComboBox.disabledBackground", new Color(212,212,210) );
        UIManager.put( "ComboBox.disabledForeground", Color.BLACK );
//        subjectGradeLevelJcbx.setModel(GradeLevelDaoImpl.getAll());
//        subjectSyYearFROMJcbx.setModel(schoolYearDaoImpl.getAllSchoolYearStart());
//        subjectSyYearTOJcbx.setModel(schoolYearDaoImpl.getAllSchoolYearEnd());
        
        
        subjectNameJtf.setText(subjectName);
        subjectCodeJtf.setText(subjectCode);
        subjectDescriptionJta.setText(subjectDescription);
        subjectGradeLevelJcbx.setSelectedItem(subjectGradeLevel);
        subjectSyYearFROMJcbx.setSelectedItem(subjectSyYearFrom);
        subjectSyYearTOJcbx.setSelectedItem(subjectSyYearTo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subjectNameJtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subjectCodeJtf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectDescriptionJta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cancelEditSubjectJbtn = new javax.swing.JButton();
        updateSubjectJbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        gradeLevelJLbl = new javax.swing.JLabel();
        subjectGradeLevelJcbx = new javax.swing.JComboBox<>();
        schoolYearJlbl = new javax.swing.JLabel();
        subjectSyYearFROMJcbx = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        subjectSyYearTOJcbx = new javax.swing.JComboBox<>();
        schoolYearContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 249));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Subject Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jLabel2, gridBagConstraints);

        subjectNameJtf.setColumns(10);
        subjectNameJtf.setMinimumSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(subjectNameJtf, gridBagConstraints);

        jLabel3.setText("Subject Code :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jLabel3, gridBagConstraints);

        subjectCodeJtf.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(subjectCodeJtf, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        subjectDescriptionJta.setColumns(20);
        subjectDescriptionJta.setLineWrap(true);
        subjectDescriptionJta.setRows(5);
        jScrollPane1.setViewportView(subjectDescriptionJta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jScrollPane1, gridBagConstraints);

        jLabel1.setText("Subject Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        cancelEditSubjectJbtn.setText("Cancel");
        cancelEditSubjectJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEditSubjectJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(cancelEditSubjectJbtn, gridBagConstraints);

        updateSubjectJbtn.setText("Save");
        updateSubjectJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSubjectJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(updateSubjectJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        gradeLevelJLbl.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(gradeLevelJLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(subjectGradeLevelJcbx, gridBagConstraints);

        schoolYearJlbl.setText("School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(schoolYearJlbl, gridBagConstraints);

        subjectSyYearFROMJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectSyYearFROMJcbxItemStateChanged(evt);
            }
        });
        subjectSyYearFROMJcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectSyYearFROMJcbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(subjectSyYearFROMJcbx, gridBagConstraints);

        jLabel7.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(jLabel7, gridBagConstraints);

        subjectSyYearTOJcbx.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(subjectSyYearTOJcbx, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel6, gridBagConstraints);

        schoolYearContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        schoolYearContainer.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(schoolYearContainer, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectSyYearFROMJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectSyYearFROMJcbxItemStateChanged
        int syStartSelectedIndex = subjectSyYearFROMJcbx.getSelectedIndex();
        subjectSyYearTOJcbx.setSelectedIndex(syStartSelectedIndex);
    }//GEN-LAST:event_subjectSyYearFROMJcbxItemStateChanged

    private void subjectSyYearFROMJcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectSyYearFROMJcbxActionPerformed
        int selectedSyStart = Integer.parseInt( (subjectSyYearFROMJcbx.getSelectedItem().toString()) );

        if( selectedSyStart != subjectSyYearFrom ){
            schoolYearJlbl.setText("* School Year:");
            updateSubjectJbtn.setEnabled(true);
            isSubjectSchoolYearChanged = true;
        }
        if ( selectedSyStart == subjectSyYearFrom ){
            schoolYearJlbl.setText("School Year:");
            isSubjectSchoolYearChanged = false;
        }
    }//GEN-LAST:event_subjectSyYearFROMJcbxActionPerformed

    private void cancelEditSubjectJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEditSubjectJbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelEditSubjectJbtnActionPerformed

    private void updateSubjectJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSubjectJbtnActionPerformed
        String myNewSubjectCode = subjectCodeJtf.getText().trim();
        String myNewSubjectName = subjectNameJtf.getText().trim();
        String myNewSubjectDescription = subjectDescriptionJta.getText();
//        int myNewSubjectGradeLevelID = GradeLevelDaoImpl.getId( subjectGradeLevelJcbx.getSelectedItem().toString() );
        
        int newYearFrom = Integer.parseInt(subjectSyYearFROMJcbx.getSelectedItem().toString());
        int newYearTo = Integer.parseInt(subjectSyYearTOJcbx.getSelectedItem().toString());
//        int myNewSubjectSchoolYearID = SchoolYearDaoImpl.getId(newYearFrom,newYearTo);
        
        int mySubjectId = SubjectDaoImpl_OLD.getId(subjectCode);
        
//        SubjectDaoImpl_OLD.updateAllInformation
//            (myNewSubjectCode, myNewSubjectName, myNewSubjectUnit, myNewSubjectDescription, 
//                    mySubjectId, myNewSubjectGradeLevelID, myNewSubjectSchoolYearID, LoginDaoImpl.getUserId() );
    }//GEN-LAST:event_updateSubjectJbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelEditSubjectJbtn;
    private javax.swing.JLabel gradeLevelJLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel schoolYearContainer;
    private javax.swing.JLabel schoolYearJlbl;
    private javax.swing.JTextField subjectCodeJtf;
    private javax.swing.JTextArea subjectDescriptionJta;
    private javax.swing.JComboBox<String> subjectGradeLevelJcbx;
    private javax.swing.JTextField subjectNameJtf;
    private javax.swing.JComboBox<String> subjectSyYearFROMJcbx;
    private javax.swing.JComboBox<String> subjectSyYearTOJcbx;
    private javax.swing.JButton updateSubjectJbtn;
    // End of variables declaration//GEN-END:variables
}
