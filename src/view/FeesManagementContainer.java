/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import daoimpl.DiscountDaoImpl;
import daoimpl.FeeDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import component_model_loader.DiscountML;
import component_model_loader.FeeML;
import component_model_loader.JPanelGUIUtil;
import daoimpl.SchoolYearDaoImpl;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.GradeLevel;
import model.SchoolYear;
import model.Discount;
import model.Fee;
import model.FeeCategory;
import utility.InputUtil;

public class FeesManagementContainer extends javax.swing.JPanel {
    DiscountDaoImpl ddi = new DiscountDaoImpl();
    SchoolYearDaoImpl sdi = new SchoolYearDaoImpl();
    FeeDaoImpl fdi = new FeeDaoImpl();
    FeeML feeML = new FeeML();
    DiscountML discountGUIUtil = new DiscountML();
    GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    
    public FeesManagementContainer() {
        initComponents();
        
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        UIManager.put("TextField.disabledBackground", new Color(255, 255, 255));
        UIManager.put("TextField.inactiveForeground", Color.BLACK);
        jtaDiscountDescriptionUpdate.setDisabledTextColor(Color.BLACK);
        SpinnerNumberModel spinnerModel1 = new SpinnerNumberModel(0, 0, 100, 1);
        jsprPercentOfDiscountUpdate.setModel(spinnerModel1);
        SpinnerNumberModel spinnerModel2 = new SpinnerNumberModel(0, 0, 100, 1);
        jsprPercentOfDiscountCreate.setModel(spinnerModel2);
        reloadDiscountList();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel13 = new javax.swing.JPanel();
        feesCardContainer = new javax.swing.JPanel();
        jtpFeesTopTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jpnlCreateNewFeeFields = new javax.swing.JPanel();
        jtpFees = new javax.swing.JTabbedPane();
        jpnlFeeCreationTab = new javax.swing.JPanel();
        jspFeeCreation = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jpnlCreateFee = new javax.swing.JPanel();
        jpnlCreateNewFeeDescription = new javax.swing.JPanel();
        jspFeeDescription = new javax.swing.JScrollPane();
        jtaFeeDescription = new javax.swing.JTextArea();
        jpnlCreateFeeControls = new javax.swing.JPanel();
        jbtnClear = new javax.swing.JButton();
        jbtnCreateFee = new javax.swing.JButton();
        jpnlFeeAmount = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jtfKindergartenAmount = new javax.swing.JTextField();
        jtfGrade1Amount = new javax.swing.JTextField();
        jtfGrade2Amount = new javax.swing.JTextField();
        jtfGrade3Amount = new javax.swing.JTextField();
        jtfGrade4Amount = new javax.swing.JTextField();
        jtfGrade5Amount = new javax.swing.JTextField();
        jtfGrade6Amount = new javax.swing.JTextField();
        jtfGrade7Amount = new javax.swing.JTextField();
        jtfGrade8Amount = new javax.swing.JTextField();
        jtfGrade9Amount = new javax.swing.JTextField();
        jtfGrade10Amount = new javax.swing.JTextField();
        jcbGrade1 = new javax.swing.JCheckBox();
        jcbGrade2 = new javax.swing.JCheckBox();
        jcbGrade3 = new javax.swing.JCheckBox();
        jcbGrade4 = new javax.swing.JCheckBox();
        jcbGrade5 = new javax.swing.JCheckBox();
        jcbGrade6 = new javax.swing.JCheckBox();
        jcbGrade7 = new javax.swing.JCheckBox();
        jcbGrade8 = new javax.swing.JCheckBox();
        jcbGrade9 = new javax.swing.JCheckBox();
        jcbGrade10 = new javax.swing.JCheckBox();
        jcbKindergarten = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jcbApplyAmountToAll = new javax.swing.JCheckBox();
        jtfApplyToAllAmount = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jlblFeeCategory = new javax.swing.JLabel();
        jcmbFeeCategory = new javax.swing.JComboBox<>();
        jlblFeeName = new javax.swing.JLabel();
        jtfFeeName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jpnlSortFeeList = new javax.swing.JPanel();
        jlblYearCreated = new javax.swing.JLabel();
        jcmbYearCreated = new javax.swing.JComboBox<>();
        jspFeeList = new javax.swing.JScrollPane();
        jlstFeeNameList = new javax.swing.JList<>();
        jbtnDeleteFee = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlstFeeGradeLevels = new javax.swing.JList<>();
        jpnlFeeInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfFeeAmount = new javax.swing.JTextField();
        jbtnEditFee = new javax.swing.JButton();
        jcbFeeStatus = new javax.swing.JCheckBox();
        jbtnSaveEdit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfDiscountNameCreate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jsprPercentOfDiscountCreate = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDiscountDescriptionCreate = new javax.swing.JTextArea();
        jbtnSaveDiscountCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlstDiscountsList = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jlblDiscountNameUpdate = new javax.swing.JLabel();
        jtfDiscountNameUpdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jsprPercentOfDiscountUpdate = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaDiscountDescriptionUpdate = new javax.swing.JTextArea();
        jbtnUpdateDiscountInfo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlblStatus = new javax.swing.JLabel();
        jcmbDiscountStatusUpdate = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jlblDateCreateText = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcmbAction = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        feesCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Fees Card Container"));
        feesCardContainer.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jpnlCreateNewFeeFields.setLayout(new java.awt.GridBagLayout());

        jpnlFeeCreationTab.setLayout(new java.awt.GridBagLayout());

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jpnlCreateFee.setBorder(javax.swing.BorderFactory.createTitledBorder("Fee Creation"));
        jpnlCreateFee.setLayout(new java.awt.GridBagLayout());

        jpnlCreateNewFeeDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Fee Description"));
        jpnlCreateNewFeeDescription.setLayout(new java.awt.GridBagLayout());

        jtaFeeDescription.setColumns(20);
        jtaFeeDescription.setRows(5);
        jspFeeDescription.setViewportView(jtaFeeDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateNewFeeDescription.add(jspFeeDescription, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jpnlCreateNewFeeDescription, gridBagConstraints);

        jpnlCreateFeeControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlCreateFeeControls.setLayout(new java.awt.GridBagLayout());

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
        jpnlCreateFeeControls.add(jbtnClear, gridBagConstraints);

        jbtnCreateFee.setText("Create");
        jbtnCreateFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateFeeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFeeControls.add(jbtnCreateFee, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jpnlCreateFeeControls, gridBagConstraints);

        jpnlFeeAmount.setBorder(javax.swing.BorderFactory.createTitledBorder("Amount"));
        jpnlFeeAmount.setLayout(new java.awt.GridBagLayout());

        jPanel12.setLayout(new java.awt.GridBagLayout());

        jtfKindergartenAmount.setColumns(5);
        jtfKindergartenAmount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfKindergartenAmount, gridBagConstraints);

        jtfGrade1Amount.setColumns(5);
        jtfGrade1Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade1Amount, gridBagConstraints);

