/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import calendar_utility.CalendarUtil;
import daoimpl.AdmissionDaoImpl;
import java.awt.Color;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import daoimpl.RegistrationDaoImpl;
import component_model_loader.GradeLevelML;
import component_model_loader.SchoolYearML;
import java.util.Arrays;
import model.Registration;
import component_renderers.JComboBoxRenderer_GradeLevel;

public class UpdateRegistrationDetailsGUI extends javax.swing.JDialog {

    private final GradeLevelML gradeLevelGUIUtil = new GradeLevelML();
    private final SchoolYearML schoolYearGUIUtil = new SchoolYearML();
    GUIManager guiManager = new GUIManager();
    int aRegistrationId;
        
    public UpdateRegistrationDetailsGUI(int aRegistrationId) {
        super(null, ModalityType.APPLICATION_MODAL);
        guiManager.setInitialGUIState();
        initComponents();
        this.aRegistrationId = aRegistrationId;
        guiManager.setGUIComponentsModel();
        guiManager.setGUIComponentsRenderer();
        guiManager.setFormDetails(this.aRegistrationId);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        studentTypeButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnCamera = new javax.swing.JButton();
        jbtnAddImage = new javax.swing.JButton();
        credentialsJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        studentInfoJPanel = new javax.swing.JPanel();
        jlblLastName = new javax.swing.JLabel();
        jlblFirstName = new javax.swing.JLabel();
        jlblMiddleName = new javax.swing.JLabel();
        jlblGender = new javax.swing.JLabel();
        jlblReligion = new javax.swing.JLabel();
        jlblNationality = new javax.swing.JLabel();
        jlblDob = new javax.swing.JLabel();
        jlblAge = new javax.swing.JLabel();
        jlblPob = new javax.swing.JLabel();
        jtfLastName = new javax.swing.JTextField();
        jtfFirstName = new javax.swing.JTextField();
        jtfMiddleName = new javax.swing.JTextField();
        jtfReligion = new javax.swing.JTextField();
        jtfNationality = new javax.swing.JTextField();
        jtfAge = new javax.swing.JTextField();
        jtfPob = new javax.swing.JTextField();
        jcmbGender = new javax.swing.JComboBox<>();
        jcmbDobDay = new javax.swing.JComboBox<>();
        jcmbDobMonth = new javax.swing.JComboBox<>();
        jcmbDobYear = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jpnlAdmissionStatus = new javax.swing.JPanel();
        jcmbAdmissionStatus = new javax.swing.JComboBox<>();
        jbtnCompleteAdmission = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentTypeJPanel = new javax.swing.JPanel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        gradeLevelJLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcmbSchoolYearFrom = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcmbSchoolYearTo = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jcbTransfereeStudent = new javax.swing.JCheckBox();
        jcbNewStudent = new javax.swing.JCheckBox();
        homeAddressJPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtfRoomOfHouseNo = new javax.swing.JTextField();
        jtfStreet = new javax.swing.JTextField();
        jtfBrgySubd = new javax.swing.JTextField();
        jtfCity = new javax.swing.JTextField();
        jtfProvince = new javax.swing.JTextField();
        parentsJPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        fatherJlbl = new javax.swing.JLabel();
        fatherOccupationJlbl = new javax.swing.JLabel();
        fatherMobileJlbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fatherLastNameJlbl = new javax.swing.JLabel();
        fatherFirstNameJlbl = new javax.swing.JLabel();
        jlblFatherMiddleName = new javax.swing.JLabel();
        jtfFatherLastName = new javax.swing.JTextField();
        jtfFatherFirstName = new javax.swing.JTextField();
        jtfFatherMiddleName = new javax.swing.JTextField();
        jtfFatherOccupation = new javax.swing.JTextField();
        jtfFatherOfficePhoneNo = new javax.swing.JTextField();
        jtfFatherMobileNo = new javax.swing.JTextField();
        jcbFatherContactInCaseOfEmergency = new javax.swing.JCheckBox();
        jlblMother = new javax.swing.JLabel();
        jtfMotherLastName = new javax.swing.JTextField();
        jtfMotherFirstName = new javax.swing.JTextField();
        jtfMotherMiddleName = new javax.swing.JTextField();
        jlblMotherOccupation = new javax.swing.JLabel();
        jtfMotherOccupation = new javax.swing.JTextField();
        jlblMotherLastName = new javax.swing.JLabel();
        jlblMotherFirstName = new javax.swing.JLabel();
        jlblMotherMiddleName = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtfMotherOfficePhoneNo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtfMotherMobileNo = new javax.swing.JTextField();
        jcbMotherContactInCaseOfEmergency = new javax.swing.JCheckBox();
        guardianJPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jtfGuardianLastName = new javax.swing.JTextField();
        jtfGuardianFirstName = new javax.swing.JTextField();
        jtfGuardianMiddleName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jtfGuardianOccupation = new javax.swing.JTextField();
        jcbGuardianContactInCaseOfEmergency = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jtfGuardianOfficePhone = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jtfGuardianMobileNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jtfGuardianRelationshipToStudent = new javax.swing.JTextField();
        schoolLastAttendedJPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jtfSchoolLastAttended = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jtfSchoolLastAttendedAddress = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jbtnUpdateRegistration = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration Information");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jbtnCamera.setText("Camera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jbtnCamera, gridBagConstraints);

