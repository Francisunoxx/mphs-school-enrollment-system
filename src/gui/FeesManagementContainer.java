/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import calendar_utility.CalendarUtil;
import daoimpl.DiscountDaoImpl;
import daoimpl.FeeDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import component_model_loader.DiscountML;
import component_model_loader.FeeML;
import component_model_loader.JPanelGUIUtil;
import component_model_loader.SchoolYearML;
import daoimpl.SchoolYearDaoImpl;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Discount;
import model.Fee;
import model.FeeCategory;
import model.GradeLevel;
import model.SchoolYear;
import model.Discount;
import model.Fee;
import model.FeeCategory;
import utility.InputUtil;

public class FeesManagementContainer extends javax.swing.JPanel {

    FeeDaoImpl feeDaoImpl = new FeeDaoImpl();
    FeeML feeGUIUtil = new FeeML();
    DiscountDaoImpl discountDaoImpl = new DiscountDaoImpl();
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
        jlblFeeName = new javax.swing.JLabel();
        jlblFeeCategory = new javax.swing.JLabel();
        jcmbFeeCategory = new javax.swing.JComboBox<>();
        jtfFeeName = new javax.swing.JTextField();
        jpnlCreateNewFeeDescription = new javax.swing.JPanel();
        jspFeeDescription = new javax.swing.JScrollPane();
        jtaFeeDescription = new javax.swing.JTextArea();
        jlblGradeLevel = new javax.swing.JLabel();
        jlblAmount = new javax.swing.JLabel();
        jtfFeeAmount = new javax.swing.JTextField();
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
        jpnlCreateFeeControls = new javax.swing.JPanel();
        jbtnClear = new javax.swing.JButton();
        jbtnCreateFee = new javax.swing.JButton();
        jspFeeList = new javax.swing.JScrollPane();
        jlstFeeNameList = new javax.swing.JList<>();
        jpnlSortFeeList = new javax.swing.JPanel();
        jlblYearCreated = new javax.swing.JLabel();
        jcmbYearCreated = new javax.swing.JComboBox<>();
        jpnlUpdateFee = new javax.swing.JPanel();
        jlblFeeName2 = new javax.swing.JLabel();
        jlblFeeCategory1 = new javax.swing.JLabel();
        jcmbFeeCategory1 = new javax.swing.JComboBox<>();
        jtfFeeName1 = new javax.swing.JTextField();
        jpnlCreateNewFeeDescription1 = new javax.swing.JPanel();
        jspFeeDescription2 = new javax.swing.JScrollPane();
        jtaFeeDescription1 = new javax.swing.JTextArea();
        jlblGradeLevel2 = new javax.swing.JLabel();
        jlblAmount2 = new javax.swing.JLabel();
        jtfFeeAmount1 = new javax.swing.JTextField();
        jpnlGradeLevelSelection1 = new javax.swing.JPanel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jpnlUpdateFeeControls = new javax.swing.JPanel();
        jbtnClearFeeInfoFields = new javax.swing.JButton();
        jbtnUpdateFee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jbtnDeleteFee = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jpnlFeeRecordTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblAllFees = new javax.swing.JTable();
        jpnlFilterControl = new javax.swing.JPanel();
        jlblFilterGradeLevel = new javax.swing.JLabel();
        jlblFilterSearch = new javax.swing.JLabel();
        jtfFilterEnterSearch = new javax.swing.JTextField();
        jlblFilterFeeCategory = new javax.swing.JLabel();
        jcmbFilterByFeeCategory = new javax.swing.JComboBox<>();
        jcmbFilterGradeLevel = new javax.swing.JComboBox<>();
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

        jpnlCreateFee.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Fee"));
        jpnlCreateFee.setLayout(new java.awt.GridBagLayout());

        jlblFeeName.setText("Fee Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jlblFeeName, gridBagConstraints);

        jlblFeeCategory.setText("Fee Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jlblFeeCategory, gridBagConstraints);

        jcmbFeeCategory.setModel(new component_model_loader.FeeML().getAllFeeCategoriesAsModel());
        jcmbFeeCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFeeCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jcmbFeeCategory, gridBagConstraints);

        jtfFeeName.setColumns(10);
        jtfFeeName.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jtfFeeName, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jpnlCreateNewFeeDescription, gridBagConstraints);

