
package view;

import daoimpl.CredentialDaoImpl;
import org.joda.time.*;
import daoimpl.GradeLevelDaoImpl;
import java.awt.Color;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import component_model_loader.JPanelGUIUtil;
import daoimpl.PaymentTermDaoImpl;
import daoimpl.RegistrationDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import layout_utility.CardLayoutUtil;
import component_model_loader.CredentialML;
import component_model_loader.GradeLevelML;
import component_model_loader.NavigationImpl;
import component_model_loader.SchoolYearML;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import model.GradeLevel;
import model.PaymentTerm;
import model.Registration;
import model.SchoolYear;
import component_renderers.JComboBoxRenderer_GradeLevel;
import component_renderers.JComboBoxRenderer_Master;

/**
 *
 * @author Acer
 */
public class RegistrationForm extends javax.swing.JPanel {
    //HAS-A
    private final SchoolYearML schoolYearGUIUtil = new SchoolYearML();
    private final GradeLevelML gradeLevelGUIUtil = new GradeLevelML();
    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private final CredentialDaoImpl credentialDaoImpl = new CredentialDaoImpl();
    private final CredentialML credentialGUIUtil = new CredentialML();
    private final NavigationImpl navigation = new NavigationImpl();
    
    public RegistrationForm() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        UIManager.put("TextField.disabledBackground", new Color(255, 255, 255));
        UIManager.put("TextField.inactiveForeground", Color.BLACK);
        initComponents();
        
//        jpnlPaymentTerm.setVisible(false);
        
        jcmbGradeLevel.setModel(gradeLevelGUIUtil.getAllGradeLevels());
        jcmbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevel.setSelectedIndex(-1);
        
        jcmbSchoolYearStart.setModel(schoolYearGUIUtil.getCurrentSchoolYearFrom());
//        jcmbSchoolYearStart.setRenderer(new JComboBoxRenderer_SchoolYear());
        jcmbSchoolYearStart.setSelectedIndex(-1);
        
        jcmbSchoolYearEnd.setModel(schoolYearGUIUtil.getCurrentSchoolYearTo());
//        jcmbSchoolYearEnd.setRenderer(new JComboBoxRenderer_SchoolYear());
        jcmbSchoolYearEnd.setSelectedIndex(-1);
        
        PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
        DefaultComboBoxModel paymentTermModel = new DefaultComboBoxModel(ptdi.getAllPaymentTermsInfo().toArray());
        jcmbPaymentTerm.setModel(paymentTermModel);
        jcmbPaymentTerm.setRenderer(new JComboBoxRenderer_Master());
        jcmbPaymentTerm.setSelectedIndex(-1);
        
        
        setDayModel();
        setMonthModel();
        setYearModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        studentTypeJcbGroup = new javax.swing.ButtonGroup();
        ChildPanel1 = new javax.swing.JPanel();
        ChildPanel2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnCamera = new javax.swing.JButton();
        jbtnAddImage = new javax.swing.JButton();
        credentialsJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstCredentialRequirements = new javax.swing.JList<>();
        ChilPanel3 = new javax.swing.JPanel();
        studentInformationTopJPanel = new javax.swing.JPanel();
        jpnlStudentInformation = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jpnlPaymentTerm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmbPaymentTerm = new javax.swing.JComboBox<>();
        jpnlStudentType = new javax.swing.JPanel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        gradeLevelJLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcmbSchoolYearStart = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcmbSchoolYearEnd = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jcbTransfereeeStudent = new javax.swing.JCheckBox();
        jcbNewStudent = new javax.swing.JCheckBox();
        jpnlHomeAddress = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtfRoomOrHouseNo = new javax.swing.JTextField();
        jtfStreet = new javax.swing.JTextField();
        jtfBrgySubd = new javax.swing.JTextField();
        jtfCity = new javax.swing.JTextField();
        jtfProvince = new javax.swing.JTextField();
        jpnlParentInfo = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        fatherJlbl = new javax.swing.JLabel();
        fatherOccupationJlbl = new javax.swing.JLabel();
        fatherMobileJlbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fatherLastNameJlbl = new javax.swing.JLabel();
        fatherFirstNameJlbl = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jtfFatherLastName = new javax.swing.JTextField();
        jtfFatherFirstName = new javax.swing.JTextField();
        jtfFatherMiddleName = new javax.swing.JTextField();
        jtfFatherOccupation = new javax.swing.JTextField();
        jtfFatherOfficePhone = new javax.swing.JTextField();
        jtfFatherMobileNo = new javax.swing.JTextField();
        jcbFatherContactInCaseOfEmergency = new javax.swing.JCheckBox();
        motherJlbl = new javax.swing.JLabel();
        jtfMotherLastName = new javax.swing.JTextField();
        jtfMotherFirstName = new javax.swing.JTextField();
        jtfMotherMiddleName = new javax.swing.JTextField();
        motherOccupationJlbl = new javax.swing.JLabel();
        jtfMotherOccupation = new javax.swing.JTextField();
        motherLastNameJlbl = new javax.swing.JLabel();
        motherFirstNameJlbl = new javax.swing.JLabel();
        motherMiddleNameJlbl = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtfMotherOfficePhoneNo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtfMotherMobileNo = new javax.swing.JTextField();
        jcbMotherContactInCaseOfEmergency = new javax.swing.JCheckBox();
        jpnlGuardianInfo = new javax.swing.JPanel();
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
        jpnlSchoolLastAttended = new javax.swing.JPanel();
        jlblSchoolLastAttended = new javax.swing.JLabel();
        jtfSchoolLastAttended = new javax.swing.JTextField();
        jlblSchoolLastAttendedName = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jtfSchoolLastAttendedAddress = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jbtnCancelRegistration = new javax.swing.JButton();
        jtbnClearRegistrationFields = new javax.swing.JButton();
        jbtnAddRegistration = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        ChildPanel1.setLayout(new java.awt.BorderLayout());
        add(ChildPanel1, new java.awt.GridBagConstraints());

