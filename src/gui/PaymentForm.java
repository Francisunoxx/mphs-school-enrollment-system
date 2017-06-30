/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import daoimpl.DiscountDaoImpl;
import daoimpl.FeeDaoImpl;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import daoimpl.PaymentTermDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.StudentDaoImpl;
import component_model_loader.DiscountML;
import component_model_loader.FeeML;
import component_model_loader.ImageGUIUtil;
import utility.InputUtil;
import component_model_loader.SchoolFeesML;
import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableCellRenderer;
import model.PresentGradeLevel;
import model.Student;
import component_renderers.JTableRenderer_Payment;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.RegistrationDaoImpl;
import daoimpl.SchoolFeesDaoImpl;
import daoimpl.TuitionFeeDaoImpl;
import java.text.DecimalFormat;
import model.BalanceBreakDownFee;
import model.Discount;
import model.Particulars;
import model.Payment;
import model.PaymentTerm;
import model.SchoolFees;
import model.SchoolYear;
import model.TuitionFee;
import service.TuitionFeeProcessor;
import threads.SchoolYearLoaderThread;

/**
 *
 * @author Jordan
 */
public class PaymentForm extends javax.swing.JPanel {

    GUIManager guiManager = new GUIManager();
    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private final RegistrationDaoImpl registrationDaoImpl = new RegistrationDaoImpl();
    private final PaymentTermDaoImpl paymentTermDaoImpl = new PaymentTermDaoImpl();
    private final DiscountDaoImpl discountDaoImpl = new DiscountDaoImpl();
    private final DiscountML discountML = new DiscountML();
    private final FeeML feeML = new FeeML();
    private final SchoolFeesML schoolFeesML = new SchoolFeesML();
    private static final SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();
    private static final StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    private final FeeDaoImpl feeDaoImpl = new FeeDaoImpl();
    private final SchoolFeesDaoImpl schoolFeesDaoImpl = new SchoolFeesDaoImpl();
    private final TuitionFeeDaoImpl tuitionFeeDaoImpl = new TuitionFeeDaoImpl();
    
    private int studentId;
    private final Image studentPhoto;
    
    public PaymentForm() {
        initComponents();
        guiManager.setGUIComponentRenderers();
        guiManager.setGUIComponentModels();
        guiManager.setGUIComponentProperties();
        guiManager.resetForm();
        studentPhoto = new ImageGUIUtil().getResourceAsImage("assets/usernameIcon.jpg", 200,200);
        SchoolYearLoaderThread sylt = new SchoolYearLoaderThread(jlblCurrentSchoolYear);
        sylt.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGrpStudentType = new javax.swing.ButtonGroup();
        jspTopPaymentFormScrollPane = new javax.swing.JScrollPane();
        jtpTopPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jpnlStudentInfo = new javax.swing.JPanel();
        jlblStudentID = new javax.swing.JLabel();
        jlblLastName = new javax.swing.JLabel();
        jlblFirstName = new javax.swing.JLabel();
        jlblMiddleName = new javax.swing.JLabel();
        jlblPreviousGradeLevel = new javax.swing.JLabel();
        jtfStudentID = new javax.swing.JTextField();
        jlblLastNameText = new javax.swing.JLabel();
        jlblFirstNameText = new javax.swing.JLabel();
        jlblMiddleNameText = new javax.swing.JLabel();
        jlblPresentGradeLevelText = new javax.swing.JLabel();
        jlblStudentType = new javax.swing.JLabel();
        jlblStudentTypeText = new javax.swing.JLabel();
        jlblAdmissionGradeLevel = new javax.swing.JLabel();
        jlblAdmissionGradeLevelText = new javax.swing.JLabel();
        jlblStudentStatus = new javax.swing.JLabel();
        jlblStudentStatusText = new javax.swing.JLabel();
        jpnlFeeSummary = new javax.swing.JPanel();
        jlblTotalFees = new javax.swing.JLabel();
        jtfBasicFee = new javax.swing.JTextField();
        jtfDiscounts = new javax.swing.JTextField();
        jlblDiscounts = new javax.swing.JLabel();
        jlblTotalPaid = new javax.swing.JLabel();
        jtfTotalPaid = new javax.swing.JTextField();
        jlblRemainingBalance = new javax.swing.JLabel();
        jtfRemainingBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfOtherFee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfTotalFees = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfMiscellaneousFee = new javax.swing.JTextField();
        jlblTotalFeesWithDiscount = new javax.swing.JLabel();
        jtfTotalFeesWithDiscount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlblCurrentSchoolYear = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblDateToday = new javax.swing.JLabel();
        jpnlPhotoContainer = new javax.swing.JPanel(){
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
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jpnlFeeCollectionItems = new javax.swing.JPanel();
    jspFeeCollectionItems = new javax.swing.JScrollPane();
    jPanel14 = new javax.swing.JPanel();
    jpnlBreakdownOfFees = new javax.swing.JPanel();
    jspAcademicFees = new javax.swing.JScrollPane();
    jtblBasicFee = new javax.swing.JTable();
    jspMiscFees = new javax.swing.JScrollPane();
    jtblMiscFees = new javax.swing.JTable();
    jspOtherFees = new javax.swing.JScrollPane();
    jtblOtherFees = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    jtblDownPaymentFee = new javax.swing.JTable();
    jPanel7 = new javax.swing.JPanel();
    jpnlBalanceBreakdown = new javax.swing.JPanel();
    jspFeesPerPaymentTerm = new javax.swing.JScrollPane();
    jtblBalanceBreakdown = new javax.swing.JTable();
    jPanel9 = new javax.swing.JPanel();
    jbtnPaySelected = new javax.swing.JButton();
    jpnlPaymentTermSelection = new javax.swing.JPanel();
    jlblPaymentTerm = new javax.swing.JLabel();
    jcmbPaymentTerm = new javax.swing.JComboBox<>();
    jpnlApplyDiscount = new javax.swing.JPanel();
    jlblDiscount = new javax.swing.JLabel();
    jcmbDiscount = new javax.swing.JComboBox<>();
    jlblPercentOfDiscount = new javax.swing.JLabel();
    jtfDiscountPercentage = new javax.swing.JTextField();
    jbtnResetDiscount = new javax.swing.JButton();
    jpnlFilter = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jcmbSchoolYearFrom = new javax.swing.JComboBox<>();
    jLabel8 = new javax.swing.JLabel();
    jcmbSchoolYearTo = new javax.swing.JComboBox<>();
    jlblPreviousBalanceFeeCheck = new javax.swing.JLabel();
    jpnlExit = new javax.swing.JPanel();
    jbtnExitPayment = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jpnlTransactionHistory = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jtblTransactionHistory = new javax.swing.JTable();
    jpnlTransactionSchoolYearFilter = new javax.swing.JPanel();
    jlblTransactionSchoolYear = new javax.swing.JLabel();
    jcmbTransactionSyYearFrom = new javax.swing.JComboBox<>();
    jPanel10 = new javax.swing.JPanel();
    jpnlReceipts = new javax.swing.JPanel();
    jpnlDiscounts = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtblDiscountsInformation = new javax.swing.JTable();
    jPanel8 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();

    setLayout(new java.awt.BorderLayout());

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel1.setLayout(new java.awt.GridBagLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setLayout(new java.awt.GridBagLayout());

    jPanel5.setLayout(new java.awt.GridBagLayout());

    jpnlStudentInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Student"));
    jpnlStudentInfo.setLayout(new java.awt.GridBagLayout());

    jlblStudentID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblStudentID.setText("Student ID");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblStudentID, gridBagConstraints);

    jlblLastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblLastName.setText("Last Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblLastName, gridBagConstraints);

    jlblFirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblFirstName.setText("First Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblFirstName, gridBagConstraints);

    jlblMiddleName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblMiddleName.setText("Middle Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblMiddleName, gridBagConstraints);

    jlblPreviousGradeLevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblPreviousGradeLevel.setText("Present :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblPreviousGradeLevel, gridBagConstraints);

    jtfStudentID.setColumns(10);
    jtfStudentID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jtfStudentID.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jtfStudentIDActionPerformed(evt);
        }
    });
    jtfStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jtfStudentIDKeyPressed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jtfStudentID, gridBagConstraints);

    jlblLastNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblLastNameText.setText("LastNameText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblLastNameText, gridBagConstraints);

    jlblFirstNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblFirstNameText.setText("FirstNameText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblFirstNameText, gridBagConstraints);

    jlblMiddleNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblMiddleNameText.setText("MiddleNameText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblMiddleNameText, gridBagConstraints);

    jlblPresentGradeLevelText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jlblPresentGradeLevelText.setText("PresentGradeLevelText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblPresentGradeLevelText, gridBagConstraints);

    jlblStudentType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblStudentType.setText("Student Type :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblStudentType, gridBagConstraints);

    jlblStudentTypeText.setText("StudentTypeText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblStudentTypeText, gridBagConstraints);

    jlblAdmissionGradeLevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblAdmissionGradeLevel.setText("Admission :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblAdmissionGradeLevel, gridBagConstraints);

    jlblAdmissionGradeLevelText.setText("AdmissionGradeLevelText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblAdmissionGradeLevelText, gridBagConstraints);

    jlblStudentStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    jlblStudentStatus.setText("Status :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblStudentStatus, gridBagConstraints);

    jlblStudentStatusText.setText("ActiveOrInactive");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInfo.add(jlblStudentStatusText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel5.add(jpnlStudentInfo, gridBagConstraints);

    jpnlFeeSummary.setBorder(javax.swing.BorderFactory.createTitledBorder("Tuition For SY"));
    jpnlFeeSummary.setLayout(new java.awt.GridBagLayout());

    jlblTotalFees.setText("Basic Fee");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jlblTotalFees, gridBagConstraints);

    jtfBasicFee.setColumns(10);
    jtfBasicFee.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfBasicFee.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfBasicFee.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfBasicFee, gridBagConstraints);

    jtfDiscounts.setColumns(10);
    jtfDiscounts.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfDiscounts.setForeground(new java.awt.Color(0, 0, 0));
    jtfDiscounts.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfDiscounts.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfDiscounts, gridBagConstraints);

    jlblDiscounts.setText("Discount");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jlblDiscounts, gridBagConstraints);

    jlblTotalPaid.setText("Total Paid");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jlblTotalPaid, gridBagConstraints);

    jtfTotalPaid.setColumns(10);
    jtfTotalPaid.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfTotalPaid.setForeground(new java.awt.Color(0, 0, 0));
    jtfTotalPaid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfTotalPaid.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfTotalPaid, gridBagConstraints);

    jlblRemainingBalance.setText("Remaining Balance");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jlblRemainingBalance, gridBagConstraints);

    jtfRemainingBalance.setColumns(10);
    jtfRemainingBalance.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfRemainingBalance.setForeground(new java.awt.Color(0, 0, 0));
    jtfRemainingBalance.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfRemainingBalance.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfRemainingBalance, gridBagConstraints);

    jLabel5.setText("Other Fees");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jLabel5, gridBagConstraints);

    jtfOtherFee.setColumns(10);
    jtfOtherFee.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfOtherFee.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfOtherFee.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfOtherFee, gridBagConstraints);

    jLabel9.setText("Total Fees");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jLabel9, gridBagConstraints);

    jtfTotalFees.setColumns(10);
    jtfTotalFees.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfTotalFees.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfTotalFees.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfTotalFees, gridBagConstraints);

