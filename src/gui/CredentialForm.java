/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import calendar_utility.CalendarUtil;
import daoimpl.CredentialDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import component_model_loader.CredentialML;
import component_model_loader.JPanelGUIUtil;
import component_model_loader.SchoolYearML;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import model.Credential;
import model.GradeLevel;
import model.SchoolYear;

/**
 *
 * @author Jordan
 */
public class CredentialForm extends javax.swing.JPanel {

    
    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private final CredentialDaoImpl credentialDaoImpl = new CredentialDaoImpl();
    private final CredentialML credentialGUIUtil = new CredentialML();
    
    
    public CredentialForm() {
        initComponents();
        setCredentialJList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpnlCreateCredential = new javax.swing.JPanel();
        jlblCredentialName = new javax.swing.JLabel();
        jpnlCreateNewCredentialDescription = new javax.swing.JPanel();
        jspCredentialDescription = new javax.swing.JScrollPane();
        jtaCredentialDescription = new javax.swing.JTextArea();
        jlblGradeLevel = new javax.swing.JLabel();
        jpnlGradeLevelSelection = new javax.swing.JPanel();
        jcbKindergarten = new javax.swing.JCheckBox();
        jcbGradeOne = new javax.swing.JCheckBox();
        jcbGradeTwo = new javax.swing.JCheckBox();
        jcbGradeThree = new javax.swing.JCheckBox();
        jcbGradeFour = new javax.swing.JCheckBox();
        jcbGradeFive = new javax.swing.JCheckBox();
        jcbGradeSix = new javax.swing.JCheckBox();
        jcbGradeSeven = new javax.swing.JCheckBox();
        jcbGradeEight = new javax.swing.JCheckBox();
        jcbGradeNine = new javax.swing.JCheckBox();
        jcbGradeTen = new javax.swing.JCheckBox();
        jcbKindergartenCtg = new javax.swing.JCheckBox();
        jcbElementaryCtg = new javax.swing.JCheckBox();
        jcbJuniorHighCtg = new javax.swing.JCheckBox();
        jpnlCreateCredentialControls = new javax.swing.JPanel();
        jbtnClear = new javax.swing.JButton();
        jbtnCreateCredential = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jspCredentialsList = new javax.swing.JScrollPane();
        jlstCredentialNamesList = new javax.swing.JList<>();
        jpnlSortCredentialList = new javax.swing.JPanel();
        jlblYearCreated = new javax.swing.JLabel();
        jcmbYearCreated = new javax.swing.JComboBox<>();
        jpnlDeleteCredential = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jpnlCreateCredential.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Credential"));
        jpnlCreateCredential.setLayout(new java.awt.GridBagLayout());

        jlblCredentialName.setText("Credential Title");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jlblCredentialName, gridBagConstraints);

        jpnlCreateNewCredentialDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Credential Description"));
        jpnlCreateNewCredentialDescription.setLayout(new java.awt.GridBagLayout());

        jtaCredentialDescription.setColumns(20);
        jtaCredentialDescription.setRows(5);
        jspCredentialDescription.setViewportView(jtaCredentialDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateNewCredentialDescription.add(jspCredentialDescription, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jpnlCreateNewCredentialDescription, gridBagConstraints);

        jlblGradeLevel.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jlblGradeLevel, gridBagConstraints);

        jpnlGradeLevelSelection.setLayout(new java.awt.GridBagLayout());

        jcbKindergarten.setText("Kindergarten");
        jcbKindergarten.setEnabled(false);
        jpnlGradeLevelSelection.add(jcbKindergarten, new java.awt.GridBagConstraints());