        ChildPanel2.setPreferredSize(new java.awt.Dimension(210, 429));
        ChildPanel2.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel4, gridBagConstraints);

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
        ChildPanel2.add(jPanel2, gridBagConstraints);

        credentialsJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Credential Requirements");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        credentialsJPanel.add(jLabel1, gridBagConstraints);

        jScrollPane1.setViewportView(jlstCredentialRequirements);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        credentialsJPanel.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChildPanel2.add(credentialsJPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(ChildPanel2, gridBagConstraints);

        ChilPanel3.setLayout(new java.awt.GridBagLayout());

        studentInformationTopJPanel.setLayout(new java.awt.GridBagLayout());

        jpnlStudentInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Information"));
        jpnlStudentInformation.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel3, gridBagConstraints);

        jLabel4.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Religion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Nationality");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Date of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Age");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel10, gridBagConstraints);

        jLabel11.setText("Place of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jLabel11, gridBagConstraints);

        jtfLastName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfLastName, gridBagConstraints);

        jtfFirstName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfFirstName, gridBagConstraints);

        jtfMiddleName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfMiddleName, gridBagConstraints);

        jtfReligion.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfReligion, gridBagConstraints);

        jtfNationality.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfNationality, gridBagConstraints);

        jtfAge.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfAge, gridBagConstraints);

        jtfPob.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jtfPob, gridBagConstraints);

        jcmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcmbGender.setSelectedIndex(-1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jcmbGender, gridBagConstraints);

        jcmbDobDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDobDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jcmbDobDay, gridBagConstraints);

        jcmbDobMonth.setEnabled(false);
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
        jpnlStudentInformation.add(jcmbDobMonth, gridBagConstraints);

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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlStudentInformation.add(jcmbDobYear, gridBagConstraints);

        jLabel34.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel34, gridBagConstraints);

        jLabel35.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel35, gridBagConstraints);

        jLabel36.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel36, gridBagConstraints);

        jLabel37.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel37, gridBagConstraints);

        jLabel38.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel38, gridBagConstraints);

        jLabel39.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel39, gridBagConstraints);

        jLabel40.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel40, gridBagConstraints);

        jLabel41.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 6);
        jpnlStudentInformation.add(jLabel41, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        studentInformationTopJPanel.add(jpnlStudentInformation, gridBagConstraints);

        jpnlPaymentTerm.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Term "));
        jpnlPaymentTerm.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Payment Term");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaymentTerm.add(jLabel2, gridBagConstraints);

        jcmbPaymentTerm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbPaymentTermItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaymentTerm.add(jcmbPaymentTerm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentInformationTopJPanel.add(jpnlPaymentTerm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(studentInformationTopJPanel, gridBagConstraints);

        jpnlStudentType.setLayout(new java.awt.GridBagLayout());

        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jcmbGradeLevel, gridBagConstraints);

        gradeLevelJLbl.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jpnlStudentType.add(gradeLevelJLbl, gridBagConstraints);

        jLabel12.setText("School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jLabel12, gridBagConstraints);

        jcmbSchoolYearStart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearStartItemStateChanged(evt);
            }
        });
        jcmbSchoolYearStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearStartActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jcmbSchoolYearStart, gridBagConstraints);

        jLabel13.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jLabel13, gridBagConstraints);

        jcmbSchoolYearEnd.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jcmbSchoolYearEnd, gridBagConstraints);

        jLabel45.setText("Student Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jLabel45, gridBagConstraints);

        studentTypeJcbGroup.add(jcbTransfereeeStudent);
        jcbTransfereeeStudent.setText("Transferee");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jcbTransfereeeStudent, gridBagConstraints);

        studentTypeJcbGroup.add(jcbNewStudent);
        jcbNewStudent.setText("New");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentType.add(jcbNewStudent, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(jpnlStudentType, gridBagConstraints);

        jpnlHomeAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Address"));
        jpnlHomeAddress.setLayout(new java.awt.GridBagLayout());

        jLabel15.setText("Room / House #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jLabel15, gridBagConstraints);

        jLabel16.setText("Street");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jLabel16, gridBagConstraints);

        jLabel17.setText("Brgy./Subd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jLabel17, gridBagConstraints);

        jLabel18.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jLabel18, gridBagConstraints);

        jLabel19.setText("State");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jLabel19, gridBagConstraints);

        jtfRoomOrHouseNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jtfRoomOrHouseNo, gridBagConstraints);

        jtfStreet.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jtfStreet, gridBagConstraints);

        jtfBrgySubd.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jtfBrgySubd, gridBagConstraints);

        jtfCity.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jtfCity, gridBagConstraints);

        jtfProvince.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHomeAddress.add(jtfProvince, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(jpnlHomeAddress, gridBagConstraints);

        jpnlParentInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parent Information"));
        jpnlParentInfo.setLayout(new java.awt.GridBagLayout());

        jLabel21.setText("Parents / Guardian Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jLabel21, gridBagConstraints);

        fatherJlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fatherJlbl.setText("Father");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(fatherJlbl, gridBagConstraints);

        fatherOccupationJlbl.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(fatherOccupationJlbl, gridBagConstraints);

        fatherMobileJlbl.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(fatherMobileJlbl, gridBagConstraints);

        jLabel25.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jLabel25, gridBagConstraints);

        fatherLastNameJlbl.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(fatherLastNameJlbl, gridBagConstraints);

        fatherFirstNameJlbl.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(fatherFirstNameJlbl, gridBagConstraints);

        jLabel28.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jLabel28, gridBagConstraints);

        jtfFatherLastName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherLastName, gridBagConstraints);

        jtfFatherFirstName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherFirstName, gridBagConstraints);

        jtfFatherMiddleName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherMiddleName, gridBagConstraints);

        jtfFatherOccupation.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherOccupation, gridBagConstraints);

        jtfFatherOfficePhone.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherOfficePhone, gridBagConstraints);

        jtfFatherMobileNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfFatherMobileNo, gridBagConstraints);

        jcbFatherContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jcbFatherContactInCaseOfEmergency, gridBagConstraints);

        motherJlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        motherJlbl.setText("Mother");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(motherJlbl, gridBagConstraints);

        jtfMotherLastName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherLastName, gridBagConstraints);

        jtfMotherFirstName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherFirstName, gridBagConstraints);

        jtfMotherMiddleName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherMiddleName, gridBagConstraints);

        motherOccupationJlbl.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(motherOccupationJlbl, gridBagConstraints);

        jtfMotherOccupation.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherOccupation, gridBagConstraints);

        motherLastNameJlbl.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(motherLastNameJlbl, gridBagConstraints);

        motherFirstNameJlbl.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(motherFirstNameJlbl, gridBagConstraints);

        motherMiddleNameJlbl.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(motherMiddleNameJlbl, gridBagConstraints);

        jLabel26.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jLabel26, gridBagConstraints);

        jtfMotherOfficePhoneNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherOfficePhoneNo, gridBagConstraints);

        jLabel27.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jLabel27, gridBagConstraints);

        jtfMotherMobileNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jtfMotherMobileNo, gridBagConstraints);

        jcbMotherContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlParentInfo.add(jcbMotherContactInCaseOfEmergency, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(jpnlParentInfo, gridBagConstraints);

        jpnlGuardianInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardian Information"));
        jpnlGuardianInfo.setLayout(new java.awt.GridBagLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Guardian");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel22, gridBagConstraints);

        jtfGuardianLastName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianLastName, gridBagConstraints);

        jtfGuardianFirstName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianFirstName, gridBagConstraints);

        jtfGuardianMiddleName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianMiddleName, gridBagConstraints);

        jLabel23.setText("Occupation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel23, gridBagConstraints);

        jtfGuardianOccupation.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianOccupation, gridBagConstraints);

        jcbGuardianContactInCaseOfEmergency.setText("contact person in case of emergency");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jcbGuardianContactInCaseOfEmergency, gridBagConstraints);

        jLabel24.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel24, gridBagConstraints);

        jLabel29.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel29, gridBagConstraints);

        jLabel30.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel30, gridBagConstraints);

        jLabel31.setText("Office Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel31, gridBagConstraints);

        jtfGuardianOfficePhone.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianOfficePhone, gridBagConstraints);

        jLabel32.setText("Mobile #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel32, gridBagConstraints);

        jtfGuardianMobileNo.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianMobileNo, gridBagConstraints);

        jLabel33.setText("Relationship");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jLabel33, gridBagConstraints);

        jtfGuardianRelationshipToStudent.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGuardianInfo.add(jtfGuardianRelationshipToStudent, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(jpnlGuardianInfo, gridBagConstraints);

        jpnlSchoolLastAttended.setBorder(javax.swing.BorderFactory.createTitledBorder("School Last Attended"));
        jpnlSchoolLastAttended.setLayout(new java.awt.GridBagLayout());

        jlblSchoolLastAttended.setText("School Last Attended");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolLastAttended.add(jlblSchoolLastAttended, gridBagConstraints);

        jtfSchoolLastAttended.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolLastAttended.add(jtfSchoolLastAttended, gridBagConstraints);

        jlblSchoolLastAttendedName.setText("School Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolLastAttended.add(jlblSchoolLastAttendedName, gridBagConstraints);

        jLabel44.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolLastAttended.add(jLabel44, gridBagConstraints);

        jtfSchoolLastAttendedAddress.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolLastAttended.add(jtfSchoolLastAttendedAddress, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        ChilPanel3.add(jpnlSchoolLastAttended, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(ChilPanel3, gridBagConstraints);

        jPanel14.setLayout(new java.awt.GridBagLayout());

        jbtnCancelRegistration.setText("Close");
        jbtnCancelRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelRegistrationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jbtnCancelRegistration, gridBagConstraints);

        jtbnClearRegistrationFields.setText("Clear");
        jtbnClearRegistrationFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnClearRegistrationFieldsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jtbnClearRegistrationFields, gridBagConstraints);

        jbtnAddRegistration.setText("Register");
        jbtnAddRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddRegistrationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jbtnAddRegistration, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jPanel14, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbSchoolYearStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartActionPerformed
        int selectedYearFrom = jcmbSchoolYearStart.getSelectedIndex();
        jcmbSchoolYearEnd.setSelectedIndex(selectedYearFrom);
    }//GEN-LAST:event_jcmbSchoolYearStartActionPerformed

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

    private void jcmbDobYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDobYearActionPerformed
    }//GEN-LAST:event_jcmbDobYearActionPerformed

    private void jcmbDobYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbDobYearItemStateChanged
        int yearSelectedIndex = jcmbDobYear.getSelectedIndex();
        if (yearSelectedIndex > -1) {
            int year = Integer.parseInt(jcmbDobYear.getSelectedItem().toString());
            int day = Integer.parseInt(jcmbDobDay.getSelectedItem().toString());
            int month = Integer.parseInt(jcmbDobMonth.getSelectedItem().toString());

            LocalDate birthdate = new LocalDate(year, month, day);
            LocalDate now = new LocalDate();
            Years age = Years.yearsBetween(birthdate, now);
            System.out.println("Age: " + age);
            jtfAge.setText("" + age.toString().replaceAll("\\D+", ""));
        }
    }//GEN-LAST:event_jcmbDobYearItemStateChanged

    
    private void resetRegistrationForm(){
        JPanelGUIUtil.clearFields(jpnlStudentType);
        JPanelGUIUtil.clearFields(jpnlStudentInformation);
        JPanelGUIUtil.clearFields(jpnlHomeAddress);
        JPanelGUIUtil.clearFields(jpnlParentInfo);
        JPanelGUIUtil.clearFields(jpnlGuardianInfo);
        JPanelGUIUtil.clearFields(jpnlSchoolLastAttended);
    }
    
    private void jtbnClearRegistrationFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnClearRegistrationFieldsActionPerformed
        resetRegistrationForm();
    }//GEN-LAST:event_jtbnClearRegistrationFieldsActionPerformed

    private void jbtnCancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelRegistrationActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Exit Registration?", "Exit", JOptionPane.WARNING_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            CardLayoutUtil.flipCardTo(TopContainer.jpnlTopCardContainer,TopContainer.jpnlTopCard);
            TopContainer.jtpTopTabbedPane.remove(this);
            TopContainer.setREGISTRATION_INSTANCE(0);
        }
        
    }//GEN-LAST:event_jbtnCancelRegistrationActionPerformed

    private void jbtnAddRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddRegistrationActionPerformed
        Registration registration = new Registration();
        
        registration.setRegisteredStudentType(jcbTransfereeeStudent.isSelected()==true? jcbTransfereeeStudent.getText() : jcbNewStudent.getText() ); 
        registration.setLastName(jtfLastName.getText().trim());
        registration.setFirstName(jtfFirstName.getText().trim());
        registration.setMiddleName(jtfMiddleName.getText().trim());
        registration.setGender(jcmbGender.getSelectedItem().toString());
        registration.setNationality(jtfNationality.getText().trim());
        registration.setReligion(jtfReligion.getText());
        
        String day = jcmbDobDay.getSelectedItem().toString();
        String year = jcmbDobYear.getSelectedItem().toString();
        String mo = jcmbDobMonth.getSelectedItem().toString();
        String dob = (year+"-"+mo+"-"+day);
        registration.setDateOfBirth(dob);

        registration.setPlaceOfBirth(jtfPob.getText().trim());
        registration.setFatherFirstName(jtfFatherFirstName.getText().trim());
        registration.setFatherMiddleName(jtfFatherMiddleName.getText().trim());
        registration.setFatherLastName(jtfFatherLastName.getText().trim());
        registration.setFatherOccupation(jtfFatherOccupation.getText().trim());
        registration.setFatherOfficePhoneNo(jtfFatherOfficePhone.getText().trim());
        registration.setFatherMobileNo(jtfFatherMobileNo.getText().trim());
        registration.setMotherFirstName(jtfMotherFirstName.getText().trim());
        registration.setMotherMiddleName(jtfMotherMiddleName.getText().trim());
        registration.setMotherLastName(jtfMotherLastName.getText().trim());
        registration.setMotherOccupation(jtfMotherOccupation.getText().trim());
        registration.setMotherOfficePhoneNo(jtfMotherOfficePhoneNo.getText().trim());
        registration.setMotherMobileNo(jtfMotherMobileNo.getText().trim());
        registration.setGuardianLastName(jtfGuardianLastName.getText().trim());
        registration.setGuardianFirstName(jtfGuardianFirstName.getText().trim());
        registration.setGuardianMiddleName(jtfGuardianMiddleName.getText().trim());
        registration.setGuardianOccupation(jtfGuardianOccupation.getText().trim());
        registration.setGuardianOfficePhoneNo(jtfGuardianOfficePhone.getText().trim());
        registration.setGuardianMobileNo(jtfGuardianMobileNo.getText().trim());
        registration.setGuardianRelationToStudent(jtfGuardianRelationshipToStudent.getText().trim());
        registration.setAddressRoomOrHouseNo(jtfRoomOrHouseNo.getText().trim());
        registration.setAddressStreet(jtfStreet.getText().trim());
        registration.setAddressBrgyOrSubd(jtfBrgySubd.getText().trim());
        registration.setAddressCity(jtfCity.getText().trim());
        registration.setProvince(jtfProvince.getText().trim());
        registration.setIsMotherContactInCaseEmergency(jcbMotherContactInCaseOfEmergency.isSelected());
        registration.setIsFatherContactInCaseEmergency(jcbFatherContactInCaseOfEmergency.isSelected());
        registration.setIsGuardianContactInCaseEmergency(jcbGuardianContactInCaseOfEmergency.isSelected());
        registration.setSchoolLastAttended(jtfSchoolLastAttended.getText().trim());
        registration.setSchoolLastAttendedAddress(jtfSchoolLastAttendedAddress.getText().trim());
        registration.setPaymentTerm( ((PaymentTerm)jcmbPaymentTerm.getSelectedItem()).getPaymentTerm() );
