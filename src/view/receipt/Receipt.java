/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.receipt;

import daoimpl.SchoolYearDaoImpl;
import daoimpl.StudentDaoImpl;
import component_utility.ImageGUIUtil;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.SchoolYear;
import model.Student;
import model.BalanceBreakDownFee;
import model.OfficialReceipt;
import model.Particulars;
import model.Payment;

/**
 *
 * @author Jordan
 */
public class Receipt extends javax.swing.JDialog {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private final SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();
    private final DecimalFormat decimalFormatter = new DecimalFormat("#0.00");
    private final Image schoolLogo;
    private final Payment payment;
    private final Student student;
    private final SchoolYear schoolYear;
    private final Particulars particulars;
    
    public Receipt(OfficialReceipt officialReceipt) {
        super(null, ModalityType.APPLICATION_MODAL);
        initComponents();
        schoolLogo = new ImageGUIUtil().getResourceAsImage("assets/logo.jpg", 200, 200);
        
        this.particulars = officialReceipt.getPayment().getParticulars();
        this.payment = officialReceipt.getPayment();
        this.student = officialReceipt.getStudent();
        this.schoolYear = officialReceipt.getPayment().getSchoolYear();
        setFormDetails();
        
        JTableHeader header = jtblParticulars.getTableHeader();
        header.setBackground(Color.WHITE);
        header.setForeground(Color.BLACK);
        jtblParticulars.setShowGrid(false);
        jtblParticulars.setShowHorizontalLines(false);
        jtblParticulars.setShowVerticalLines(false);
    }

    
        private void setFormDetails(){
            int studentId = student.getStudentId();
            String firstName = student.getRegistration().getFirstName();
            String lastName = student.getRegistration().getLastName();
            String middleName = student.getRegistration().getMiddleName();
            String studentName = lastName + ", " + firstName + " " + middleName;
            String roomHouseNo = student.getRegistration().getAddressRoomOrHouseNo() + " ";
            String street = student.getRegistration().getAddressStreet() + " ";
            String brgyOrSubd = student.getRegistration().getAddressBrgyOrSubd() + " ";
            String city = student.getRegistration().getAddressCity();
            String address = roomHouseNo + street + brgyOrSubd + city;
            String gradeLevel = student.getPresentGradeLevel().getLevel()+"";
                    
            double amountTendered = payment.getAmountTendered();
            double change = payment.getChange();
            double particularsBalanceSum = particulars.getBalanceSum();
            
            int schoolYearFrom = schoolYear.getYearFrom();
            int schoolYearTo = schoolYear.getYearTo();
            
            Date date = new Date();
            jlblDateOfPayment.setText(dateFormat.format(date));
            
            jlblStudentIdText.setText(studentId+"");
            jlblNameText.setText(studentName);
            jlblAddressText.setText(address);
            jlblTotalPaymentDueText.setText("\u20B1 "+decimalFormatter.format(particularsBalanceSum)+"");
            jlblCashText.setText("\u20B1 " + decimalFormatter.format(particularsBalanceSum) + "");
            jlblCashReceivedText.setText("\u20B1 " + decimalFormatter.format(amountTendered) + "");
            jlblChangeText.setText("\u20B1 "+ decimalFormatter.format(change));
            jlblGradeLevelText.setText(gradeLevel);
            jlblSchoolYearText.setText(schoolYearFrom+" - "+schoolYearTo);
            
            DefaultTableModel tableModel = (DefaultTableModel) jtblParticulars.getModel();
            tableModel.setRowCount(0);

            for (Object o : particulars.getBalanceBreakDownFees()) {
                BalanceBreakDownFee b = (BalanceBreakDownFee) o;
                double balance = b.getBalance();
                String description = b.getDescription();
                tableModel.addRow(new Object[]{description, " (" + "\u20B1" + decimalFormatter.format(balance) + " )"});
            }
            jtblParticulars.setModel(tableModel);
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
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
    jlblTransactionNo = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jpnlContainer = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jlblCashText = new javax.swing.JLabel();
    jlblCashReceivedText = new javax.swing.JLabel();
    jlblChangeText = new javax.swing.JLabel();
    jpnlPaymentInformation = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtblParticulars = new javax.swing.JTable();
    jLabel12 = new javax.swing.JLabel();
    jlblTotalPaymentDueText = new javax.swing.JLabel();
    jpnlStudentInformation = new javax.swing.JPanel();
    jlblStudentIdText = new javax.swing.JLabel();
    jlblName = new javax.swing.JLabel();
    jlblNameText = new javax.swing.JLabel();
    jlblAddress = new javax.swing.JLabel();
    jlblAddressText = new javax.swing.JLabel();
    jlblSchoolYear = new javax.swing.JLabel();
    jlblSchoolYearText = new javax.swing.JLabel();
    jlblGradeLevel = new javax.swing.JLabel();
    jlblGradeLevelText = new javax.swing.JLabel();
    jlblDate = new javax.swing.JLabel();
    jlblDateOfPayment = new javax.swing.JLabel();
    jlblStudentId = new javax.swing.JLabel();
    jPanel5 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(650, 650));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setPreferredSize(new java.awt.Dimension(650, 750));
    jPanel1.setLayout(new java.awt.GridBagLayout());

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
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlHeader.add(jpnlLogo, gridBagConstraints);