        jlblGradeLevel.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jlblGradeLevel, gridBagConstraints);

        jlblAmount.setText("Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jlblAmount, gridBagConstraints);

        jtfFeeAmount.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jtfFeeAmount, gridBagConstraints);

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
        jpnlCreateFee.add(jpnlGradeLevelSelection, gridBagConstraints);

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
        jpnlCreateFee.add(jcbKindergartenCtg, gridBagConstraints);

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
        jpnlCreateFee.add(jcbElementaryCtg, gridBagConstraints);

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
        jpnlCreateFee.add(jcbJuniorHighCtg, gridBagConstraints);

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
        jbtnCreateFee.setEnabled(false);
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
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateFee.add(jpnlCreateFeeControls, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jpnlCreateFee, gridBagConstraints);

        jspFeeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Fees Created"));
        jspFeeList.setPreferredSize(new java.awt.Dimension(200, 250));

        jlstFeeNameList.setModel(new component_model_loader.FeeML().getAllFeeNamesAsModel());
        jspFeeList.setViewportView(jlstFeeNameList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jspFeeList, gridBagConstraints);

        jpnlSortFeeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort List"));
        jpnlSortFeeList.setLayout(new java.awt.GridBagLayout());

        jlblYearCreated.setText("Year Created");
        jpnlSortFeeList.add(jlblYearCreated, new java.awt.GridBagConstraints());

        jcmbYearCreated.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearStart());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSortFeeList.add(jcmbYearCreated, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jpnlSortFeeList, gridBagConstraints);

        jpnlUpdateFee.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Fee"));
        jpnlUpdateFee.setLayout(new java.awt.GridBagLayout());

        jlblFeeName2.setText("Fee Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jlblFeeName2, gridBagConstraints);

        jlblFeeCategory1.setText("Fee Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jlblFeeCategory1, gridBagConstraints);

        jcmbFeeCategory1.setModel(new component_model_loader.FeeML().getAllFeeCategoriesAsModel());
        jcmbFeeCategory1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFeeCategory1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jcmbFeeCategory1, gridBagConstraints);

        jtfFeeName1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jtfFeeName1, gridBagConstraints);

        jpnlCreateNewFeeDescription1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fee Description"));
        jpnlCreateNewFeeDescription1.setLayout(new java.awt.GridBagLayout());

        jtaFeeDescription1.setColumns(20);
        jtaFeeDescription1.setRows(5);
        jspFeeDescription2.setViewportView(jtaFeeDescription1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateNewFeeDescription1.add(jspFeeDescription2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jpnlCreateNewFeeDescription1, gridBagConstraints);

        jlblGradeLevel2.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jlblGradeLevel2, gridBagConstraints);

        jlblAmount2.setText("Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jlblAmount2, gridBagConstraints);

        jtfFeeAmount1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jtfFeeAmount1, gridBagConstraints);

        jpnlGradeLevelSelection1.setLayout(new java.awt.GridBagLayout());

        jCheckBox15.setText("Kindergarten");
        jpnlGradeLevelSelection1.add(jCheckBox15, new java.awt.GridBagConstraints());

        jCheckBox16.setText("Grade 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox16, gridBagConstraints);

        jCheckBox17.setText("Grade 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox17, gridBagConstraints);

        jCheckBox18.setText("Grade 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox18, gridBagConstraints);

        jCheckBox19.setText("Grade 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox19, gridBagConstraints);

        jCheckBox20.setText("Grade 5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox20, gridBagConstraints);

        jCheckBox21.setText("Grade 6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox21, gridBagConstraints);

        jCheckBox22.setText("Grade 7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox22, gridBagConstraints);

        jCheckBox23.setText("Grade 8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox23, gridBagConstraints);

        jCheckBox24.setText("Grade 9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox24, gridBagConstraints);

        jCheckBox25.setText("Grade 10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlGradeLevelSelection1.add(jCheckBox25, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jpnlGradeLevelSelection1, gridBagConstraints);

        jCheckBox26.setText("Kindergarten");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jCheckBox26, gridBagConstraints);

        jCheckBox27.setText("Grade School");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jCheckBox27, gridBagConstraints);

        jCheckBox28.setText("Junior HS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jCheckBox28, gridBagConstraints);

        jpnlUpdateFeeControls.setLayout(new java.awt.GridBagLayout());

        jbtnClearFeeInfoFields.setText("Clear");
        jbtnClearFeeInfoFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearFeeInfoFieldsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFeeControls.add(jbtnClearFeeInfoFields, gridBagConstraints);

        jbtnUpdateFee.setText("Update");
        jbtnUpdateFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateFeeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFeeControls.add(jbtnUpdateFee, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateFee.add(jpnlUpdateFeeControls, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jpnlUpdateFee, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jbtnDeleteFee.setText("Delete");
        jbtnDeleteFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteFeeActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnDeleteFee, new java.awt.GridBagConstraints());

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

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jpnlFeeRecordTab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Displaying All Fees", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jpnlFeeRecordTab.setLayout(new java.awt.GridBagLayout());

        jtblAllFees.setAutoCreateRowSorter(true);
        jtblAllFees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Amount", "Description", "Fee Category", "Grade Level", "Year Created", "Active Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblAllFees.setShowVerticalLines(false);
        jtblAllFees.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtblAllFees);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeRecordTab.add(jScrollPane2, gridBagConstraints);

        jpnlFilterControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jpnlFilterControl.setLayout(new java.awt.GridBagLayout());

        jlblFilterGradeLevel.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jlblFilterGradeLevel, gridBagConstraints);

        jlblFilterSearch.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jlblFilterSearch, gridBagConstraints);

        jtfFilterEnterSearch.setColumns(12);
        jtfFilterEnterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfFilterEnterSearchKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jtfFilterEnterSearch, gridBagConstraints);

        jlblFilterFeeCategory.setText("Fee Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jlblFilterFeeCategory, gridBagConstraints);

        jcmbFilterByFeeCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFilterByFeeCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jcmbFilterByFeeCategory, gridBagConstraints);

        jcmbFilterGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFilterGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilterControl.add(jcmbFilterGradeLevel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFeeRecordTab.add(jpnlFilterControl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel10.add(jpnlFeeRecordTab, gridBagConstraints);

        jtpFees.addTab("Fee Record", jPanel10);

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
           int discountId = discountDaoImpl.getId(nameOfDiscount);
           Discount discount = discountDaoImpl.get(discountId);
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
            JPanelGUIUtil.enableAllJPanelCheckBox(jpnlGradeLevelSelection);
            jcbKindergartenCtg.setEnabled(true);
            jcbElementaryCtg.setEnabled(true);
            jcbJuniorHighCtg.setEnabled(true);
            jbtnCreateFee.setEnabled(true);
        }else{
            jtfFeeName.setEnabled(false);
        }
    }//GEN-LAST:event_jcmbFeeCategoryItemStateChanged

    private List<GradeLevel> getGradeLevelsSelected() {
        List<GradeLevel> gradeLevelList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Component[] comp = jpnlGradeLevelSelection.getComponents();
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
            int gradeLevelId = gldi.getGradeLevelId(g);
            g.setId(gradeLevelId);
            gradeLevelList.add(g);
            System.out.println("LevelId: " + gradeLevelId);
        }
        return gradeLevelList;
    }
    
    private void setFeeCategoryJComboModel(){
        jcmbFeeCategory.setModel(feeGUIUtil.getAllFeeCategoriesAsModel());
    }
    
    private void reloadFeeJList(){
        jlstFeeNameList.setModel(new FeeML().getAllFeeNamesAsModel());
    }
    
    private void resetCreateFeeFormPanel(){
        JPanelGUIUtil.clearAllJPanelCheckBox(jpnlGradeLevelSelection);
        JPanelGUIUtil.disableAllJCheckBox(jpnlGradeLevelSelection);
        jtfFeeName.setText("");
        jtfFeeAmount.setText("");
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
                if (InputUtil.isDouble(jtfFeeAmount.getText().trim())) {
                    String feeDescription = jtaFeeDescription.getText();
                    String feeName = jtfFeeName.getText().trim();
                    FeeCategory feeCategory = new FeeCategory();
                    String fCat = jcmbFeeCategory.getSelectedItem().toString();
                    feeCategory.setCategory(fCat);

                    SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();
                    SchoolYear yearCreated = new SchoolYear();
                    yearCreated.setSchoolYearId(schoolYearDaoImpl.getCurrentSchoolYearId());

                    Fee fee = new Fee();
                    fee.setName(feeName);
                    fee.setDescription(feeDescription);
                    fee.setFeeCategory(feeCategory);
                    fee.setAmount(Double.parseDouble(jtfFeeAmount.getText().trim()));
                    fee.setAssignedGradeLevels(getGradeLevelsSelected());
                    fee.setSchoolYear(yearCreated);

                    FeeDaoImpl fdi = new FeeDaoImpl();
                    boolean isSuccessfullyAdded = fdi.add(fee);
                    if (isSuccessfullyAdded) {
                        resetCreateFeeFormPanel();
                        JOptionPane.showMessageDialog(null, "Successfully added " + fee.getName());
                        reloadFeeJList();
                    } else {
                        JOptionPane.showMessageDialog(null, "Adding of " + fee.getName() + " failed.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Please enter a valid amount value.");
                }
            }
        }
    }//GEN-LAST:event_jbtnCreateFeeActionPerformed

    private void jtfFilterEnterSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFilterEnterSearchKeyPressed
        //TODO add your handling code here:
        if( (jtfFilterEnterSearch.getText().isEmpty())&&(evt.getKeyCode() == KeyEvent.VK_ENTER) ){
            FeeDaoImpl feeDaoImpl = new FeeDaoImpl();
            DefaultTableModel feeInfoModel = (DefaultTableModel) jtblAllFees.getModel();
            feeInfoModel.setRowCount(0); // CLEAR THE RECORD ON VIEW BEFORE LOADING NEW DATA
            Object[] rowData = feeDaoImpl.getAll().toArray();
            for (Object rd : rowData) {
                //cast rd first to its object type which is Fee
                Fee f = (Fee) rd;//rd contains a list of Fee objects not their attributes
                Object[] o = {
                    f.getId(), f.getName(),
                    f.getAmount(),
                    f.getDescription(),
                    f.getFeeCategory().getCategory(),
                    f.getGradeLevel().getLevel(),
                    f.getSchoolYear().getYearFrom(),
                    f.isActive() == true ? "Yes" : "No"
                }; //end of object array declaration
                feeInfoModel.addRow(o);
            }

            jtblAllFees.setModel(feeInfoModel);
            jcmbFilterByFeeCategory.setSelectedIndex(-1);
            jcmbFilterGradeLevel.setSelectedIndex(-1);
        }else{

        }
    }//GEN-LAST:event_jtfFilterEnterSearchKeyPressed

    private void jcmbFilterByFeeCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFilterByFeeCategoryItemStateChanged
        
    }//GEN-LAST:event_jcmbFilterByFeeCategoryItemStateChanged

    private void jcmbFilterGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFilterGradeLevelItemStateChanged

        if (jcmbFilterGradeLevel.getSelectedIndex() > -1) {
            DefaultTableModel feeInfoModel = (DefaultTableModel) jtblAllFees.getModel();
            feeInfoModel.setRowCount(0);
            FeeDaoImpl feeDaoImpl = new FeeDaoImpl();
            GradeLevel aGradeLevel = (GradeLevel)jcmbFilterGradeLevel.getSelectedItem();

            Object[] rowData = feeDaoImpl.getByGradeLevel(aGradeLevel).toArray();
            for (Object rd : rowData) {
                //cast rd first to its object type which is Fee
                Fee f = (Fee) rd;//rd contains a list of Fee objects not their attributes
                Object[] o = {
                    f.getId(), f.getName(),
                    f.getAmount(),
                    f.getDescription(),
                    f.getFeeCategory().getCategory(),
                    f.getGradeLevel().getLevel(),
                    f.getSchoolYear().getYearFrom(),
                    f.isActive() == true ? "Yes" : "No"
                }; //end of object array declaration
                feeInfoModel.addRow(o);
            }
            jtblAllFees.setModel(feeInfoModel);
        }

    }//GEN-LAST:event_jcmbFilterGradeLevelItemStateChanged

    private void jbtnClearFeeInfoFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearFeeInfoFieldsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClearFeeInfoFieldsActionPerformed

    private void jbtnUpdateFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnUpdateFeeActionPerformed

    private void jcmbFeeCategory1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFeeCategory1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFeeCategory1ItemStateChanged

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

    private void jbtnDeleteFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteFeeActionPerformed
        
        
    }//GEN-LAST:event_jbtnDeleteFeeActionPerformed

    private void clearCreateDiscountFields(){
        jtfDiscountNameCreate.setText("");
        jsprPercentOfDiscountCreate.setValue(0);
        jtaDiscountDescriptionCreate.setText("");
        
    }
    
    private void jbtnSaveDiscountCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveDiscountCreateActionPerformed
        String discountName = jtfDiscountNameCreate.getText();
        System.out.println(discountName);
        int percentage = Integer.parseInt(jsprPercentOfDiscountCreate.getValue().toString());
        System.out.println(percentage);
        String description = jtaDiscountDescriptionCreate.getText();
        System.out.println(description);
        if(!discountName.isEmpty() && percentage > 0 && !description.isEmpty()){
            int choice = JOptionPane.showConfirmDialog(null, "Add Discount?", "Add Discount Confirmation", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                Discount discount = new Discount();
                discount.setDescription(description);
                discount.setPercentOfDiscount(percentage);
                discount.setDiscountName(discountName);
                boolean isAdded = discountDaoImpl.add(discount);
                if(isAdded){
                    JOptionPane.showMessageDialog(null,"Successfully added "+discountName);
                    reloadDiscountList();
                    clearCreateDiscountFields();
                }else{
                    JOptionPane.showMessageDialog(null,"Error encountered while adding discount.");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please check your input values");
        }
    }//GEN-LAST:event_jbtnSaveDiscountCreateActionPerformed

    private void jbtnUpdateDiscountInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateDiscountInfoActionPerformed
        // TODO add your handling code here:
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel feesCardContainer;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JButton jbtnClearFeeInfoFields;
    private javax.swing.JButton jbtnCreateFee;
    private javax.swing.JButton jbtnDeleteFee;
    private javax.swing.JButton jbtnSaveDiscountCreate;
    private javax.swing.JButton jbtnUpdateDiscountInfo;
    private javax.swing.JButton jbtnUpdateFee;
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
    private javax.swing.JComboBox<String> jcmbAction;
    private javax.swing.JComboBox<String> jcmbDiscountStatusUpdate;
    private javax.swing.JComboBox<String> jcmbFeeCategory;
    private javax.swing.JComboBox<String> jcmbFeeCategory1;
    private javax.swing.JComboBox<String> jcmbFilterByFeeCategory;
    private javax.swing.JComboBox<String> jcmbFilterGradeLevel;
    private javax.swing.JComboBox<String> jcmbYearCreated;
    private javax.swing.JLabel jlblAmount;
    private javax.swing.JLabel jlblAmount2;
    private javax.swing.JLabel jlblDateCreateText;
    private javax.swing.JLabel jlblDiscountNameUpdate;
    private javax.swing.JLabel jlblFeeCategory;
    private javax.swing.JLabel jlblFeeCategory1;
    private javax.swing.JLabel jlblFeeName;
    private javax.swing.JLabel jlblFeeName2;
    private javax.swing.JLabel jlblFilterFeeCategory;
    private javax.swing.JLabel jlblFilterGradeLevel;
    private javax.swing.JLabel jlblFilterSearch;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblGradeLevel2;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JLabel jlblYearCreated;
    private javax.swing.JList<String> jlstDiscountsList;
    private javax.swing.JList<String> jlstFeeNameList;
    private javax.swing.JPanel jpnlCreateFee;
    private javax.swing.JPanel jpnlCreateFeeControls;
    private javax.swing.JPanel jpnlCreateNewFeeDescription;
    private javax.swing.JPanel jpnlCreateNewFeeDescription1;
    private javax.swing.JPanel jpnlCreateNewFeeFields;
    private javax.swing.JPanel jpnlFeeCreationTab;
    private javax.swing.JPanel jpnlFeeRecordTab;
    private javax.swing.JPanel jpnlFilterControl;
    private javax.swing.JPanel jpnlGradeLevelSelection;
    private javax.swing.JPanel jpnlGradeLevelSelection1;
    private javax.swing.JPanel jpnlSortFeeList;
    private javax.swing.JPanel jpnlUpdateFee;
    private javax.swing.JPanel jpnlUpdateFeeControls;
    private javax.swing.JScrollPane jspFeeCreation;
    private javax.swing.JScrollPane jspFeeDescription;
    private javax.swing.JScrollPane jspFeeDescription2;
    private javax.swing.JScrollPane jspFeeList;
    private javax.swing.JSpinner jsprPercentOfDiscountCreate;
    private javax.swing.JSpinner jsprPercentOfDiscountUpdate;
    private javax.swing.JTextArea jtaDiscountDescriptionCreate;
    private javax.swing.JTextArea jtaDiscountDescriptionUpdate;
    private javax.swing.JTextArea jtaFeeDescription;
    private javax.swing.JTextArea jtaFeeDescription1;
    private javax.swing.JTable jtblAllFees;
    private javax.swing.JTextField jtfDiscountNameCreate;
    private javax.swing.JTextField jtfDiscountNameUpdate;
    private javax.swing.JTextField jtfFeeAmount;
    private javax.swing.JTextField jtfFeeAmount1;
    private javax.swing.JTextField jtfFeeName;
    private javax.swing.JTextField jtfFeeName1;
    private javax.swing.JTextField jtfFilterEnterSearch;
    private javax.swing.JTabbedPane jtpFees;
    private javax.swing.JTabbedPane jtpFeesTopTabbedPane;
    // End of variables declaration//GEN-END:variables
}
