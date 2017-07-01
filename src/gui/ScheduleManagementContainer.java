/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import daoimpl.ScheduleDaoImpl;
import component_model_loader.GradeLevelML;
import component_model_loader.JSpinnerGUIUtil;
import component_model_loader.SchoolYearML;
import component_model_loader.SectionML;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import component_renderers.JComboBoxRenderer_GradeLevel;

public class ScheduleManagementContainer extends javax.swing.JPanel {

    private final GUIManager guiManager = new GUIManager();
    
    public ScheduleManagementContainer() {
        initComponents();
        guiManager.setGUIComponentProperties();
        guiManager.setGUIComponentModels();
        guiManager.setInitialGUIComponentState();
    }

    
    public class GUIManager {

        private void setInitialGUIComponentState() {
            jcmbGradeLevel.setSelectedIndex(-1);
            jcmbSection.setSelectedIndex(-1);
            jcmbSubject.setSelectedIndex(-1);
            jcmbSchoolYearFrom.setSelectedIndex(-1);
            jcmbSchoolYearTo.setSelectedIndex(-1);
            jcmbDay.setSelectedIndex(-1);
        }

        private void setGUIComponentProperties() {
            UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
            UIManager.put("ComboBox.disabledForeground", Color.BLACK);
            jtblScheduleTable.setAutoCreateRowSorter(true);
        }

        private void setGUIComponentModels() {
            jsprStartTime.setModel(JSpinnerGUIUtil.getADateModel());
            jsprStartTime.setEditor(JSpinnerGUIUtil.getEditorInTimeFormat(jsprStartTime));
            jsprEndTime.setModel(JSpinnerGUIUtil.getADateModel());
            jsprEndTime.setEditor(JSpinnerGUIUtil.getEditorInTimeFormat(jsprEndTime));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        schedulesCardContainer = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jpnlCreateSchedule = new javax.swing.JPanel();
        jpnlDayAndTime = new javax.swing.JPanel();
        jlblStartTime = new javax.swing.JLabel();
        jsprStartTime = new javax.swing.JSpinner();
        jlblEndTime = new javax.swing.JLabel();
        jsprEndTime = new javax.swing.JSpinner();
        jlblDay = new javax.swing.JLabel();
        jcmbDay = new javax.swing.JComboBox<>();
        jpnlDays = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jlblGradeLevel = new javax.swing.JLabel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        jlblSection = new javax.swing.JLabel();
        jcmbSection = new javax.swing.JComboBox<>();
        jlblSubject = new javax.swing.JLabel();
        jcmbSubject = new javax.swing.JComboBox<>();
        jcmbSchoolYearFrom = new javax.swing.JComboBox<>();
        jlblSchoolYear = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcmbSchoolYearTo = new javax.swing.JComboBox<>();
        jpnlControl = new javax.swing.JPanel();
        jbtnAddSchedule = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jlblRoom = new javax.swing.JLabel();
        jcmbRoom = new javax.swing.JComboBox<>();
        jpnlScheduleTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblScheduleTable = new javax.swing.JTable();
        jpnlSubmitSchedule = new javax.swing.JPanel();
        jbtnSubmit = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        schedulesCardContainer.setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jpnlCreateSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Schedule"));
        jpnlCreateSchedule.setLayout(new java.awt.GridBagLayout());

        jpnlDayAndTime.setBorder(javax.swing.BorderFactory.createTitledBorder("Day & Time"));
        jpnlDayAndTime.setLayout(new java.awt.GridBagLayout());

        jlblStartTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblStartTime.setText("Start Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jlblStartTime, gridBagConstraints);

        jsprStartTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jsprStartTime.setMinimumSize(new java.awt.Dimension(55, 30));
        jsprStartTime.setPreferredSize(new java.awt.Dimension(55, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jsprStartTime, gridBagConstraints);

        jlblEndTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblEndTime.setText("End Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jlblEndTime, gridBagConstraints);

        jsprEndTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jsprEndTime.setMinimumSize(new java.awt.Dimension(55, 30));
        jsprEndTime.setPreferredSize(new java.awt.Dimension(55, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jsprEndTime, gridBagConstraints);

        jlblDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblDay.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jlblDay, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDayAndTime.add(jcmbDay, gridBagConstraints);

        jpnlDays.setLayout(new java.awt.GridBagLayout());

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Mon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Tues");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox2, gridBagConstraints);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Wed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox3, gridBagConstraints);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Thurs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox4, gridBagConstraints);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Fri");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox5, gridBagConstraints);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Sat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox6, gridBagConstraints);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Sun");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlDays.add(jCheckBox7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlDayAndTime.add(jpnlDays, gridBagConstraints);

        jpnlCreateSchedule.add(jpnlDayAndTime, new java.awt.GridBagConstraints());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Assignment"));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jlblGradeLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblGradeLevel.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jlblGradeLevel, gridBagConstraints);

        jcmbGradeLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbGradeLevel.setModel(new GradeLevelML().getAllGradeLevels());
        jcmbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jcmbGradeLevel, gridBagConstraints);

        jlblSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblSection.setText("Section");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jlblSection, gridBagConstraints);

        jcmbSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbSection.setModel(new SectionML().getSectionForJComboBox());
        jcmbSection.setMinimumSize(new java.awt.Dimension(100, 20));
        jcmbSection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSectionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jcmbSection, gridBagConstraints);

        jlblSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblSubject.setText("Subject");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jlblSubject, gridBagConstraints);

        jcmbSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbSubject.setMinimumSize(new java.awt.Dimension(370, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jcmbSubject, gridBagConstraints);

        jcmbSchoolYearFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbSchoolYearFrom.setModel(new SchoolYearML().getAllSchoolYearStart());
        jcmbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jcmbSchoolYearFrom, gridBagConstraints);

        jlblSchoolYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblSchoolYear.setText("School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jlblSchoolYear, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jLabel9, gridBagConstraints);

        jcmbSchoolYearTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbSchoolYearTo.setModel(new SchoolYearML().getAllSchoolYearEnd());
        jcmbSchoolYearTo.setEnabled(false);
        jcmbSchoolYearTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearToItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jcmbSchoolYearTo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jpnlCreateSchedule.add(jPanel7, gridBagConstraints);

        jpnlControl.setLayout(new java.awt.GridBagLayout());

        jbtnAddSchedule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAddSchedule.setText("Add");
        jbtnAddSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddScheduleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlControl.add(jbtnAddSchedule, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSchedule.add(jpnlControl, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jlblRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblRoom.setText("Room");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jlblRoom, gridBagConstraints);

        jcmbRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jcmbRoom, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSchedule.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jpnlCreateSchedule, gridBagConstraints);

        jpnlScheduleTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlScheduleTable.setPreferredSize(new java.awt.Dimension(600, 410));
        jpnlScheduleTable.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 402));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 402));

        jtblScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Start Time", "End Time", "Room", "Subject", "Grade Level", "Section"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblScheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtblScheduleTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlScheduleTable.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jpnlScheduleTable, gridBagConstraints);

        jpnlSubmitSchedule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlSubmitSchedule.setLayout(new java.awt.GridBagLayout());

        jbtnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubmitSchedule.add(jbtnSubmit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jpnlSubmitSchedule, gridBagConstraints);

        jTabbedPane1.addTab("Schedule Creation", jPanel1);

        schedulesCardContainer.add(jTabbedPane1, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(schedulesCardContainer, gridBagConstraints);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
        
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged

    private void jcmbSectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSectionItemStateChanged
    }//GEN-LAST:event_jcmbSectionItemStateChanged

    private void jcmbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearFromItemStateChanged
        jcmbSchoolYearTo.setSelectedIndex(jcmbSchoolYearFrom.getSelectedIndex());
    }//GEN-LAST:event_jcmbSchoolYearFromItemStateChanged

    private void jbtnAddScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddScheduleActionPerformed
        String  aDay = null ,
        aRoom = null,
        aSubject = null,
        aGradeLevel = null,
        aSection = null;
        if(jcmbDay.getSelectedIndex() > -1){
            aDay = jcmbDay.getSelectedItem().toString();
        }
        if(jcmbRoom.getSelectedIndex() > -1){
            aRoom = jcmbRoom.getSelectedItem().toString();
        }
        if(jcmbSubject.getSelectedIndex() > -1){
            aSubject = jcmbSubject.getSelectedItem().toString();
        }
        if(jcmbRoom.getSelectedIndex() > -1){
            aRoom = jcmbRoom.getSelectedItem().toString();
        }
        if(jcmbGradeLevel.getSelectedIndex() > -1){
            aGradeLevel = jcmbGradeLevel.getSelectedItem().toString();
        }
        if(jcmbSection.getSelectedIndex() > -1){
            aSection = jcmbSection.getSelectedItem().toString();
        }

        Date startDate = (Date) jsprStartTime.getValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm");
        String startTimeString = localDateFormat.format(startDate);
        int startHours = calendar.get(Calendar.HOUR_OF_DAY) * 100;
        int startMinutes = calendar.get(Calendar.MINUTE);
        int startTimeJSpinnerInt = ( (startHours)+startMinutes );

        Date endDate = (Date) jsprEndTime.getValue();
        String endTimeString = localDateFormat.format(endDate);
        calendar.setTime(endDate);
        int endHours = calendar.get(Calendar.HOUR_OF_DAY) * 100;
        int endMinutes = calendar.get(Calendar.MINUTE);
        int endTimeJSpinnerInt = ( (endHours)+endMinutes );

        if(endTimeJSpinnerInt < startTimeJSpinnerInt) {
            JOptionPane.showMessageDialog(null,"End Time must be greater than Start Time");
        }else if(startHours == 0){
            JOptionPane.showMessageDialog(null,"Classes can't start as early as 12 AM");
        }
        else if( (endTimeJSpinnerInt <= 0)||(startTimeJSpinnerInt <= 0) ){
            JOptionPane.showMessageDialog(null,"Time cannot have a 00:00 value");
        }
        else if( (startTimeJSpinnerInt > 0)&&(startTimeJSpinnerInt == endTimeJSpinnerInt) ){
            JOptionPane.showMessageDialog(null,"Start Time must not equal End Time");
        }else{
            DefaultTableModel myModel = (DefaultTableModel)jtblScheduleTable.getModel();

            boolean hasConflict = false;

            for(int i=0; i<myModel.getRowCount(); i++) //for every row
            {
                for(int j=0; j<myModel.getColumnCount(); j++)// for every column
                {
                    String day = (String) myModel.getValueAt(i,j);
                    String startTime = (String) myModel.getValueAt(i,1);
                    String[] startTimeParts = startTime.split(":") ;
                    int startTimeINT_fromJTable = Integer.parseInt(startTimeParts[0]+startTimeParts[1]);

                    String endTime = (String) myModel.getValueAt(i,2);
                    String[] endTimeParts = endTime.split(":") ;
                    int endTimeINT_fromJTable = Integer.parseInt(endTimeParts[0]+endTimeParts[1]);

                    String room = (String) myModel.getValueAt(i,3);
                    Object subject = myModel.getValueAt(i,4);

                    if( (aDay.equals(day)) && (aRoom.equals(room)) ){
                        if( startTimeJSpinnerInt == startTimeINT_fromJTable )  {
                            hasConflict = true;
                            jtblScheduleTable.setRowSelectionInterval(i, i);
                        }
                        //                        if( (startTimeINT_fromSpinner >= endTimeINT_fromJTable) && (endTimeINT_fromSpinner > endTimeINT_fromJTable) ){
                            //                            hasConflict = false;
                            //                        }
                        //                        if((startTimeINT_fromSpinner < startTimeINT_fromJTable) && (endTimeINT_fromSpinner <= startTimeINT_fromJTable)){
                            //                            hasConflict = false;
                            //                        }
                        else if((startTimeJSpinnerInt > startTimeINT_fromJTable) && (endTimeJSpinnerInt < endTimeINT_fromJTable) ){
                            hasConflict = true;
                        }
                        else if((startTimeJSpinnerInt < endTimeINT_fromJTable) && (endTimeJSpinnerInt <= endTimeINT_fromJTable)){
                            hasConflict = true;
                        }
                        else if((startTimeJSpinnerInt == startTimeINT_fromJTable) && (endTimeJSpinnerInt < endTimeINT_fromJTable)){
                            hasConflict = true;
                        }
                        else if((startTimeJSpinnerInt > startTimeINT_fromJTable) && (startTimeJSpinnerInt < endTimeINT_fromJTable)){
                            hasConflict = true;
                        }else if((startTimeJSpinnerInt < startTimeINT_fromJTable) && (endTimeJSpinnerInt > endTimeINT_fromJTable)){
                            hasConflict = true;
                        }

                        if((startTimeJSpinnerInt < startTimeINT_fromJTable) && (endTimeJSpinnerInt <= startTimeINT_fromJTable)){
                            hasConflict = false;
                        }
                    }
                }
            }
            if(hasConflict == false){
                myModel.addRow(new Object[]{aDay,startTimeString,endTimeString,aRoom,aSubject,aGradeLevel,aSection} );
            }else{
                JOptionPane.showMessageDialog(null,"Conflict");
            }
        }
    }//GEN-LAST:event_jbtnAddScheduleActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        String myGradeLevel = null, mySectionName = null, mySubject = null, myDay = null, myRoom = null;
        int mySyYearFrom = 0, mySyYearTo = 0;
        int startTimeINT = 0, endTimeINT = 0;
        mySyYearFrom = Integer.parseInt(jcmbSchoolYearFrom.getSelectedItem().toString() );
        mySyYearTo = Integer.parseInt(jcmbSchoolYearTo.getSelectedItem().toString());

        int choice = JOptionPane.showConfirmDialog(null, "Add Schedule","Add Schedule?",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            boolean isSuccessful = true;
            for(int i=0; i < jtblScheduleTable.getRowCount(); i++){
                for(int j = 0; j < jtblScheduleTable.getColumnCount(); j++){
                    String startTime = (String) jtblScheduleTable.getValueAt(i,1);
                    String[] startTimeParts = startTime.split(":") ;
                    startTimeINT = Integer.parseInt(startTimeParts[0]+startTimeParts[1]);

                    String endTime = (String) jtblScheduleTable.getValueAt(i,2);
                    String[] endTimeParts = endTime.split(":") ;
                    endTimeINT = Integer.parseInt(endTimeParts[0]+endTimeParts[1]);

                    myGradeLevel = (String) jtblScheduleTable.getValueAt(i, 5);
                    myRoom = (String) jtblScheduleTable.getValueAt(i, 3);
                    mySectionName = (String) jtblScheduleTable.getValueAt(i, 6);
                    mySubject = (String) jtblScheduleTable.getValueAt(i, 4);
                    myDay = (String) jtblScheduleTable.getValueAt(i,0);
                }
                ScheduleDaoImpl schedule = new ScheduleDaoImpl
                (startTimeINT, endTimeINT, myDay, myRoom, mySubject, mySectionName, myGradeLevel, mySyYearFrom, mySyYearTo);
                isSuccessful = schedule.add();
            }

            if (isSuccessful) {
                JOptionPane.showMessageDialog(null, "Successfully saved.");
            } else {
                JOptionPane.showMessageDialog(null, "Error encountered");
            }
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jcmbSchoolYearToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearToItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSchoolYearToItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAddSchedule;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JComboBox<String> jcmbDay;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    private javax.swing.JComboBox<String> jcmbRoom;
    private javax.swing.JComboBox<String> jcmbSchoolYearFrom;
    private javax.swing.JComboBox<String> jcmbSchoolYearTo;
    private javax.swing.JComboBox<String> jcmbSection;
    private javax.swing.JComboBox<String> jcmbSubject;
    private javax.swing.JLabel jlblDay;
    private javax.swing.JLabel jlblEndTime;
    private javax.swing.JLabel jlblGradeLevel;
    private javax.swing.JLabel jlblRoom;
    private javax.swing.JLabel jlblSchoolYear;
    private javax.swing.JLabel jlblSection;
    private javax.swing.JLabel jlblStartTime;
    private javax.swing.JLabel jlblSubject;
    private javax.swing.JPanel jpnlControl;
    private javax.swing.JPanel jpnlCreateSchedule;
    private javax.swing.JPanel jpnlDayAndTime;
    private javax.swing.JPanel jpnlDays;
    private javax.swing.JPanel jpnlScheduleTable;
    private javax.swing.JPanel jpnlSubmitSchedule;
    private javax.swing.JSpinner jsprEndTime;
    private javax.swing.JSpinner jsprStartTime;
    private javax.swing.JTable jtblScheduleTable;
    public static javax.swing.JPanel schedulesCardContainer;
    // End of variables declaration//GEN-END:variables
}