        jtfGrade2Amount.setColumns(5);
        jtfGrade2Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade2Amount, gridBagConstraints);

        jtfGrade3Amount.setColumns(5);
        jtfGrade3Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade3Amount, gridBagConstraints);

        jtfGrade4Amount.setColumns(5);
        jtfGrade4Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade4Amount, gridBagConstraints);

        jtfGrade5Amount.setColumns(5);
        jtfGrade5Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade5Amount, gridBagConstraints);

        jtfGrade6Amount.setColumns(5);
        jtfGrade6Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade6Amount, gridBagConstraints);

        jtfGrade7Amount.setColumns(5);
        jtfGrade7Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade7Amount, gridBagConstraints);

        jtfGrade8Amount.setColumns(5);
        jtfGrade8Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade8Amount, gridBagConstraints);

        jtfGrade9Amount.setColumns(5);
        jtfGrade9Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade9Amount, gridBagConstraints);

        jtfGrade10Amount.setColumns(5);
        jtfGrade10Amount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jtfGrade10Amount, gridBagConstraints);

        jcbGrade1.setText("Grade 1");
        jcbGrade1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel12.add(jcbGrade1, gridBagConstraints);

        jcbGrade2.setText("Grade 2");
        jcbGrade2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel12.add(jcbGrade2, gridBagConstraints);

        jcbGrade3.setText("Grade 3");
        jcbGrade3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade3ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade3, gridBagConstraints);

        jcbGrade4.setText("Grade 4");
        jcbGrade4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade4ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade4, gridBagConstraints);

        jcbGrade5.setText("Grade 5");
        jcbGrade5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade5ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade5, gridBagConstraints);

        jcbGrade6.setText("Grade 6");
        jcbGrade6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade6ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade6, gridBagConstraints);

        jcbGrade7.setText("Grade 7");
        jcbGrade7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade7ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade7, gridBagConstraints);

        jcbGrade8.setText("Grade 8");
        jcbGrade8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade8ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade8, gridBagConstraints);

        jcbGrade9.setText("Grade 9");
        jcbGrade9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade9ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade9, gridBagConstraints);

        jcbGrade10.setText("Grade 10");
        jcbGrade10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrade10ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbGrade10, gridBagConstraints);

        jcbKindergarten.setText("Kindergarten");
        jcbKindergarten.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbKindergartenItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcbKindergarten, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeAmount.add(jPanel12, gridBagConstraints);

        jPanel15.setLayout(new java.awt.GridBagLayout());

        jcbApplyAmountToAll.setText("Apply to all");
        jcbApplyAmountToAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbApplyAmountToAllItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel15.add(jcbApplyAmountToAll, gridBagConstraints);

        jtfApplyToAllAmount.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel15.add(jtfApplyToAllAmount, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jpnlFeeAmount.add(jPanel15, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jpnlFeeAmount, gridBagConstraints);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        jlblFeeCategory.setText("Fee Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel16.add(jlblFeeCategory, gridBagConstraints);

        jcmbFeeCategory.setModel(new component_model_loader.FeeML().getAllFeeCategoriesAsModel());
        jcmbFeeCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFeeCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel16.add(jcmbFeeCategory, gridBagConstraints);

        jlblFeeName.setText("Fee Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel16.add(jlblFeeName, gridBagConstraints);

        jtfFeeName.setColumns(10);
        jtfFeeName.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel16.add(jtfFeeName, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jPanel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jpnlCreateFee, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jPanel4, gridBagConstraints);

        jspFeeCreation.setViewportView(jPanel8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeCreationTab.add(jspFeeCreation, gridBagConstraints);

        jtpFees.addTab("Fee Creation", jpnlFeeCreationTab);

        jPanel14.setLayout(new java.awt.GridBagLayout());

        jpnlSortFeeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort "));
        jpnlSortFeeList.setLayout(new java.awt.GridBagLayout());

        jlblYearCreated.setText("Year Created");
        jpnlSortFeeList.add(jlblYearCreated, new java.awt.GridBagConstraints());

        jcmbYearCreated.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearStart());
        jcmbYearCreated.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbYearCreatedItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSortFeeList.add(jcmbYearCreated, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jpnlSortFeeList, gridBagConstraints);

        jspFeeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Fees Created"));
        jspFeeList.setPreferredSize(new java.awt.Dimension(200, 250));

        jlstFeeNameList.setModel(new component_model_loader.FeeML().getAllFeeNamesAsModel());
        jlstFeeNameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlstFeeNameListValueChanged(evt);
            }
        });
        jspFeeList.setViewportView(jlstFeeNameList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jspFeeList, gridBagConstraints);

        jbtnDeleteFee.setText("Delete");
        jbtnDeleteFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteFeeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jbtnDeleteFee, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Grade Level Assignment"));
        jPanel10.setPreferredSize(new java.awt.Dimension(180, 250));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setViewportView(jlstFeeGradeLevels);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel10.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jPanel10, gridBagConstraints);

        jpnlFeeInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));
        jpnlFeeInfo.setPreferredSize(new java.awt.Dimension(260, 93));
        jpnlFeeInfo.setLayout(new java.awt.GridBagLayout());

        jLabel10.setText("Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeInfo.add(jLabel10, gridBagConstraints);

        jtfFeeAmount.setColumns(5);
        jtfFeeAmount.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeInfo.add(jtfFeeAmount, gridBagConstraints);

        jbtnEditFee.setText("Edit");
        jbtnEditFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditFeeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeInfo.add(jbtnEditFee, gridBagConstraints);

        jcbFeeStatus.setText("Active");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeInfo.add(jcbFeeStatus, gridBagConstraints);

        jbtnSaveEdit.setText("Save");
        jbtnSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeInfo.add(jbtnSaveEdit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jpnlFeeInfo, gridBagConstraints);

        jtpFees.addTab("Fee Record", jPanel14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateNewFeeFields.add(jtpFees, gridBagConstraints);

        jPanel6.add(jpnlCreateNewFeeFields, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jtpFeesTopTabbedPane.addTab("Fees", jPanel1);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Discount Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel1, gridBagConstraints);

        jtfDiscountNameCreate.setColumns(12);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jtfDiscountNameCreate, gridBagConstraints);

        jLabel2.setText("Percentage");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel2, gridBagConstraints);

        jsprPercentOfDiscountCreate.setMinimumSize(new java.awt.Dimension(50, 26));
        jsprPercentOfDiscountCreate.setPreferredSize(new java.awt.Dimension(50, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jsprPercentOfDiscountCreate, gridBagConstraints);

        jLabel3.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel3, gridBagConstraints);

        jtaDiscountDescriptionCreate.setColumns(20);
        jtaDiscountDescriptionCreate.setRows(5);
        jScrollPane1.setViewportView(jtaDiscountDescriptionCreate);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jScrollPane1, gridBagConstraints);

        jbtnSaveDiscountCreate.setText("Save");
        jbtnSaveDiscountCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveDiscountCreateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jbtnSaveDiscountCreate, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jPanel5, gridBagConstraints);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Discount List"));
        jScrollPane3.setMaximumSize(null);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(300, 300));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 300));

        jlstDiscountsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlstDiscountsListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jlstDiscountsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jScrollPane3, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jlblDiscountNameUpdate.setText("Discount Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jlblDiscountNameUpdate, gridBagConstraints);

        jtfDiscountNameUpdate.setColumns(12);
        jtfDiscountNameUpdate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfDiscountNameUpdate.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jtfDiscountNameUpdate, gridBagConstraints);

        jLabel6.setText("Percentage :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel6, gridBagConstraints);

        jsprPercentOfDiscountUpdate.setEnabled(false);
        jsprPercentOfDiscountUpdate.setMinimumSize(new java.awt.Dimension(50, 26));
        jsprPercentOfDiscountUpdate.setPreferredSize(new java.awt.Dimension(50, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jsprPercentOfDiscountUpdate, gridBagConstraints);

        jLabel7.setText("Description :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel7, gridBagConstraints);

        jtaDiscountDescriptionUpdate.setColumns(20);
        jtaDiscountDescriptionUpdate.setRows(5);
        jtaDiscountDescriptionUpdate.setEnabled(false);
        jScrollPane4.setViewportView(jtaDiscountDescriptionUpdate);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jScrollPane4, gridBagConstraints);

        jbtnUpdateDiscountInfo.setText("Update");
        jbtnUpdateDiscountInfo.setEnabled(false);
        jbtnUpdateDiscountInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateDiscountInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jbtnUpdateDiscountInfo, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel8, gridBagConstraints);

        jlblStatus.setText("Status :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jlblStatus, gridBagConstraints);

        jcmbDiscountStatusUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jcmbDiscountStatusUpdate.setSelectedIndex(-1);
        jcmbDiscountStatusUpdate.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jcmbDiscountStatusUpdate, gridBagConstraints);

        jLabel9.setText("Date Created :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel9, gridBagConstraints);

        jlblDateCreateText.setText("dateCreatedText");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jlblDateCreateText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jPanel9, gridBagConstraints);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jLabel5.setText("Action :");
        jPanel11.add(jLabel5, new java.awt.GridBagConstraints());

        jcmbAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Update" }));
        jcmbAction.setSelectedIndex(-1);
        jcmbAction.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbActionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jcmbAction, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jPanel11, gridBagConstraints);

        jtpFeesTopTabbedPane.addTab("Discounts", jPanel7);

        feesCardContainer.add(jtpFeesTopTabbedPane, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel13.add(feesCardContainer, gridBagConstraints);

        add(jPanel13, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    private void reloadDiscountList(){
        jlstDiscountsList.setModel(discountGUIUtil.getListOfDiscountNames());
    }
    
    private void setDiscountInformation(){
        if(jlstDiscountsList.getSelectedIndex()>-1){
           String nameOfDiscount = jlstDiscountsList.getSelectedValue();
           int discountId = ddi.getId(nameOfDiscount);
           Discount discount = ddi.get(discountId);
           jtfDiscountNameUpdate.setText(discount.getDiscountName());
           jsprPercentOfDiscountUpdate.setValue(discount.getPercentOfDiscount());
           jcmbDiscountStatusUpdate.setSelectedItem(discount.getIsActive()==true?"Active":"Inactive");
           jlblDateCreateText.setText(""+discount.getDateCreated());
           jtaDiscountDescriptionUpdate.setText(discount.getDescription());
        }
    }
    private void jcmbFeeCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFeeCategoryItemStateChanged
        if(jcmbFeeCategory.getSelectedIndex()>-1){
            String selectedFeeCategory = jcmbFeeCategory.getSelectedItem().toString();
            if(selectedFeeCategory.equals("Downpayment")){
                jtfFeeName.setEnabled(false);
                jtfFeeName.setText(selectedFeeCategory);
            }else{
                jtfFeeName.setEnabled(true);
            }
            jbtnCreateFee.setEnabled(true);
        }else{
            jtfFeeName.setEnabled(false);
        }
    }//GEN-LAST:event_jcmbFeeCategoryItemStateChanged

    
    private List<GradeLevel> getGradeLevelsSelected() {
        List<GradeLevel> gradeLevelList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Component[] comp = jpnlFeeAmount.getComponents();
        for (Component c : comp) {
            if (c instanceof JCheckBox) {
                if (((JCheckBox) c).isSelected() && !((JCheckBox) c).getText().equals("Kindergarten")) {
                    String glStr = ((JCheckBox) c).getText().replaceAll("[^-?0-9]+", " "); //takes out all numeric from string 
                    String gl = glStr.replaceAll("\\s+", ""); // removes all whitespace
                    if (!gl.isEmpty()) {
                        int glInt = Integer.parseInt(gl);
                        list.add(glInt);
                    }
                } else if (((JCheckBox) c).isSelected() && ((JCheckBox) c).getText().equals("Kindergarten")) {
                    int gInt = 0;
                    list.add(gInt);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            GradeLevel g = new GradeLevel();
            g.setLevel(list.get(i));
            int gradeLevelId = gldi.getId(g);
            g.setId(gradeLevelId);
            gradeLevelList.add(g);
            System.out.println("LevelId: " + gradeLevelId);
        }
        return gradeLevelList;
    }
    
    
    private void reloadFeeJList(){
        jlstFeeNameList.setModel(new FeeML().getAllFeeNamesAsModel());
    }
    
    private void resetCreateFeeFormPanel(){
        JPanelGUIUtil.clearJCheckBox(jpnlFeeAmount);
        JPanelGUIUtil.clearJTextFields(jpnlFeeAmount);
        jtfFeeName.setText("");
        jcmbFeeCategory.setSelectedIndex(-1);
        jtaFeeDescription.setText(null);
    }
    
    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
       resetCreateFeeFormPanel();
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnCreateFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateFeeActionPerformed
        if (new FeeDaoImpl().exists(jtfFeeName.getText().trim())) {
            String feeName = jtfFeeName.getText().trim();
            JOptionPane.showMessageDialog(null, feeName + " already exists on record.\nPlease try a different name");
        } else {
            int selected = JOptionPane.showConfirmDialog(null, "Add Fee", "Add Confirmation", JOptionPane.YES_NO_OPTION);
            if (selected == JOptionPane.YES_OPTION) {
                String feeDescription = jtaFeeDescription.getText();
                String feeName = jtfFeeName.getText().trim();

                FeeCategory feeCategory = new FeeCategory();
                String fCat = jcmbFeeCategory.getSelectedItem().toString();
                feeCategory.setCategory(fCat);

                SchoolYear syCreated = new SchoolYear();
                syCreated.setSchoolYearId(sdi.getCurrentSchoolYearId());

                Map<Integer, Double> gradelevel_amount_pair = new HashMap<>();
                Integer key = null;
                Double value = null;

                Component[] comp = jpnlFeeAmount.getComponents();
                for (Component c : comp) {
                    if (c instanceof JCheckBox) {
                        if (((JCheckBox) c).isSelected() && !((JCheckBox) c).getText().equals("Kindergarten")) {
                            String glStr = ((JCheckBox) c).getText().replaceAll("[^-?0-9]+", " "); //takes out all numeric from string 
                            String aGradeLevel = glStr.replaceAll("\\s+", ""); // removes all whitespace
                            if (!aGradeLevel.isEmpty()) {
                                int aGradeLevelInt = Integer.parseInt(aGradeLevel);
                                switch (aGradeLevelInt) {
                                    case 1:
                                        key = 1;
                                        value = Double.parseDouble(jtfGrade1Amount.getText().trim());
                                        break;
                                    case 2:
                                        key = 2;
                                        value = Double.parseDouble(jtfGrade2Amount.getText().trim());
                                        break;
                                    case 3:
                                        key = 3;
                                        value = Double.parseDouble(jtfGrade3Amount.getText().trim());
                                        break;
                                    case 4:
                                        key = 4;
                                        value = Double.parseDouble(jtfGrade4Amount.getText().trim());
                                        break;
                                    case 5:
                                        key = 5;
                                        value = Double.parseDouble(jtfGrade5Amount.getText().trim());
                                        break;
                                    case 6:
                                        key = 6;
                                        value = Double.parseDouble(jtfGrade6Amount.getText().trim());
                                        break;
                                    case 7:
                                        key = 7;
                                        value = Double.parseDouble(jtfGrade7Amount.getText().trim());
                                        break;
                                    case 8:
                                        key = 8;
                                        value = Double.parseDouble(jtfGrade8Amount.getText().trim());
                                        break;
                                    case 9:
                                        key = 9;
                                        value = Double.parseDouble(jtfGrade9Amount.getText().trim());
                                        break;
                                    case 10:
                                        key = 10;
                                        value = Double.parseDouble(jtfGrade10Amount.getText().trim());
                                        break;
                                }
                                gradelevel_amount_pair.put(key, value);
                            }
                        } else if (((JCheckBox) c).isSelected() && ((JCheckBox) c).getText().equals("Kindergarten")) {
                            key = 0;
                            value = Double.parseDouble(jtfKindergartenAmount.getText().trim());
                            gradelevel_amount_pair.put(key, value);
                        }
                    }
                }

                Fee fee = new Fee();
                fee.setName(feeName);
                fee.setDescription(feeDescription);
                fee.setFeeCategory(feeCategory);
                fee.setGradeLevelAmountPair(gradelevel_amount_pair);
                fee.setSchoolYear(syCreated);

                boolean isSuccessfullyAdded = fdi.add(fee);
                if (isSuccessfullyAdded) {
                    resetCreateFeeFormPanel();
                    JOptionPane.showMessageDialog(null, "Successfully added " + fee.getName());
                    reloadFeeJList();
                } else {
                    JOptionPane.showMessageDialog(null, "Adding of " + fee.getName() + " failed.");
                }
            }
        }
    }//GEN-LAST:event_jbtnCreateFeeActionPerformed

    private void jbtnDeleteFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteFeeActionPerformed
        
        
    }//GEN-LAST:event_jbtnDeleteFeeActionPerformed

    private void clearCreateDiscountFields(){
        jtfDiscountNameCreate.setText("");
        jsprPercentOfDiscountCreate.setValue(0);
        jtaDiscountDescriptionCreate.setText("");
        
    }
    
    private void jbtnSaveDiscountCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveDiscountCreateActionPerformed
        String discountName = jtfDiscountNameCreate.getText();
        int percentage = Integer.parseInt(jsprPercentOfDiscountCreate.getValue().toString());
        String description = jtaDiscountDescriptionCreate.getText();

        if (!discountName.isEmpty() && percentage > 0 && !description.isEmpty()) {
            int choice = JOptionPane.showConfirmDialog(null, "Add Discount?", "Add Discount Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                Discount discount = new Discount();
                discount.setDescription(description);
                discount.setPercentOfDiscount(percentage);
                discount.setDiscountName(discountName);
                boolean isAdded = ddi.add(discount);
                if (isAdded) {
                    JOptionPane.showMessageDialog(null, "Successfully added " + discountName);
                    reloadDiscountList();
                    clearCreateDiscountFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Error encountered while adding discount.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please check your input values");
        }
    }//GEN-LAST:event_jbtnSaveDiscountCreateActionPerformed

    private void jbtnUpdateDiscountInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateDiscountInfoActionPerformed
        String discountName = jtfDiscountNameCreate.getText();
        int percentage = Integer.parseInt(jsprPercentOfDiscountCreate.getValue().toString());
        String description = jtaDiscountDescriptionCreate.getText();
        
        
    }//GEN-LAST:event_jbtnUpdateDiscountInfoActionPerformed

    private void jlstDiscountsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlstDiscountsListValueChanged
        disableUpdateDiscountFields();
         setDiscountInformation();
    }//GEN-LAST:event_jlstDiscountsListValueChanged

    private void disableUpdateDiscountFields(){
        if (jcmbAction.getSelectedIndex() > -1) {
            jtfDiscountNameUpdate.setEnabled(false);
            jsprPercentOfDiscountUpdate.setEnabled(false);
            jcmbDiscountStatusUpdate.setEnabled(false);
            jtaDiscountDescriptionUpdate.setEnabled(false);
            jbtnUpdateDiscountInfo.setEnabled(false);
            jcmbAction.setSelectedIndex(-1);
        }
    }
    
    private void enableUpdateDiscountFields(){
        if (jcmbAction.getSelectedIndex() > -1) {
            jtfDiscountNameUpdate.setEnabled(true);
            jsprPercentOfDiscountUpdate.setEnabled(true);
            jcmbDiscountStatusUpdate.setEnabled(true);
            jtaDiscountDescriptionUpdate.setEnabled(true);
            jbtnUpdateDiscountInfo.setEnabled(true);
        }
    }
    
    private void jcmbActionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbActionItemStateChanged
        enableUpdateDiscountFields();
    }//GEN-LAST:event_jcmbActionItemStateChanged

    private void jcmbYearCreatedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbYearCreatedItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbYearCreatedItemStateChanged

    private void jcbKindergartenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbKindergartenItemStateChanged
        if(jcbKindergarten.isSelected()){
            jtfKindergartenAmount.setEnabled(true);
        }else{
            jtfKindergartenAmount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbKindergartenItemStateChanged

    private void jcbGrade1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade1ItemStateChanged
        if(jcbGrade1.isSelected()){
            jtfGrade1Amount.setEnabled(true);
        }else{
            jtfGrade1Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade1ItemStateChanged

    private void jcbGrade2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade2ItemStateChanged
        if(jcbGrade2.isSelected()){
            jtfGrade2Amount.setEnabled(true);
        }else{
            jtfGrade2Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade2ItemStateChanged

    private void jcbGrade3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade3ItemStateChanged
        if(jcbGrade3.isSelected()){
            jtfGrade3Amount.setEnabled(true);
        }else{
            jtfGrade3Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade3ItemStateChanged

    private void jcbGrade4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade4ItemStateChanged
        if(jcbGrade4.isSelected()){
            jtfGrade4Amount.setEnabled(true);
        }else{
            jtfGrade4Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade4ItemStateChanged

    private void jcbGrade5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade5ItemStateChanged
        if(jcbGrade5.isSelected()){
            jtfGrade5Amount.setEnabled(true);
        }else{
            jtfGrade5Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade5ItemStateChanged

    private void jcbGrade6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade6ItemStateChanged
        if(jcbGrade6.isSelected()){
            jtfGrade6Amount.setEnabled(true);
        }else{
            jtfGrade6Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade6ItemStateChanged

    private void jcbGrade7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade7ItemStateChanged
        if(jcbGrade7.isSelected()){
            jtfGrade7Amount.setEnabled(true);
        }else{
            jtfGrade7Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade7ItemStateChanged

    private void jcbGrade8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade8ItemStateChanged
        if(jcbGrade8.isSelected()){
            jtfGrade8Amount.setEnabled(true);
        }else{
            jtfGrade8Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade8ItemStateChanged

    private void jcbGrade9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade9ItemStateChanged
        if(jcbGrade9.isSelected()){
            jtfGrade9Amount.setEnabled(true);
        }else{
            jtfGrade9Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade9ItemStateChanged

    private void jcbGrade10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrade10ItemStateChanged
        if(jcbGrade10.isSelected()){
            jtfGrade10Amount.setEnabled(true);
        }else{
            jtfGrade10Amount.setEnabled(false);
        }
    }//GEN-LAST:event_jcbGrade10ItemStateChanged

    private void jbtnEditFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditFeeActionPerformed
        jtfFeeAmount.setEnabled(true);
    }//GEN-LAST:event_jbtnEditFeeActionPerformed

    private void jbtnSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveEditActionPerformed
        jtfFeeAmount.setEnabled(false);
    }//GEN-LAST:event_jbtnSaveEditActionPerformed

    private void jlstFeeNameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlstFeeNameListValueChanged
        String feeName = jlstFeeNameList.getSelectedValue().trim();
        int aFeeId = fdi.getId(feeName);
        Object[] obj = fdi.getGradeLevelAssignment(aFeeId).toArray();
        DefaultListModel dlm = new DefaultListModel();
        for(Object o : obj){
            GradeLevel g = (GradeLevel)o;
            dlm.addElement(g.getLevel()==0? "Kindergarten": "Grade "+g.getLevel());
        }
        jlstFeeGradeLevels.setModel(dlm);
    }//GEN-LAST:event_jlstFeeNameListValueChanged

    private void jcbApplyAmountToAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbApplyAmountToAllItemStateChanged
        if(jcbApplyAmountToAll.isSelected()){
           Double amount = Double.parseDouble(jtfApplyToAllAmount.getText());
           jtfKindergartenAmount.setText(amount+"");
           jtfGrade1Amount.setText(amount+"");
           jtfGrade2Amount.setText(amount+"");
           jtfGrade3Amount.setText(amount+"");
           jtfGrade4Amount.setText(amount+"");
           jtfGrade5Amount.setText(amount+"");
           jtfGrade6Amount.setText(amount+"");
           jtfGrade7Amount.setText(amount+"");
           jtfGrade8Amount.setText(amount+"");
           jtfGrade9Amount.setText(amount+"");
           jtfGrade10Amount.setText(amount+"");
        }
    }//GEN-LAST:event_jcbApplyAmountToAllItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel feesCardContainer;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCreateFee;
    private javax.swing.JButton jbtnDeleteFee;
    private javax.swing.JButton jbtnEditFee;
    private javax.swing.JButton jbtnSaveDiscountCreate;
    private javax.swing.JButton jbtnSaveEdit;
    private javax.swing.JButton jbtnUpdateDiscountInfo;
    private javax.swing.JCheckBox jcbApplyAmountToAll;
    private javax.swing.JCheckBox jcbFeeStatus;
    private javax.swing.JCheckBox jcbGrade1;
    private javax.swing.JCheckBox jcbGrade10;
    private javax.swing.JCheckBox jcbGrade2;
    private javax.swing.JCheckBox jcbGrade3;
    private javax.swing.JCheckBox jcbGrade4;
    private javax.swing.JCheckBox jcbGrade5;
    private javax.swing.JCheckBox jcbGrade6;
    private javax.swing.JCheckBox jcbGrade7;
    private javax.swing.JCheckBox jcbGrade8;
    private javax.swing.JCheckBox jcbGrade9;
    private javax.swing.JCheckBox jcbKindergarten;
    private javax.swing.JComboBox<String> jcmbAction;
    private javax.swing.JComboBox<String> jcmbDiscountStatusUpdate;
    private javax.swing.JComboBox<String> jcmbFeeCategory;
    private javax.swing.JComboBox<String> jcmbYearCreated;
    private javax.swing.JLabel jlblDateCreateText;
    private javax.swing.JLabel jlblDiscountNameUpdate;
    private javax.swing.JLabel jlblFeeCategory;
    private javax.swing.JLabel jlblFeeName;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JLabel jlblYearCreated;
    private javax.swing.JList<String> jlstDiscountsList;
    private javax.swing.JList<String> jlstFeeGradeLevels;
    private javax.swing.JList<String> jlstFeeNameList;
    private javax.swing.JPanel jpnlCreateFee;
    private javax.swing.JPanel jpnlCreateFeeControls;
    private javax.swing.JPanel jpnlCreateNewFeeDescription;
    private javax.swing.JPanel jpnlCreateNewFeeFields;
    private javax.swing.JPanel jpnlFeeAmount;
    private javax.swing.JPanel jpnlFeeCreationTab;
    private javax.swing.JPanel jpnlFeeInfo;
    private javax.swing.JPanel jpnlSortFeeList;
    private javax.swing.JScrollPane jspFeeCreation;
    private javax.swing.JScrollPane jspFeeDescription;
    private javax.swing.JScrollPane jspFeeList;
    private javax.swing.JSpinner jsprPercentOfDiscountCreate;
    private javax.swing.JSpinner jsprPercentOfDiscountUpdate;
    private javax.swing.JTextArea jtaDiscountDescriptionCreate;
    private javax.swing.JTextArea jtaDiscountDescriptionUpdate;
    private javax.swing.JTextArea jtaFeeDescription;
    private javax.swing.JTextField jtfApplyToAllAmount;
    private javax.swing.JTextField jtfDiscountNameCreate;
    private javax.swing.JTextField jtfDiscountNameUpdate;
    private javax.swing.JTextField jtfFeeAmount;
    private javax.swing.JTextField jtfFeeName;
    private javax.swing.JTextField jtfGrade10Amount;
    private javax.swing.JTextField jtfGrade1Amount;
    private javax.swing.JTextField jtfGrade2Amount;
    private javax.swing.JTextField jtfGrade3Amount;
    private javax.swing.JTextField jtfGrade4Amount;
    private javax.swing.JTextField jtfGrade5Amount;
    private javax.swing.JTextField jtfGrade6Amount;
    private javax.swing.JTextField jtfGrade7Amount;
    private javax.swing.JTextField jtfGrade8Amount;
    private javax.swing.JTextField jtfGrade9Amount;
    private javax.swing.JTextField jtfKindergartenAmount;
    private javax.swing.JTabbedPane jtpFees;
    private javax.swing.JTabbedPane jtpFeesTopTabbedPane;
    // End of variables declaration//GEN-END:variables
}