        jcbGradeOne.setText("Grade 1");
        jcbGradeOne.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeOne, gridBagConstraints);

        jcbGradeTwo.setText("Grade 2");
        jcbGradeTwo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeTwo, gridBagConstraints);

        jcbGradeThree.setText("Grade 3");
        jcbGradeThree.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeThree, gridBagConstraints);

        jcbGradeFour.setText("Grade 4");
        jcbGradeFour.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeFour, gridBagConstraints);

        jcbGradeFive.setText("Grade 5");
        jcbGradeFive.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeFive, gridBagConstraints);

        jcbGradeSix.setText("Grade 6");
        jcbGradeSix.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeSix, gridBagConstraints);

        jcbGradeSeven.setText("Grade 7");
        jcbGradeSeven.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeSeven, gridBagConstraints);

        jcbGradeEight.setText("Grade 8");
        jcbGradeEight.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeEight, gridBagConstraints);

        jcbGradeNine.setText("Grade 9");
        jcbGradeNine.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeNine, gridBagConstraints);

        jcbGradeTen.setText("Grade 10");
        jcbGradeTen.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection.add(jcbGradeTen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jpnlGradeLevelSelection, gridBagConstraints);

        jcbKindergartenCtg.setText("Kindergarten");
        jcbKindergartenCtg.setEnabled(false);
        jcbKindergartenCtg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbKindergartenCtgItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jcbKindergartenCtg, gridBagConstraints);

        jcbElementaryCtg.setText("Elementary");
        jcbElementaryCtg.setEnabled(false);
        jcbElementaryCtg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbElementaryCtgItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jcbElementaryCtg, gridBagConstraints);

        jcbJuniorHighCtg.setText("Junior HS");
        jcbJuniorHighCtg.setEnabled(false);
        jcbJuniorHighCtg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbJuniorHighCtgItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jcbJuniorHighCtg, gridBagConstraints);

        jpnlCreateCredentialControls.setLayout(new java.awt.GridBagLayout());

        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredentialControls.add(jbtnClear, gridBagConstraints);

        jbtnCreateCredential.setText("Create");
        jbtnCreateCredential.setEnabled(false);
        jbtnCreateCredential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateCredentialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredentialControls.add(jbtnCreateCredential, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jpnlCreateCredentialControls, gridBagConstraints);

        jTextField1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateCredential.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jpnlCreateCredential, gridBagConstraints);

        jspCredentialsList.setBorder(javax.swing.BorderFactory.createTitledBorder("Credentials Created"));
        jspCredentialsList.setPreferredSize(new java.awt.Dimension(200, 250));
        jspCredentialsList.setViewportView(jlstCredentialNamesList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jspCredentialsList, gridBagConstraints);

        jpnlSortCredentialList.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort List"));
        jpnlSortCredentialList.setLayout(new java.awt.GridBagLayout());

        jlblYearCreated.setText("Year Created");
        jpnlSortCredentialList.add(jlblYearCreated, new java.awt.GridBagConstraints());

        jcmbYearCreated.setModel(new SchoolYearML().getAllSchoolYearStart());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSortCredentialList.add(jcmbYearCreated, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jpnlSortCredentialList, gridBagConstraints);

        jpnlDeleteCredential.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnlDeleteCredential.add(jButton1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jpnlDeleteCredential, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void resetCreateCredentialFormPanel(){
        JPanelGUIUtil.clearAllJPanelCheckBox(jpnlGradeLevelSelection);
        JPanelGUIUtil.disableAllJCheckBox(jpnlGradeLevelSelection);
        jTextField1.setText("");
        jtaCredentialDescription.setText(null);
    }
    
    private List<GradeLevel> getGradeLevelsSelected() {
        List<GradeLevel> gradeLevelList = new ArrayList<>();
        List<Integer> levelsList = new ArrayList<>();
        Component[] comp = jpnlGradeLevelSelection.getComponents();
        for (Component c : comp) {
            if (c instanceof JCheckBox) {
                if (((JCheckBox) c).isSelected() && !((JCheckBox) c).getText().equals("Kindergarten")) {
                    String glStr = ((JCheckBox) c).getText().replaceAll("[^-?0-9]+", " "); //takes out all numeric from string 
                    String gl = glStr.replaceAll("\\s+", ""); // removes all whitespace
                    if (!gl.isEmpty()) {
                        int glInt = Integer.parseInt(gl);
                        levelsList.add(glInt);
                    }
                } else if (((JCheckBox) c).isSelected() && ((JCheckBox) c).getText().equals("Kindergarten")) {
                    int gInt = 0;
                    levelsList.add(gInt);
                }
            }
        }
        for (int index = 0; index < levelsList.size(); index++) {
            GradeLevel gradeLevel = new GradeLevel();
            gradeLevel.setLevel(levelsList.get(index));
            int gradeLevelId = gradeLevelDaoImpl.getId(gradeLevel);
            gradeLevel.setId(gradeLevelId);
            gradeLevelList.add(gradeLevel);
            System.out.println("LevelId: " + gradeLevelId);
        }
        return gradeLevelList;
    }
    
    private void setCredentialJList(){
        jlstCredentialNamesList.setModel(credentialGUIUtil.getAllCredentialNames());
    }
    
    
    private void jbtnCreateCredentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateCredentialActionPerformed

        if (credentialDaoImpl.alreadyExists(jTextField1.getText().trim())) {
            String credentialName = jTextField1.getText().trim();
            JOptionPane.showMessageDialog(null,credentialName+" already exists on record.\nPlease try a different name");
        } else {
            int selected = JOptionPane.showConfirmDialog(null, "Add Credential?", "Add Confirmation", JOptionPane.YES_NO_OPTION);
            if (selected==JOptionPane.YES_OPTION) {
                String credentialDescription = jtaCredentialDescription.getText();
                String credentialName = jTextField1.getText().trim();

                SchoolYear yearCreated = new SchoolYear();
                yearCreated.setYearFrom(CalendarUtil.getCurrentYear());
                Credential credential = new Credential();
                credential.setCredentialName(credentialName);
                credential.setCredentialDescription(credentialDescription);
                credential.setGradeLevelsAssigned(getGradeLevelsSelected());
                credential.setSchoolYearCreated(yearCreated);

                boolean isSuccessfullyAdded = credentialDaoImpl.addCredential(credential);
                if (isSuccessfullyAdded) {
                    JOptionPane.showMessageDialog(null, "Successfully added " + credential.getCredentialName());
                    resetCreateCredentialFormPanel();
                    setCredentialJList();
                } else {
                    JOptionPane.showMessageDialog(null, "Adding of " + credential.getCredentialName()+ " failed.");
                }
            }
        }
    }//GEN-LAST:event_jbtnCreateCredentialActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        resetCreateCredentialFormPanel();
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jcbJuniorHighCtgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbJuniorHighCtgItemStateChanged
        if(jcbJuniorHighCtg.isSelected()){
            jcbGradeSeven.setSelected(true);
            jcbGradeEight.setSelected(true);
            jcbGradeNine.setSelected(true);
            jcbGradeTen.setSelected(true);
        }else if(!jcbJuniorHighCtg.isSelected()){
            jcbGradeSeven.setSelected(false);
            jcbGradeEight.setSelected(false);
            jcbGradeNine.setSelected(false);
            jcbGradeTen.setSelected(false);
        }
    }//GEN-LAST:event_jcbJuniorHighCtgItemStateChanged

    private void jcbElementaryCtgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbElementaryCtgItemStateChanged
        if(jcbElementaryCtg.isSelected()){
            jcbGradeOne.setSelected(true);
            jcbGradeTwo.setSelected(true);
            jcbGradeThree.setSelected(true);
            jcbGradeFour.setSelected(true);
            jcbGradeFive.setSelected(true);
            jcbGradeSix.setSelected(true);
        }else if(!jcbElementaryCtg.isSelected()){
            jcbGradeOne.setSelected(false);
            jcbGradeTwo.setSelected(false);
            jcbGradeThree.setSelected(false);
            jcbGradeFour.setSelected(false);
            jcbGradeFive.setSelected(false);
            jcbGradeSix.setSelected(false);
        }
    }//GEN-LAST:event_jcbElementaryCtgItemStateChanged

    private void jcbKindergartenCtgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbKindergartenCtgItemStateChanged
        if(jcbKindergartenCtg.isSelected()){
            JPanelGUIUtil.clearAllJPanelCheckBox(jpnlGradeLevelSelection);
            jcbKindergarten.setSelected(true);
        }else{
            jcbKindergarten.setSelected(false);
        }
    }//GEN-LAST:event_jcbKindergartenCtgItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Hellow Jordan");
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCreateCredential;
    private javax.swing.JCheckBox jcbElementaryCtg;
    private javax.swing.JCheckBox jcbGradeEight;
    private javax.swing.JCheckBox jcbGradeFive;
    private javax.swing.JCheckBox jcbGradeFour;
    private javax.swing.JCheckBox jcbGradeNine;
    private javax.swing.JCheckBox jcbGradeOne;
    private javax.swing.JCheckBox jcbGradeSeven;
    private javax.swing.JCheckBox jcbGradeSix;
    private javax.swing.JCheckBox jcbGradeTen;
    private javax.swing.JCheckBox jcbGradeThree;
    private javax.swing.JCheckBox jcbGradeTwo;
    private javax.swing.JCheckBox jcbJuniorHighCtg;
    private javax.swing.JCheckBox jcbKindergarten;
    private javax.swing.JCheckBox jcbKindergartenCtg;
    private javax.swing.JComboBox<String> jcmbYearCreated;
    private javax.swing.JLabel jlblCredentialName;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblYearCreated;
    private javax.swing.JList<String> jlstCredentialNamesList;
    private javax.swing.JPanel jpnlCreateCredential;
    private javax.swing.JPanel jpnlCreateCredentialControls;
    private javax.swing.JPanel jpnlCreateNewCredentialDescription;
    private javax.swing.JPanel jpnlDeleteCredential;
    private javax.swing.JPanel jpnlGradeLevelSelection;
    private javax.swing.JPanel jpnlSortCredentialList;
    private javax.swing.JScrollPane jspCredentialDescription;
    private javax.swing.JScrollPane jspCredentialsList;
    private javax.swing.JTextArea jtaCredentialDescription;
    // End of variables declaration//GEN-END:variables
}