        jbtnAddImage.setText("Add Image");
        jPanel5.add(jbtnAddImage, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel2, gridBagConstraints);

        credentialsJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        credentialsJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Credential Requirements");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        credentialsJPanel.add(jLabel1, gridBagConstraints);

        jScrollPane2.setViewportView(jList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        credentialsJPanel.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(credentialsJPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        studentInfoJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentInfoJPanel.setLayout(new java.awt.GridBagLayout());

        jlblLastName.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblLastName, gridBagConstraints);

        jlblFirstName.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblFirstName, gridBagConstraints);

        jlblMiddleName.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblMiddleName, gridBagConstraints);

        jlblGender.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblGender, gridBagConstraints);

        jlblReligion.setText("Religion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblReligion, gridBagConstraints);

        jlblNationality.setText("Nationality");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblNationality, gridBagConstraints);

        jlblDob.setText("Date of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblDob, gridBagConstraints);

        jlblAge.setText("Age");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblAge, gridBagConstraints);

        jlblPob.setText("Place of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jlblPob, gridBagConstraints);

        jtfLastName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfLastName, gridBagConstraints);

        jtfFirstName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfFirstName, gridBagConstraints);

        jtfMiddleName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfMiddleName, gridBagConstraints);

        jtfReligion.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfReligion, gridBagConstraints);

        jtfNationality.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfNationality, gridBagConstraints);

        jtfAge.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfAge, gridBagConstraints);

        jtfPob.setColumns(10);
        jtfPob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPobActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jtfPob, gridBagConstraints);

        jcmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcmbGender.setSelectedIndex(-1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jcmbGender, gridBagConstraints);

        jcmbDobDay.setEnabled(false);
        jcmbDobDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbDobDayItemStateChanged(evt);
            }
        });
        jcmbDobDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDobDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jcmbDobDay, gridBagConstraints);

        jcmbDobMonth.setEnabled(false);
        jcmbDobMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbDobMonthItemStateChanged(evt);
            }
        });
        jcmbDobMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDobMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jcmbDobMonth, gridBagConstraints);

        jcmbDobYear.setEnabled(false);
        jcmbDobYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbDobYearItemStateChanged(evt);
            }
        });
        jcmbDobYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDobYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        studentInfoJPanel.add(jcmbDobYear, gridBagConstraints);

        jLabel34.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel34, gridBagConstraints);

        jLabel35.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel35, gridBagConstraints);

        jLabel36.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel36, gridBagConstraints);

        jLabel37.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel37, gridBagConstraints);

        jLabel38.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel38, gridBagConstraints);

        jLabel39.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel39, gridBagConstraints);

        jLabel40.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel40, gridBagConstraints);

        jLabel41.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        studentInfoJPanel.add(jLabel41, gridBagConstraints);

        jpnlAdmissionStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Admission "));
        jpnlAdmissionStatus.setLayout(new java.awt.GridBagLayout());

        jcmbAdmissionStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "Pending" }));
        jcmbAdmissionStatus.setSelectedIndex(-1);
        jcmbAdmissionStatus.setEnabled(false);
        jcmbAdmissionStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbAdmissionStatusItemStateChanged(evt);
            }
        });
        jcmbAdmissionStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbAdmissionStatusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlAdmissionStatus.add(jcmbAdmissionStatus, gridBagConstraints);

        jbtnCompleteAdmission.setText("Complete Admission");
        jbtnCompleteAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCompleteAdmissionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlAdmissionStatus.add(jbtnCompleteAdmission, gridBagConstraints);

        jLabel2.setText("Admission Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlAdmissionStatus.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentInfoJPanel.add(jpnlAdmissionStatus, gridBagConstraints);

        jLabel3.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        studentInfoJPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        studentInfoJPanel.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        studentInfoJPanel.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(studentInfoJPanel, gridBagConstraints);

        studentTypeJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentTypeJPanel.setLayout(new java.awt.GridBagLayout());

        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jcmbGradeLevel, gridBagConstraints);

        gradeLevelJLbl.setText("* For Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(gradeLevelJLbl, gridBagConstraints);

        jLabel12.setText(" * School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jLabel12, gridBagConstraints);

        jcmbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearFromItemStateChanged(evt);
            }
        });
        jcmbSchoolYearFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearFromActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jcmbSchoolYearFrom, gridBagConstraints);

        jLabel13.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jLabel13, gridBagConstraints);

        jcmbSchoolYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jcmbSchoolYearTo, gridBagConstraints);

        jLabel45.setText("* Student Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jLabel45, gridBagConstraints);

        studentTypeButtonGroup.add(jcbTransfereeStudent);
        jcbTransfereeStudent.setText("Transferee");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jcbTransfereeStudent, gridBagConstraints);

        studentTypeButtonGroup.add(jcbNewStudent);
        jcbNewStudent.setText("New");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentTypeJPanel.add(jcbNewStudent, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(studentTypeJPanel, gridBagConstraints);

        homeAddressJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        homeAddressJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel14.setText("Home Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel14, gridBagConstraints);

        jLabel15.setText("Room / House #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel15, gridBagConstraints);

        jLabel16.setText("Street");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel16, gridBagConstraints);

        jLabel17.setText("Brgy./Subd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel17, gridBagConstraints);

        jLabel18.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel18, gridBagConstraints);

        jLabel19.setText("Province");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jLabel19, gridBagConstraints);

        jtfRoomOfHouseNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jtfRoomOfHouseNo, gridBagConstraints);

        jtfStreet.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jtfStreet, gridBagConstraints);

        jtfBrgySubd.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jtfBrgySubd, gridBagConstraints);

        jtfCity.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jtfCity, gridBagConstraints);

        jtfProvince.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        homeAddressJPanel.add(jtfProvince, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(homeAddressJPanel, gridBagConstraints);

        parentsJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parentsJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel21.setText("Parents / Guardian Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jLabel21, gridBagConstraints);

        fatherJlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fatherJlbl.setText("Father");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(fatherJlbl, gridBagConstraints);

        fatherOccupationJlbl.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(fatherOccupationJlbl, gridBagConstraints);

        fatherMobileJlbl.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(fatherMobileJlbl, gridBagConstraints);

        jLabel25.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jLabel25, gridBagConstraints);

        fatherLastNameJlbl.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(fatherLastNameJlbl, gridBagConstraints);

        fatherFirstNameJlbl.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(fatherFirstNameJlbl, gridBagConstraints);

        jlblFatherMiddleName.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblFatherMiddleName, gridBagConstraints);

        jtfFatherLastName.setColumns(10);
        jtfFatherLastName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherLastName, gridBagConstraints);

        jtfFatherFirstName.setColumns(10);
        jtfFatherFirstName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherFirstName, gridBagConstraints);

        jtfFatherMiddleName.setColumns(10);
        jtfFatherMiddleName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherMiddleName, gridBagConstraints);

        jtfFatherOccupation.setColumns(12);
        jtfFatherOccupation.setMinimumSize(new java.awt.Dimension(86, 20));
        jtfFatherOccupation.setPreferredSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherOccupation, gridBagConstraints);

        jtfFatherOfficePhoneNo.setColumns(10);
        jtfFatherOfficePhoneNo.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherOfficePhoneNo, gridBagConstraints);

        jtfFatherMobileNo.setColumns(10);
        jtfFatherMobileNo.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfFatherMobileNo, gridBagConstraints);

        jcbFatherContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jcbFatherContactInCaseOfEmergency, gridBagConstraints);

        jlblMother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblMother.setText("Mother");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblMother, gridBagConstraints);

        jtfMotherLastName.setColumns(10);
        jtfMotherLastName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherLastName, gridBagConstraints);

        jtfMotherFirstName.setColumns(10);
        jtfMotherFirstName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherFirstName, gridBagConstraints);

        jtfMotherMiddleName.setColumns(10);
        jtfMotherMiddleName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherMiddleName, gridBagConstraints);

        jlblMotherOccupation.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblMotherOccupation, gridBagConstraints);

        jtfMotherOccupation.setColumns(10);
        jtfMotherOccupation.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherOccupation, gridBagConstraints);

        jlblMotherLastName.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblMotherLastName, gridBagConstraints);

        jlblMotherFirstName.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblMotherFirstName, gridBagConstraints);

        jlblMotherMiddleName.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jlblMotherMiddleName, gridBagConstraints);

        jLabel26.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jLabel26, gridBagConstraints);

        jtfMotherOfficePhoneNo.setColumns(10);
        jtfMotherOfficePhoneNo.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherOfficePhoneNo, gridBagConstraints);

        jLabel27.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jLabel27, gridBagConstraints);

        jtfMotherMobileNo.setColumns(10);
        jtfMotherMobileNo.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jtfMotherMobileNo, gridBagConstraints);

        jcbMotherContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        parentsJPanel.add(jcbMotherContactInCaseOfEmergency, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(parentsJPanel, gridBagConstraints);

        guardianJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardianJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Guardian");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel22, gridBagConstraints);

        jtfGuardianLastName.setColumns(10);
        jtfGuardianLastName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianLastName, gridBagConstraints);

        jtfGuardianFirstName.setColumns(10);
        jtfGuardianFirstName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianFirstName, gridBagConstraints);

        jtfGuardianMiddleName.setColumns(10);
        jtfGuardianMiddleName.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianMiddleName, gridBagConstraints);

        jLabel23.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel23, gridBagConstraints);

        jtfGuardianOccupation.setColumns(10);
        jtfGuardianOccupation.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianOccupation, gridBagConstraints);

        jcbGuardianContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jcbGuardianContactInCaseOfEmergency, gridBagConstraints);

        jLabel24.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel24, gridBagConstraints);

        jLabel29.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel29, gridBagConstraints);

        jLabel30.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel30, gridBagConstraints);

        jLabel31.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel31, gridBagConstraints);

        jtfGuardianOfficePhone.setColumns(10);
        jtfGuardianOfficePhone.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianOfficePhone, gridBagConstraints);

        jLabel32.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel32, gridBagConstraints);

        jtfGuardianMobileNo.setColumns(10);
        jtfGuardianMobileNo.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianMobileNo, gridBagConstraints);

        jLabel33.setText("Relationship");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jLabel33, gridBagConstraints);

        jtfGuardianRelationshipToStudent.setColumns(10);
        jtfGuardianRelationshipToStudent.setMinimumSize(new java.awt.Dimension(86, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        guardianJPanel.add(jtfGuardianRelationshipToStudent, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(guardianJPanel, gridBagConstraints);

        schoolLastAttendedJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        schoolLastAttendedJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel42.setText("School Last Attended");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolLastAttendedJPanel.add(jLabel42, gridBagConstraints);

        jtfSchoolLastAttended.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolLastAttendedJPanel.add(jtfSchoolLastAttended, gridBagConstraints);

        jLabel43.setText("School Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolLastAttendedJPanel.add(jLabel43, gridBagConstraints);

        jLabel44.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolLastAttendedJPanel.add(jLabel44, gridBagConstraints);

        jtfSchoolLastAttendedAddress.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        schoolLastAttendedJPanel.add(jtfSchoolLastAttendedAddress, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(schoolLastAttendedJPanel, gridBagConstraints);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jbtnUpdateRegistration.setText("Save");
        jPanel14.add(jbtnUpdateRegistration, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(jPanel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jPanel6, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class GUIManager {

        private void setInitialGUIState() {
            UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
            UIManager.put("ComboBox.disabledForeground", Color.BLACK);
            UIManager.put("TextField.disabledBackground", new Color(255, 255, 255));
            UIManager.put("TextField.inactiveForeground", Color.BLACK);
        }
        
        private void setGUIComponentsModel() {
            setDayModel();
            setMonthModel();
            setYearModel();
            jcmbSchoolYearFrom.setModel(schoolYearGUIUtil.getAllSchoolYearStart());
            jcmbSchoolYearTo.setModel(schoolYearGUIUtil.getAllSchoolYearEnd());
            jcmbGradeLevel.setModel(gradeLevelGUIUtil.getAllGradeLevels());
        }
        
        private void setGUIComponentsRenderer(){
            jcmbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        }
        
        private void setFormDetails(Integer aRegistrationId) {
            RegistrationDaoImpl rdi = new RegistrationDaoImpl();
            Registration registration = rdi.getRegistrationInfoById(aRegistrationId);

            jcmbGradeLevel.setSelectedItem(registration.getGradeLevel());
            
            int schoolYearFrom = registration.getSchoolYear().getYearFrom();
            jcmbSchoolYearFrom.setSelectedItem(schoolYearFrom);
            int schoolYearTo = registration.getSchoolYear().getYearTo();
            jcmbSchoolYearTo.setSelectedItem(schoolYearTo);

            String[] dob = registration.getDateOfBirth().split("-");
            int[] dobInt = Arrays.asList(dob).stream().mapToInt(Integer::parseInt).toArray();
            //dobInt[0] is year
            //dobInt[1] is month
            //dobInt[2] is day
            
            jcmbDobYear.setSelectedItem(dobInt[0]);
            jcmbDobMonth.setSelectedItem(dobInt[1]);
            jcmbDobDay.setSelectedItem(dobInt[2]);
            int age = getAge(dobInt[0],dobInt[1],dobInt[2]);
            jtfAge.setText(age+"");

            jtfRoomOfHouseNo.setText(registration.getAddressRoomOrHouseNo());
            jtfStreet.setText(registration.getAddressStreet());
            jtfBrgySubd.setText(registration.getAddressBrgyOrSubd());
            jtfCity.setText(registration.getAddressCity());
            jtfProvince.setText(registration.getProvince());
            jtfLastName.setText(registration.getLastName());
            jtfFirstName.setText(registration.getFirstName());
            jtfMiddleName.setText(registration.getMiddleName());
            jcmbGender.setSelectedItem(registration.getGender());
            jtfReligion.setText(registration.getReligion());
            jtfNationality.setText(registration.getNationality());
            jtfPob.setText(registration.getPlaceOfBirth());
            jtfFatherLastName.setText(registration.getFatherLastName());
            jtfFatherFirstName.setText(registration.getFatherFirstName());
            jtfFatherMiddleName.setText(registration.getFatherMiddleName());
            jtfFatherOccupation.setText(registration.getFatherOccupation());
            jtfFatherOfficePhoneNo.setText(registration.getFatherOfficePhoneNo());
            jtfFatherMobileNo.setText(registration.getFatherMobileNo());
            jcbFatherContactInCaseOfEmergency.setSelected(registration.getIsFatherContactInCaseEmergency());
            jtfMotherLastName.setText(registration.getMotherLastName());
            jtfMotherFirstName.setText(registration.getMotherFirstName());
            jtfMotherMiddleName.setText(registration.getMotherMiddleName());
            jtfMotherOccupation.setText(registration.getMotherOccupation());
            jtfMotherOfficePhoneNo.setText(registration.getMotherOfficePhoneNo());
            jtfMotherMobileNo.setText(registration.getMotherMobileNo());
            jcbMotherContactInCaseOfEmergency.setSelected(registration.getIsMotherContactInCaseEmergency());
            jtfGuardianLastName.setText(registration.getGuardianLastName());
            jtfGuardianFirstName.setText(registration.getGuardianFirstName());
            jtfGuardianMiddleName.setText(registration.getGuardianMiddleName());
            jtfGuardianOfficePhone.setText(registration.getGuardianOfficePhoneNo());
            jtfGuardianOccupation.setText(registration.getGuardianOccupation());
            jtfGuardianMobileNo.setText(registration.getGuardianMobileNo());
            jtfGuardianRelationshipToStudent.setText(registration.getGuardianRelationToStudent());
            jcbGuardianContactInCaseOfEmergency.setSelected(registration.getIsGuardianContactInCaseEmergency());
            jtfSchoolLastAttended.setText(registration.getSchoolLastAttended());
            jtfSchoolLastAttendedAddress.setText(registration.getSchoolLastAttendedAddress());

            jcmbAdmissionStatus.setSelectedItem(registration.getIsAdmissionComplete() == true ? "Completed" : "Pending");
            jcbNewStudent.setSelected("New".equals(registration.getRegisteredStudentType()));
            jcbTransfereeStudent.setSelected("Transferee".equals(registration.getRegisteredStudentType()));
        }
    }
    
    private void setDayModel() {
        DefaultComboBoxModel days = new DefaultComboBoxModel();
        for(int i=1; i<=31; i++){
            days.addElement(i);
        }
        jcmbDobDay.setModel((ComboBoxModel) days);
    }

    private void setMonthModel() {
        DefaultComboBoxModel months = new DefaultComboBoxModel();
        for(int i=1; i<=12; i++){
            months.addElement(i);
        }
        jcmbDobMonth.setModel(months);
    }

    private void setYearModel() {
        DefaultComboBoxModel years = new DefaultComboBoxModel();
        for (int i = 1960; i <= CalendarUtil.getCurrentYear(); i++) {
            years.addElement(i);
        }
        jcmbDobYear.setModel(years);
    }

    private void jcmbDobDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDobDayActionPerformed
        int daySelectedIndex = jcmbDobDay.getSelectedIndex();
        if (daySelectedIndex > -1) {
            jcmbDobMonth.setEnabled(true);
        }
    }//GEN-LAST:event_jcmbDobDayActionPerformed

    private void jcmbDobMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDobMonthActionPerformed
        int monthSelectedIndex = jcmbDobMonth.getSelectedIndex();
        if (monthSelectedIndex > -1) {
            jcmbDobYear.setEnabled(true);
        }
    }//GEN-LAST:event_jcmbDobMonthActionPerformed

    private int getAge(int aYear, int aMonth, int aDay){
        int age = CalendarUtil.getAgeByBirthday(aYear, aMonth, aDay);
        return age;
    }
    
    private void jcmbDobYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbDobYearItemStateChanged
        if((jcmbDobYear.getSelectedIndex()>-1)&&
           (jcmbDobMonth.getSelectedIndex()>-1)&&
           (jcmbDobDay.getSelectedIndex()>-1) ){
           int year;
           int month;
           int day;
           int age;
           year = Integer.parseInt(jcmbDobYear.getSelectedItem().toString());
           month = Integer.parseInt(jcmbDobMonth.getSelectedItem().toString());
           day = Integer.parseInt(jcmbDobDay.getSelectedItem().toString());
           age = CalendarUtil.getAgeByBirthday(year, month, day);
           jtfAge.setText(""+age);
           //JOptionPane.showMessageDialog(null,age);
           int[] daysOfMonth = CalendarUtil.getDaysOfMonth(month, year);
           DefaultComboBoxModel daysModel = (DefaultComboBoxModel) jcmbDobDay.getModel();
           daysModel.removeAllElements();
           for(int x: daysOfMonth){
               daysModel.addElement(x);
           }
           jcmbDobDay.setModel(daysModel);
        }
    }//GEN-LAST:event_jcmbDobYearItemStateChanged

    private void jcmbDobYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDobYearActionPerformed

    }//GEN-LAST:event_jcmbDobYearActionPerformed

    private void jcmbSchoolYearFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearFromActionPerformed
        int selectedYearFrom = jcmbSchoolYearFrom.getSelectedIndex();
        jcmbSchoolYearTo.setSelectedIndex(selectedYearFrom);
    }//GEN-LAST:event_jcmbSchoolYearFromActionPerformed

    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void jcmbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearFromItemStateChanged
        // TODO add your handling code here:
        
        if(jcmbSchoolYearFrom.getSelectedIndex()>-1){
//        JOptionPane.showMessageDialog(null, jcmbSchoolYearFrom.getSelectedItem());
        }
    }//GEN-LAST:event_jcmbSchoolYearFromItemStateChanged

    private void jcmbDobMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbDobMonthItemStateChanged
        if((jcmbDobYear.getSelectedIndex()>-1)&&
           (jcmbDobMonth.getSelectedIndex()>-1)&&
           (jcmbDobDay.getSelectedIndex()>-1) ){
           int year;
           int month;
           int day;
           int age;
           year = Integer.parseInt(jcmbDobYear.getSelectedItem().toString());
           month = Integer.parseInt(jcmbDobMonth.getSelectedItem().toString());
           day = Integer.parseInt(jcmbDobDay.getSelectedItem().toString());
           age = CalendarUtil.getAgeByBirthday(year, month, day);
           jtfAge.setText(""+age);
           //JOptionPane.showMessageDialog(null,age);
           int[] daysOfMonth = CalendarUtil.getDaysOfMonth(month, year);
           DefaultComboBoxModel daysModel = (DefaultComboBoxModel) jcmbDobDay.getModel();
           daysModel.removeAllElements();
           for(int x: daysOfMonth){
               daysModel.addElement(x);
           }
           jcmbDobDay.setModel(daysModel);
        }
    }//GEN-LAST:event_jcmbDobMonthItemStateChanged

    private void jcmbDobDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbDobDayItemStateChanged
        if((jcmbDobYear.getSelectedIndex()>-1)&&
           (jcmbDobMonth.getSelectedIndex()>-1)&&
           (jcmbDobDay.getSelectedIndex()>-1) ){
           int year;
           int month;
           int day;
           int age;
           year = Integer.parseInt(jcmbDobYear.getSelectedItem().toString());
           month = Integer.parseInt(jcmbDobMonth.getSelectedItem().toString());
           day = Integer.parseInt(jcmbDobDay.getSelectedItem().toString());
           age = CalendarUtil.getAgeByBirthday(year, month, day);
           jtfAge.setText(""+age);
        }
    }//GEN-LAST:event_jcmbDobDayItemStateChanged

    private void jcmbAdmissionStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbAdmissionStatusItemStateChanged
        
        if (jcmbAdmissionStatus.getSelectedIndex()>-1) {
            if (jcmbAdmissionStatus.getSelectedItem().toString().equals("Completed")) {
                jbtnCompleteAdmission.setEnabled(false);
            } else {
                jbtnCompleteAdmission.setEnabled(true);
            }
        }
        
    }//GEN-LAST:event_jcmbAdmissionStatusItemStateChanged

    private void jcmbAdmissionStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbAdmissionStatusActionPerformed
        
    }//GEN-LAST:event_jcmbAdmissionStatusActionPerformed

    private void jbtnCompleteAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCompleteAdmissionActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Complete Admission?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            AdmissionDaoImpl adi = new AdmissionDaoImpl();
            boolean isSuccessful = adi.completeAdmission(aRegistrationId);
            if (isSuccessful) {
                JOptionPane.showMessageDialog(null, "Student Officially Admitted.");
                jcmbAdmissionStatus.setSelectedItem("Completed");
                jcmbAdmissionStatus.setEnabled(false);
                EnrollmentPanel.loadAllStudentsToJTable();
                EnrollmentPanel.loadRegisteredApplicantsToJTable();
            } else {
                JOptionPane.showMessageDialog(null, "Error encountered while completing admission.");
            }
        }
    }//GEN-LAST:event_jbtnCompleteAdmissionActionPerformed

    private void jtfPobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPobActionPerformed
    }//GEN-LAST:event_jtfPobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel credentialsJPanel;
    private javax.swing.JLabel fatherFirstNameJlbl;
    private javax.swing.JLabel fatherJlbl;
    private javax.swing.JLabel fatherLastNameJlbl;
    private javax.swing.JLabel fatherMobileJlbl;
    private javax.swing.JLabel fatherOccupationJlbl;
    private javax.swing.JLabel gradeLevelJLbl;
    private javax.swing.JPanel guardianJPanel;
    private javax.swing.JPanel homeAddressJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAddImage;
    private javax.swing.JButton jbtnCamera;
    private javax.swing.JButton jbtnCompleteAdmission;
    private javax.swing.JButton jbtnUpdateRegistration;
    private javax.swing.JCheckBox jcbFatherContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbGuardianContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbMotherContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbNewStudent;
    private javax.swing.JCheckBox jcbTransfereeStudent;
    private javax.swing.JComboBox<String> jcmbAdmissionStatus;
    private javax.swing.JComboBox<String> jcmbDobDay;
    private javax.swing.JComboBox<String> jcmbDobMonth;
    private javax.swing.JComboBox<String> jcmbDobYear;
    private javax.swing.JComboBox<String> jcmbGender;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    private javax.swing.JComboBox<String> jcmbSchoolYearFrom;
    private javax.swing.JComboBox<String> jcmbSchoolYearTo;
    private javax.swing.JLabel jlblAge;
    private javax.swing.JLabel jlblDob;
    private javax.swing.JLabel jlblFatherMiddleName;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblMiddleName;
    private javax.swing.JLabel jlblMother;
    private javax.swing.JLabel jlblMotherFirstName;
    private javax.swing.JLabel jlblMotherLastName;
    private javax.swing.JLabel jlblMotherMiddleName;
    private javax.swing.JLabel jlblMotherOccupation;
    private javax.swing.JLabel jlblNationality;
    private javax.swing.JLabel jlblPob;
    private javax.swing.JLabel jlblReligion;
    private javax.swing.JPanel jpnlAdmissionStatus;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfBrgySubd;
    private javax.swing.JTextField jtfCity;
    private javax.swing.JTextField jtfFatherFirstName;
    private javax.swing.JTextField jtfFatherLastName;
    private javax.swing.JTextField jtfFatherMiddleName;
    private javax.swing.JTextField jtfFatherMobileNo;
    private javax.swing.JTextField jtfFatherOccupation;
    private javax.swing.JTextField jtfFatherOfficePhoneNo;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfGuardianFirstName;
    private javax.swing.JTextField jtfGuardianLastName;
    private javax.swing.JTextField jtfGuardianMiddleName;
    private javax.swing.JTextField jtfGuardianMobileNo;
    private javax.swing.JTextField jtfGuardianOccupation;
    private javax.swing.JTextField jtfGuardianOfficePhone;
    private javax.swing.JTextField jtfGuardianRelationshipToStudent;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfMiddleName;
    private javax.swing.JTextField jtfMotherFirstName;
    private javax.swing.JTextField jtfMotherLastName;
    private javax.swing.JTextField jtfMotherMiddleName;
    private javax.swing.JTextField jtfMotherMobileNo;
    private javax.swing.JTextField jtfMotherOccupation;
    private javax.swing.JTextField jtfMotherOfficePhoneNo;
    private javax.swing.JTextField jtfNationality;
    private javax.swing.JTextField jtfPob;
    private javax.swing.JTextField jtfProvince;
    private javax.swing.JTextField jtfReligion;
    private javax.swing.JTextField jtfRoomOfHouseNo;
    private javax.swing.JTextField jtfSchoolLastAttended;
    private javax.swing.JTextField jtfSchoolLastAttendedAddress;
    private javax.swing.JTextField jtfStreet;
    private javax.swing.JPanel parentsJPanel;
    private javax.swing.JPanel schoolLastAttendedJPanel;
    private javax.swing.JPanel studentInfoJPanel;
    private javax.swing.ButtonGroup studentTypeButtonGroup;
    private javax.swing.JPanel studentTypeJPanel;
    // End of variables declaration//GEN-END:variables
}
