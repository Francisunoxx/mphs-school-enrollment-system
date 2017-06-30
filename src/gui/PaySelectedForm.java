package gui;

import calendar_utility.CalendarUtil;
import daoimpl.EnrollmentDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.StudentDaoImpl;
import daoimpl.TuitionFeeDaoImpl;
import utility.InputUtil;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.SchoolYear;
import model.Student;
import model.BalanceBreakDownFee;
import model.OfficialReceipt;
import model.Particulars;
import model.Payment;
import model.TuitionFee;
import org.joda.time.LocalDate;
import service.PaymentProcessor;

public class PaySelectedForm extends javax.swing.JDialog {

    private final DecimalFormat decimalFormatter = new DecimalFormat("#0.00");
    private final TuitionFeeDaoImpl tuitionFeeDaoImpl = new TuitionFeeDaoImpl();
    private final EnrollmentDaoImpl enrollmentDaoImpl = new EnrollmentDaoImpl();
    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private final StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

    TuitionFee tuitionFee;
    List<BalanceBreakDownFee> balanceBreakDownFeeList = new ArrayList<>();
    Particulars particulars = new Particulars();

    public PaySelectedForm(Particulars particulars, TuitionFee tuitionFee) {
        super(null, ModalityType.APPLICATION_MODAL);
        initComponents();

        this.particulars = particulars;
        this.tuitionFee = tuitionFee;
        setFormDetails();
    }

    private void setFormDetails() {
        jlblTotalOfFeesToPayText.setText("");
        jlblChangeText.setText("");
        DefaultListModel listModel = new DefaultListModel();
        double balanceSum = particulars.getBalanceSum();

        for (Object o : particulars.getBalanceBreakDownFees()) {
            BalanceBreakDownFee b = (BalanceBreakDownFee) o;
            double balance = b.getBalance();
            String description = b.getDescription();
            listModel.addElement(" " + description + " (" + "\u20B1" + decimalFormatter.format(balance) + " )");
        }
        jlstParticulars.setModel(listModel);
        jlblTotalOfFeesToPayText.setText("\u20B1 " + decimalFormatter.format(balanceSum));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpnlPaySelected = new javax.swing.JPanel();
        jpnlControls = new javax.swing.JPanel();
        jbtnPay = new javax.swing.JButton();
        jbtnContinue = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlblEnterAmount = new javax.swing.JLabel();
        jtfAmountEntered = new javax.swing.JTextField();
        jlblChange = new javax.swing.JLabel();
        jlblChangeText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstParticulars = new javax.swing.JList<>();
        jlblTotalOfFeesToPay = new javax.swing.JLabel();
        jlblTotalOfFeesToPayText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblDate = new javax.swing.JLabel();
        jlblDateText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 398));

        jpnlPaySelected.setPreferredSize(new java.awt.Dimension(350, 398));
        jpnlPaySelected.setLayout(new java.awt.GridBagLayout());

        jpnlControls.setLayout(new java.awt.GridBagLayout());

        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlControls.add(jbtnPay, gridBagConstraints);

        jbtnContinue.setText("Cancel");
        jbtnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlControls.add(jbtnContinue, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaySelected.add(jpnlControls, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jlblEnterAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblEnterAmount.setText("Amount Tendered");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jlblEnterAmount, gridBagConstraints);

        jtfAmountEntered.setColumns(10);
        jtfAmountEntered.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfAmountEnteredKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jtfAmountEntered, gridBagConstraints);

        jlblChange.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblChange.setText("Change :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jlblChange, gridBagConstraints);

        jlblChangeText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblChangeText.setText("ChangeText");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jlblChangeText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaySelected.add(jPanel1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Particulars :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jLabel2, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 200));

        jScrollPane1.setViewportView(jlstParticulars);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        jlblTotalOfFeesToPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblTotalOfFeesToPay.setText("Total ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jlblTotalOfFeesToPay, gridBagConstraints);

        jlblTotalOfFeesToPayText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblTotalOfFeesToPayText.setText("TotalText");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jlblTotalOfFeesToPayText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaySelected.add(jPanel3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jlblDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblDate.setText("Date :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblDate, gridBagConstraints);

        jlblDateText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblDateText.setText(CalendarUtil.getDateToday());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblDateText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPaySelected.add(jPanel2, gridBagConstraints);

        getContentPane().add(jpnlPaySelected, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processPayment() {
        SchoolYear schoolYear = tuitionFee.getSchoolYear();
        Student student = tuitionFee.getStudent();

        if (!jtfAmountEntered.getText().isEmpty()) {
            boolean amountIsValid = InputUtil.isDouble(jtfAmountEntered.getText());
            if (amountIsValid) {
                double amountTendered = Double.parseDouble(jtfAmountEntered.getText());
                if (amountTendered > 0) {
                    Payment payment = new Payment();
                    payment.setSchoolYear(schoolYear);
                    payment.setParticulars(particulars);
                    payment.setAmountTendered(amountTendered);
                    payment.setDateOfPayment(LocalDate.now().toDate());
                    PaymentProcessor paymentProcessor = new PaymentProcessor(payment);
                    payment.setChange(paymentProcessor.getChange());

                    double change = paymentProcessor.getChange();
                    jlblChangeText.setText("\u20B1 " + decimalFormatter.format(change));

                    int choice = JOptionPane.showConfirmDialog(null, "Proceed with payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION);

                    if (choice == JOptionPane.YES_OPTION) {
                        if (tuitionFee.exists()) {
                            tuitionFee.setPayment(payment);
                            boolean paid = tuitionFeeDaoImpl.pay(tuitionFee);
                            if (paid) {
                                JOptionPane.showMessageDialog(null, "Transaction complete.");
                                this.dispose();
                            } else {
//                                JOptionPane.showMessageDialog(null, "Error encountered while processing payment.");
                            }
                        } else {
                            tuitionFee.setPayment(payment);
                            boolean added = tuitionFeeDaoImpl.add(tuitionFee);
                            if (added) {
                                JOptionPane.showMessageDialog(null, "Transaction complete.");
                                this.dispose();
                                //schoolyear enrolled
                                //present gradelevel
                                //recommended gradelevel to enroll
                                //studentId
                            } else {
//                                JOptionPane.showMessageDialog(null, "Error encountered while processing payment.");
                            }
                        }
                        OfficialReceipt officialReceipt = new OfficialReceipt();
                        officialReceipt.setPayment(payment);
                        officialReceipt.setStudent(student);

                        ReceiptForm receiptForm = new ReceiptForm(officialReceipt);
                        receiptForm.setVisible(true);
                        receiptForm.pack();
                        receiptForm.setLocationRelativeTo(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Payment must be greater than 0.00");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid amount format.");
            }
        }
    }

    private void jtfAmountEnteredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAmountEnteredKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            processPayment();
        }
    }//GEN-LAST:event_jtfAmountEnteredKeyPressed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        processPayment();

    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinueActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnContinueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnContinue;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JLabel jlblChange;
    private javax.swing.JLabel jlblChangeText;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblDateText;
    private javax.swing.JLabel jlblEnterAmount;
    private javax.swing.JLabel jlblTotalOfFeesToPay;
    private javax.swing.JLabel jlblTotalOfFeesToPayText;
    private javax.swing.JList<String> jlstParticulars;
    private javax.swing.JPanel jpnlControls;
    private javax.swing.JPanel jpnlPaySelected;
    private javax.swing.JTextField jtfAmountEntered;
    // End of variables declaration//GEN-END:variables
}