    jLabel10.setText("Miscellaneous Fees");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jLabel10, gridBagConstraints);

    jtfMiscellaneousFee.setColumns(10);
    jtfMiscellaneousFee.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfMiscellaneousFee.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfMiscellaneousFee.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfMiscellaneousFee, gridBagConstraints);

    jlblTotalFeesWithDiscount.setText("Total Fees w / Discount");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jlblTotalFeesWithDiscount, gridBagConstraints);

    jtfTotalFeesWithDiscount.setColumns(10);
    jtfTotalFeesWithDiscount.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jtfTotalFeesWithDiscount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfTotalFeesWithDiscount.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeSummary.add(jtfTotalFeesWithDiscount, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel5.add(jpnlFeeSummary, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jPanel5, gridBagConstraints);

    jPanel6.setLayout(new java.awt.GridBagLayout());

    jPanel16.setLayout(new java.awt.GridBagLayout());

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel6.setText("Current School Year :  ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel16.add(jLabel6, gridBagConstraints);

    jlblCurrentSchoolYear.setText("SY");
    jlblCurrentSchoolYear.addInputMethodListener(new java.awt.event.InputMethodListener() {
        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
        }
        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            jlblCurrentSchoolYearInputMethodTextChanged(evt);
        }
    });
    jlblCurrentSchoolYear.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            jlblCurrentSchoolYearPropertyChange(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel16.add(jlblCurrentSchoolYear, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel6.add(jPanel16, gridBagConstraints);

    jLabel1.setBackground(new java.awt.Color(255, 255, 0));
    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel1.setText("Date Today: ");
    jLabel1.setOpaque(true);
    jPanel17.add(jLabel1);

    jlblDateToday.setBackground(new java.awt.Color(255, 255, 0));
    jlblDateToday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jlblDateToday.setText("Date Goes Here");
    jlblDateToday.setOpaque(true);
    jPanel17.add(jlblDateToday);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel6.add(jPanel17, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jPanel6, gridBagConstraints);

    jpnlPhotoContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlPhotoContainer.setMaximumSize(new java.awt.Dimension(200, 200));
    jpnlPhotoContainer.setMinimumSize(new java.awt.Dimension(200, 200));
    jpnlPhotoContainer.setPreferredSize(new java.awt.Dimension(200, 200));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel2.add(jpnlPhotoContainer, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jPanel2, gridBagConstraints);

    jpnlFeeCollectionItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlFeeCollectionItems.setMinimumSize(new java.awt.Dimension(381, 56));
    jpnlFeeCollectionItems.setLayout(new java.awt.GridBagLayout());

    jspFeeCollectionItems.setPreferredSize(new java.awt.Dimension(1115, 300));

    jPanel14.setLayout(new java.awt.GridBagLayout());

    jpnlBreakdownOfFees.setBorder(javax.swing.BorderFactory.createTitledBorder("School Fees"));
    jpnlBreakdownOfFees.setMinimumSize(new java.awt.Dimension(550, 550));
    jpnlBreakdownOfFees.setPreferredSize(new java.awt.Dimension(550, 550));
    jpnlBreakdownOfFees.setLayout(new java.awt.GridBagLayout());

    jspAcademicFees.setMaximumSize(new java.awt.Dimension(20, 50));
    jspAcademicFees.setMinimumSize(new java.awt.Dimension(20, 50));
    jspAcademicFees.setPreferredSize(new java.awt.Dimension(20, 50));

    jtblBasicFee.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null}
        },
        new String [] {
            "Name", "Amount"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblBasicFee.setMinimumSize(new java.awt.Dimension(30, 16));
    jtblBasicFee.setPreferredSize(new java.awt.Dimension(150, 16));
    jtblBasicFee.getTableHeader().setReorderingAllowed(false);
    jspAcademicFees.setViewportView(jtblBasicFee);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jspAcademicFees, gridBagConstraints);

    jspMiscFees.setMinimumSize(new java.awt.Dimension(500, 120));
    jspMiscFees.setPreferredSize(new java.awt.Dimension(200, 200));

    jtblMiscFees.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Name", "Amount"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblMiscFees.getTableHeader().setReorderingAllowed(false);
    jspMiscFees.setViewportView(jtblMiscFees);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jspMiscFees, gridBagConstraints);

    jspOtherFees.setMinimumSize(new java.awt.Dimension(500, 120));
    jspOtherFees.setPreferredSize(new java.awt.Dimension(200, 200));

    jtblOtherFees.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Name", "Amount"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblOtherFees.getTableHeader().setReorderingAllowed(false);
    jspOtherFees.setViewportView(jtblOtherFees);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jspOtherFees, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel2.setText("Tuition");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jLabel2, gridBagConstraints);

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel3.setText("Miscellaneous");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jLabel3, gridBagConstraints);

    jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel4.setText("Other");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jLabel4, gridBagConstraints);

    jScrollPane3.setMinimumSize(new java.awt.Dimension(20, 50));

    jtblDownPaymentFee.setAutoCreateRowSorter(true);
    jtblDownPaymentFee.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null}
        },
        new String [] {
            "Downpayment", "Amount"
        }
    ));
    jtblDownPaymentFee.getTableHeader().setReorderingAllowed(false);
    jScrollPane3.setViewportView(jtblDownPaymentFee);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBreakdownOfFees.add(jScrollPane3, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel14.add(jpnlBreakdownOfFees, gridBagConstraints);

    jPanel7.setMinimumSize(new java.awt.Dimension(550, 550));
    jPanel7.setPreferredSize(new java.awt.Dimension(550, 550));
    jPanel7.setLayout(new java.awt.GridBagLayout());

    jpnlBalanceBreakdown.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance Breakdown"));
    jpnlBalanceBreakdown.setPreferredSize(new java.awt.Dimension(266, 150));
    jpnlBalanceBreakdown.setLayout(new java.awt.GridBagLayout());

    jspFeesPerPaymentTerm.setPreferredSize(new java.awt.Dimension(250, 150));

    jtblBalanceBreakdown.setAutoCreateRowSorter(true);
    jtblBalanceBreakdown.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Description", "Amount", "Balance", "Deadline"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblBalanceBreakdown.getTableHeader().setReorderingAllowed(false);
    jtblBalanceBreakdown.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jtblBalanceBreakdownMouseClicked(evt);
        }
    });
    jspFeesPerPaymentTerm.setViewportView(jtblBalanceBreakdown);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBalanceBreakdown.add(jspFeesPerPaymentTerm, gridBagConstraints);

    jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Control"));

    jbtnPaySelected.setText("Pay Selected");
    jbtnPaySelected.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnPaySelectedActionPerformed(evt);
        }
    });
    jPanel9.add(jbtnPaySelected);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlBalanceBreakdown.add(jPanel9, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel7.add(jpnlBalanceBreakdown, gridBagConstraints);

    jpnlPaymentTermSelection.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Term"));
    jpnlPaymentTermSelection.setLayout(new java.awt.GridBagLayout());

    jlblPaymentTerm.setText("Payment Term");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlPaymentTermSelection.add(jlblPaymentTerm, gridBagConstraints);

    jcmbPaymentTerm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jcmbPaymentTerm.setEnabled(false);
    jcmbPaymentTerm.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jcmbPaymentTermItemStateChanged(evt);
        }
    });
    jcmbPaymentTerm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcmbPaymentTermActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlPaymentTermSelection.add(jcmbPaymentTerm, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel7.add(jpnlPaymentTermSelection, gridBagConstraints);

    jpnlApplyDiscount.setBorder(javax.swing.BorderFactory.createTitledBorder("Discounts"));
    jpnlApplyDiscount.setLayout(new java.awt.GridBagLayout());

    jlblDiscount.setText("Discount");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlApplyDiscount.add(jlblDiscount, gridBagConstraints);

    jcmbDiscount.setEnabled(false);
    jcmbDiscount.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jcmbDiscountItemStateChanged(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlApplyDiscount.add(jcmbDiscount, gridBagConstraints);

    jlblPercentOfDiscount.setText("%");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlApplyDiscount.add(jlblPercentOfDiscount, gridBagConstraints);

    jtfDiscountPercentage.setColumns(2);
    jtfDiscountPercentage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jtfDiscountPercentage.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jtfDiscountPercentage.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlApplyDiscount.add(jtfDiscountPercentage, gridBagConstraints);

    jbtnResetDiscount.setText("Reset Discount");
    jbtnResetDiscount.setEnabled(false);
    jbtnResetDiscount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnResetDiscountActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlApplyDiscount.add(jbtnResetDiscount, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel7.add(jpnlApplyDiscount, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel14.add(jPanel7, gridBagConstraints);

    jpnlFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
    jpnlFilter.setMinimumSize(new java.awt.Dimension(425, 70));
    jpnlFilter.setPreferredSize(new java.awt.Dimension(425, 70));
    jpnlFilter.setLayout(new java.awt.GridBagLayout());

    jLabel7.setText("School Year");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFilter.add(jLabel7, gridBagConstraints);

    jcmbSchoolYearFrom.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearStart());
    jcmbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jcmbSchoolYearFromItemStateChanged(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFilter.add(jcmbSchoolYearFrom, gridBagConstraints);

    jLabel8.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFilter.add(jLabel8, gridBagConstraints);

    jcmbSchoolYearTo.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearEnd());
    jcmbSchoolYearTo.setEnabled(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFilter.add(jcmbSchoolYearTo, gridBagConstraints);

    jlblPreviousBalanceFeeCheck.setBackground(new java.awt.Color(204, 204, 0));
    jlblPreviousBalanceFeeCheck.setText("NoticeIfNoPreviousTransactionForSchoolYear");
    jlblPreviousBalanceFeeCheck.setOpaque(true);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFilter.add(jlblPreviousBalanceFeeCheck, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel14.add(jpnlFilter, gridBagConstraints);

    jpnlExit.setLayout(new java.awt.GridBagLayout());

    jbtnExitPayment.setText("Close");
    jbtnExitPayment.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnExitPaymentActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlExit.add(jbtnExitPayment, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jPanel14.add(jpnlExit, gridBagConstraints);

    jspFeeCollectionItems.setViewportView(jPanel14);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlFeeCollectionItems.add(jspFeeCollectionItems, gridBagConstraints);

    jTabbedPane1.addTab("Fee Collection Items", jpnlFeeCollectionItems);

    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel4.setLayout(new java.awt.GridBagLayout());

    jpnlTransactionHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlTransactionHistory.setLayout(new java.awt.GridBagLayout());

    jtblTransactionHistory.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Payment ID", "Payment Term", "Balance Breakdown ID", "Description", "Amount Of Payment", "OR Number", "Date Of Payment", "School Year"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblTransactionHistory.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(jtblTransactionHistory);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlTransactionHistory.add(jScrollPane2, gridBagConstraints);

    jpnlTransactionSchoolYearFilter.setLayout(new java.awt.GridBagLayout());

    jlblTransactionSchoolYear.setText("School Year");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlTransactionSchoolYearFilter.add(jlblTransactionSchoolYear, gridBagConstraints);

    jcmbTransactionSyYearFrom.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearStart());
    jcmbTransactionSyYearFrom.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jcmbTransactionSyYearFromItemStateChanged(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlTransactionSchoolYearFilter.add(jcmbTransactionSyYearFrom, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlTransactionHistory.add(jpnlTransactionSchoolYearFilter, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jpnlTransactionHistory, gridBagConstraints);

    jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel10.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jPanel10, gridBagConstraints);

    jTabbedPane1.addTab("Payment History", jPanel4);
    jTabbedPane1.addTab("Receipts", jpnlReceipts);

    jpnlDiscounts.setLayout(new java.awt.GridBagLayout());

    jtblDiscountsInformation.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "School Year", "Discount Type", "Discount Percentage", "Amount of Discount"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(jtblDiscountsInformation);

    jpnlDiscounts.add(jScrollPane1, new java.awt.GridBagConstraints());

    jTabbedPane1.addTab("Discounts", jpnlDiscounts);
    jTabbedPane1.addTab("Adjustments", jPanel8);
    jTabbedPane1.addTab("SOA", jPanel3);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jTabbedPane1, gridBagConstraints);

    jtpTopPane.addTab("Payment Form", jPanel1);

    jspTopPaymentFormScrollPane.setViewportView(jtpTopPane);

    add(jspTopPaymentFormScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public static void setStudentPanelFields() {
        int schoolYearFrom = Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString());
        int aStudentId = getValidatedStudentIdFromTextField();
        int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(schoolYearFrom);
        Student student = studentDaoImpl.getStudentById(aStudentId);
        jlblAdmissionGradeLevelText.setText(student.getAdmissionGradeLevel().getLevel() == 0 ? "Kindergarten" : "Grade " + student.getAdmissionGradeLevel().getLevel());
        jlblStudentTypeText.setText(student.getStudentType() == 1 ? "New" : "Old");
        jlblLastNameText.setText(student.getRegistration().getLastName());
        jlblFirstNameText.setText(student.getRegistration().getFirstName());
        jlblMiddleNameText.setText(student.getRegistration().getMiddleName());
        jlblStudentStatusText.setText(studentDaoImpl.isEnrolledInSchoolYear(aStudentId, aSchoolYearId) == true ? "Active" : "Inactive");

        Integer presentGradeLevel = student.getPresentGradeLevel().getLevel();
        String prG = "";
        if (presentGradeLevel == null) {
            prG = "";
        } else if (presentGradeLevel == 0) {
            prG = "Kindergarten";
        } else {
            prG = prG + presentGradeLevel;
        }
        jlblPresentGradeLevelText.setText(prG);
    }
    
    
    class GUIManager {
        private void resetForm(){
            jlblStudentStatusText.setText("");
            jtfStudentID.setText("");
            jlblStudentTypeText.setText("");
            jlblLastNameText.setText("");
            jlblFirstNameText.setText("");
            jlblMiddleNameText.setText("");
            jlblAdmissionGradeLevelText.setText("");
            jlblPresentGradeLevelText.setText("");
            jtfBasicFee.setText("");
            jtfMiscellaneousFee.setText("");
            jtfOtherFee.setText("");
            jtfTotalFees.setText("");
            jtfDiscounts.setText("");
            jtfTotalFeesWithDiscount.setText("");
            jtfTotalPaid.setText("");
            jtfRemainingBalance.setText("");
            jlblPreviousBalanceFeeCheck.setText("");
            DefaultTableModel jtblDownPaymentFeeModel = (DefaultTableModel) jtblDownPaymentFee.getModel();
            jtblDownPaymentFeeModel.setRowCount(0);
            DefaultTableModel jtblTuitionFeeModel = (DefaultTableModel)jtblBasicFee.getModel();
            jtblTuitionFeeModel.setRowCount(0);
            DefaultTableModel jtblMiscFeesModel = (DefaultTableModel) jtblMiscFees.getModel();
            jtblMiscFeesModel.setRowCount(0);
            DefaultTableModel jtblOtherFeesModel = (DefaultTableModel) jtblOtherFees.getModel();
            jtblOtherFeesModel.setRowCount(0);
            jcmbPaymentTerm.setSelectedIndex(-1);
            jcmbPaymentTerm.setEnabled(false);
            jcmbDiscount.setSelectedIndex(-1);
            jcmbDiscount.setEnabled(false);
            jtfDiscountPercentage.setText("");
            jbtnResetDiscount.setEnabled(false);
            DefaultTableModel jtblBalanceBreakdownModel = (DefaultTableModel) jtblBalanceBreakdown.getModel();
            jtblBalanceBreakdownModel.setRowCount(0);
            jbtnPaySelected.setEnabled(false);
            DefaultTableModel jtblTransactionHistoryModel = (DefaultTableModel)jtblTransactionHistory.getModel();
            jtblTransactionHistoryModel.setRowCount(0);
            int schoolYearFrom = Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString());
            int schoolYearTo = Integer.parseInt(jcmbSchoolYearTo.getSelectedItem().toString());
            TitledBorder titledBorder;
            titledBorder = BorderFactory.createTitledBorder("Tuition Summary School Year: "+schoolYearFrom+"-"+schoolYearTo);
            jpnlFeeSummary.setBorder(titledBorder);
        }
        
        private void setGUIComponentProperties() {
            UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
            UIManager.put("ComboBox.disabledForeground", Color.BLACK);
            UIManager.put("TextField.inactiveForeground", Color.BLACK);
            UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
            UIManager.put("ComboBox.disabledForeground", Color.BLACK);
            jspFeeCollectionItems.getVerticalScrollBar().setUnitIncrement(30);
            jspTopPaymentFormScrollPane.getVerticalScrollBar().setUnitIncrement(30);
            //jtblBalanceBreakdown.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setCurrentDateJLabelText();
        }
        
        private void setGUIComponentModels(){
            setPaymentTermJComboBoxModel();
            jcmbDiscount.setModel(discountML.getListOfDiscountNamesAsComboBoxModel());
        }
        
        private void setGUIComponentRenderers() {
            int jtblBalanceBreakdownColumnCount = jtblBalanceBreakdown.getColumnCount();
            int jtblTuitionFeeColumnCount = jtblBasicFee.getColumnCount();
            int jtblMiscFeesColumnCount = jtblMiscFees.getColumnCount();
            int jtblOtherFeesColumnCount = jtblOtherFees.getColumnCount();
            int jtblDownPaymentFeeColumnCount = jtblDownPaymentFee.getColumnCount();
            int jtblTransactionHistoryColumnCount = jtblTransactionHistory.getColumnCount();

            for (int i = 0; i < jtblBalanceBreakdownColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblBalanceBreakdown.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }

            for (int i = 0; i < jtblTuitionFeeColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblBasicFee.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }

            for (int i = 0; i < jtblMiscFeesColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblMiscFees.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }

            for (int i = 0; i < jtblOtherFeesColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblOtherFees.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
            
            for (int i = 0; i < jtblDownPaymentFeeColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblDownPaymentFee.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
            
            for (int i = 0; i < jtblTransactionHistoryColumnCount; i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblTransactionHistory.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
        }

        private void setPaymentTermJComboBoxModel() {
            PaymentTermDaoImpl ptdi = new PaymentTermDaoImpl();
            DefaultComboBoxModel paymentTermModel = new DefaultComboBoxModel();
            Object[] paymentTerm = ptdi.getAllActivePaymentTerms().toArray();
            for (Object o : paymentTerm) {
                PaymentTerm pt = (PaymentTerm) o;
                paymentTermModel.addElement(pt.getPaymentTerm());
            }
            jcmbPaymentTerm.setModel(paymentTermModel);
            jcmbPaymentTerm.setSelectedIndex(-1);
        }
    }

    private void setCurrentDateJLabelText() {
        DateTime rawDateTime = new DateTime();
        //DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        String formattedDateTime = formatter.print(rawDateTime);
        jlblDateToday.setText(formattedDateTime);
    }

    private static int getValidatedStudentIdFromTextField() {
        int aStudentId = 0;
        if (!jtfStudentID.getText().isEmpty()) {
            String valueEntered = (jtfStudentID.getText());
            if (InputUtil.isInteger(valueEntered)) {
                aStudentId = Integer.parseInt(valueEntered);
            }
        }
        return aStudentId;
    }

    public static void setFeeSummaryPanelFields(int aStudentId, int aSchoolYearId) {
        int schoolYearFrom = Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString());
        int schoolYearTo = Integer.parseInt(jcmbSchoolYearTo.getSelectedItem().toString());
        TitledBorder titledBorder;
        titledBorder = BorderFactory.createTitledBorder("Tuition Summary School Year: " + schoolYearFrom + "-" + schoolYearTo);
        jpnlFeeSummary.setBorder(titledBorder);
    }
    
    private class FeeCollectionLoader{
        private final Student student;
        private final SchoolFees schoolFees;
        private final TuitionFee tuitionFee;
//        private final DecimalFormat decimalFormatter = new DecimalFormat("#0.00");
        private final DecimalFormat decimalFormatter = new DecimalFormat("#,#00.00");
        
        public FeeCollectionLoader(Student student,SchoolFees schoolFees,TuitionFee tuitionFee){
            this.student = student;
            this.schoolFees = schoolFees;
            this.tuitionFee = tuitionFee;
        }
        
        private void setForm() {
            String studentType = student.getStudentType() == 0 ? "Old" : "New";
            String lastName = student.getRegistration().getLastName();
            String firstName = student.getRegistration().getFirstName();
            String middleName = student.getRegistration().getMiddleName();
            String admissionStatus = student.getAdmission().isCompleted() == true ? "Complete" : "Not Completed";
            String presentGradeLevel = student.getPresentGradeLevel().getLevel()==0? "Kindergarten":"Grade "+student.getPresentGradeLevel().getLevel();
            String studentStatus = student.isActive() == true ? "Active" : "Inactive";
            String basicFee = decimalFormatter.format(schoolFees.getBasicFee().getAmount());
            String miscellaneousFee = decimalFormatter.format(schoolFees.getMiscellaneousFees().getSum());
            String otherFee = decimalFormatter.format(schoolFees.getOtherFees().getSum());
            String totalFees = decimalFormatter.format(tuitionFee.getSum());
            String totalPaid = decimalFormatter.format(tuitionFee.getTotalPaid());
            String remainingBalance = decimalFormatter.format(tuitionFee.getBalance());
            String paymentTerm = tuitionFee.getPaymentTerm().getPaymentTerm();
            String discount = tuitionFee.getDiscount().getDiscountName();
            String discountPercentage = tuitionFee.hasDiscount()? 
                    tuitionFee.getDiscount().getPercentOfDiscount()+"" : "";
            String discountAmount = tuitionFee.hasDiscount()?
                    tuitionFee.getDiscount().getAmount()+"" : "";
            
            jlblStudentTypeText.setText(studentType);
            jlblLastNameText.setText(lastName);
            jlblFirstNameText.setText(firstName);
            jlblMiddleNameText.setText(middleName);
            jlblAdmissionGradeLevelText.setText(admissionStatus);
            jlblPresentGradeLevelText.setText(presentGradeLevel);
            jlblStudentStatusText.setText(studentStatus);
            
            jtfBasicFee.setText(basicFee);
            jtfMiscellaneousFee.setText(miscellaneousFee);
            jtfOtherFee.setText(otherFee);
            
            jtfTotalFees.setText(totalFees);
            jtfTotalPaid.setText(totalPaid);
            jtfRemainingBalance.setText(remainingBalance);
            
            jcmbPaymentTerm.setSelectedItem(paymentTerm);
            jcmbDiscount.setSelectedItem(discount);
            jtfDiscountPercentage.setText(discountPercentage);
            jtfDiscounts.setText(discountAmount);
            
            List<BalanceBreakDownFee> balanceBreakDownFee = tuitionFee.getBalanceBreakDownFees();
            DefaultTableModel dtm = (DefaultTableModel) jtblBalanceBreakdown.getModel();
            dtm.setRowCount(0);
            for (BalanceBreakDownFee b : balanceBreakDownFee) {
                Object[] rowData = {
                    b.getDescription(),
                    decimalFormatter.format(b.getAmount()),
                    decimalFormatter.format(b.getBalance())
                };
                dtm.addRow(rowData);
            }
            jtblBalanceBreakdown.setModel(dtm);
        }
        
        
        private void changePaymentTerm(){
            String studentType = student.getStudentType() == 0 ? "Old" : "New";
            String lastName = student.getRegistration().getLastName();
            String firstName = student.getRegistration().getFirstName();
            String middleName = student.getRegistration().getMiddleName();
            String admissionStatus = student.getAdmission().isCompleted() == true ? "Complete" : "Not Completed";
            String presentGradeLevel = student.getPresentGradeLevel().getLevel()==0? "Kindergarten":"Grade "+student.getPresentGradeLevel().getLevel();
            String studentStatus = student.isActive() == true ? "Active" : "Inactive";
            String basicFee = decimalFormatter.format(schoolFees.getBasicFee().getAmount());
            String miscellaneousFee = decimalFormatter.format(schoolFees.getMiscellaneousFees().getSum());
            String otherFee = decimalFormatter.format(schoolFees.getOtherFees().getSum());
            String totalFees = decimalFormatter.format(tuitionFee.getSum());
            String totalPaid = decimalFormatter.format(tuitionFee.getTotalPaid());
            String remainingBalance = decimalFormatter.format(tuitionFee.getBalance());
            String discount = tuitionFee.getDiscount().getDiscountName();
            String discountPercentage = tuitionFee.getDiscount().getPercentOfDiscount()+"";
            
            jlblStudentTypeText.setText(studentType);
            jlblLastNameText.setText(lastName);
            jlblFirstNameText.setText(firstName);
            jlblMiddleNameText.setText(middleName);
            jlblAdmissionGradeLevelText.setText(admissionStatus);
            jlblPresentGradeLevelText.setText(presentGradeLevel);
            jlblStudentStatusText.setText(studentStatus);
            
            jtfBasicFee.setText(basicFee);
            jtfMiscellaneousFee.setText(miscellaneousFee);
            jtfOtherFee.setText(otherFee);
            
            jtfTotalFees.setText(totalFees);
            jtfTotalPaid.setText(totalPaid);
            jtfRemainingBalance.setText(remainingBalance);
            
            jcmbDiscount.setSelectedItem(discount);
            jtfDiscountPercentage.setText(discountPercentage);
            
            List<BalanceBreakDownFee> balanceBreakDownFee = tuitionFee.getBalanceBreakDownFees();
            DefaultTableModel dtm = (DefaultTableModel) jtblBalanceBreakdown.getModel();
            dtm.setRowCount(0);
            for (BalanceBreakDownFee b : balanceBreakDownFee) {
                Object[] rowData = {
                    b.getDescription(),
                    decimalFormatter.format(b.getAmount()),
                    decimalFormatter.format(b.getBalance())
                };
                dtm.addRow(rowData);
            }
            jtblBalanceBreakdown.setModel(dtm);
        }
        
        private void setSchoolFees() {
            PresentGradeLevel presentGradeLevel = student.getPresentGradeLevel();
            int gradeLevelId = gradeLevelDaoImpl.getId(presentGradeLevel);
            
            DefaultTableModel downPaymentModel = (DefaultTableModel) schoolFeesML.getDownPayment(jtblDownPaymentFee, gradeLevelId);
            for (int i = 0; i < jtblDownPaymentFee.getColumnCount(); i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblDownPaymentFee.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
            
            jtblDownPaymentFee.setModel(downPaymentModel);
            jtblBasicFee.setModel(schoolFeesML.getBasic(jtblBasicFee, gradeLevelId));
            jtblMiscFees.setModel(schoolFeesML.getMiscellaneous(jtblMiscFees, gradeLevelId));
            jtblOtherFees.setModel(schoolFeesML.getOther(jtblOtherFees, gradeLevelId));
            
            for (int i = 0; i < jtblBasicFee.getColumnCount(); i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblBasicFee.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
            for (int i = 0; i < jtblMiscFees.getColumnCount(); i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblMiscFees.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
            for (int i = 0; i < jtblOtherFees.getColumnCount(); i++) {
                TableCellRenderer myJTableRenderer = new JTableRenderer_Payment();
                jtblOtherFees.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
            }
        }
        
        private void applyDiscount(){
            String studentType = student.getStudentType() == 0 ? "Old" : "New";
            String lastName = student.getRegistration().getLastName();
            String firstName = student.getRegistration().getFirstName();
            String middleName = student.getRegistration().getMiddleName();
            String admissionStatus = student.getAdmission().isCompleted() == true ? "Complete" : "Not Completed";
            String presentGradeLevel = student.getPresentGradeLevel().getLevel()==0? "Kindergarten":"Grade "+student.getPresentGradeLevel().getLevel();
            String studentStatus = student.isActive() == true ? "Active" : "Inactive";
            String basicFee = decimalFormatter.format(schoolFees.getBasicFee().getAmount());
            String miscellaneousFee = decimalFormatter.format(schoolFees.getMiscellaneousFees().getSum());
            String otherFee = decimalFormatter.format(schoolFees.getOtherFees().getSum());
            String totalFees = decimalFormatter.format(tuitionFee.getSum());
            String totalPaid = decimalFormatter.format(tuitionFee.getTotalPaid());
            String remainingBalance = decimalFormatter.format(tuitionFee.getBalance());
            String paymentTerm = tuitionFee.getPaymentTerm().getPaymentTerm();
            String discountPercentage = tuitionFee.getDiscount().getPercentOfDiscount()+"";
            
            TuitionFeeProcessor tuitionFeeProcessor = new TuitionFeeProcessor(tuitionFee, schoolFees);
            String discountAmount = decimalFormatter.format(tuitionFeeProcessor.getDiscount());
            String tuitionFeeWithDiscount = decimalFormatter.format(tuitionFeeProcessor.getFinalTuition());
            
            jlblStudentTypeText.setText(studentType);
            jlblLastNameText.setText(lastName);
            jlblFirstNameText.setText(firstName);
            jlblMiddleNameText.setText(middleName);
            jlblAdmissionGradeLevelText.setText(admissionStatus);
            jlblPresentGradeLevelText.setText(presentGradeLevel);
            jlblStudentStatusText.setText(studentStatus);
            
            jtfBasicFee.setText(basicFee);
            jtfMiscellaneousFee.setText(miscellaneousFee);
            jtfOtherFee.setText(otherFee);
            
            jtfTotalFees.setText(totalFees);
            jtfTotalPaid.setText(totalPaid);
            jtfRemainingBalance.setText(remainingBalance);
            jtfTotalFeesWithDiscount.setText(tuitionFeeWithDiscount);
            jtfDiscounts.setText(discountAmount);
            
            jcmbPaymentTerm.setSelectedItem(paymentTerm);
            jtfDiscountPercentage.setText(discountPercentage);
            
            List<BalanceBreakDownFee> balanceBreakDownFee = tuitionFee.getBalanceBreakDownFees();
            DefaultTableModel dtm = (DefaultTableModel) jtblBalanceBreakdown.getModel();
            dtm.setRowCount(0);
            for (BalanceBreakDownFee b : balanceBreakDownFee) {
                Object[] rowData = {
                    b.getDescription(),
                    decimalFormatter.format(b.getAmount()),
                    decimalFormatter.format(b.getBalance())
                };
                dtm.addRow(rowData);
            }
            jtblBalanceBreakdown.setModel(dtm);
        }
        private void setFieldsState(){
            if(tuitionFee.exists()){
                
            }else{
                jcmbPaymentTerm.setEnabled(true);
                jcmbDiscount.setEnabled(true);
                jbtnResetDiscount.setEnabled(true);
            }
        }
    }
    
    private void jtfStudentIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfStudentIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.setStudentId(Integer.parseInt(jtfStudentID.getText().trim()));
            int aStudentId = this.getStudentId();
            int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString()));
            Student aStudent = studentDaoImpl.getStudentById(aStudentId);
            
            if (aStudent.getRegistration().exists()) {
                System.out.println("Exists @ jtfStudentIDKeyPressed");
                PresentGradeLevel presentGradeLevel = aStudent.getPresentGradeLevel();
                int aGradeLevelId = gradeLevelDaoImpl.getId(presentGradeLevel);
                
                SchoolFees aSchoolFee = schoolFeesDaoImpl.get(aGradeLevelId);
                TuitionFee tf = tuitionFeeDaoImpl.get(studentId, aSchoolYearId);
                
                if (tf.exists()) {
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, tf);
                    feeCollectionLoader.setForm();
                    feeCollectionLoader.setSchoolFees();
                    feeCollectionLoader.setFieldsState();
                } else {
                    double totalPaid = 0.00;
                    double totalFees = aSchoolFee.getSum();
                    double remainingBalance = aSchoolFee.getSum();
                    PaymentTerm paymentTerm = new PaymentTerm();
                    paymentTerm.setPaymentTerm(aStudent.getRegistration().getPaymentTerm());
                    
                    Discount discount = new Discount();
                    discount.setDiscountName(null);
                    discount.setPercentOfDiscount(0);
                    
                    TuitionFee aTuitionFee = new TuitionFee();
                    aTuitionFee.setExists(false);
                    aTuitionFee.setSum(totalFees);
                    aTuitionFee.setTotalPaid(totalPaid);
                    aTuitionFee.setBalance(remainingBalance);
                    aTuitionFee.setPaymentTerm(paymentTerm);
                    aTuitionFee.setDiscount(discount);
                    TuitionFeeProcessor tuitionFeeProcessor = new TuitionFeeProcessor(aTuitionFee, aSchoolFee);
                    aTuitionFee.setBalanceBreakDownFees(tuitionFeeProcessor.getBreakDown());
                    
                    
                    guiManager.resetForm();
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, aTuitionFee);
                    feeCollectionLoader.setForm();
                    feeCollectionLoader.setSchoolFees();
                    feeCollectionLoader.setFieldsState();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No record found for Student ID: " + studentId);
                guiManager.resetForm();
            }
        }
    }//GEN-LAST:event_jtfStudentIDKeyPressed

    private void jcmbPaymentTermItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbPaymentTermItemStateChanged
        if (jcmbPaymentTerm.getSelectedIndex() > -1) {
            int aStudentId = this.getStudentId();
            int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString()));
            Student aStudent = studentDaoImpl.getStudentById(aStudentId);
            
            if (aStudent.getRegistration().exists()) {
                PresentGradeLevel presentGradeLevel = aStudent.getPresentGradeLevel();
                int aGradeLevelId = gradeLevelDaoImpl.getId(presentGradeLevel);
                
                SchoolFees aSchoolFee = schoolFeesDaoImpl.get(aGradeLevelId);
                TuitionFee tf = tuitionFeeDaoImpl.get(studentId, aSchoolYearId);
                
                if (tf.exists()) {
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, tf);
                    feeCollectionLoader.setForm();
                } else {
                    double totalPaid = 0.00;
                    double totalFees = aSchoolFee.getSum();
                    double remainingBalance = aSchoolFee.getSum();
                    PaymentTerm aPaymentTerm = new PaymentTerm();
                    aPaymentTerm.setPaymentTerm(jcmbPaymentTerm.getSelectedItem().toString().trim());
                    Discount aDiscount = new Discount();
                    aDiscount.setDiscountName(null);
                    aDiscount.setPercentOfDiscount(0);
                    
                    TuitionFee aTuitionFee = new TuitionFee();
                    aTuitionFee.setExists(false);
                    aTuitionFee.setSum(totalFees);
                    aTuitionFee.setTotalPaid(totalPaid);
                    aTuitionFee.setBalance(remainingBalance);
                    aTuitionFee.setPaymentTerm(aPaymentTerm);
                    aTuitionFee.setDiscount(aDiscount);
                    TuitionFeeProcessor tuitionFeeBreaker = new TuitionFeeProcessor(aTuitionFee, aSchoolFee);
                    aTuitionFee.setBalanceBreakDownFees(tuitionFeeBreaker.getBreakDown());
                    
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, aTuitionFee);
                    feeCollectionLoader.changePaymentTerm();
                }
            } 
        }
    }//GEN-LAST:event_jcmbPaymentTermItemStateChanged

    private void jcmbPaymentTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbPaymentTermActionPerformed
    }//GEN-LAST:event_jcmbPaymentTermActionPerformed

    private void jtfStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfStudentIDActionPerformed

    }//GEN-LAST:event_jtfStudentIDActionPerformed

    private void jbtnPaySelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaySelectedActionPerformed
        if (jtblBalanceBreakdown.getSelectedRow() > -1) {
            int aSchoolYearStart = Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString());
            int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(aSchoolYearStart);
            int aStudentId = this.getStudentId();

            Discount discount = null;
            PaymentTerm paymentTerm = new PaymentTerm();
            SchoolYear schoolYear = schoolYearDaoImpl.getSchoolYearById(aSchoolYearId);
            TuitionFee tuitionFee = new TuitionFee();
            Particulars particulars = new Particulars();
            List<BalanceBreakDownFee> balanceBreakDownFees = new ArrayList<>();
            Student student = studentDaoImpl.getStudentById(aStudentId);
            int gradeLevelId = gradeLevelDaoImpl.getId(student.getPresentGradeLevel());
            SchoolFees schoolFees = schoolFeesDaoImpl.get(gradeLevelId);
            
            int[] selectedRows = jtblBalanceBreakdown.getSelectedRows();
            int jtblBalanceColumn = 2;
            double particularSum = 0;
            for (int i = 0; i < selectedRows.length; i++) {
                double balanceAmount = Double.parseDouble(jtblBalanceBreakdown.getValueAt(selectedRows[i], jtblBalanceColumn).toString());
                if (balanceAmount > 0) {
                    String description = "" + jtblBalanceBreakdown.getValueAt(selectedRows[i], 0);
                    double amount = Double.parseDouble(jtblBalanceBreakdown.getValueAt(selectedRows[i], 1).toString());
                    double balance = Double.parseDouble(jtblBalanceBreakdown.getValueAt(selectedRows[i], 2).toString());

                    BalanceBreakDownFee balanceFeeToPay = new BalanceBreakDownFee();
                    balanceFeeToPay.setDescription(description); 
                    balanceFeeToPay.setAmount(amount); 
                    balanceFeeToPay.setBalance(balance); 
                    balanceFeeToPay.setStudentId(aStudentId);
                    balanceFeeToPay.setSchoolYearId(aSchoolYearId);

                    balanceBreakDownFees.add(balanceFeeToPay);
                    particularSum += balance;
                    particulars.setBalanceBreakDownFees(balanceBreakDownFees);
                    particulars.setBalanceSum(particularSum);
                }
            }
            