//        JOptionPane.showMessageDialog(null,"Test 1: "+((PaymentTerm)jcmbPaymentTerm.getSelectedItem()).getPaymentTerm());
        
        int gradeLevelNo = Integer.parseInt(jcmbGradeLevel.getSelectedItem().toString());
        registration.setGradeLevel(gradeLevelNo);
        
        int schoolYearFrom = Integer.parseInt(jcmbSchoolYearStart.getSelectedItem().toString());
        int schoolYearTo = Integer.parseInt(jcmbSchoolYearEnd.getSelectedItem().toString());
        SchoolYear schoolYear = new SchoolYear();
        schoolYear.setYearFrom(schoolYearFrom);
        schoolYear.setYearTo(schoolYearTo);
        registration.setSchoolYear(schoolYear);
        
        int register = JOptionPane.showConfirmDialog(null, "Submit form?", "Register", JOptionPane.YES_NO_OPTION);

        if (register == JOptionPane.YES_OPTION) {
            RegistrationDaoImpl rdi = new RegistrationDaoImpl();
            boolean isAdded = rdi.addRegistration(registration);
            if(isAdded){
                JOptionPane.showMessageDialog(null,"Successfully added");
                resetRegistrationForm();
                EnrollmentPanel.loadRegisteredApplicantsToJTable();
            }else{
                JOptionPane.showMessageDialog(null,"Error occured during registration");
            }
        }
    }//GEN-LAST:event_jbtnAddRegistrationActionPerformed

    
    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
            
        if (jcmbGradeLevel.getSelectedIndex() > -1) {
            int aGradeLevel = Integer.parseInt(jcmbGradeLevel.getSelectedItem().toString());
            GradeLevel gradeLevel = new GradeLevel();
            gradeLevel.setLevel(aGradeLevel);
            int aGradeLevelId = gradeLevelDaoImpl.getId(gradeLevel);

            jlstCredentialRequirements.setModel(credentialGUIUtil.getAllCredentialNamesByGradeLevelId(aGradeLevelId));
        }
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged

    private void jcmbSchoolYearStartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartItemStateChanged
        if(jcmbSchoolYearStart.getSelectedIndex() > -1){
           int schoolYearFrom = Integer.parseInt(jcmbSchoolYearStart.getSelectedItem().toString());
           int aSchoolYearId = new SchoolYearDaoImpl().getSchoolYearId(schoolYearFrom);
//           JOptionPane.showMessageDialog(null,aSchoolYearId);
        }
    }//GEN-LAST:event_jcmbSchoolYearStartItemStateChanged

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                
    }//GEN-LAST:event_formKeyPressed

    private void jcmbPaymentTermItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbPaymentTermItemStateChanged
        // TODO add your handling code here:
        if(jcmbPaymentTerm.getSelectedIndex() > -1){
            int selectedPaymentTermId = ((PaymentTerm)jcmbPaymentTerm.getSelectedItem()).getId();
            //            JOptionPane.showMessageDialog(null,selectedPaymentTermId);
        }
    }//GEN-LAST:event_jcmbPaymentTermItemStateChanged

    private void setDayModel() {
        Object[] daysObj = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "26", "27", "28", "29", "30", "31"};
        DefaultComboBoxModel days = new DefaultComboBoxModel(daysObj);
        jcmbDobDay.setModel((ComboBoxModel) days);
        jcmbDobDay.setSelectedIndex(-1);
    }

    private void setMonthModel() {
        Object[] monthObj = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        DefaultComboBoxModel months = new DefaultComboBoxModel(monthObj);
        jcmbDobMonth.setModel(months);
        jcmbDobMonth.setSelectedIndex(-1);
    }

    private void setYearModel() {
        DefaultComboBoxModel years = new DefaultComboBoxModel();
        LocalDateTime now = LocalDateTime.now();
        int currentYear = now.getYear();
        for (int x = 1980; x <= currentYear; x++) {
            years.addElement(x);
        }
        jcmbDobYear.setModel(years);
        jcmbDobYear.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChilPanel3;
    private javax.swing.JPanel ChildPanel1;
    private javax.swing.JPanel ChildPanel2;
    private javax.swing.JPanel credentialsJPanel;
    private javax.swing.JLabel fatherFirstNameJlbl;
    private javax.swing.JLabel fatherJlbl;
    private javax.swing.JLabel fatherLastNameJlbl;
    private javax.swing.JLabel fatherMobileJlbl;
    private javax.swing.JLabel fatherOccupationJlbl;
    private javax.swing.JLabel gradeLevelJLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAddImage;
    private javax.swing.JButton jbtnAddRegistration;
    private javax.swing.JButton jbtnCamera;
    private javax.swing.JButton jbtnCancelRegistration;
    private javax.swing.JCheckBox jcbFatherContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbGuardianContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbMotherContactInCaseOfEmergency;
    private javax.swing.JCheckBox jcbNewStudent;
    private javax.swing.JCheckBox jcbTransfereeeStudent;
    private javax.swing.JComboBox<String> jcmbDobDay;
    private javax.swing.JComboBox<String> jcmbDobMonth;
    private javax.swing.JComboBox<String> jcmbDobYear;
    private javax.swing.JComboBox<String> jcmbGender;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    private javax.swing.JComboBox<String> jcmbPaymentTerm;
    private javax.swing.JComboBox<String> jcmbSchoolYearEnd;
    private javax.swing.JComboBox<String> jcmbSchoolYearStart;
    private javax.swing.JLabel jlblSchoolLastAttended;
    private javax.swing.JLabel jlblSchoolLastAttendedName;
    private javax.swing.JList<String> jlstCredentialRequirements;
    private javax.swing.JPanel jpnlGuardianInfo;
    private javax.swing.JPanel jpnlHomeAddress;
    private javax.swing.JPanel jpnlParentInfo;
    private javax.swing.JPanel jpnlPaymentTerm;
    private javax.swing.JPanel jpnlSchoolLastAttended;
    private javax.swing.JPanel jpnlStudentInformation;
    private javax.swing.JPanel jpnlStudentType;
    private javax.swing.JButton jtbnClearRegistrationFields;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfBrgySubd;
    private javax.swing.JTextField jtfCity;
    private javax.swing.JTextField jtfFatherFirstName;
    private javax.swing.JTextField jtfFatherLastName;
    private javax.swing.JTextField jtfFatherMiddleName;
    private javax.swing.JTextField jtfFatherMobileNo;
    private javax.swing.JTextField jtfFatherOccupation;
    private javax.swing.JTextField jtfFatherOfficePhone;
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
    private javax.swing.JTextField jtfRoomOrHouseNo;
    private javax.swing.JTextField jtfSchoolLastAttended;
    private javax.swing.JTextField jtfSchoolLastAttendedAddress;
    private javax.swing.JTextField jtfStreet;
    private javax.swing.JLabel motherFirstNameJlbl;
    private javax.swing.JLabel motherJlbl;
    private javax.swing.JLabel motherLastNameJlbl;
    private javax.swing.JLabel motherMiddleNameJlbl;
    private javax.swing.JLabel motherOccupationJlbl;
    private javax.swing.JPanel studentInformationTopJPanel;
    private javax.swing.ButtonGroup studentTypeJcbGroup;
    // End of variables declaration//GEN-END:variables
}
