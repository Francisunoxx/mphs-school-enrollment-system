/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.student;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.StudentDaoImpl;
import component_utility.ImageGUIUtil;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.print.PrinterJob;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.JTableHeader;
import model.SchoolYear;
import model.Student;

public class StudentInformationJDialog extends javax.swing.JDialog {

    private final int studentId;
    private final GUIManager gUIManager = new GUIManager();
    private final StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    private Image schoolLogo, studentPhoto;
    
    public StudentInformationJDialog(int aStudentId) {
        super(null, ModalityType.APPLICATION_MODAL);
        initComponents();
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        gUIManager.setGUIInitialState();
        
        
        this.studentId = aStudentId;
        setSchoolYearJComboBoxModel();
        setFormDetails();
        jlblAccuntingClearedText.setText("");
        jlblAccountingCleared.setText("");
        
        
        setStudentDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jpnlAdmission = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblAdmissionIdText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblAdmissionStatusText = new javax.swing.JLabel();
        jlblAdmissionCompletion = new javax.swing.JLabel();
        jlblAdmissionCompletionDateText = new javax.swing.JLabel();
        jpnlAccounting = new javax.swing.JPanel();
        jlblAccountingCleared = new javax.swing.JLabel();
        jlblAccuntingClearedText = new javax.swing.JLabel();
        jpnlGradeLevel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlblPresentGradeLevelText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlblPassedText = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlblRecommendedForGradeLevelText = new javax.swing.JLabel();
        jlblAdmissionGradeLevel = new javax.swing.JLabel();
        jlblAdmissionGradeLevelText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jpnlHeader = new javax.swing.JPanel();
        jpnlLogo = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, 0.8f));
            g2d.drawImage(schoolLogo, 0, 0, getWidth(), getHeight(), null);
            jPanel1.repaint();
        }
    };
    jPanel10 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jpnlRegistrationNo = new javax.swing.JPanel();
    jlblRegistrationNo = new javax.swing.JLabel();
    jlblRegistrationIdText = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jpnlCertificateOfRegistration = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jPanel9 = new javax.swing.JPanel();
    jPanel12 = new javax.swing.JPanel();
    jlblSchoolYear = new javax.swing.JLabel();
    jlblSchoolYearText = new javax.swing.JLabel();
    jlblName = new javax.swing.JLabel();
    jlblNameText = new javax.swing.JLabel();
    jlblAddress = new javax.swing.JLabel();
    jlblAddressText = new javax.swing.JLabel();
    jlblStudentIdRegistrationform = new javax.swing.JLabel();
    jlblStudentIdRegistrationText = new javax.swing.JLabel();
    jlblStudentType = new javax.swing.JLabel();
    jlblGradeLevel = new javax.swing.JLabel();
    jlblGradeLevelText = new javax.swing.JLabel();
    jlblContact = new javax.swing.JLabel();
    jlblContactText = new javax.swing.JLabel();
    jlblSection = new javax.swing.JLabel();
    jlblSectionText = new javax.swing.JLabel();
    jlblDate = new javax.swing.JLabel();
    jlblRegistrationDateText = new javax.swing.JLabel();
    jlblStudentTypeRegForm = new javax.swing.JLabel();
    jPanel13 = new javax.swing.JPanel();
    jPanel20 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jtblRegformSchedule = new javax.swing.JTable();
    jPanel5 = new javax.swing.JPanel();
    jpnlStudentFees = new javax.swing.JPanel();
    jpnlTuition = new javax.swing.JPanel();
    jlblTuitionHeader = new javax.swing.JLabel();
    jPanel15 = new javax.swing.JPanel();
    jLabel14 = new javax.swing.JLabel();
    jpnlMiscellaneous = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    jPanel17 = new javax.swing.JPanel();
    jLabel16 = new javax.swing.JLabel();
    jpnlOthers = new javax.swing.JPanel();
    jLabel17 = new javax.swing.JLabel();
    jPanel19 = new javax.swing.JPanel();
    jLabel18 = new javax.swing.JLabel();
    jpnlTotal = new javax.swing.JPanel();
    jLabel19 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jpnlStudentPhoto = new javax.swing.JPanel(){

        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(studentPhoto, 0, 0, getWidth(), getHeight(), null);
        jPanel1.repaint();
    }

    };
    jPanel8 = new javax.swing.JPanel();
    jlblStudentId = new javax.swing.JLabel();
    jlblStudentIdText = new javax.swing.JLabel();
    jlblStatus = new javax.swing.JLabel();
    jlblStatusText = new javax.swing.JLabel();
    jlblLastName = new javax.swing.JLabel();
    jlblLastNameText = new javax.swing.JLabel();
    jlblFirstName = new javax.swing.JLabel();
    jlblFirstNameText = new javax.swing.JLabel();
    jlblMiddleName = new javax.swing.JLabel();
    jlblMiddleNameText = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jlblStudentTypeText = new javax.swing.JLabel();
    jPanel7 = new javax.swing.JPanel();
    jbtnCancelEnrollment = new javax.swing.JButton();
    jbtnPrintRegistrationForm = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Student Information");
    setMinimumSize(new java.awt.Dimension(800, 540));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jPanel6.setLayout(new java.awt.GridBagLayout());

    jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTabbedPane1MouseClicked(evt);
        }
    });

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setLayout(new java.awt.GridBagLayout());

    jpnlAdmission.setBorder(javax.swing.BorderFactory.createTitledBorder("Admission"));
    jpnlAdmission.setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Admission Id : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jLabel1, gridBagConstraints);

    jlblAdmissionIdText.setText("AdmissionIdText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jlblAdmissionIdText, gridBagConstraints);

    jLabel3.setText("Status : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jLabel3, gridBagConstraints);

    jlblAdmissionStatusText.setText("Admission Status Text  ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jlblAdmissionStatusText, gridBagConstraints);

    jlblAdmissionCompletion.setText("Completion Date :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jlblAdmissionCompletion, gridBagConstraints);

    jlblAdmissionCompletionDateText.setText("Completion Date Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAdmission.add(jlblAdmissionCompletionDateText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jpnlAdmission, gridBagConstraints);

    jpnlAccounting.setBorder(javax.swing.BorderFactory.createTitledBorder("Accounting"));
    jpnlAccounting.setLayout(new java.awt.GridBagLayout());

    jlblAccountingCleared.setText("Cleared : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccounting.add(jlblAccountingCleared, gridBagConstraints);

    jlblAccuntingClearedText.setText("Yes Or No Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccounting.add(jlblAccuntingClearedText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jpnlAccounting, gridBagConstraints);

    jpnlGradeLevel.setBorder(javax.swing.BorderFactory.createTitledBorder("Grade Level"));
    jpnlGradeLevel.setLayout(new java.awt.GridBagLayout());

    jLabel6.setText("Present GradeLevel :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jLabel6, gridBagConstraints);

    jlblPresentGradeLevelText.setText("Previous Grade Level Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jlblPresentGradeLevelText, gridBagConstraints);

    jLabel11.setText("Passed :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jLabel11, gridBagConstraints);

    jlblPassedText.setText("Yes Or No Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jlblPassedText, gridBagConstraints);

    jLabel13.setText("Recommended For :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jLabel13, gridBagConstraints);

    jlblRecommendedForGradeLevelText.setText("Recommended For Grade Level Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jlblRecommendedForGradeLevelText, gridBagConstraints);

    jlblAdmissionGradeLevel.setText("Admission GradeLevel :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jlblAdmissionGradeLevel, gridBagConstraints);

    jlblAdmissionGradeLevelText.setText("AdmissionGradeLevelText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlGradeLevel.add(jlblAdmissionGradeLevelText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jpnlGradeLevel, gridBagConstraints);

    jTabbedPane1.addTab("Student", jPanel2);

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setForeground(new java.awt.Color(255, 255, 255));
    jPanel4.setLayout(new java.awt.GridBagLayout());

    jpnlHeader.setBackground(new java.awt.Color(255, 255, 255));
    jpnlHeader.setForeground(new java.awt.Color(51, 51, 51));
    jpnlHeader.setLayout(new java.awt.GridBagLayout());

    jpnlLogo.setBackground(new java.awt.Color(255, 255, 255));
    jpnlLogo.setMinimumSize(new java.awt.Dimension(100, 100));
    jpnlLogo.setPreferredSize(new java.awt.Dimension(120, 120));
    jpnlLogo.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    jpnlHeader.add(jpnlLogo, gridBagConstraints);

    jPanel10.setBackground(new java.awt.Color(255, 255, 255));
    jPanel10.setPreferredSize(new java.awt.Dimension(420, 18));
    jPanel10.setLayout(new java.awt.GridBagLayout());

    jLabel5.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 114, 188));
    jLabel5.setText("Mother of Perpetual Help School");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(10, 20, 1, 1);
    jPanel10.add(jLabel5, gridBagConstraints);

    jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(51, 51, 51));
    jLabel7.setText("Iris Street Dahlia, West Fairview Quezon City");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(1, 20, 1, 1);
    jPanel10.add(jLabel7, gridBagConstraints);

    jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(51, 51, 51));
    jLabel8.setText("1118 Metro Manila, Philippines");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(1, 20, 1, 1);
    jPanel10.add(jLabel8, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    jpnlHeader.add(jPanel10, gridBagConstraints);

    jpnlRegistrationNo.setBackground(new java.awt.Color(255, 255, 255));
    jpnlRegistrationNo.setLayout(new java.awt.GridBagLayout());

    jlblRegistrationNo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jlblRegistrationNo.setForeground(new java.awt.Color(51, 51, 51));
    jlblRegistrationNo.setText("No.");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(10, 2, 2, 2);
    jpnlRegistrationNo.add(jlblRegistrationNo, gridBagConstraints);

    jlblRegistrationIdText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jlblRegistrationIdText.setForeground(new java.awt.Color(51, 51, 51));
    jlblRegistrationIdText.setText("RegistrationNoText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(10, 2, 2, 2);
    jpnlRegistrationNo.add(jlblRegistrationIdText, gridBagConstraints);

    jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(51, 51, 51));
    jLabel10.setText("Student's Copy");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlRegistrationNo.add(jLabel10, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jpnlHeader.add(jpnlRegistrationNo, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel4.add(jpnlHeader, gridBagConstraints);

    jpnlCertificateOfRegistration.setBackground(new java.awt.Color(255, 255, 255));
    jpnlCertificateOfRegistration.setLayout(new java.awt.GridBagLayout());

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 114, 188));
    jLabel4.setText("Certificate Of Registration");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlCertificateOfRegistration.add(jLabel4, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    jPanel4.add(jpnlCertificateOfRegistration, gridBagConstraints);

    jPanel9.setBackground(new java.awt.Color(255, 255, 255));
    jPanel9.setLayout(new java.awt.GridBagLayout());

    jPanel12.setBackground(new java.awt.Color(255, 255, 255));
    jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jPanel12.setLayout(new java.awt.GridBagLayout());

    jlblSchoolYear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblSchoolYear.setForeground(new java.awt.Color(51, 51, 51));
    jlblSchoolYear.setText("SY");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblSchoolYear, gridBagConstraints);

    jlblSchoolYearText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblSchoolYearText.setForeground(new java.awt.Color(51, 51, 51));
    jlblSchoolYearText.setText("SchoolYearText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblSchoolYearText, gridBagConstraints);

    jlblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblName.setForeground(new java.awt.Color(51, 51, 51));
    jlblName.setText("Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblName, gridBagConstraints);

    jlblNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblNameText.setForeground(new java.awt.Color(51, 51, 51));
    jlblNameText.setText("NameText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblNameText, gridBagConstraints);

    jlblAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblAddress.setForeground(new java.awt.Color(51, 51, 51));
    jlblAddress.setText("Address :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblAddress, gridBagConstraints);

    jlblAddressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblAddressText.setForeground(new java.awt.Color(51, 51, 51));
    jlblAddressText.setText("AddressText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblAddressText, gridBagConstraints);

    jlblStudentIdRegistrationform.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblStudentIdRegistrationform.setForeground(new java.awt.Color(51, 51, 51));
    jlblStudentIdRegistrationform.setText("Student ID :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblStudentIdRegistrationform, gridBagConstraints);

    jlblStudentIdRegistrationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblStudentIdRegistrationText.setForeground(new java.awt.Color(51, 51, 51));
    jlblStudentIdRegistrationText.setText("StudentIdText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblStudentIdRegistrationText, gridBagConstraints);

    jlblStudentType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblStudentType.setForeground(new java.awt.Color(51, 51, 51));
    jlblStudentType.setText("Type :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblStudentType, gridBagConstraints);

    jlblGradeLevel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblGradeLevel.setForeground(new java.awt.Color(51, 51, 51));
    jlblGradeLevel.setText("Grade :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblGradeLevel, gridBagConstraints);

    jlblGradeLevelText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblGradeLevelText.setForeground(new java.awt.Color(51, 51, 51));
    jlblGradeLevelText.setText("GradeText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblGradeLevelText, gridBagConstraints);

    jlblContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblContact.setForeground(new java.awt.Color(51, 51, 51));
    jlblContact.setText("Contact :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblContact, gridBagConstraints);

    jlblContactText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblContactText.setForeground(new java.awt.Color(51, 51, 51));
    jlblContactText.setText("ContactText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblContactText, gridBagConstraints);

    jlblSection.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblSection.setForeground(new java.awt.Color(51, 51, 51));
    jlblSection.setText("Section :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblSection, gridBagConstraints);

    jlblSectionText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblSectionText.setForeground(new java.awt.Color(51, 51, 51));
    jlblSectionText.setText("SectionText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblSectionText, gridBagConstraints);

    jlblDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblDate.setForeground(new java.awt.Color(51, 51, 51));
    jlblDate.setText("Date :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblDate, gridBagConstraints);

    jlblRegistrationDateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblRegistrationDateText.setForeground(new java.awt.Color(51, 51, 51));
    jlblRegistrationDateText.setText("DateText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 7;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblRegistrationDateText, gridBagConstraints);

    jlblStudentTypeRegForm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblStudentTypeRegForm.setForeground(new java.awt.Color(51, 51, 51));
    jlblStudentTypeRegForm.setText("TypeText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel12.add(jlblStudentTypeRegForm, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
    jPanel9.add(jPanel12, gridBagConstraints);

    jPanel13.setBackground(new java.awt.Color(255, 255, 255));
    jPanel13.setLayout(new java.awt.GridBagLayout());

    jPanel20.setBackground(new java.awt.Color(255, 255, 255));
    jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel20.setForeground(new java.awt.Color(51, 51, 51));
    jPanel20.setPreferredSize(new java.awt.Dimension(455, 300));
    jPanel20.setLayout(new java.awt.GridBagLayout());

    jScrollPane2.setBorder(null);
    jScrollPane2.setPreferredSize(new java.awt.Dimension(453, 250));

    jtblRegformSchedule.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Subject ", "Time", "Room", "Adviser"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane2.setViewportView(jtblRegformSchedule);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jPanel20.add(jScrollPane2, gridBagConstraints);

    jPanel5.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jPanel20.add(jPanel5, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
    jPanel13.add(jPanel20, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jPanel9.add(jPanel13, gridBagConstraints);

    jpnlStudentFees.setBackground(new java.awt.Color(255, 255, 255));
    jpnlStudentFees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jpnlStudentFees.setMinimumSize(new java.awt.Dimension(215, 215));
    jpnlStudentFees.setPreferredSize(new java.awt.Dimension(215, 215));
    jpnlStudentFees.setLayout(new java.awt.GridBagLayout());

    jpnlTuition.setBackground(new java.awt.Color(255, 255, 255));
    jpnlTuition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jpnlTuition.setForeground(new java.awt.Color(51, 51, 51));
    jpnlTuition.setLayout(new java.awt.GridBagLayout());

    jlblTuitionHeader.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblTuitionHeader.setForeground(new java.awt.Color(51, 51, 51));
    jlblTuitionHeader.setText("Tuition");
    jpnlTuition.add(jlblTuitionHeader, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jpnlStudentFees.add(jpnlTuition, gridBagConstraints);

    jPanel15.setBackground(new java.awt.Color(255, 255, 255));
    jPanel15.setForeground(new java.awt.Color(51, 51, 51));
    jPanel15.setLayout(new java.awt.GridBagLayout());

    jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(51, 51, 51));
    jLabel14.setText("jLabel14");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    jPanel15.add(jLabel14, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jpnlStudentFees.add(jPanel15, gridBagConstraints);

    jpnlMiscellaneous.setBackground(new java.awt.Color(255, 255, 255));
    jpnlMiscellaneous.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jpnlMiscellaneous.setForeground(new java.awt.Color(51, 51, 51));
    jpnlMiscellaneous.setLayout(new java.awt.GridBagLayout());

    jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(51, 51, 51));
    jLabel15.setText(" Miscellaneous");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jpnlMiscellaneous.add(jLabel15, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jpnlStudentFees.add(jpnlMiscellaneous, gridBagConstraints);

    jPanel17.setBackground(new java.awt.Color(255, 255, 255));
    jPanel17.setForeground(new java.awt.Color(51, 51, 51));
    jPanel17.setLayout(new java.awt.GridBagLayout());

    jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(51, 51, 51));
    jLabel16.setText("jLabel16");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel17.add(jLabel16, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlStudentFees.add(jPanel17, gridBagConstraints);

    jpnlOthers.setBackground(new java.awt.Color(255, 255, 255));
    jpnlOthers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jpnlOthers.setForeground(new java.awt.Color(51, 51, 51));
    jpnlOthers.setLayout(new java.awt.GridBagLayout());

    jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(51, 51, 51));
    jLabel17.setText("Others");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    jpnlOthers.add(jLabel17, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jpnlStudentFees.add(jpnlOthers, gridBagConstraints);

    jPanel19.setBackground(new java.awt.Color(255, 255, 255));
    jPanel19.setForeground(new java.awt.Color(51, 51, 51));
    jPanel19.setLayout(new java.awt.GridBagLayout());

    jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(51, 51, 51));
    jLabel18.setText("jLabel18");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel19.add(jLabel18, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlStudentFees.add(jPanel19, gridBagConstraints);

    jpnlTotal.setBackground(new java.awt.Color(255, 255, 255));
    jpnlTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 188)));
    jpnlTotal.setForeground(new java.awt.Color(51, 51, 51));
    jpnlTotal.setLayout(new java.awt.GridBagLayout());

    jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(51, 51, 51));
    jLabel19.setText("Total");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    jpnlTotal.add(jLabel19, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jpnlStudentFees.add(jpnlTotal, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
    jPanel9.add(jpnlStudentFees, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jPanel4.add(jPanel9, gridBagConstraints);

    jTabbedPane1.addTab("Certificate Of Registration", jPanel4);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel6.add(jTabbedPane1, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jPanel6, gridBagConstraints);

    jPanel3.setLayout(new java.awt.GridBagLayout());

    jpnlStudentPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlStudentPhoto.setMaximumSize(new java.awt.Dimension(200, 200));
    jpnlStudentPhoto.setMinimumSize(new java.awt.Dimension(200, 200));
    jpnlStudentPhoto.setPreferredSize(new java.awt.Dimension(200, 200));
    jpnlStudentPhoto.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel3.add(jpnlStudentPhoto, gridBagConstraints);

    jPanel8.setLayout(new java.awt.GridBagLayout());

    jlblStudentId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblStudentId.setText("Student ID :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblStudentId, gridBagConstraints);

    jlblStudentIdText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblStudentIdText.setText("Student Id Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblStudentIdText, gridBagConstraints);

    jlblStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblStatus.setText("Status : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblStatus, gridBagConstraints);

    jlblStatusText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblStatusText.setText("Status Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblStatusText, gridBagConstraints);

    jlblLastName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblLastName.setText("Last Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblLastName, gridBagConstraints);

    jlblLastNameText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblLastNameText.setText("Last Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblLastNameText, gridBagConstraints);

    jlblFirstName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblFirstName.setText("First Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblFirstName, gridBagConstraints);

    jlblFirstNameText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblFirstNameText.setText("First Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblFirstNameText, gridBagConstraints);

    jlblMiddleName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblMiddleName.setText("Middle Name : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblMiddleName, gridBagConstraints);

    jlblMiddleNameText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblMiddleNameText.setText("Middle Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblMiddleNameText, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jLabel2.setText("Student Type : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jLabel2, gridBagConstraints);

    jlblStudentTypeText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jlblStudentTypeText.setText("Student Type Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel8.add(jlblStudentTypeText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel3.add(jPanel8, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jPanel3, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    getContentPane().add(jPanel1, gridBagConstraints);

    jPanel7.setLayout(new java.awt.GridBagLayout());

    jbtnCancelEnrollment.setText("Cancel");
    jbtnCancelEnrollment.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnCancelEnrollmentActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel7.add(jbtnCancelEnrollment, gridBagConstraints);

    jbtnPrintRegistrationForm.setText("Print");
    jbtnPrintRegistrationForm.setEnabled(false);
    jbtnPrintRegistrationForm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnPrintRegistrationFormActionPerformed(evt);
        }
    });
    jPanel7.add(jbtnPrintRegistrationForm, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    getContentPane().add(jPanel7, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setStudentDetails(){
            Student s = studentDaoImpl.getStudentById(studentId);
            Integer aRegistrationId = studentDaoImpl.getRegistrationId(studentId);
        String aAdmissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId)==0?
                "Kindergarten":studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId)+"";
        String aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(studentId)==0?
                "Kindergarten":studentDaoImpl.getPresentGradeLevelByStudentId(studentId)+"";
        String aRecommendedGradeLevel = studentDaoImpl.getRecommendedGradeLevel(studentId)==0?
                "Kindergarten":studentDaoImpl.getRecommendedGradeLevel(studentId)+"";
        String aStudentId = s.getStudentId()+"";
        String aStatus = s.isActive()==true? "Active":"Inactive" ;
        String aStudentType = s.getStudentType()==1?"New":"Old";
        String aLastName = s.getRegistration().getLastName();
        String aFirstName = s.getRegistration().getFirstName();
        String aMiddleName = s.getRegistration().getMiddleName();
        String aAdmissionId = s.getAdmission().getAdmissionId()+"";
        String aAdmissionStatus = s.getAdmission().isCompleted()==true?"Complete":"Pending";
        String aAdmissionCompletionDate = s.getAdmission().getCompletionDate()==null?"--":s.getAdmission().getCompletionDate()+"";
        String isPassed = s.getPresentGradeLevel().getIsPassed()==null?
                "":s.getPresentGradeLevel().getIsPassed()+"";
        
        String aAddress = s.getRegistration().getAddressRoomOrHouseNo()+" "+s.getRegistration().getAddressStreet()+
                s.getRegistration().getAddressBrgyOrSubd()+" "+s.getRegistration().getAddressCity();
        
        String aRegistrationDate = s.getRegistration().getRegistrationDate()==null?"":s.getRegistration().getRegistrationDate()+"";
        
        jlblNameText.setText(aLastName.toUpperCase()+", "+aFirstName.toUpperCase()+" "+aMiddleName.toUpperCase());
        jlblAddressText.setText(aAddress);
        jlblStudentIdRegistrationText.setText(aStudentId);
        jlblStudentTypeRegForm.setText(aStudentType);
        jlblGradeLevelText.setText(aPresentGradeLevel);
        jlblRegistrationIdText.setText(aRegistrationId+"");
        jlblRegistrationDateText.setText(aRegistrationDate);
        jlblSectionText.setText("");
        jlblSchoolYearText.setText(s.getRegistration().getSchoolYear().getYearFrom()+"-"+
                s.getRegistration().getSchoolYear().getYearTo());
        
        }
    
    public class GUIManager{
        private void setGUIInitialState() {
            JTableHeader header = jtblRegformSchedule.getTableHeader();
            header.setBackground(Color.WHITE);
            header.setForeground(Color.BLACK);
            jtblRegformSchedule.setShowGrid(false);
            jtblRegformSchedule.setShowHorizontalLines(false);
            jtblRegformSchedule.setShowVerticalLines(false);
            
            schoolLogo = new ImageGUIUtil().getRenderedImageForJPanel("assets/logo.jpg", jpnlLogo);
            studentPhoto = new ImageGUIUtil().getRenderedImageForJPanel("assets/usernameIcon.jpg", jpnlStudentPhoto);
        }
    }
    
    private void setSchoolYearJComboBoxModel(){
        SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
        Object[] syStart = sydi.getAllStart().toArray();
        DefaultComboBoxModel syStartModel = new DefaultComboBoxModel();
        for(Object o : syStart){
            SchoolYear s = (SchoolYear)o;
            syStartModel.addElement(s.getYearFrom());
        }
        
        Object[] syEnd = sydi.getAllEnd().toArray();
        DefaultComboBoxModel syEndModel = new DefaultComboBoxModel();
        for(Object o : syEnd){
            SchoolYear s = (SchoolYear)o;
            syEndModel.addElement(s.getYearTo());
        }
        
    }
    
    private void setFormDetails(){
        Student student =studentDaoImpl.getStudentById(studentId);
        Integer aRegistrationId = studentDaoImpl.getRegistrationId(studentId);
        String aAdmissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId)==0?
                "Kindergarten":studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId)+"";
        String aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(studentId)==0?
                "Kindergarten":studentDaoImpl.getPresentGradeLevelByStudentId(studentId)+"";
        String aRecommendedGradeLevel = studentDaoImpl.getRecommendedGradeLevel(studentId)==0?
                "Kindergarten":studentDaoImpl.getRecommendedGradeLevel(studentId)+"";
        String aStudentId = student.getStudentId()+"";
        String aStatus = student.isActive()==true? "Active":"Inactive" ;
        String aStudentType = student.getStudentType()==1?"New":"Old";
        String aLastName = student.getRegistration().getLastName();
        String aFirstName = student.getRegistration().getFirstName();
        String aMiddleName = student.getRegistration().getMiddleName();
        String aAdmissionId = student.getAdmission().getAdmissionId()+"";
        String aAdmissionStatus = student.getAdmission().isCompleted()==true?"Complete":"Pending";
        String aAdmissionCompletionDate = student.getAdmission().getCompletionDate()==null?"--":student.getAdmission().getCompletionDate()+"";
        String isPassed = student.getPresentGradeLevel().getIsPassed()==null?
                "":student.getPresentGradeLevel().getIsPassed()+"";
        String aDateOfRegistration = student.getRegistration().getRegistrationDate()+"";
        
        jlblStatusText.setText(aStatus);
        jlblStudentIdText.setText(aStudentId);
        jlblStudentTypeText.setText(aStudentType);
        jlblRecommendedForGradeLevelText.setText(aRecommendedGradeLevel+"");
        jlblLastNameText.setText(aLastName);
        jlblFirstNameText.setText(aFirstName);
        jlblMiddleNameText.setText(aMiddleName);
        jlblAdmissionIdText.setText(aAdmissionId);
        jlblAdmissionStatusText.setText(aAdmissionStatus);
        jlblAdmissionCompletionDateText.setText(aAdmissionCompletionDate);
        jlblPresentGradeLevelText.setText(aPresentGradeLevel+"");
        jlblPassedText.setText(isPassed+"");
        jlblRecommendedForGradeLevelText.setText(aRecommendedGradeLevel+"");
        jlblAdmissionGradeLevelText.setText(aAdmissionGradeLevel);
        jlblRegistrationDateText.setText(aDateOfRegistration);
    }
    
    
    private void jbtnCancelEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelEnrollmentActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Exit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jbtnCancelEnrollmentActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if(jTabbedPane1.getSelectedIndex()==1){
            jbtnPrintRegistrationForm.setEnabled(true);
        }else{
            jbtnPrintRegistrationForm.setEnabled(false);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jbtnPrintRegistrationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintRegistrationFormActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.printDialog();
    }//GEN-LAST:event_jbtnPrintRegistrationFormActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCancelEnrollment;
    private javax.swing.JButton jbtnPrintRegistrationForm;
    private javax.swing.JLabel jlblAccountingCleared;
    private javax.swing.JLabel jlblAccuntingClearedText;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblAddressText;
    private javax.swing.JLabel jlblAdmissionCompletion;
    private javax.swing.JLabel jlblAdmissionCompletionDateText;
    private javax.swing.JLabel jlblAdmissionGradeLevel;
    private javax.swing.JLabel jlblAdmissionGradeLevelText;
    private javax.swing.JLabel jlblAdmissionIdText;
    private javax.swing.JLabel jlblAdmissionStatusText;
    private javax.swing.JLabel jlblContact;
    private javax.swing.JLabel jlblContactText;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblFirstNameText;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblGradeLevelText;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblLastNameText;
    private javax.swing.JLabel jlblMiddleName;
    private javax.swing.JLabel jlblMiddleNameText;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblNameText;
    private javax.swing.JLabel jlblPassedText;
    private javax.swing.JLabel jlblPresentGradeLevelText;
    private javax.swing.JLabel jlblRecommendedForGradeLevelText;
    private javax.swing.JLabel jlblRegistrationDateText;
    private javax.swing.JLabel jlblRegistrationIdText;
    private javax.swing.JLabel jlblRegistrationNo;
    private javax.swing.JLabel jlblSchoolYear;
    private javax.swing.JLabel jlblSchoolYearText;
    private javax.swing.JLabel jlblSection;
    private javax.swing.JLabel jlblSectionText;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JLabel jlblStatusText;
    private javax.swing.JLabel jlblStudentId;
    private javax.swing.JLabel jlblStudentIdRegistrationText;
    private javax.swing.JLabel jlblStudentIdRegistrationform;
    private javax.swing.JLabel jlblStudentIdText;
    private javax.swing.JLabel jlblStudentType;
    private javax.swing.JLabel jlblStudentTypeRegForm;
    private javax.swing.JLabel jlblStudentTypeText;
    private javax.swing.JLabel jlblTuitionHeader;
    private javax.swing.JPanel jpnlAccounting;
    private javax.swing.JPanel jpnlAdmission;
    private javax.swing.JPanel jpnlCertificateOfRegistration;
    private javax.swing.JPanel jpnlGradeLevel;
    private javax.swing.JPanel jpnlHeader;
    private javax.swing.JPanel jpnlLogo;
    private javax.swing.JPanel jpnlMiscellaneous;
    private javax.swing.JPanel jpnlOthers;
    private javax.swing.JPanel jpnlRegistrationNo;
    private javax.swing.JPanel jpnlStudentFees;
    private javax.swing.JPanel jpnlStudentPhoto;
    private javax.swing.JPanel jpnlTotal;
    private javax.swing.JPanel jpnlTuition;
    private javax.swing.JTable jtblRegformSchedule;
    // End of variables declaration//GEN-END:variables
}