//            boolean feesAreZero = particulars.getBalanceBreakDownFees().size() <= 0;
//            boolean hasRemainingBalance = particulars.getBalanceBreakDownFees().size() > 0;
//            if (feesAreZero) {
//                JOptionPane.showMessageDialog(null,"All fees are already paid.");
//            }else if(hasRemainingBalance){
//                paymentTerm.setPaymentTerm(jcmbPaymentTerm.getSelectedItem().toString().trim());
//                paymentTerm.setId(paymentTermDaoImpl.getId(jcmbPaymentTerm.getSelectedItem().toString().trim()));
//            }
            
            if (!tuitionFeeDaoImpl.get(aStudentId, aSchoolYearId).exists()) {
                System.out.print("TuitionFee doesn't exist\n");
                if (jcmbDiscount.getSelectedIndex() > -1) {
                    String discountName = jcmbDiscount.getSelectedItem().toString().trim();
                    int discountId = discountDaoImpl.getId(discountName);
                    discount = discountDaoImpl.get(discountId);
                }
                paymentTerm.setPaymentTerm(jcmbPaymentTerm.getSelectedItem().toString().trim());
                paymentTerm.setId(paymentTermDaoImpl.getId(jcmbPaymentTerm.getSelectedItem().toString().trim()));
                
                tuitionFee.setExists(false);
                tuitionFee.setDiscount(discount);
                tuitionFee.setPaymentTerm(paymentTerm);
                tuitionFee.setTotalPaid(0.00);
                tuitionFee.setSum(schoolFees.getSum());
                tuitionFee.setBalance(schoolFees.getSum());
                TuitionFeeProcessor tuitionFeeProcessor = new TuitionFeeProcessor(tuitionFee, schoolFees);
                System.out.println("At Pay Selected Action Performed: ");
                tuitionFee.setBalanceBreakDownFees(tuitionFeeProcessor.getBreakDown());
                tuitionFee.setSchoolYear(schoolYear);
                tuitionFee.setStudent(student);
                
                
                PaySelectedForm psf = new PaySelectedForm(particulars, tuitionFee);
                psf.setPreferredSize(new Dimension(540, 450));
                psf.pack();
                psf.setLocationRelativeTo(null);
                psf.setVisible(true);
            }else{
                TuitionFee t = tuitionFeeDaoImpl.get(studentId, aSchoolYearId);
                t.setExists(true);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select an item to pay.");
        }
    }//GEN-LAST:event_jbtnPaySelectedActionPerformed

    private void jcmbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearFromItemStateChanged
        jcmbSchoolYearTo.setSelectedIndex(jcmbSchoolYearFrom.getSelectedIndex());
    }//GEN-LAST:event_jcmbSchoolYearFromItemStateChanged

    private void jcmbDiscountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbDiscountItemStateChanged
        if (jcmbDiscount.getSelectedIndex() > -1) {
            int aStudentId = this.getStudentId();
            int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString()));
            Student aStudent = studentDaoImpl.getStudentById(aStudentId);

            if (aStudent.getRegistration().exists()) {
                PresentGradeLevel presentGradeLevel = aStudent.getPresentGradeLevel();
                int aGradeLevelId = gradeLevelDaoImpl.getId(presentGradeLevel);

                SchoolFees aSchoolFee = schoolFeesDaoImpl.get(aGradeLevelId);
                TuitionFee tf = tuitionFeeDaoImpl.get(studentId, aSchoolYearId);

                if (tf.exists()) {
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent, aSchoolFee, tf);
                    feeCollectionLoader.setForm();
                } else {
                    double totalPaid = 0.00;
                    double totalFees = aSchoolFee.getSum();
                    double remainingBalance = aSchoolFee.getSum();
                    PaymentTerm aPaymentTerm = new PaymentTerm();
                    aPaymentTerm.setPaymentTerm(jcmbPaymentTerm.getSelectedItem().toString().trim());

                    String discountName = jcmbDiscount.getSelectedItem().toString().trim();
                    int discountId = discountDaoImpl.getId(discountName);
                    Discount aDiscount = discountDaoImpl.get(discountId);
                    double discountAmount = (aSchoolFee.getSum() - aDiscount.getPercentOfDiscount() )/100;
                    aDiscount.setAmount(discountAmount);

                    TuitionFee aTuitionFee = new TuitionFee();
                    aTuitionFee.setExists(false);
                    aTuitionFee.setSum(totalFees);
                    aTuitionFee.setTotalPaid(totalPaid);
                    aTuitionFee.setBalance(remainingBalance);
                    aTuitionFee.setPaymentTerm(aPaymentTerm);
                    aTuitionFee.setDiscount(aDiscount);
                    TuitionFeeProcessor tuitionFeeProcessor = new TuitionFeeProcessor(aTuitionFee, aSchoolFee);
                    aTuitionFee.setBalanceBreakDownFees(tuitionFeeProcessor.getBreakDown());

                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent, aSchoolFee, aTuitionFee);
                    feeCollectionLoader.applyDiscount();
                }
            }
        }
    }//GEN-LAST:event_jcmbDiscountItemStateChanged

    private void jbtnResetDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetDiscountActionPerformed
            int aStudentId = this.getStudentId();
            int aSchoolYearId = schoolYearDaoImpl.getSchoolYearId(Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString()));
            Student aStudent = studentDaoImpl.getStudentById(aStudentId);
            
            if (aStudent.getRegistration().exists()) {
                PresentGradeLevel presentGradeLevel = aStudent.getPresentGradeLevel();
                int aGradeLevelId = gradeLevelDaoImpl.getId(presentGradeLevel);
                
                SchoolFees aSchoolFee = schoolFeesDaoImpl.get(aGradeLevelId);
                TuitionFee tf = tuitionFeeDaoImpl.get(studentId, aSchoolYearId);
                
                if (tf.exists()) {
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, tf);
                    feeCollectionLoader.setForm();
                } else {
                    double totalPaid = 0.00;
                    double totalFees = aSchoolFee.getSum();
                    double remainingBalance = aSchoolFee.getSum();
                    PaymentTerm paymentTerm = new PaymentTerm();
                    paymentTerm.setPaymentTerm(aStudent.getRegistration().getPaymentTerm());
                    Discount discount = new Discount();
                    discount.setDiscountName(null);
                    discount.setPercentOfDiscount(0);
                    
                    TuitionFee aTuitionFee = new TuitionFee();
                    aTuitionFee.setExists(false);
                    aTuitionFee.setSum(totalFees);
                    aTuitionFee.setTotalPaid(totalPaid);
                    aTuitionFee.setBalance(remainingBalance);
                    aTuitionFee.setPaymentTerm(paymentTerm);
                    aTuitionFee.setDiscount(discount);
                    TuitionFeeProcessor tuitionFeeProcessor = new TuitionFeeProcessor(aTuitionFee, aSchoolFee);
                    aTuitionFee.setBalanceBreakDownFees(tuitionFeeProcessor.getBreakDown());
                    
                    
                    guiManager.resetForm();
                    FeeCollectionLoader feeCollectionLoader = new FeeCollectionLoader(aStudent,aSchoolFee, aTuitionFee);
                    feeCollectionLoader.setForm();
                    feeCollectionLoader.setSchoolFees();
                    feeCollectionLoader.setFieldsState();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No record found for Student ID: " + studentId);
                guiManager.resetForm();
            }
    }//GEN-LAST:event_jbtnResetDiscountActionPerformed

    private void jcmbTransactionSyYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbTransactionSyYearFromItemStateChanged
        
    }//GEN-LAST:event_jcmbTransactionSyYearFromItemStateChanged

    private void jlblCurrentSchoolYearInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jlblCurrentSchoolYearInputMethodTextChanged

    }//GEN-LAST:event_jlblCurrentSchoolYearInputMethodTextChanged

    private void jlblCurrentSchoolYearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jlblCurrentSchoolYearPropertyChange
        jcmbSchoolYearFrom.setSelectedItem(SchoolYearDaoImpl.getCurrentSchoolYearFrom());
        jcmbTransactionSyYearFrom.setSelectedItem(SchoolYearDaoImpl.getCurrentSchoolYearFrom());
    }//GEN-LAST:event_jlblCurrentSchoolYearPropertyChange

    private void jtblBalanceBreakdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblBalanceBreakdownMouseClicked
        jbtnPaySelected.setEnabled(true);
    }//GEN-LAST:event_jtblBalanceBreakdownMouseClicked

    private void jbtnExitPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitPaymentActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Exit Payment?", "Exit", JOptionPane.WARNING_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            int index = TopContainer.jtpTopTabbedPane.getSelectedIndex();
            TopContainer.jtpTopTabbedPane.remove(index);
            TopContainer.setPAYMENTS_INSTANCE(0);
        }
    }//GEN-LAST:event_jbtnExitPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpStudentType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnExitPayment;
    private javax.swing.JButton jbtnPaySelected;
    private javax.swing.JButton jbtnResetDiscount;
    private javax.swing.JComboBox<String> jcmbDiscount;
    private javax.swing.JComboBox<String> jcmbPaymentTerm;
    public static javax.swing.JComboBox<String> jcmbSchoolYearFrom;
    public static javax.swing.JComboBox<String> jcmbSchoolYearTo;
    public static javax.swing.JComboBox<String> jcmbTransactionSyYearFrom;
    private javax.swing.JLabel jlblAdmissionGradeLevel;
    private static javax.swing.JLabel jlblAdmissionGradeLevelText;
    private javax.swing.JLabel jlblCurrentSchoolYear;
    private javax.swing.JLabel jlblDateToday;
    private javax.swing.JLabel jlblDiscount;
    private javax.swing.JLabel jlblDiscounts;
    private javax.swing.JLabel jlblFirstName;
    private static javax.swing.JLabel jlblFirstNameText;
    private javax.swing.JLabel jlblLastName;
    private static javax.swing.JLabel jlblLastNameText;
    private javax.swing.JLabel jlblMiddleName;
    private static javax.swing.JLabel jlblMiddleNameText;
    private javax.swing.JLabel jlblPaymentTerm;
    private javax.swing.JLabel jlblPercentOfDiscount;
    private static javax.swing.JLabel jlblPresentGradeLevelText;
    private javax.swing.JLabel jlblPreviousBalanceFeeCheck;
    private javax.swing.JLabel jlblPreviousGradeLevel;
    private javax.swing.JLabel jlblRemainingBalance;
    private javax.swing.JLabel jlblStudentID;
    private javax.swing.JLabel jlblStudentStatus;
    private static javax.swing.JLabel jlblStudentStatusText;
    private javax.swing.JLabel jlblStudentType;
    private static javax.swing.JLabel jlblStudentTypeText;
    private javax.swing.JLabel jlblTotalFees;
    private javax.swing.JLabel jlblTotalFeesWithDiscount;
    private javax.swing.JLabel jlblTotalPaid;
    private javax.swing.JLabel jlblTransactionSchoolYear;
    private javax.swing.JPanel jpnlApplyDiscount;
    private javax.swing.JPanel jpnlBalanceBreakdown;
    private javax.swing.JPanel jpnlBreakdownOfFees;
    private javax.swing.JPanel jpnlDiscounts;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlFeeCollectionItems;
    public static javax.swing.JPanel jpnlFeeSummary;
    private javax.swing.JPanel jpnlFilter;
    private javax.swing.JPanel jpnlPaymentTermSelection;
    private javax.swing.JPanel jpnlPhotoContainer;
    private javax.swing.JPanel jpnlReceipts;
    private javax.swing.JPanel jpnlStudentInfo;
    private javax.swing.JPanel jpnlTransactionHistory;
    private javax.swing.JPanel jpnlTransactionSchoolYearFilter;
    private javax.swing.JScrollPane jspAcademicFees;
    private javax.swing.JScrollPane jspFeeCollectionItems;
    private javax.swing.JScrollPane jspFeesPerPaymentTerm;
    private javax.swing.JScrollPane jspMiscFees;
    private javax.swing.JScrollPane jspOtherFees;
    private javax.swing.JScrollPane jspTopPaymentFormScrollPane;
    public static javax.swing.JTable jtblBalanceBreakdown;
    private javax.swing.JTable jtblBasicFee;
    private javax.swing.JTable jtblDiscountsInformation;
    private javax.swing.JTable jtblDownPaymentFee;
    private javax.swing.JTable jtblMiscFees;
    private javax.swing.JTable jtblOtherFees;
    public static javax.swing.JTable jtblTransactionHistory;
    public static javax.swing.JTextField jtfBasicFee;
    private javax.swing.JTextField jtfDiscountPercentage;
    public static javax.swing.JTextField jtfDiscounts;
    private javax.swing.JTextField jtfMiscellaneousFee;
    private javax.swing.JTextField jtfOtherFee;
    public static javax.swing.JTextField jtfRemainingBalance;
    private static javax.swing.JTextField jtfStudentID;
    private javax.swing.JTextField jtfTotalFees;
    private javax.swing.JTextField jtfTotalFeesWithDiscount;
    public static javax.swing.JTextField jtfTotalPaid;
    private javax.swing.JTabbedPane jtpTopPane;
    // End of variables declaration//GEN-END:variables
}