    jPanel10.setBackground(new java.awt.Color(255, 255, 255));
    jPanel10.setPreferredSize(new java.awt.Dimension(420, 18));
    jPanel10.setLayout(new java.awt.GridBagLayout());

    jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 114, 188));
    jLabel5.setText("Mother of Perpetual Help School");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel10.add(jLabel5, gridBagConstraints);

    jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(51, 51, 51));
    jLabel7.setText("Iris Street Dahlia, West Fairview Quezon City");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel10.add(jLabel7, gridBagConstraints);

    jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(51, 51, 51));
    jLabel8.setText("1118 Metro Manila, Philippines");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel10.add(jLabel8, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    jpnlHeader.add(jPanel10, gridBagConstraints);

    jpnlRegistrationNo.setBackground(new java.awt.Color(255, 255, 255));
    jpnlRegistrationNo.setLayout(new java.awt.GridBagLayout());

    jlblTransactionNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    jlblTransactionNo.setForeground(new java.awt.Color(51, 51, 51));
    jlblTransactionNo.setText("No.");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(10, 2, 2, 2);
    jpnlRegistrationNo.add(jlblTransactionNo, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jpnlHeader.add(jpnlRegistrationNo, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jpnlHeader, gridBagConstraints);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new java.awt.GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("OFFICIAL RECEIPT");
    jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jPanel2, gridBagConstraints);

    jpnlContainer.setBackground(new java.awt.Color(255, 255, 255));
    jpnlContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    jpnlContainer.setForeground(new java.awt.Color(0, 0, 0));
    jpnlContainer.setLayout(new java.awt.GridBagLayout());

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel4.setLayout(new java.awt.GridBagLayout());

    jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("Cash");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jLabel3, gridBagConstraints);

    jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("Cash Received");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jLabel4, gridBagConstraints);

    jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("Change");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jLabel6, gridBagConstraints);

    jlblCashText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblCashText.setForeground(new java.awt.Color(0, 0, 0));
    jlblCashText.setText("CashText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jlblCashText, gridBagConstraints);

    jlblCashReceivedText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblCashReceivedText.setForeground(new java.awt.Color(0, 0, 0));
    jlblCashReceivedText.setText("CashReceivedText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jlblCashReceivedText, gridBagConstraints);

    jlblChangeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblChangeText.setForeground(new java.awt.Color(0, 0, 0));
    jlblChangeText.setText("ChangeText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel4.add(jlblChangeText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlContainer.add(jPanel4, gridBagConstraints);

    jpnlPaymentInformation.setBackground(new java.awt.Color(255, 255, 255));
    jpnlPaymentInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlPaymentInformation.setLayout(new java.awt.GridBagLayout());

    jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

    jtblParticulars.setBackground(new java.awt.Color(255, 255, 255));
    jtblParticulars.setForeground(new java.awt.Color(0, 0, 0));
    jtblParticulars.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Item Name", "Amount"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jtblParticulars.setGridColor(new java.awt.Color(255, 255, 255));
    jtblParticulars.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(jtblParticulars);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlPaymentInformation.add(jScrollPane1, gridBagConstraints);

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Total Payment Due :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlPaymentInformation.add(jLabel12, gridBagConstraints);

    jlblTotalPaymentDueText.setBackground(new java.awt.Color(255, 255, 255));
    jlblTotalPaymentDueText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblTotalPaymentDueText.setForeground(new java.awt.Color(0, 0, 0));
    jlblTotalPaymentDueText.setText("TotalPaymentDueText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlPaymentInformation.add(jlblTotalPaymentDueText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlContainer.add(jpnlPaymentInformation, gridBagConstraints);

    jpnlStudentInformation.setBackground(new java.awt.Color(255, 255, 255));
    jpnlStudentInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlStudentInformation.setLayout(new java.awt.GridBagLayout());

    jlblStudentIdText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblStudentIdText.setForeground(new java.awt.Color(0, 0, 0));
    jlblStudentIdText.setText("Student ID Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblStudentIdText, gridBagConstraints);

    jlblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblName.setForeground(new java.awt.Color(0, 0, 0));
    jlblName.setText("Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblName, gridBagConstraints);

    jlblNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblNameText.setForeground(new java.awt.Color(0, 0, 0));
    jlblNameText.setText("Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblNameText, gridBagConstraints);

    jlblAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblAddress.setForeground(new java.awt.Color(0, 0, 0));
    jlblAddress.setText("Address");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblAddress, gridBagConstraints);

    jlblAddressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblAddressText.setForeground(new java.awt.Color(0, 0, 0));
    jlblAddressText.setText("AddressText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblAddressText, gridBagConstraints);

    jlblSchoolYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblSchoolYear.setForeground(new java.awt.Color(0, 0, 0));
    jlblSchoolYear.setText("School Year");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblSchoolYear, gridBagConstraints);

    jlblSchoolYearText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblSchoolYearText.setForeground(new java.awt.Color(0, 0, 0));
    jlblSchoolYearText.setText("SchoolYearText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblSchoolYearText, gridBagConstraints);

    jlblGradeLevel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblGradeLevel.setForeground(new java.awt.Color(0, 0, 0));
    jlblGradeLevel.setText("Grade Level");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblGradeLevel, gridBagConstraints);

    jlblGradeLevelText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblGradeLevelText.setForeground(new java.awt.Color(0, 0, 0));
    jlblGradeLevelText.setText("GradeLevelText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblGradeLevelText, gridBagConstraints);

    jlblDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblDate.setForeground(new java.awt.Color(0, 0, 0));
    jlblDate.setText("Date");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblDate, gridBagConstraints);

    jlblDateOfPayment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblDateOfPayment.setForeground(new java.awt.Color(0, 0, 0));
    jlblDateOfPayment.setText("DateOfPaymentText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblDateOfPayment, gridBagConstraints);

    jlblStudentId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jlblStudentId.setForeground(new java.awt.Color(0, 0, 0));
    jlblStudentId.setText("Student ID :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlStudentInformation.add(jlblStudentId, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlContainer.add(jpnlStudentInformation, gridBagConstraints);

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel5.setForeground(new java.awt.Color(0, 0, 0));
    jPanel5.setLayout(new java.awt.GridBagLayout());

    jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Received By: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel5.add(jLabel13, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlContainer.add(jPanel5, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    jPanel1.add(jpnlContainer, gridBagConstraints);

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 114, 188));
    jLabel2.setText("Kindly count your change, check your name and amount paid before leaving the counter");
    jPanel3.add(jLabel2);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel1.add(jPanel3, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    getContentPane().add(jPanel1, gridBagConstraints);

    jMenu1.setText("File");

    jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem1.setText("Print");
    jMenu1.add(jMenuItem1);

    jMenuItem2.setText("Exit");
    jMenu1.add(jMenuItem2);

    jMenuBar1.add(jMenu1);

    setJMenuBar(jMenuBar1);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblAddressText;
    private javax.swing.JLabel jlblCashReceivedText;
    private javax.swing.JLabel jlblCashText;
    private javax.swing.JLabel jlblChangeText;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblDateOfPayment;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblGradeLevelText;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblNameText;
    private javax.swing.JLabel jlblSchoolYear;
    private javax.swing.JLabel jlblSchoolYearText;
    private javax.swing.JLabel jlblStudentId;
    private javax.swing.JLabel jlblStudentIdText;
    private javax.swing.JLabel jlblTotalPaymentDueText;
    private javax.swing.JLabel jlblTransactionNo;
    private javax.swing.JPanel jpnlContainer;
    private javax.swing.JPanel jpnlHeader;
    private javax.swing.JPanel jpnlLogo;
    private javax.swing.JPanel jpnlPaymentInformation;
    private javax.swing.JPanel jpnlRegistrationNo;
    private javax.swing.JPanel jpnlStudentInformation;
    private javax.swing.JTable jtblParticulars;
    // End of variables declaration//GEN-END:variables
}
