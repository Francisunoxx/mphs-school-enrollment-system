/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.schoolyear;

import calendar_utility.CalendarUtil;
import daoimpl.EnrollmentDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import component_model_loader.CalendarML;
import component_model_loader.JPanelGUIUtil;
import component_model_loader.JSpinnerGUIUtil;
import java.awt.Color;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.Enrollment;
import model.SchoolYear;
import model.Quarter;
import component_renderers.JTableRenderer_SchoolYear;
import daoimpl.HolidayDaoImpl;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import model.Holiday;
import model.SummerClassSchedule;
import view.holiday.AddHolidayToSchoolYear;

/**
 *
 * @author Acer
 */
public class SchoolYearManagementContainer extends javax.swing.JPanel {

    private SchoolYearDaoImpl SYDAOIMPL = new SchoolYearDaoImpl();
    private HolidayDaoImpl HOLIDAYDAOIMPL = new HolidayDaoImpl();

    private final int CURRENT_YEAR = CalendarUtil.getCurrentYear();
    private final int SYSTART_MIN_YEAR = CURRENT_YEAR; // 2017
    private final int SYSTART_MAX_YEAR = CURRENT_YEAR + 10; // 2027
    private final int SYEND_MIN_YEAR = CURRENT_YEAR + 1; // 2018
    private final int SYEND_MAX_YEAR = CURRENT_YEAR + 10; // 2028
    private final int INCREMENT_COUNT = 1;

    public SchoolYearManagementContainer() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        UIManager.put("TextField.disabledBackground", new Color(255, 255, 255));
        UIManager.put("TextField.inactiveForeground", Color.BLACK);
        
        initComponents();
        jspCreateSchoolYear.getVerticalScrollBar().setUnitIncrement(66);
        
        loadJListHolidayRecord();
        setHolidayJComboBoxModels();
        
        setSummerScheduleJComboBoxModel();
        
        setSchoolYearStartDateDayJComboBoxModel();
        setYearJComboModel();

        setSemestersYearJComboBoxModels();
        setSchoolYearMonthJComboBoxModel();
        setFirstSemMonthJComboBoxModel();
        setSecondSemMonthJComboBoxModel();
        setThirdSemMonthJComboBoxModel();
        setFourthSemMonthJComboBoxModel();
        
        //JSpinner SCHOOL YEAR FROM
        SpinnerNumberModel schoolYearFromModel = new SpinnerNumberModel(CURRENT_YEAR, SYSTART_MIN_YEAR, SYSTART_MAX_YEAR, INCREMENT_COUNT);
        jsprSchoolYearFrom.setModel(schoolYearFromModel);
        JSpinner.NumberEditor schoolYearFromEditor = new JSpinner.NumberEditor(jsprSchoolYearFrom, "#");
        jsprSchoolYearFrom.setEditor(schoolYearFromEditor);

        //JSpinner SCHOOL YEAR TO
        SpinnerNumberModel schoolYearToModel = new SpinnerNumberModel(CURRENT_YEAR + 1, SYEND_MIN_YEAR, SYEND_MAX_YEAR, INCREMENT_COUNT + 1);
        jsprSchoolYearTo.setModel(schoolYearToModel);
        JSpinner.NumberEditor schoolYearToEditor = new JSpinner.NumberEditor(jsprSchoolYearTo, "#");
        jsprSchoolYearTo.setEditor(schoolYearToEditor);
        JSpinnerGUIUtil.setDisabledForegroundColorTo(jsprSchoolYearTo, Color.BLACK);

        //JSpinner Class Hours
        SpinnerNumberModel classHoursModel = new SpinnerNumberModel(0, 0, 5000, 1);
        jsprClassHours.setModel(classHoursModel);
        
        //JComboBox INITIAL SELECTED ITEM
        jcmbSchoolYearStartDateYear.setSelectedItem(CURRENT_YEAR);

        //JTABLE
        setjtblSchoolYearList();
        setjtblEnrollmentScheduleList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblSchoolYearList = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEnrollmentSchedule = new javax.swing.JTable();
        jspCreateSchoolYear = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtbnClear = new javax.swing.JButton();
        jbtnCreate = new javax.swing.JButton();
        jpnlClassHours = new javax.swing.JPanel();
        jlblClassHours = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jsprClassHours = new javax.swing.JSpinner();
        jpnlHolidays = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlstHolidays = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jbtnAddHolidays = new javax.swing.JButton();
        jpnlHolidaySchedule = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jpnlFirstQuarterSchedule = new javax.swing.JPanel();
        jlblStartDate1 = new javax.swing.JLabel();
        jcmbFirstQuarterStartDateDay = new javax.swing.JComboBox<>();
        jcmbFirstQuarterStartDateMonth = new javax.swing.JComboBox<>();
        jcmbFirstQuarterStartDateYear = new javax.swing.JComboBox<>();
        jlblStartDateDay2 = new javax.swing.JLabel();
        jlblStartDateMonth2 = new javax.swing.JLabel();
        jlblStartDateYear2 = new javax.swing.JLabel();
        jcmbFirstQuarterEndDateDay = new javax.swing.JComboBox<>();
        jcmbFirstQuarterEndDateMonth = new javax.swing.JComboBox<>();
        jcmbFirstQuarterEndDateYear = new javax.swing.JComboBox<>();
        jlblEndDateDay2 = new javax.swing.JLabel();
        jlblEndDateMonth2 = new javax.swing.JLabel();
        jlblEndDateYear2 = new javax.swing.JLabel();
        jlblEndDate1 = new javax.swing.JLabel();
        jpnlSecondQuarterSchedule = new javax.swing.JPanel();
        jlblStartDate2 = new javax.swing.JLabel();
        jcmbSecondQuarterStartDateDay = new javax.swing.JComboBox<>();
        jcmbSecondQuarterStartDateMonth = new javax.swing.JComboBox<>();
        jcmbSecondQuarterStartDateYear = new javax.swing.JComboBox<>();
        jlblStartDateDay3 = new javax.swing.JLabel();
        jlblStartDateMonth3 = new javax.swing.JLabel();
        jlblStartDateYear3 = new javax.swing.JLabel();
        jcmbSecondQuarterEndDateDay = new javax.swing.JComboBox<>();
        jcmbSecondQuarterEndDateMonth = new javax.swing.JComboBox<>();
        jcmbSecondQuarterEndDateYear = new javax.swing.JComboBox<>();
        jlblEndDateDay3 = new javax.swing.JLabel();
        jlblEndDateMonth3 = new javax.swing.JLabel();
        jlblEndDateYear3 = new javax.swing.JLabel();
        jlblEndDate2 = new javax.swing.JLabel();
        jpnlThirdQuarterSchedule = new javax.swing.JPanel();
        jlblStartDate3 = new javax.swing.JLabel();
        jcmbThirdQuarterStartDateDay = new javax.swing.JComboBox<>();
        jcmbThirdQuarterStartDateMonth = new javax.swing.JComboBox<>();
        jcmbThirdQuarterStartDateYear = new javax.swing.JComboBox<>();
        jlblStartDateDay4 = new javax.swing.JLabel();
        jlblStartDateMonth4 = new javax.swing.JLabel();
        jlblStartDateYear4 = new javax.swing.JLabel();
        jcmbThirdQuarterEndDateDay = new javax.swing.JComboBox<>();
        jcmbThirdQuarterEndDateMonth = new javax.swing.JComboBox<>();
        jcmbThirdQuarterEndDateYear = new javax.swing.JComboBox<>();
        jlblEndDateDay4 = new javax.swing.JLabel();
        jlblEndDateMonth4 = new javax.swing.JLabel();
        jlblEndDateYear4 = new javax.swing.JLabel();
        jlblEndDate3 = new javax.swing.JLabel();
        jpnlFourthQuarterSchedule = new javax.swing.JPanel();
        jlblStartDate4 = new javax.swing.JLabel();
        jcmbFourthQuarterStartDateDay = new javax.swing.JComboBox<>();
        jcmbFourthQuarterStartDateMonth = new javax.swing.JComboBox<>();
        jcmbFourthQuarterStartDateYear = new javax.swing.JComboBox<>();
        jlblStartDateDay5 = new javax.swing.JLabel();
        jlblStartDateMonth5 = new javax.swing.JLabel();
        jlblStartDateYear5 = new javax.swing.JLabel();
        jcmbFourthQuarterEndDateDay = new javax.swing.JComboBox<>();
        jcmbFourthQuarterEndDateMonth = new javax.swing.JComboBox<>();
        jcmbFourthQuarterEndDateYear = new javax.swing.JComboBox<>();
        jlblEndDateDay5 = new javax.swing.JLabel();
        jlblEndDateMonth5 = new javax.swing.JLabel();
        jlblEndDateYear5 = new javax.swing.JLabel();
        jlblEndDate4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jsprSchoolYearFrom = new javax.swing.JSpinner();
        jlblSchoolYearTo = new javax.swing.JLabel();
        jsprSchoolYearTo = new javax.swing.JSpinner();
        jpnlSchoolYearSchedule = new javax.swing.JPanel();
        jlblStartDate = new javax.swing.JLabel();
        jlblEndDate = new javax.swing.JLabel();
        jcmbSchoolYearStartDateYear = new javax.swing.JComboBox<>();
        jlblStartDateYear = new javax.swing.JLabel();
        jcmbSchoolYearStartDateMonth = new javax.swing.JComboBox<>();
        jlblStartDateMonth = new javax.swing.JLabel();
        jcmbSchoolYearStartDateDay = new javax.swing.JComboBox<>();
        jlblStartDateDay = new javax.swing.JLabel();
        jcmbSchoolYearClosingDateYear = new javax.swing.JComboBox<>();
        jcmbSchoolYearEndDateMonth = new javax.swing.JComboBox<>();
        jcmbSchoolYearEndDateDay = new javax.swing.JComboBox<>();
        jlblEndDateYear = new javax.swing.JLabel();
        jlblEndDateMonth = new javax.swing.JLabel();
        jlblEndDateDay = new javax.swing.JLabel();
        jpnlEnrollmentSchedule = new javax.swing.JPanel();
        jlblEnrollmentOpeningDate = new javax.swing.JLabel();
        jcmbEnrollmentOpeningDateDay = new javax.swing.JComboBox<>();
        jcmbEnrollmentOpeningDateMonth = new javax.swing.JComboBox<>();
        jcmbEnrollmentOpeningDateYear = new javax.swing.JComboBox<>();
        jlblStartDateDay1 = new javax.swing.JLabel();
        jlblStartDateMonth1 = new javax.swing.JLabel();
        jlblStartDateYear1 = new javax.swing.JLabel();
        jlblEnrollmentClosingDate = new javax.swing.JLabel();
        jcmbEnrollmentClosingDateDay = new javax.swing.JComboBox<>();
        jcmbEnrollmentClosingDateMonth = new javax.swing.JComboBox<>();
        jcmbEnrollmentClosingDateYear = new javax.swing.JComboBox<>();
        jlblEndDateDay1 = new javax.swing.JLabel();
        jlblEndDateMonth1 = new javax.swing.JLabel();
        jlblEndDateYear1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblSummerStartDate = new javax.swing.JLabel();
        jcmbSummerStartDay = new javax.swing.JComboBox<>();
        jcmbSummerStartMonth = new javax.swing.JComboBox<>();
        jcmbSummerStartYear = new javax.swing.JComboBox<>();
        jlblStartDateDay7 = new javax.swing.JLabel();
        jlblStartDateMonth7 = new javax.swing.JLabel();
        jlblStartDateYear7 = new javax.swing.JLabel();
        jlblSummerEndDate = new javax.swing.JLabel();
        jcmbSummerEndDay = new javax.swing.JComboBox<>();
        jcmbSummerEndMonth = new javax.swing.JComboBox<>();
        jcmbSummerEndYear = new javax.swing.JComboBox<>();
        jlblEndDateYear7 = new javax.swing.JLabel();
        jlblEndDateMonth7 = new javax.swing.JLabel();
        jlblEndDateDay7 = new javax.swing.JLabel();
        jpnlHolidaySets = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jlblHolidayName = new javax.swing.JLabel();
        jtfHolidayName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaHolidayDescription = new javax.swing.JTextArea();
        jbtnSaveHoliday = new javax.swing.JButton();
        jlblHolidayDescription = new javax.swing.JLabel();
        jpnlHolidayDate = new javax.swing.JPanel();
        jlblHolidayStartDate = new javax.swing.JLabel();
        jlblHolidayEndDate = new javax.swing.JLabel();
        jcmbStartHolidayYear = new javax.swing.JComboBox<>();
        jlblStartDateYear6 = new javax.swing.JLabel();
        jcmbStartHolidayMonth = new javax.swing.JComboBox<>();
        jlblStartDateMonth6 = new javax.swing.JLabel();
        jcmbStartHolidayDay = new javax.swing.JComboBox<>();
        jlblStartDateDay6 = new javax.swing.JLabel();
        jcmbEndHolidayYear = new javax.swing.JComboBox<>();
        jcmbEndHolidayMonth = new javax.swing.JComboBox<>();
        jcmbEndHolidayDay = new javax.swing.JComboBox<>();
        jlblEndDateYear6 = new javax.swing.JLabel();
        jlblEndDateMonth6 = new javax.swing.JLabel();
        jlblEndDateDay6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlstHolidayRecord = new javax.swing.JList<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmbHolidayRecordAction = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jpnlHolidayDate1 = new javax.swing.JPanel();
        jlblHolidayStartDate1 = new javax.swing.JLabel();
        jlblHolidayEndDate1 = new javax.swing.JLabel();
        jcmbStartHolidayYear1 = new javax.swing.JComboBox<>();
        jlblStartDateYear8 = new javax.swing.JLabel();
        jcmbStartHolidayMonth1 = new javax.swing.JComboBox<>();
        jlblStartDateMonth8 = new javax.swing.JLabel();
        jcmbStartHolidayDay1 = new javax.swing.JComboBox<>();
        jlblStartDateDay8 = new javax.swing.JLabel();
        jcmbEndHolidayYear1 = new javax.swing.JComboBox<>();
        jcmbEndHolidayMonth1 = new javax.swing.JComboBox<>();
        jcmbEndHolidayDay1 = new javax.swing.JComboBox<>();
        jlblEndDateYear8 = new javax.swing.JLabel();
        jlblEndDateMonth8 = new javax.swing.JLabel();
        jlblEndDateDay8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "School Year List"));

        jtblSchoolYearList.setAutoCreateRowSorter(true);
        jtblSchoolYearList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "From", "To", "Start Date", "End Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblSchoolYearList);

        jTabbedPane1.addTab("School Year", jScrollPane2);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jtblEnrollmentSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.Y. ID", "School Year", "Date Open", "Date Closed", "Enrollment Ended"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblEnrollmentSchedule.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtblEnrollmentSchedule);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jScrollPane1, gridBagConstraints);

        jTabbedPane1.addTab("Enrollment Schedule", jPanel5);

        jTabbedPane2.addTab("Record", jTabbedPane1);

        jspCreateSchoolYear.setMinimumSize(new java.awt.Dimension(568, 500));
        jspCreateSchoolYear.setPreferredSize(new java.awt.Dimension(720, 700));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Create School Year"));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 675));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jtbnClear.setText("Clear");
        jtbnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jtbnClear, gridBagConstraints);

        jbtnCreate.setText("Create");
        jbtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCreate, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel4.add(jPanel1, gridBagConstraints);

        jpnlClassHours.setBorder(javax.swing.BorderFactory.createTitledBorder("Class Hours"));
        jpnlClassHours.setPreferredSize(new java.awt.Dimension(150, 150));
        jpnlClassHours.setLayout(new java.awt.GridBagLayout());

        jlblClassHours.setText("Total Hours");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlClassHours.add(jlblClassHours, gridBagConstraints);

        jLabel1.setText("(hrs)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlClassHours.add(jLabel1, gridBagConstraints);

        jsprClassHours.setPreferredSize(new java.awt.Dimension(50, 26));
        jsprClassHours.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsprClassHoursStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlClassHours.add(jsprClassHours, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jpnlClassHours, gridBagConstraints);

        jpnlHolidays.setBorder(javax.swing.BorderFactory.createTitledBorder("Holidays"));
        jpnlHolidays.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(160, 200));

        jScrollPane3.setViewportView(jlstHolidays);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidays.add(jScrollPane3, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jbtnAddHolidays.setText("Add..");
        jbtnAddHolidays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddHolidaysActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnAddHolidays, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidays.add(jPanel6, gridBagConstraints);

        jpnlHolidaySchedule.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidays.add(jpnlHolidaySchedule, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jpnlHolidays, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Quarters"));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jpnlFirstQuarterSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("1st Quarter"));
        jpnlFirstQuarterSchedule.setPreferredSize(new java.awt.Dimension(300, 150));
        jpnlFirstQuarterSchedule.setLayout(new java.awt.GridBagLayout());

        jlblStartDate1.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblStartDate1, gridBagConstraints);

        jcmbFirstQuarterStartDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFirstQuarterStartDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterStartDateDayItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterStartDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterStartDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterStartDateDay, gridBagConstraints);

        jcmbFirstQuarterStartDateMonth.setMaximumRowCount(12);
        jcmbFirstQuarterStartDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFirstQuarterStartDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbFirstQuarterStartDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterStartDateMonthItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterStartDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterStartDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterStartDateMonth, gridBagConstraints);

        jcmbFirstQuarterStartDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterStartDateYearItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterStartDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterStartDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterStartDateYear, gridBagConstraints);

        jlblStartDateDay2.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblStartDateDay2, gridBagConstraints);

        jlblStartDateMonth2.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblStartDateMonth2, gridBagConstraints);

        jlblStartDateYear2.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblStartDateYear2, gridBagConstraints);

        jcmbFirstQuarterEndDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFirstQuarterEndDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterEndDateDayItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterEndDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterEndDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterEndDateDay, gridBagConstraints);

        jcmbFirstQuarterEndDateMonth.setMaximumRowCount(12);
        jcmbFirstQuarterEndDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFirstQuarterEndDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbFirstQuarterEndDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterEndDateMonthItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterEndDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterEndDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterEndDateMonth, gridBagConstraints);

        jcmbFirstQuarterEndDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFirstQuarterEndDateYearItemStateChanged(evt);
            }
        });
        jcmbFirstQuarterEndDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFirstQuarterEndDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jcmbFirstQuarterEndDateYear, gridBagConstraints);

        jlblEndDateDay2.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblEndDateDay2, gridBagConstraints);

        jlblEndDateMonth2.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblEndDateMonth2, gridBagConstraints);

        jlblEndDateYear2.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblEndDateYear2, gridBagConstraints);

        jlblEndDate1.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFirstQuarterSchedule.add(jlblEndDate1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jpnlFirstQuarterSchedule, gridBagConstraints);

        jpnlSecondQuarterSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("2nd Quarter"));
        jpnlSecondQuarterSchedule.setPreferredSize(new java.awt.Dimension(300, 150));
        jpnlSecondQuarterSchedule.setLayout(new java.awt.GridBagLayout());

        jlblStartDate2.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblStartDate2, gridBagConstraints);

        jcmbSecondQuarterStartDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSecondQuarterStartDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterStartDateDayItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterStartDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterStartDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterStartDateDay, gridBagConstraints);

        jcmbSecondQuarterStartDateMonth.setMaximumRowCount(12);
        jcmbSecondQuarterStartDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSecondQuarterStartDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSecondQuarterStartDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterStartDateMonthItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterStartDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterStartDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterStartDateMonth, gridBagConstraints);

        jcmbSecondQuarterStartDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterStartDateYearItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterStartDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterStartDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterStartDateYear, gridBagConstraints);

        jlblStartDateDay3.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblStartDateDay3, gridBagConstraints);

        jlblStartDateMonth3.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblStartDateMonth3, gridBagConstraints);

        jlblStartDateYear3.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblStartDateYear3, gridBagConstraints);

        jcmbSecondQuarterEndDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSecondQuarterEndDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterEndDateDayItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterEndDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterEndDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterEndDateDay, gridBagConstraints);

        jcmbSecondQuarterEndDateMonth.setMaximumRowCount(12);
        jcmbSecondQuarterEndDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSecondQuarterEndDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSecondQuarterEndDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterEndDateMonthItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterEndDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterEndDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterEndDateMonth, gridBagConstraints);

        jcmbSecondQuarterEndDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSecondQuarterEndDateYearItemStateChanged(evt);
            }
        });
        jcmbSecondQuarterEndDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSecondQuarterEndDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jcmbSecondQuarterEndDateYear, gridBagConstraints);

        jlblEndDateDay3.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblEndDateDay3, gridBagConstraints);

        jlblEndDateMonth3.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblEndDateMonth3, gridBagConstraints);

        jlblEndDateYear3.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblEndDateYear3, gridBagConstraints);

        jlblEndDate2.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSecondQuarterSchedule.add(jlblEndDate2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jpnlSecondQuarterSchedule, gridBagConstraints);

        jpnlThirdQuarterSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("3rd Quarter"));
        jpnlThirdQuarterSchedule.setPreferredSize(new java.awt.Dimension(300, 150));
        jpnlThirdQuarterSchedule.setLayout(new java.awt.GridBagLayout());

        jlblStartDate3.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblStartDate3, gridBagConstraints);

        jcmbThirdQuarterStartDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbThirdQuarterStartDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterStartDateDayItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterStartDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterStartDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterStartDateDay, gridBagConstraints);

        jcmbThirdQuarterStartDateMonth.setMaximumRowCount(12);
        jcmbThirdQuarterStartDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbThirdQuarterStartDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbThirdQuarterStartDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterStartDateMonthItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterStartDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterStartDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterStartDateMonth, gridBagConstraints);

        jcmbThirdQuarterStartDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterStartDateYearItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterStartDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterStartDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterStartDateYear, gridBagConstraints);

        jlblStartDateDay4.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblStartDateDay4, gridBagConstraints);

        jlblStartDateMonth4.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblStartDateMonth4, gridBagConstraints);

        jlblStartDateYear4.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblStartDateYear4, gridBagConstraints);

        jcmbThirdQuarterEndDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbThirdQuarterEndDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterEndDateDayItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterEndDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterEndDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterEndDateDay, gridBagConstraints);

        jcmbThirdQuarterEndDateMonth.setMaximumRowCount(12);
        jcmbThirdQuarterEndDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbThirdQuarterEndDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbThirdQuarterEndDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterEndDateMonthItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterEndDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterEndDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterEndDateMonth, gridBagConstraints);

        jcmbThirdQuarterEndDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbThirdQuarterEndDateYearItemStateChanged(evt);
            }
        });
        jcmbThirdQuarterEndDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbThirdQuarterEndDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jcmbThirdQuarterEndDateYear, gridBagConstraints);

        jlblEndDateDay4.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblEndDateDay4, gridBagConstraints);

        jlblEndDateMonth4.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblEndDateMonth4, gridBagConstraints);

        jlblEndDateYear4.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblEndDateYear4, gridBagConstraints);

        jlblEndDate3.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlThirdQuarterSchedule.add(jlblEndDate3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jpnlThirdQuarterSchedule, gridBagConstraints);

        jpnlFourthQuarterSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("4th Quarter"));
        jpnlFourthQuarterSchedule.setPreferredSize(new java.awt.Dimension(300, 150));
        jpnlFourthQuarterSchedule.setLayout(new java.awt.GridBagLayout());

        jlblStartDate4.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblStartDate4, gridBagConstraints);

        jcmbFourthQuarterStartDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFourthQuarterStartDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterStartDateDayItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterStartDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterStartDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterStartDateDay, gridBagConstraints);

        jcmbFourthQuarterStartDateMonth.setMaximumRowCount(12);
        jcmbFourthQuarterStartDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFourthQuarterStartDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbFourthQuarterStartDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterStartDateMonthItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterStartDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterStartDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterStartDateMonth, gridBagConstraints);

        jcmbFourthQuarterStartDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterStartDateYearItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterStartDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterStartDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterStartDateYear, gridBagConstraints);

        jlblStartDateDay5.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblStartDateDay5, gridBagConstraints);

        jlblStartDateMonth5.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblStartDateMonth5, gridBagConstraints);

        jlblStartDateYear5.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblStartDateYear5, gridBagConstraints);

        jcmbFourthQuarterEndDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFourthQuarterEndDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterEndDateDayItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterEndDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterEndDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterEndDateDay, gridBagConstraints);

        jcmbFourthQuarterEndDateMonth.setMaximumRowCount(12);
        jcmbFourthQuarterEndDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbFourthQuarterEndDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbFourthQuarterEndDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterEndDateMonthItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterEndDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterEndDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterEndDateMonth, gridBagConstraints);

        jcmbFourthQuarterEndDateYear.setEnabled(false);
        jcmbFourthQuarterEndDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbFourthQuarterEndDateYearItemStateChanged(evt);
            }
        });
        jcmbFourthQuarterEndDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbFourthQuarterEndDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jcmbFourthQuarterEndDateYear, gridBagConstraints);

        jlblEndDateDay5.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblEndDateDay5, gridBagConstraints);

        jlblEndDateMonth5.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblEndDateMonth5, gridBagConstraints);

        jlblEndDateYear5.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblEndDateYear5, gridBagConstraints);

        jlblEndDate4.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFourthQuarterSchedule.add(jlblEndDate4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jpnlFourthQuarterSchedule, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jPanel9, gridBagConstraints);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("School Year"));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("School Year");
        jPanel10.add(jLabel3, new java.awt.GridBagConstraints());

        jsprSchoolYearFrom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsprSchoolYearFromStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel10.add(jsprSchoolYearFrom, gridBagConstraints);

        jlblSchoolYearTo.setText("to");
        jPanel10.add(jlblSchoolYearTo, new java.awt.GridBagConstraints());

        jsprSchoolYearTo.setEnabled(false);
        jsprSchoolYearTo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsprSchoolYearToStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel10.add(jsprSchoolYearTo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel10, gridBagConstraints);

        jpnlSchoolYearSchedule.setPreferredSize(new java.awt.Dimension(300, 150));
        jpnlSchoolYearSchedule.setLayout(new java.awt.GridBagLayout());

        jlblStartDate.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblStartDate, gridBagConstraints);

        jlblEndDate.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblEndDate, gridBagConstraints);

        jcmbSchoolYearStartDateYear.setEnabled(false);
        jcmbSchoolYearStartDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearStartDateYearItemStateChanged(evt);
            }
        });
        jcmbSchoolYearStartDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearStartDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearStartDateYear, gridBagConstraints);

        jlblStartDateYear.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblStartDateYear, gridBagConstraints);

        jcmbSchoolYearStartDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSchoolYearStartDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSchoolYearStartDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearStartDateMonthItemStateChanged(evt);
            }
        });
        jcmbSchoolYearStartDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearStartDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearStartDateMonth, gridBagConstraints);

        jlblStartDateMonth.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblStartDateMonth, gridBagConstraints);

        jcmbSchoolYearStartDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSchoolYearStartDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearStartDateDayItemStateChanged(evt);
            }
        });
        jcmbSchoolYearStartDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearStartDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearStartDateDay, gridBagConstraints);

        jlblStartDateDay.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblStartDateDay, gridBagConstraints);

        jcmbSchoolYearClosingDateYear.setEnabled(false);
        jcmbSchoolYearClosingDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearClosingDateYearItemStateChanged(evt);
            }
        });
        jcmbSchoolYearClosingDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearClosingDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearClosingDateYear, gridBagConstraints);

        jcmbSchoolYearEndDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSchoolYearEndDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSchoolYearEndDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearEndDateMonthItemStateChanged(evt);
            }
        });
        jcmbSchoolYearEndDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearEndDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearEndDateMonth, gridBagConstraints);

        jcmbSchoolYearEndDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSchoolYearEndDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearEndDateDayItemStateChanged(evt);
            }
        });
        jcmbSchoolYearEndDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSchoolYearEndDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jcmbSchoolYearEndDateDay, gridBagConstraints);

        jlblEndDateYear.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblEndDateYear, gridBagConstraints);

        jlblEndDateMonth.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblEndDateMonth, gridBagConstraints);

        jlblEndDateDay.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYearSchedule.add(jlblEndDateDay, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jpnlSchoolYearSchedule, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel3, gridBagConstraints);

        jpnlEnrollmentSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("Enrollment Schedule"));
        jpnlEnrollmentSchedule.setPreferredSize(new java.awt.Dimension(270, 150));
        jpnlEnrollmentSchedule.setLayout(new java.awt.GridBagLayout());

        jlblEnrollmentOpeningDate.setText("Opening Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblEnrollmentOpeningDate, gridBagConstraints);

        jcmbEnrollmentOpeningDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbEnrollmentOpeningDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentOpeningDateDayItemStateChanged(evt);
            }
        });
        jcmbEnrollmentOpeningDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentOpeningDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentOpeningDateDay, gridBagConstraints);

        jcmbEnrollmentOpeningDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbEnrollmentOpeningDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbEnrollmentOpeningDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentOpeningDateMonthItemStateChanged(evt);
            }
        });
        jcmbEnrollmentOpeningDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentOpeningDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentOpeningDateMonth, gridBagConstraints);

        jcmbEnrollmentOpeningDateYear.setEnabled(false);
        jcmbEnrollmentOpeningDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentOpeningDateYearItemStateChanged(evt);
            }
        });
        jcmbEnrollmentOpeningDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentOpeningDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentOpeningDateYear, gridBagConstraints);

        jlblStartDateDay1.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblStartDateDay1, gridBagConstraints);

        jlblStartDateMonth1.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblStartDateMonth1, gridBagConstraints);

        jlblStartDateYear1.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblStartDateYear1, gridBagConstraints);

        jlblEnrollmentClosingDate.setText("Closing Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblEnrollmentClosingDate, gridBagConstraints);

        jcmbEnrollmentClosingDateDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbEnrollmentClosingDateDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentClosingDateDayItemStateChanged(evt);
            }
        });
        jcmbEnrollmentClosingDateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentClosingDateDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentClosingDateDay, gridBagConstraints);

        jcmbEnrollmentClosingDateMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbEnrollmentClosingDateMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbEnrollmentClosingDateMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentClosingDateMonthItemStateChanged(evt);
            }
        });
        jcmbEnrollmentClosingDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentClosingDateMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentClosingDateMonth, gridBagConstraints);

        jcmbEnrollmentClosingDateYear.setEnabled(false);
        jcmbEnrollmentClosingDateYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEnrollmentClosingDateYearItemStateChanged(evt);
            }
        });
        jcmbEnrollmentClosingDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEnrollmentClosingDateYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jcmbEnrollmentClosingDateYear, gridBagConstraints);

        jlblEndDateDay1.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblEndDateDay1, gridBagConstraints);

        jlblEndDateMonth1.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblEndDateMonth1, gridBagConstraints);

        jlblEndDateYear1.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlEnrollmentSchedule.add(jlblEndDateYear1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jpnlEnrollmentSchedule, gridBagConstraints);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Summer Class Schedule"));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jlblSummerStartDate.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblSummerStartDate, gridBagConstraints);

        jcmbSummerStartDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSummerStartDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerStartDayItemStateChanged(evt);
            }
        });
        jcmbSummerStartDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerStartDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerStartDay, gridBagConstraints);

        jcmbSummerStartMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSummerStartMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSummerStartMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerStartMonthItemStateChanged(evt);
            }
        });
        jcmbSummerStartMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerStartMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerStartMonth, gridBagConstraints);

        jcmbSummerStartYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerStartYearItemStateChanged(evt);
            }
        });
        jcmbSummerStartYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerStartYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerStartYear, gridBagConstraints);

        jlblStartDateDay7.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblStartDateDay7, gridBagConstraints);

        jlblStartDateMonth7.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblStartDateMonth7, gridBagConstraints);

        jlblStartDateYear7.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblStartDateYear7, gridBagConstraints);

        jlblSummerEndDate.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblSummerEndDate, gridBagConstraints);

        jcmbSummerEndDay.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSummerEndDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerEndDayItemStateChanged(evt);
            }
        });
        jcmbSummerEndDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerEndDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerEndDay, gridBagConstraints);

        jcmbSummerEndMonth.setPreferredSize(new java.awt.Dimension(43, 26));
        jcmbSummerEndMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbSummerEndMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerEndMonthItemStateChanged(evt);
            }
        });
        jcmbSummerEndMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerEndMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerEndMonth, gridBagConstraints);

        jcmbSummerEndYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSummerEndYearItemStateChanged(evt);
            }
        });
        jcmbSummerEndYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSummerEndYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jcmbSummerEndYear, gridBagConstraints);

        jlblEndDateYear7.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblEndDateYear7, gridBagConstraints);

        jlblEndDateMonth7.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblEndDateMonth7, gridBagConstraints);

        jlblEndDateDay7.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel8.add(jlblEndDateDay7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jPanel11, gridBagConstraints);

        jspCreateSchoolYear.setViewportView(jPanel4);

        jTabbedPane2.addTab("Creation", jspCreateSchoolYear);

        jpnlHolidaySets.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jlblHolidayName.setText("Holiday Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblHolidayName, gridBagConstraints);

        jtfHolidayName.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jtfHolidayName, gridBagConstraints);

        jtaHolidayDescription.setColumns(20);
        jtaHolidayDescription.setRows(5);
        jScrollPane4.setViewportView(jtaHolidayDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jScrollPane4, gridBagConstraints);

        jbtnSaveHoliday.setText("Save");
        jbtnSaveHoliday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveHolidayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jbtnSaveHoliday, gridBagConstraints);

        jlblHolidayDescription.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblHolidayDescription, gridBagConstraints);

        jpnlHolidayDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jpnlHolidayDate.setLayout(new java.awt.GridBagLayout());

        jlblHolidayStartDate.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblHolidayStartDate, gridBagConstraints);

        jlblHolidayEndDate.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblHolidayEndDate, gridBagConstraints);

        jcmbStartHolidayYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayYearItemStateChanged(evt);
            }
        });
        jcmbStartHolidayYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jcmbStartHolidayYear, gridBagConstraints);

        jlblStartDateYear6.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblStartDateYear6, gridBagConstraints);

        jcmbStartHolidayMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbStartHolidayMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayMonthItemStateChanged(evt);
            }
        });
        jcmbStartHolidayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jcmbStartHolidayMonth, gridBagConstraints);

        jlblStartDateMonth6.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblStartDateMonth6, gridBagConstraints);

        jcmbStartHolidayDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayDayItemStateChanged(evt);
            }
        });
        jcmbStartHolidayDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlHolidayDate.add(jcmbStartHolidayDay, gridBagConstraints);

        jlblStartDateDay6.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblStartDateDay6, gridBagConstraints);

        jcmbEndHolidayYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayYearItemStateChanged(evt);
            }
        });
        jcmbEndHolidayYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jcmbEndHolidayYear, gridBagConstraints);

        jcmbEndHolidayMonth.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbEndHolidayMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayMonthItemStateChanged(evt);
            }
        });
        jcmbEndHolidayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jcmbEndHolidayMonth, gridBagConstraints);

        jcmbEndHolidayDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayDayItemStateChanged(evt);
            }
        });
        jcmbEndHolidayDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jcmbEndHolidayDay, gridBagConstraints);

        jlblEndDateYear6.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblEndDateYear6, gridBagConstraints);

        jlblEndDateMonth6.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblEndDateMonth6, gridBagConstraints);

        jlblEndDateDay6.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate.add(jlblEndDateDay6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jpnlHolidayDate, gridBagConstraints);

        jTabbedPane3.addTab("Creation", jPanel2);

        jPanel7.setPreferredSize(new java.awt.Dimension(480, 171));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jScrollPane5.setPreferredSize(new java.awt.Dimension(100, 147));

        jlstHolidayRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlstHolidayRecordMouseClicked(evt);
            }
        });
        jlstHolidayRecord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlstHolidayRecordValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jlstHolidayRecord);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jScrollPane5, gridBagConstraints);

        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Action");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jLabel2, gridBagConstraints);

        jcmbHolidayRecordAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edit" }));
        jcmbHolidayRecordAction.setSelectedIndex(-1);
        jcmbHolidayRecordAction.setEnabled(false);
        jcmbHolidayRecordAction.setPreferredSize(new java.awt.Dimension(70, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jcmbHolidayRecordAction, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jPanel12, gridBagConstraints);

        jPanel13.setLayout(new java.awt.GridBagLayout());

        jCheckBox1.setText("Active");
        jCheckBox1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel13.add(jCheckBox1, gridBagConstraints);

        jpnlHolidayDate1.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jpnlHolidayDate1.setLayout(new java.awt.GridBagLayout());

        jlblHolidayStartDate1.setText("Start Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblHolidayStartDate1, gridBagConstraints);

        jlblHolidayEndDate1.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblHolidayEndDate1, gridBagConstraints);

        jcmbStartHolidayYear1.setEnabled(false);
        jcmbStartHolidayYear1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayYear1ItemStateChanged(evt);
            }
        });
        jcmbStartHolidayYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayYear1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jcmbStartHolidayYear1, gridBagConstraints);

        jlblStartDateYear8.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblStartDateYear8, gridBagConstraints);

        jcmbStartHolidayMonth1.setEnabled(false);
        jcmbStartHolidayMonth1.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbStartHolidayMonth1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayMonth1ItemStateChanged(evt);
            }
        });
        jcmbStartHolidayMonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayMonth1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jcmbStartHolidayMonth1, gridBagConstraints);

        jlblStartDateMonth8.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblStartDateMonth8, gridBagConstraints);

        jcmbStartHolidayDay1.setEnabled(false);
        jcmbStartHolidayDay1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStartHolidayDay1ItemStateChanged(evt);
            }
        });
        jcmbStartHolidayDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStartHolidayDay1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jpnlHolidayDate1.add(jcmbStartHolidayDay1, gridBagConstraints);

        jlblStartDateDay8.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblStartDateDay8, gridBagConstraints);

        jcmbEndHolidayYear1.setEnabled(false);
        jcmbEndHolidayYear1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayYear1ItemStateChanged(evt);
            }
        });
        jcmbEndHolidayYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayYear1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jcmbEndHolidayYear1, gridBagConstraints);

        jcmbEndHolidayMonth1.setEnabled(false);
        jcmbEndHolidayMonth1.setRenderer(new component_renderers.JComboBoxRenderer_Month("--"));
        jcmbEndHolidayMonth1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayMonth1ItemStateChanged(evt);
            }
        });
        jcmbEndHolidayMonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayMonth1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jcmbEndHolidayMonth1, gridBagConstraints);

        jcmbEndHolidayDay1.setEnabled(false);
        jcmbEndHolidayDay1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbEndHolidayDay1ItemStateChanged(evt);
            }
        });
        jcmbEndHolidayDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEndHolidayDay1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jcmbEndHolidayDay1, gridBagConstraints);

        jlblEndDateYear8.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblEndDateYear8, gridBagConstraints);

        jlblEndDateMonth8.setText("Month");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblEndDateMonth8, gridBagConstraints);

        jlblEndDateDay8.setText("Day");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidayDate1.add(jlblEndDateDay8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel13.add(jpnlHolidayDate1, gridBagConstraints);

        jPanel14.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Save");
        jButton1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel14.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel13.add(jPanel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jPanel13, gridBagConstraints);

        jTabbedPane3.addTab("Record", jPanel7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlHolidaySets.add(jTabbedPane3, gridBagConstraints);

        jTabbedPane2.addTab("Holiday", jpnlHolidaySets);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jTabbedPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void setjtblEnrollmentScheduleList() {
        EnrollmentDaoImpl edi = new EnrollmentDaoImpl();
        Object[] enrollmentScheduleRowData = edi.getAllEnrollmentSchedulesOfAllSchoolYears().toArray();
        DefaultTableModel tModel = (DefaultTableModel) jtblEnrollmentSchedule.getModel();
        tModel.setRowCount(0);
        for (Object esrd : enrollmentScheduleRowData) {
            Enrollment e = (Enrollment) esrd;
            Object[] o = {
                e.getSchoolYear().getSchoolYearId(),
                e.getSchoolYear().getYearFrom() + "-" + e.getSchoolYear().getYearTo(),
                e.getOpeningDate(),
                e.getClosingDate(),
                e.getIsClosed() == true ? "Yes" : "No"
            };
            tModel.addRow(o);
        }
    }

    private void setjtblSchoolYearList() {
        SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
        Object[] schoolYearRowData = sydi.get().toArray();
        DefaultTableModel tModel = (DefaultTableModel) jtblSchoolYearList.getModel();
        tModel.setRowCount(0);
        for (Object syrd : schoolYearRowData) {
            SchoolYear s = (SchoolYear) syrd;
            Object[] o = {s.getSchoolYearId(), s.getYearFrom(), s.getYearTo(), s.getStart_date(), s.getEnd_date(),
                s.getIsActive() == true ? "Active" : "Not Active"};
            tModel.addRow(o);
        }
        jtblSchoolYearList.setModel(tModel);
        int tColCount = jtblSchoolYearList.getColumnCount();
        for (int i = 0; i < tColCount; i++) {
            TableCellRenderer myJTableRenderer = new JTableRenderer_SchoolYear();
            jtblSchoolYearList.getColumnModel().getColumn(i).setCellRenderer(myJTableRenderer);
        }
    }

    private Quarter getFirstQuarterSchedule() {
        int sMonth, sDay, sYear, eMonth, eDay, eYear;
        String strSdate, strEdate;
        Date startDate;
        Date endDate;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        sMonth = Integer.parseInt(jcmbFirstQuarterStartDateMonth.getSelectedItem().toString());
        sDay = Integer.parseInt(jcmbFirstQuarterStartDateDay.getSelectedItem().toString());
        sYear = Integer.parseInt(jcmbFirstQuarterStartDateYear.getSelectedItem().toString());
        strSdate = sYear + "-" + (sMonth+1) + "-" + sDay;
        startDate = java.sql.Date.valueOf(strSdate);

        eMonth = Integer.parseInt(jcmbFirstQuarterEndDateMonth.getSelectedItem().toString());
        eDay = Integer.parseInt(jcmbFirstQuarterEndDateDay.getSelectedItem().toString());
        eYear = Integer.parseInt(jcmbFirstQuarterEndDateYear.getSelectedItem().toString());
        strEdate = eYear + "-" + (eMonth+1) + "-" + eDay;
        endDate = java.sql.Date.valueOf(strEdate);

        Quarter firstQuarter = new Quarter();
        firstQuarter.setQuarterNo(1);
        firstQuarter.setStartDate(startDate);
        firstQuarter.setEndDate(endDate);

        return firstQuarter;
    }

    private Quarter getSecondQuarterSchedule() {
        int sMonth, sDay, sYear, eMonth, eDay, eYear;
        String strSdate, strEdate;
        Date startDate;
        Date endDate;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        sMonth = Integer.parseInt(jcmbSecondQuarterStartDateMonth.getSelectedItem().toString());
        sDay = Integer.parseInt(jcmbSecondQuarterStartDateDay.getSelectedItem().toString());
        sYear = Integer.parseInt(jcmbSecondQuarterStartDateYear.getSelectedItem().toString());
        strSdate = sYear + "-" + (sMonth+1) + "-" + sDay;
        startDate = java.sql.Date.valueOf(strSdate);

        eMonth = Integer.parseInt(jcmbSecondQuarterEndDateMonth.getSelectedItem().toString());
        eDay = Integer.parseInt(jcmbSecondQuarterEndDateDay.getSelectedItem().toString());
        eYear = Integer.parseInt(jcmbSecondQuarterEndDateYear.getSelectedItem().toString());
        strEdate = eYear + "-" + (eMonth+1) + "-" + eDay;
        endDate = java.sql.Date.valueOf(strEdate);

        Quarter secondQuarter = new Quarter();
        secondQuarter.setQuarterNo(2);
        secondQuarter.setStartDate(startDate);
        secondQuarter.setEndDate(endDate);

        return secondQuarter;
    }

    private Quarter getThirdQuarterSchedule() {
        int sMonth, sDay, sYear, eMonth, eDay, eYear;
        String strSdate, strEdate;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;

        sMonth = Integer.parseInt(jcmbThirdQuarterStartDateMonth.getSelectedItem().toString());
        sDay = Integer.parseInt(jcmbThirdQuarterStartDateDay.getSelectedItem().toString());
        sYear = Integer.parseInt(jcmbThirdQuarterStartDateYear.getSelectedItem().toString());
        strSdate = sYear + "-" + (sMonth+1) + "-" + sDay;
        startDate = java.sql.Date.valueOf(strSdate);

        eMonth = Integer.parseInt(jcmbThirdQuarterEndDateMonth.getSelectedItem().toString());
        eDay = Integer.parseInt(jcmbThirdQuarterEndDateDay.getSelectedItem().toString());
        eYear = Integer.parseInt(jcmbThirdQuarterEndDateYear.getSelectedItem().toString());
        strEdate = eYear + "-" + (eMonth+1) + "-" + eDay;
        endDate = java.sql.Date.valueOf(strEdate);

        Quarter thirdQuarter = new Quarter();
        thirdQuarter.setQuarterNo(3);
        thirdQuarter.setStartDate(startDate);
        thirdQuarter.setEndDate(endDate);

        return thirdQuarter;
    }

    private Quarter getFourthQuarterSchedule() {
        int sMonth, sDay, sYear, eMonth, eDay, eYear;
        String strSdate, strEdate;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;

        sMonth = Integer.parseInt(jcmbFourthQuarterStartDateMonth.getSelectedItem().toString());
        sDay = Integer.parseInt(jcmbFourthQuarterStartDateDay.getSelectedItem().toString());
        sYear = Integer.parseInt(jcmbFourthQuarterStartDateYear.getSelectedItem().toString());
        strSdate = sYear + "-" + (sMonth+1) + "-" + sDay;
        startDate = java.sql.Date.valueOf(strSdate);

        eMonth = Integer.parseInt(jcmbFourthQuarterEndDateMonth.getSelectedItem().toString());
        eDay = Integer.parseInt(jcmbFourthQuarterEndDateDay.getSelectedItem().toString());
        eYear = Integer.parseInt(jcmbFourthQuarterEndDateYear.getSelectedItem().toString());
        strEdate = eYear + "-" + (eMonth+1) + "-" + eDay;
        endDate = java.sql.Date.valueOf(strEdate);

        Quarter fourthQuarter = new Quarter();
        fourthQuarter.setQuarterNo(4);
        fourthQuarter.setStartDate(startDate);
        fourthQuarter.setEndDate(endDate);

        return fourthQuarter;
    }

    private void jbtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateActionPerformed
        SchoolYear schoolYear = new SchoolYear();
        schoolYear.setYearFrom(Integer.parseInt(jsprSchoolYearFrom.getValue().toString()));
        schoolYear.setYearTo(Integer.parseInt(jsprSchoolYearTo.getValue().toString()));

        if (JPanelGUIUtil.hasNullComboBox(jpnlSchoolYearSchedule)) {
            JOptionPane.showMessageDialog(null, "Please fill out all drop down.");
        } else {
            // SCHOOL YEAR START DATE
            String syDate;
            int syStartYear = Integer.parseInt(jcmbSchoolYearStartDateYear.getSelectedItem().toString());
            int syStartMonth = Integer.parseInt(jcmbSchoolYearStartDateMonth.getSelectedItem().toString());
            int syStartDay = Integer.parseInt(jcmbSchoolYearStartDateDay.getSelectedItem().toString());
            syDate = syStartYear + "-" + (syStartMonth+1) + "-" + syStartDay;

            System.out.println("@jbtnCreate: SyStartDate: " + syDate);
            schoolYear.setStart_date(java.sql.Date.valueOf(syDate));

            // SCHOOL YEAR END DATE
            int syEndYear, syEndMonth, syEndDay;
            String strEndDate;
            Date endDate;

            syEndYear = Integer.parseInt(jcmbSchoolYearClosingDateYear.getSelectedItem().toString());
            syEndMonth = Integer.parseInt(jcmbSchoolYearEndDateMonth.getSelectedItem().toString());
            syEndDay = Integer.parseInt(jcmbSchoolYearEndDateDay.getSelectedItem().toString());
            strEndDate = syEndYear + "-" + (syEndMonth+1) + "-" + syEndDay;
            endDate = java.sql.Date.valueOf(strEndDate);
            schoolYear.setEnd_date(endDate);
        }

        if (JPanelGUIUtil.hasNullComboBox(jpnlEnrollmentSchedule)) {
            JOptionPane.showMessageDialog(null, "Please fill out all drop down.");
        } else {
            // SCHOOL YEAR ENROLLMENT OPENING DATE
            DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Enrollment enrollment = new Enrollment();
            int openingYear, openingMonth, openingDay;
            String strOpenDate;
            Date openDate;

            openingYear = Integer.parseInt(jcmbEnrollmentOpeningDateYear.getSelectedItem().toString());
            openingMonth = Integer.parseInt(jcmbEnrollmentOpeningDateMonth.getSelectedItem().toString());
            openingDay = Integer.parseInt(jcmbEnrollmentOpeningDateDay.getSelectedItem().toString());
            strOpenDate = openingYear + "-" + (openingMonth+1) + "-" + openingDay;
            openDate = java.sql.Date.valueOf(strOpenDate);
            enrollment.setOpeningDate(openDate);

            // SCHOOL YEAR ENROLLMENT CLOSING DATE 
            int closingYear, closingMonth, closingDay;
            String strCloseDate;
            Date closeDate;

            closingYear = Integer.parseInt(jcmbEnrollmentClosingDateYear.getSelectedItem().toString());
            closingMonth = Integer.parseInt(jcmbEnrollmentClosingDateMonth.getSelectedItem().toString());
            closingDay = Integer.parseInt(jcmbEnrollmentClosingDateDay.getSelectedItem().toString());
            strCloseDate = closingYear + "-" + (closingMonth+1) + "-" + closingDay;
            closeDate = java.sql.Date.valueOf(strCloseDate);
            enrollment.setClosingDate(closeDate);

            schoolYear.setEnrollment(enrollment);
        }
        // SEMESTERS    
        List<Quarter> quarterList = new ArrayList<>();
        if (JPanelGUIUtil.hasNullComboBox(jpnlFirstQuarterSchedule)
                || (JPanelGUIUtil.hasNullComboBox(jpnlSecondQuarterSchedule))
                || (JPanelGUIUtil.hasNullComboBox(jpnlThirdQuarterSchedule))
                || (JPanelGUIUtil.hasNullComboBox(jpnlFourthQuarterSchedule))) {
            JOptionPane.showMessageDialog(null, "Fill out all drop down.");
        } else {
            quarterList.add(getFirstQuarterSchedule());
            quarterList.add(getSecondQuarterSchedule());
            quarterList.add(getThirdQuarterSchedule());
            quarterList.add(getFourthQuarterSchedule());
        }
        schoolYear.setQuarters(quarterList);
        
        List<Holiday> holidays = new ArrayList<>();
        for(int i = 0; i < jlstHolidays.getModel().getSize(); i++){
            String holidayName = jlstHolidays.getModel().getElementAt(i);
            Integer holidayId = HOLIDAYDAOIMPL.getId(holidayName);
            Holiday h = new Holiday();
            h.setId(holidayId);
            holidays.add(h);
        }
        schoolYear.setHolidays(holidays);
        
        Integer classHours = Integer.parseInt(jsprClassHours.getValue().toString());
        schoolYear.setClassHours(classHours);

        int summerStartYear = Integer.parseInt(jcmbSummerStartYear.getSelectedItem().toString());
        int summerStartMonth = Integer.parseInt(jcmbSummerStartMonth.getSelectedItem().toString());
        int summerStartDay = Integer.parseInt(jcmbSummerStartDay.getSelectedItem().toString());
        String summerStartDate = summerStartYear + "-" + (summerStartMonth+1) + "-" + summerStartDay;
        int summerEndYear = Integer.parseInt(jcmbSummerEndYear.getSelectedItem().toString().trim());
        int summerEndMonth = Integer.parseInt(jcmbSummerEndMonth.getSelectedItem().toString().trim());
        int summerEndDay = Integer.parseInt(jcmbSummerEndDay.getSelectedItem().toString().trim());
        String summerEndDate = summerEndYear + "-" + (summerEndMonth+1) + "-" + summerEndDay;

        SummerClassSchedule sc = new SummerClassSchedule();
        sc.setStartDate(java.sql.Date.valueOf(summerStartDate.trim()));
        sc.setEndDate(java.sql.Date.valueOf(summerEndDate.trim()));
        schoolYear.setSummerClassSchedule(sc);
        
        int choice = JOptionPane.showConfirmDialog(null, "Add School Year? ", "Add School Year ", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            boolean isAdded = SYDAOIMPL.add(schoolYear);
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Successfully added schoolyear.");
            } else {
                JOptionPane.showMessageDialog(null, "Error encountered while adding schoolyear");
            }
        }
    }//GEN-LAST:event_jbtnCreateActionPerformed

    private void setEnrollmentOpeningDateDayJComboBoxModel() {
        if (jcmbEnrollmentOpeningDateMonth.getSelectedIndex() > -1
                && jcmbEnrollmentOpeningDateYear.getSelectedIndex() > -1) {

            int selectedEnrollmentOpeningDateMonth = Integer.parseInt(jcmbEnrollmentOpeningDateMonth.getSelectedItem().toString());
            int selectedEnrollmentOpeningDateYear = Integer.parseInt(jcmbEnrollmentOpeningDateYear.getSelectedItem().toString());
            jcmbEnrollmentOpeningDateDay.setModel(CalendarML.getDaysOfMonth(selectedEnrollmentOpeningDateMonth, selectedEnrollmentOpeningDateYear));
            jcmbEnrollmentOpeningDateDay.setSelectedIndex(-1);
        }
    }

    private void setEnrollmentClosingDateDayJComboBoxModel() {
        if (jcmbEnrollmentClosingDateMonth.getSelectedIndex() > -1
                && jcmbEnrollmentClosingDateYear.getSelectedIndex() > -1) {

            int selectedEnrollmentClosingDateMonth = Integer.parseInt(jcmbEnrollmentClosingDateMonth.getSelectedItem().toString());
            int selectedEnrollmentClosingDateYear = Integer.parseInt(jcmbEnrollmentClosingDateYear.getSelectedItem().toString());
            jcmbEnrollmentOpeningDateDay.setModel(CalendarML.getDaysOfMonth(selectedEnrollmentClosingDateMonth, selectedEnrollmentClosingDateYear));
            jcmbEnrollmentOpeningDateDay.setSelectedIndex(-1);
        }
    }

    private void setSchoolYearStartDateDayJComboBoxModel() {

        if ((jcmbSchoolYearStartDateMonth.getSelectedIndex() > -1)
                && (jcmbSchoolYearStartDateYear.getSelectedIndex() > -1)) {

            int selectedSyStartDateMonth = Integer.parseInt(jcmbSchoolYearStartDateMonth.getSelectedItem().toString());
            int selectedSyStartDateYear = Integer.parseInt(jcmbSchoolYearStartDateYear.getSelectedItem().toString());
            jcmbSchoolYearStartDateDay.setModel(CalendarML.getDaysOfMonth(selectedSyStartDateMonth, selectedSyStartDateYear));
            jcmbSchoolYearStartDateDay.setSelectedIndex(-1);
        }
    }

    private void setSchoolYearEndDateDayJComboBoxModel() {
        if ((jcmbSchoolYearEndDateMonth.getSelectedIndex() > -1)
                && (jcmbSchoolYearClosingDateYear.getSelectedIndex() > -1)) {

            int selectedSyEndDateMonth = Integer.parseInt(jcmbSchoolYearEndDateMonth.getSelectedItem().toString());
            int selectedSyEndDateYear = Integer.parseInt(jcmbSchoolYearClosingDateYear.getSelectedItem().toString());
            jcmbSchoolYearEndDateDay.setModel(CalendarML.getDaysOfMonth(selectedSyEndDateMonth, selectedSyEndDateYear));
            jcmbSchoolYearEndDateDay.setSelectedIndex(-1);
        }
    }

    private void setSemestersYearJComboBoxModels() {
        jcmbFirstQuarterStartDateYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbFirstQuarterEndDateYear.setModel(CalendarML.getCurrentYearToNYears(10));

        jcmbSecondQuarterStartDateYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbSecondQuarterEndDateYear.setModel(CalendarML.getCurrentYearToNYears(10));

        jcmbThirdQuarterStartDateYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbThirdQuarterEndDateYear.setModel(CalendarML.getCurrentYearToNYears(10));

        jcmbFourthQuarterStartDateYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbFourthQuarterEndDateYear.setModel(CalendarML.getCurrentYearToNYears(10));
    }
    
    private void setSummerScheduleJComboBoxModel(){
        jcmbSummerStartYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbSummerEndYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbSummerStartMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbSummerEndMonth.setModel(CalendarML.getMonthsOfYear());
    }
    
    private void setSummerScheduleStartDayJComboBoxModels(){
        int summerStartMonth = Integer.parseInt(jcmbSummerStartMonth.getSelectedItem().toString());
        int summerStartYear = Integer.parseInt(jcmbSummerStartYear.getSelectedItem().toString());
        jcmbSummerStartDay.setModel(CalendarML.getDaysOfMonth(summerStartMonth, summerStartYear));
//        jcmbSummerStartDay.setSelectedIndex(-1);
    }
    
    private void setSummerScheduleEndDayJComboBoxModels(){
        int summerEndMonth = Integer.parseInt(jcmbSummerEndMonth.getSelectedItem().toString());
        int summerEndYear = Integer.parseInt(jcmbSummerEndYear.getSelectedItem().toString());
        jcmbSummerEndDay.setModel(CalendarML.getDaysOfMonth(summerEndMonth, summerEndYear));
//        jcmbSummerEndDay.setSelectedIndex(-1);
    }
    
    private void setHolidayJComboBoxModels(){
        jcmbStartHolidayYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbEndHolidayYear.setModel(CalendarML.getCurrentYearToNYears(10));
        jcmbStartHolidayMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbEndHolidayMonth.setModel(CalendarML.getMonthsOfYear());
        
        int holidayStartMonth = Integer.parseInt(jcmbStartHolidayMonth.getSelectedItem().toString());
        int holidayStartYear = Integer.parseInt(jcmbStartHolidayYear.getSelectedItem().toString());
        jcmbStartHolidayDay.setModel(CalendarML.getDaysOfMonth(holidayStartMonth, holidayStartYear));
        jcmbStartHolidayDay.setSelectedIndex(-1);
        
        int holidayEndMonth = Integer.parseInt(jcmbEndHolidayMonth.getSelectedItem().toString());
        int holidayEndYear = Integer.parseInt(jcmbEndHolidayYear.getSelectedItem().toString());
        jcmbEndHolidayDay.setModel(CalendarML.getDaysOfMonth(holidayEndMonth, holidayEndYear));
        jcmbEndHolidayDay.setSelectedIndex(-1);
    }
    
    private void setHolidayStartDaysJComboBoxModel(){
        int holidayStartMonth = Integer.parseInt(jcmbStartHolidayMonth.getSelectedItem().toString());
        int holidayStartYear = Integer.parseInt(jcmbStartHolidayYear.getSelectedItem().toString());
        jcmbStartHolidayDay.setModel(CalendarML.getDaysOfMonth(holidayStartMonth, holidayStartYear));
        jcmbStartHolidayDay.setSelectedIndex(-1);
    }
    
    private void setHolidayEndDaysJComboBoxModel(){
        int holidayEndMonth = Integer.parseInt(jcmbEndHolidayMonth.getSelectedItem().toString());
        int holidayEndYear = Integer.parseInt(jcmbEndHolidayYear.getSelectedItem().toString());
        jcmbEndHolidayDay.setModel(CalendarML.getDaysOfMonth(holidayEndMonth, holidayEndYear));
        jcmbEndHolidayDay.setSelectedIndex(-1);
    }

    private void setFirstSemStartDateDaysJComboBoxModel() {
        if ((jcmbFirstQuarterStartDateMonth.getSelectedIndex() > -1)
                && (jcmbFirstQuarterStartDateYear.getSelectedIndex() > -1)) {

            int selectedFirstSemStartDateMonth = Integer.parseInt(jcmbFirstQuarterStartDateMonth.getSelectedItem().toString());
            int selectedFirstSemStartDateYear = Integer.parseInt(jcmbFirstQuarterStartDateYear.getSelectedItem().toString());
            jcmbFirstQuarterStartDateDay.setModel(CalendarML.getDaysOfMonth(selectedFirstSemStartDateMonth, selectedFirstSemStartDateYear));
        }
    }

    private void setFirstSemEndDateDaysJComboBoxModel() {
        if ((jcmbFirstQuarterEndDateMonth.getSelectedIndex() > -1)
                && (jcmbFirstQuarterEndDateYear.getSelectedIndex() > -1)) {

            int selectedFirstSemEndDateMonth = Integer.parseInt(jcmbFirstQuarterEndDateMonth.getSelectedItem().toString());
            int selectedFirstSemEndDateYear = Integer.parseInt(jcmbFirstQuarterEndDateYear.getSelectedItem().toString());
            jcmbFirstQuarterEndDateDay.setModel(CalendarML.getDaysOfMonth(selectedFirstSemEndDateMonth, selectedFirstSemEndDateYear));
        }
    }

    private void setSecondSemStartDateDaysJComboBoxModel() {
        if ((jcmbSecondQuarterStartDateMonth.getSelectedIndex() > -1)
                && (jcmbSecondQuarterStartDateYear.getSelectedIndex() > -1)) {

            int selectedSecondSemStartDateMonth = Integer.parseInt(jcmbSecondQuarterStartDateMonth.getSelectedItem().toString());
            int selectedSecondSemStartDateYear = Integer.parseInt(jcmbSecondQuarterStartDateYear.getSelectedItem().toString());
            jcmbSecondQuarterStartDateDay.setModel(CalendarML.getDaysOfMonth(selectedSecondSemStartDateMonth, selectedSecondSemStartDateYear));
        }
    }

    private void setSecondSemEndDateDaysJComboBoxModel() {
        if ((jcmbSecondQuarterEndDateMonth.getSelectedIndex() > -1)
                && (jcmbSecondQuarterEndDateYear.getSelectedIndex() > -1)) {

            int selectedSecondSemEndDateMonth = Integer.parseInt(jcmbSecondQuarterEndDateMonth.getSelectedItem().toString());
            int selectedSecondSemEndDateYear = Integer.parseInt(jcmbSecondQuarterEndDateYear.getSelectedItem().toString());
            jcmbSecondQuarterEndDateDay.setModel(CalendarML.getDaysOfMonth(selectedSecondSemEndDateMonth, selectedSecondSemEndDateYear));
        }
    }

    private void setThirdSemStartDateDaysJComboBoxModel() {
        if ((jcmbThirdQuarterStartDateMonth.getSelectedIndex() > -1)
                && (jcmbThirdQuarterStartDateYear.getSelectedIndex() > -1)) {

            int selectedThirdSemStartDateMonth = Integer.parseInt(jcmbThirdQuarterStartDateMonth.getSelectedItem().toString());
            int selectedThirdSemStartDateYear = Integer.parseInt(jcmbThirdQuarterStartDateYear.getSelectedItem().toString());
            jcmbThirdQuarterStartDateDay.setModel(CalendarML.getDaysOfMonth(selectedThirdSemStartDateMonth, selectedThirdSemStartDateYear));
        }
    }

    private void setThirdSemEndDateDaysJComboBoxModel() {
        if ((jcmbThirdQuarterEndDateMonth.getSelectedIndex() > -1)
                && (jcmbThirdQuarterEndDateYear.getSelectedIndex() > -1)) {

            int selectedThirdSemEndDateMonth = Integer.parseInt(jcmbThirdQuarterEndDateMonth.getSelectedItem().toString());
            int selectedThirdSemEndDateYear = Integer.parseInt(jcmbThirdQuarterEndDateYear.getSelectedItem().toString());
            jcmbThirdQuarterEndDateDay.setModel(CalendarML.getDaysOfMonth(selectedThirdSemEndDateMonth, selectedThirdSemEndDateYear));
        }
    }

    private void setFourthSemStartDateDaysJComboBoxModel() {
        if ((jcmbFourthQuarterStartDateMonth.getSelectedIndex() > -1)
                && (jcmbFourthQuarterStartDateYear.getSelectedIndex() > -1)) {

            int selectedFourthSemStartDateMonth = Integer.parseInt(jcmbFourthQuarterStartDateMonth.getSelectedItem().toString());
            int selectedFourthSemStartDateYear = Integer.parseInt(jcmbFourthQuarterStartDateYear.getSelectedItem().toString());
            jcmbFourthQuarterStartDateDay.setModel(CalendarML.getDaysOfMonth(selectedFourthSemStartDateMonth, selectedFourthSemStartDateYear));
        }
    }

    private void setFourthSemEndDateDaysJComboBoxModel() {
        if ((jcmbFourthQuarterEndDateMonth.getSelectedIndex() > -1)
                && (jcmbFourthQuarterEndDateYear.getSelectedIndex() > -1)) {

            int selectedFourthSemEndDateMonth = Integer.parseInt(jcmbFourthQuarterEndDateMonth.getSelectedItem().toString());
            int selectedFourthSemEndDateYear = Integer.parseInt(jcmbFourthQuarterEndDateYear.getSelectedItem().toString());
            jcmbFourthQuarterEndDateDay.setModel(CalendarML.getDaysOfMonth(selectedFourthSemEndDateMonth, selectedFourthSemEndDateYear));
        }
    }

    private void setFirstSemMonthJComboBoxModel() {
        jcmbFirstQuarterStartDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbFirstQuarterStartDateMonth.setSelectedIndex(-1);
        jcmbFirstQuarterEndDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbFirstQuarterEndDateMonth.setSelectedIndex(-1);
    }

    private void setSecondSemMonthJComboBoxModel() {
        jcmbSecondQuarterStartDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbSecondQuarterStartDateMonth.setSelectedIndex(-1);
        jcmbSecondQuarterEndDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbSecondQuarterEndDateMonth.setSelectedIndex(-1);
    }

    private void setThirdSemMonthJComboBoxModel() {
        jcmbThirdQuarterStartDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbThirdQuarterStartDateMonth.setSelectedIndex(-1);
        jcmbThirdQuarterEndDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbThirdQuarterEndDateMonth.setSelectedIndex(-1);
    }

    private void setFourthSemMonthJComboBoxModel() {
        jcmbFourthQuarterStartDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbFourthQuarterStartDateMonth.setSelectedIndex(-1);
        jcmbFourthQuarterEndDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbFourthQuarterEndDateMonth.setSelectedIndex(-1);
    }

    private void setSchoolYearMonthJComboBoxModel() {
        jcmbSchoolYearStartDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbSchoolYearStartDateMonth.setSelectedIndex(-1);
        jcmbEnrollmentOpeningDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbEnrollmentOpeningDateMonth.setSelectedIndex(-1);

        jcmbSchoolYearEndDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbSchoolYearEndDateMonth.setSelectedIndex(-1);
        jcmbEnrollmentClosingDateMonth.setModel(CalendarML.getMonthsOfYear());
        jcmbEnrollmentClosingDateMonth.setSelectedIndex(-1);
    }

    private void setYearJComboModel() {
        DefaultComboBoxModel schoolYearStartDateYearModel = new DefaultComboBoxModel();
        DefaultComboBoxModel enrollmentOpeningDateYearModel = new DefaultComboBoxModel();
        for (int i = SYSTART_MIN_YEAR; i <= SYSTART_MAX_YEAR; i++) {
            schoolYearStartDateYearModel.addElement(i);
            enrollmentOpeningDateYearModel.addElement(i);
        }
        jcmbSchoolYearStartDateYear.setModel(schoolYearStartDateYearModel);
        jcmbSchoolYearStartDateYear.setSelectedIndex(-1);
        jcmbEnrollmentOpeningDateYear.setModel(enrollmentOpeningDateYearModel);
        jcmbEnrollmentOpeningDateYear.setSelectedIndex(-1);
        jcmbSchoolYearClosingDateYear.setModel(CalendarML.getNYearToNYears(SYEND_MIN_YEAR, SYEND_MAX_YEAR + 1));
        jcmbSchoolYearClosingDateYear.setSelectedIndex(-1);
        jcmbEnrollmentClosingDateYear.setModel(CalendarML.getNYearToNYears(SYSTART_MIN_YEAR, SYSTART_MAX_YEAR));
        jcmbEnrollmentClosingDateYear.setSelectedIndex(-1);
    }

    private void jcmbSchoolYearStartDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateYearItemStateChanged

        setSchoolYearStartDateDayJComboBoxModel();
        jcmbEnrollmentOpeningDateYear.setSelectedIndex(jcmbSchoolYearStartDateYear.getSelectedIndex());
        jcmbEnrollmentClosingDateYear.setSelectedIndex(jcmbSchoolYearStartDateYear.getSelectedIndex());
        if (jcmbSchoolYearStartDateYear.getSelectedIndex() > -1) {
            jcmbSchoolYearClosingDateYear.setSelectedIndex(jcmbSchoolYearStartDateYear.getSelectedIndex());
            jcmbFourthQuarterEndDateYear.setSelectedItem(jcmbSchoolYearClosingDateYear.getSelectedItem());
        }
    }//GEN-LAST:event_jcmbSchoolYearStartDateYearItemStateChanged

    private void jcmbSchoolYearStartDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateYearActionPerformed

    }//GEN-LAST:event_jcmbSchoolYearStartDateYearActionPerformed

    private void jcmbSchoolYearStartDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateMonthItemStateChanged
        setSchoolYearStartDateDayJComboBoxModel();
    }//GEN-LAST:event_jcmbSchoolYearStartDateMonthItemStateChanged

    private void jcmbSchoolYearStartDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateMonthActionPerformed
    }//GEN-LAST:event_jcmbSchoolYearStartDateMonthActionPerformed

    private void jcmbSchoolYearStartDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateDayItemStateChanged

    }//GEN-LAST:event_jcmbSchoolYearStartDateDayItemStateChanged

    private void jcmbSchoolYearStartDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearStartDateDayActionPerformed
        int daySelectedIndex = jcmbSchoolYearStartDateDay.getSelectedIndex();
        if (daySelectedIndex > -1) {
            jcmbSchoolYearStartDateMonth.setEnabled(true);
        }
    }//GEN-LAST:event_jcmbSchoolYearStartDateDayActionPerformed

    private void jcmbSchoolYearClosingDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearClosingDateYearItemStateChanged
        setSchoolYearEndDateDayJComboBoxModel();
    }//GEN-LAST:event_jcmbSchoolYearClosingDateYearItemStateChanged

    private void jcmbSchoolYearClosingDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearClosingDateYearActionPerformed


    }//GEN-LAST:event_jcmbSchoolYearClosingDateYearActionPerformed

    private void jcmbSchoolYearEndDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearEndDateMonthItemStateChanged
        setSchoolYearEndDateDayJComboBoxModel();
    }//GEN-LAST:event_jcmbSchoolYearEndDateMonthItemStateChanged

    private void jcmbSchoolYearEndDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearEndDateMonthActionPerformed
    }//GEN-LAST:event_jcmbSchoolYearEndDateMonthActionPerformed

    private void jcmbSchoolYearEndDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearEndDateDayItemStateChanged

    }//GEN-LAST:event_jcmbSchoolYearEndDateDayItemStateChanged

    private void jcmbSchoolYearEndDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSchoolYearEndDateDayActionPerformed

    }//GEN-LAST:event_jcmbSchoolYearEndDateDayActionPerformed

    private void jsprSchoolYearFromStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsprSchoolYearFromStateChanged
        // TODO add your handling code here:
        int yearFrom = Integer.parseInt(jsprSchoolYearFrom.getValue().toString());
        jsprSchoolYearTo.setValue(yearFrom + 1);
        jcmbSchoolYearStartDateYear.setSelectedItem(yearFrom);
    }//GEN-LAST:event_jsprSchoolYearFromStateChanged

    private void jsprSchoolYearToStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsprSchoolYearToStateChanged
        int yearTo = Integer.parseInt(jsprSchoolYearTo.getValue().toString());
        jcmbSchoolYearClosingDateYear.setSelectedItem(yearTo);
    }//GEN-LAST:event_jsprSchoolYearToStateChanged

    private void jcmbEnrollmentOpeningDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateDayItemStateChanged

    private void jcmbEnrollmentOpeningDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateDayActionPerformed

    private void jcmbEnrollmentOpeningDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateMonthItemStateChanged
        if ((jcmbEnrollmentOpeningDateYear.getSelectedIndex() > -1)
                && (jcmbEnrollmentOpeningDateMonth.getSelectedIndex() > -1)) {
            int year;
            int month;
            year = Integer.parseInt(jcmbEnrollmentOpeningDateYear.getSelectedItem().toString());
            month = Integer.parseInt(jcmbEnrollmentOpeningDateMonth.getSelectedItem().toString());

            DefaultComboBoxModel daysModel = (DefaultComboBoxModel) jcmbEnrollmentOpeningDateDay.getModel();
            daysModel.removeAllElements();
            int[] daysOfMonth = CalendarUtil.getDaysOfMonth(month, year);
            for (int x : daysOfMonth) {
                daysModel.addElement(x);
            }
            jcmbEnrollmentOpeningDateDay.setModel(daysModel);
        }
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateMonthItemStateChanged

    private void jcmbEnrollmentOpeningDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateMonthActionPerformed

    private void jcmbEnrollmentOpeningDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateYearItemStateChanged
        setEnrollmentOpeningDateDayJComboBoxModel();

        if (jcmbEnrollmentOpeningDateYear.getSelectedIndex() > -1) {
            int selectedYear = Integer.parseInt(jcmbEnrollmentOpeningDateYear.getSelectedItem().toString());
            jcmbEnrollmentClosingDateYear.setSelectedItem(selectedYear);
        }
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateYearItemStateChanged

    private void jcmbEnrollmentOpeningDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentOpeningDateYearActionPerformed
    }//GEN-LAST:event_jcmbEnrollmentOpeningDateYearActionPerformed

    private void jcmbEnrollmentClosingDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentClosingDateDayItemStateChanged

    private void jcmbEnrollmentClosingDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentClosingDateDayActionPerformed

    private void jcmbEnrollmentClosingDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateMonthItemStateChanged
        if ((jcmbEnrollmentClosingDateYear.getSelectedIndex() > -1)
                && (jcmbEnrollmentClosingDateMonth.getSelectedIndex() > -1)) {
            int year;
            int month;
            year = Integer.parseInt(jcmbEnrollmentClosingDateYear.getSelectedItem().toString());
            month = Integer.parseInt(jcmbEnrollmentClosingDateMonth.getSelectedItem().toString());

            DefaultComboBoxModel daysModel = (DefaultComboBoxModel) jcmbEnrollmentClosingDateDay.getModel();
            daysModel.removeAllElements();
            int[] daysOfMonth = CalendarUtil.getDaysOfMonth(month, year);
            for (int x : daysOfMonth) {
                daysModel.addElement(x);
            }
            jcmbEnrollmentClosingDateDay.setModel(daysModel);
        }
    }//GEN-LAST:event_jcmbEnrollmentClosingDateMonthItemStateChanged

    private void jcmbEnrollmentClosingDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentClosingDateMonthActionPerformed

    private void jcmbEnrollmentClosingDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateYearItemStateChanged
        setEnrollmentClosingDateDayJComboBoxModel();
    }//GEN-LAST:event_jcmbEnrollmentClosingDateYearItemStateChanged

    private void jcmbEnrollmentClosingDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEnrollmentClosingDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEnrollmentClosingDateYearActionPerformed

    private void jcmbFirstQuarterStartDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterStartDateDayItemStateChanged

    private void jcmbFirstQuarterStartDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterStartDateDayActionPerformed

    private void jcmbFirstQuarterStartDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateMonthItemStateChanged
        setFirstSemStartDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbFirstQuarterStartDateMonthItemStateChanged

    private void jcmbFirstQuarterStartDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterStartDateMonthActionPerformed

    private void jcmbFirstQuarterStartDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateYearItemStateChanged
        setFirstSemStartDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbFirstQuarterStartDateYearItemStateChanged

    private void jcmbFirstQuarterStartDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterStartDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterStartDateYearActionPerformed

    private void jcmbFirstQuarterEndDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateDayItemStateChanged

    }//GEN-LAST:event_jcmbFirstQuarterEndDateDayItemStateChanged

    private void jcmbFirstQuarterEndDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterEndDateDayActionPerformed

    private void jcmbFirstQuarterEndDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateMonthItemStateChanged
        setFirstSemEndDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbFirstQuarterEndDateMonthItemStateChanged

    private void jcmbFirstQuarterEndDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterEndDateMonthActionPerformed

    private void jcmbFirstQuarterEndDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterEndDateYearItemStateChanged

    private void jcmbFirstQuarterEndDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFirstQuarterEndDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFirstQuarterEndDateYearActionPerformed


    private void jcmbSecondQuarterStartDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterStartDateDayItemStateChanged

    private void jcmbSecondQuarterStartDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterStartDateDayActionPerformed

    private void jcmbSecondQuarterStartDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateMonthItemStateChanged
        setSecondSemStartDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbSecondQuarterStartDateMonthItemStateChanged

    private void jcmbSecondQuarterStartDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterStartDateMonthActionPerformed

    private void jcmbSecondQuarterStartDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterStartDateYearItemStateChanged

    private void jcmbSecondQuarterStartDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterStartDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterStartDateYearActionPerformed

    private void jcmbSecondQuarterEndDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterEndDateDayItemStateChanged

    private void jcmbSecondQuarterEndDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterEndDateDayActionPerformed

    private void jcmbSecondQuarterEndDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateMonthItemStateChanged
        setSecondSemEndDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbSecondQuarterEndDateMonthItemStateChanged

    private void jcmbSecondQuarterEndDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterEndDateMonthActionPerformed

    private void jcmbSecondQuarterEndDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterEndDateYearItemStateChanged

    private void jcmbSecondQuarterEndDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSecondQuarterEndDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSecondQuarterEndDateYearActionPerformed

    private void jcmbThirdQuarterStartDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterStartDateDayItemStateChanged

    private void jcmbThirdQuarterStartDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterStartDateDayActionPerformed

    private void jcmbThirdQuarterStartDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateMonthItemStateChanged
        setThirdSemStartDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbThirdQuarterStartDateMonthItemStateChanged

    private void jcmbThirdQuarterStartDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterStartDateMonthActionPerformed

    private void jcmbThirdQuarterStartDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterStartDateYearItemStateChanged

    private void jcmbThirdQuarterStartDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterStartDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterStartDateYearActionPerformed

    private void jcmbThirdQuarterEndDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterEndDateDayItemStateChanged

    private void jcmbThirdQuarterEndDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterEndDateDayActionPerformed

    private void jcmbThirdQuarterEndDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateMonthItemStateChanged
        setThirdSemEndDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbThirdQuarterEndDateMonthItemStateChanged

    private void jcmbThirdQuarterEndDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterEndDateMonthActionPerformed

    private void jcmbThirdQuarterEndDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterEndDateYearItemStateChanged

    private void jcmbThirdQuarterEndDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbThirdQuarterEndDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbThirdQuarterEndDateYearActionPerformed

    private void jcmbFourthQuarterStartDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterStartDateDayItemStateChanged

    private void jcmbFourthQuarterStartDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterStartDateDayActionPerformed

    private void jcmbFourthQuarterStartDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateMonthItemStateChanged
        setFourthSemStartDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbFourthQuarterStartDateMonthItemStateChanged

    private void jcmbFourthQuarterStartDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterStartDateMonthActionPerformed

    private void jcmbFourthQuarterStartDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterStartDateYearItemStateChanged

    private void jcmbFourthQuarterStartDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterStartDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterStartDateYearActionPerformed

    private void jcmbFourthQuarterEndDateDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterEndDateDayItemStateChanged

    private void jcmbFourthQuarterEndDateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterEndDateDayActionPerformed

    private void jcmbFourthQuarterEndDateMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateMonthItemStateChanged
        setFourthSemEndDateDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbFourthQuarterEndDateMonthItemStateChanged

    private void jcmbFourthQuarterEndDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterEndDateMonthActionPerformed

    private void jcmbFourthQuarterEndDateYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateYearItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterEndDateYearItemStateChanged

    private void jcmbFourthQuarterEndDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbFourthQuarterEndDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbFourthQuarterEndDateYearActionPerformed

    private boolean firstSemScheduleValid() {
        boolean isValid;
        int sYear = Integer.parseInt(jcmbFirstQuarterStartDateYear.getSelectedItem().toString());
        int sMonth = Integer.parseInt(jcmbFirstQuarterStartDateMonth.getSelectedItem().toString());
        int sDay = 0;
        if (jcmbFirstQuarterStartDateYear.getSelectedIndex() > -1 && jcmbFirstQuarterStartDateMonth.getSelectedIndex() > -1) {
            sDay = Integer.parseInt(jcmbFirstQuarterStartDateDay.getSelectedItem().toString());
        }
        int eYear = Integer.parseInt(jcmbFirstQuarterEndDateYear.getSelectedItem().toString());
        int eMonth = Integer.parseInt(jcmbFirstQuarterEndDateMonth.getSelectedItem().toString());
        int eDay = 0;
        if (jcmbFirstQuarterEndDateYear.getSelectedIndex() > -1 && jcmbFirstQuarterEndDateYear.getSelectedIndex() > -1) {
            eDay = Integer.parseInt(jcmbFirstQuarterEndDateDay.getSelectedItem().toString());
        }

        if (sMonth == eMonth && sYear == eYear && sDay == eDay) {
            //year month day are equal
            JOptionPane.showMessageDialog(null, "First sem error.\nDuplicate Start and End date");
            isValid = false;
        } else if (sMonth > eMonth && sYear == eYear) {
            JOptionPane.showMessageDialog(null, "First sem error.\nStart month must be > End month for same year");
            isValid = false;
        } else if (sYear > eYear) {
            JOptionPane.showMessageDialog(null, "First sem error.\nStart year must be > End Year");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay > eDay) {
            JOptionPane.showMessageDialog(null, "First sem error.\nStart day must be <  end day");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    private boolean secondSemScheduleValid() {
        boolean isValid;

        int firstSemEndYear = Integer.parseInt(jcmbFirstQuarterEndDateYear.getSelectedItem().toString());
        int firstSemEndMonth = Integer.parseInt(jcmbFirstQuarterEndDateMonth.getSelectedItem().toString());
        int firstSemEndDay = Integer.parseInt(jcmbFirstQuarterEndDateDay.getSelectedItem().toString());

        int sYear = Integer.parseInt(jcmbSecondQuarterStartDateYear.getSelectedItem().toString());
        int sMonth = Integer.parseInt(jcmbSecondQuarterStartDateMonth.getSelectedItem().toString());
        int sDay = 0;
        if (jcmbSecondQuarterStartDateYear.getSelectedIndex() > -1 && jcmbSecondQuarterStartDateMonth.getSelectedIndex() > -1) {
            sDay = Integer.parseInt(jcmbSecondQuarterStartDateDay.getSelectedItem().toString());
        }
        int eYear = Integer.parseInt(jcmbSecondQuarterEndDateYear.getSelectedItem().toString());
        int eMonth = Integer.parseInt(jcmbSecondQuarterEndDateMonth.getSelectedItem().toString());
        int eDay = 0;
        if (jcmbSecondQuarterEndDateYear.getSelectedIndex() > -1 && jcmbSecondQuarterEndDateYear.getSelectedIndex() > -1) {
            eDay = Integer.parseInt(jcmbSecondQuarterEndDateDay.getSelectedItem().toString());
        }

        if (sYear < firstSemEndYear) {
            JOptionPane.showMessageDialog(null, "Second Sem Error.\nStart year must be >= to First Sem End year.");
            isValid = false;
        } else if (sMonth < firstSemEndMonth && sYear == firstSemEndYear) {
            JOptionPane.showMessageDialog(null, "Second Sem Error.\nStart month must be >= to First Sem End month.");
            isValid = false;
        } else if (sMonth == firstSemEndMonth && sYear == firstSemEndYear && sDay <= firstSemEndDay) {
            JOptionPane.showMessageDialog(null, "Second Sem Error.\nStart day must be > First Sem End day.");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay == eDay) {
            //year month day are equal
            JOptionPane.showMessageDialog(null, "Second sem error.\nDuplicate Start and End date");
            isValid = false;
        } else if (sMonth > eMonth && sYear == eYear) {
            JOptionPane.showMessageDialog(null, "2nd Semester Error.\nEnd Date Month must be > Start Date Month for same year");
            isValid = false;
        } else if (sYear > eYear) {
            JOptionPane.showMessageDialog(null, "Second sem error.\nStart year must be > End Year");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay > eDay) {
            JOptionPane.showMessageDialog(null, "Second sem error.\nStart day must be <  end day");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    private boolean thirdSemScheduleValid() {
        boolean isValid;

        int secondSemEndYear = Integer.parseInt(jcmbSecondQuarterEndDateYear.getSelectedItem().toString());
        int secondSemEndMonth = Integer.parseInt(jcmbSecondQuarterEndDateMonth.getSelectedItem().toString());
        int secondSemEndDay = Integer.parseInt(jcmbSecondQuarterEndDateDay.getSelectedItem().toString());

        int sYear = Integer.parseInt(jcmbThirdQuarterStartDateYear.getSelectedItem().toString());
        int sMonth = Integer.parseInt(jcmbThirdQuarterStartDateMonth.getSelectedItem().toString());
        int sDay = 0;
        if (jcmbThirdQuarterStartDateYear.getSelectedIndex() > -1 && jcmbThirdQuarterStartDateMonth.getSelectedIndex() > -1) {
            sDay = Integer.parseInt(jcmbThirdQuarterStartDateDay.getSelectedItem().toString());
        }
        int eYear = Integer.parseInt(jcmbThirdQuarterEndDateYear.getSelectedItem().toString());
        int eMonth = Integer.parseInt(jcmbThirdQuarterEndDateMonth.getSelectedItem().toString());
        int eDay = 0;
        if (jcmbThirdQuarterEndDateYear.getSelectedIndex() > -1 && jcmbThirdQuarterEndDateYear.getSelectedIndex() > -1) {
            eDay = Integer.parseInt(jcmbThirdQuarterEndDateDay.getSelectedItem().toString());
        }

        if (sYear < secondSemEndYear) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart year must be >= to Second Sem End year.");
            isValid = false;
        } else if (sMonth < secondSemEndMonth && sYear == secondSemEndYear) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart month must be >= to Second Sem End month.");
            isValid = false;
        } else if (sMonth == secondSemEndMonth && sYear == secondSemEndYear && sDay <= secondSemEndDay) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart day must be > Second Sem End day.");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay == eDay) {
            //year month day are equal
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nDuplicate Start and End date");
            isValid = false;
        } else if (sMonth > eMonth && sYear == eYear) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart month must be > End month for same year");
            isValid = false;
        } else if (sYear > eYear) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart year must be > End Year");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay > eDay) {
            JOptionPane.showMessageDialog(null, "3rd Semester Error.\nStart day must be <  end day");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    private boolean fourthSemScheduleValid() {
        boolean isValid;

        int thirdSemEndYear = Integer.parseInt(jcmbThirdQuarterEndDateYear.getSelectedItem().toString());
        int thirdSemEndMonth = Integer.parseInt(jcmbThirdQuarterEndDateMonth.getSelectedItem().toString());
        int thirdSemEndDay = Integer.parseInt(jcmbThirdQuarterEndDateDay.getSelectedItem().toString());

        int sYear = Integer.parseInt(jcmbFourthQuarterStartDateYear.getSelectedItem().toString());
        int sMonth = Integer.parseInt(jcmbFourthQuarterStartDateMonth.getSelectedItem().toString());
        int sDay = 0;
        if (jcmbFourthQuarterStartDateYear.getSelectedIndex() > -1 && jcmbFourthQuarterStartDateMonth.getSelectedIndex() > -1) {
            sDay = Integer.parseInt(jcmbFourthQuarterStartDateDay.getSelectedItem().toString());
        }
        int eYear = Integer.parseInt(jcmbFourthQuarterEndDateYear.getSelectedItem().toString());
        int eMonth = Integer.parseInt(jcmbFourthQuarterEndDateMonth.getSelectedItem().toString());
        int eDay = 0;
        if (jcmbFourthQuarterEndDateYear.getSelectedIndex() > -1 && jcmbFourthQuarterEndDateYear.getSelectedIndex() > -1) {
            eDay = Integer.parseInt(jcmbFourthQuarterEndDateDay.getSelectedItem().toString());
        }

        if (sYear < thirdSemEndYear) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart year must be >= to Third Sem End year.");
            isValid = false;
        } else if (sMonth < thirdSemEndMonth && sYear == thirdSemEndYear) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart month must be >= to Third Sem End month.");
            isValid = false;
        } else if (sMonth == thirdSemEndMonth && sYear == thirdSemEndYear && sDay <= thirdSemEndDay) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart day must be > Third Sem End day.");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay == eDay) {
            //year month day are equal
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nDuplicate Start and End date");
            isValid = false;
        } else if (sMonth > eMonth && sYear == eYear) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart month must be > End month for same year");
            isValid = false;
        } else if (sYear > eYear) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart year must be > End Year");
            isValid = false;
        } else if (sMonth == eMonth && sYear == eYear && sDay > eDay) {
            JOptionPane.showMessageDialog(null, "4th Semester Error.\nStart day must be <  end day");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

//    private boolean enrollmentScheduleIsValid(){
//        boolean isValid;
//        if(){
//            isValid = false;
//        }
//        return isValid;
//    }

    private void jtbnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnClearActionPerformed
        if (!firstSemScheduleValid()) {
//            JOptionPane.showMessageDialog(null, "Invalid schedule for First Quarter");
        } else if (!secondSemScheduleValid()) {
//            JOptionPane.showMessageDialog(null, "Invalid schedule for Second Quarter");
        } else if (!thirdSemScheduleValid()) {
//            JOptionPane.showMessageDialog(null, "Invalid schedule for Third Quarter");
        } else if (!fourthSemScheduleValid()) {
//            JOptionPane.showMessageDialog(null, "Invalid schedule for Fourth Quarter");
        } else {
//            JOptionPane.showMessageDialog(null, "All schedules for semesters are valid.");
        }
    }//GEN-LAST:event_jtbnClearActionPerformed

    private void jsprClassHoursStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsprClassHoursStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jsprClassHoursStateChanged

    private void loadJListHolidayRecord(){
        DefaultListModel dlm = new DefaultListModel();
        List<Holiday> holidays;
        holidays = HOLIDAYDAOIMPL.get();
        for(Holiday h : holidays){
            dlm.addElement(h.getName());
        }
        jlstHolidayRecord.setModel(dlm);
    }
    
    private void jbtnSaveHolidayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveHolidayActionPerformed
        int startYear = Integer.parseInt(jcmbStartHolidayYear.getSelectedItem().toString());
        int startMonth = Integer.parseInt(jcmbStartHolidayMonth.getSelectedItem().toString());
        int startDay = Integer.parseInt(jcmbStartHolidayDay.getSelectedItem().toString());
        
        String startDate = startYear + "-" + (startMonth+1) + "-" + startDay;
        
        int endYear = Integer.parseInt(jcmbEndHolidayYear.getSelectedItem().toString());
        int endMonth = Integer.parseInt(jcmbEndHolidayMonth.getSelectedItem().toString());
        int endDay = Integer.parseInt(jcmbEndHolidayDay.getSelectedItem().toString());
        
        String endDate = endYear+"-"+(endMonth+1)+"-"+endDay; // 0 in Java is January but mysql uses 1 for January
        
        String holidayName = jtfHolidayName.getText();
        String holidayDescription = jtaHolidayDescription.getText();
        Holiday holiday = new Holiday();
        holiday.setName(holidayName);
        holiday.setDescription(holidayDescription);
        holiday.setStartDate(java.sql.Date.valueOf(startDate));
        holiday.setEndDate(java.sql.Date.valueOf(endDate));
        
        boolean isAdded = HOLIDAYDAOIMPL.add(holiday);
        if (isAdded) {
            JOptionPane.showMessageDialog(null, "Successfully Added");
            loadJListHolidayRecord();
            jtfHolidayName.setText("");
            jtaHolidayDescription.setText("");
        }
    }//GEN-LAST:event_jbtnSaveHolidayActionPerformed

    private void jbtnAddHolidaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHolidaysActionPerformed
        AddHolidayToSchoolYear a = new AddHolidayToSchoolYear(null, true);
        a.setPreferredSize(new Dimension(410,310));
        a.pack();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_jbtnAddHolidaysActionPerformed

    private void jcmbStartHolidayYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayYearItemStateChanged
        setHolidayStartDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbStartHolidayYearItemStateChanged

    private void jcmbStartHolidayYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayYearActionPerformed

    private void jcmbStartHolidayMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayMonthItemStateChanged
        setHolidayStartDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbStartHolidayMonthItemStateChanged

    private void jcmbStartHolidayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayMonthActionPerformed

    private void jcmbStartHolidayDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayDayItemStateChanged

    private void jcmbStartHolidayDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayDayActionPerformed

    private void jcmbEndHolidayYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayYearItemStateChanged
        setHolidayEndDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbEndHolidayYearItemStateChanged

    private void jcmbEndHolidayYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayYearActionPerformed

    private void jcmbEndHolidayMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayMonthItemStateChanged
        setHolidayEndDaysJComboBoxModel();
    }//GEN-LAST:event_jcmbEndHolidayMonthItemStateChanged

    private void jcmbEndHolidayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayMonthActionPerformed

    private void jcmbEndHolidayDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayDayItemStateChanged

    private void jcmbEndHolidayDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayDayActionPerformed

    private void jcmbSummerStartDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerStartDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerStartDayItemStateChanged

    private void jcmbSummerStartDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerStartDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerStartDayActionPerformed

    private void jcmbSummerStartMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerStartMonthItemStateChanged
        setSummerScheduleStartDayJComboBoxModels();
    }//GEN-LAST:event_jcmbSummerStartMonthItemStateChanged

    private void jcmbSummerStartMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerStartMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerStartMonthActionPerformed

    private void jcmbSummerStartYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerStartYearItemStateChanged
        setSummerScheduleStartDayJComboBoxModels();
    }//GEN-LAST:event_jcmbSummerStartYearItemStateChanged

    private void jcmbSummerStartYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerStartYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerStartYearActionPerformed

    private void jcmbSummerEndDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerEndDayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerEndDayItemStateChanged

    private void jcmbSummerEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerEndDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerEndDayActionPerformed

    private void jcmbSummerEndMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerEndMonthItemStateChanged
        setSummerScheduleEndDayJComboBoxModels();
    }//GEN-LAST:event_jcmbSummerEndMonthItemStateChanged

    private void jcmbSummerEndMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerEndMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerEndMonthActionPerformed

    private void jcmbSummerEndYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSummerEndYearItemStateChanged
        setSummerScheduleEndDayJComboBoxModels();
    }//GEN-LAST:event_jcmbSummerEndYearItemStateChanged

    private void jcmbSummerEndYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSummerEndYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSummerEndYearActionPerformed

    private void jcmbStartHolidayYear1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayYear1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayYear1ItemStateChanged

    private void jcmbStartHolidayYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayYear1ActionPerformed

    private void jcmbStartHolidayMonth1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayMonth1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayMonth1ItemStateChanged

    private void jcmbStartHolidayMonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayMonth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayMonth1ActionPerformed

    private void jcmbStartHolidayDay1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStartHolidayDay1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayDay1ItemStateChanged

    private void jcmbStartHolidayDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStartHolidayDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbStartHolidayDay1ActionPerformed

    private void jcmbEndHolidayYear1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayYear1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayYear1ItemStateChanged

    private void jcmbEndHolidayYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayYear1ActionPerformed

    private void jcmbEndHolidayMonth1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayMonth1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayMonth1ItemStateChanged

    private void jcmbEndHolidayMonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayMonth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayMonth1ActionPerformed

    private void jcmbEndHolidayDay1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbEndHolidayDay1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayDay1ItemStateChanged

    private void jcmbEndHolidayDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEndHolidayDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbEndHolidayDay1ActionPerformed

    private void jlstHolidayRecordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlstHolidayRecordValueChanged
    }//GEN-LAST:event_jlstHolidayRecordValueChanged

    private void jlstHolidayRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlstHolidayRecordMouseClicked
        if(jlstHolidayRecord.getSelectedIndex() > -1){
            jcmbHolidayRecordAction.setEnabled(true);
        }else{
            jcmbHolidayRecordAction.setEnabled(false);
        }
    }//GEN-LAST:event_jlstHolidayRecordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton jbtnAddHolidays;
    private javax.swing.JButton jbtnCreate;
    private javax.swing.JButton jbtnSaveHoliday;
    private javax.swing.JComboBox<String> jcmbEndHolidayDay;
    private javax.swing.JComboBox<String> jcmbEndHolidayDay1;
    private javax.swing.JComboBox<String> jcmbEndHolidayMonth;
    private javax.swing.JComboBox<String> jcmbEndHolidayMonth1;
    private javax.swing.JComboBox<String> jcmbEndHolidayYear;
    private javax.swing.JComboBox<String> jcmbEndHolidayYear1;
    private javax.swing.JComboBox<String> jcmbEnrollmentClosingDateDay;
    private javax.swing.JComboBox<String> jcmbEnrollmentClosingDateMonth;
    private javax.swing.JComboBox<String> jcmbEnrollmentClosingDateYear;
    private javax.swing.JComboBox<String> jcmbEnrollmentOpeningDateDay;
    private javax.swing.JComboBox<String> jcmbEnrollmentOpeningDateMonth;
    private javax.swing.JComboBox<String> jcmbEnrollmentOpeningDateYear;
    private javax.swing.JComboBox<String> jcmbFirstQuarterEndDateDay;
    private javax.swing.JComboBox<String> jcmbFirstQuarterEndDateMonth;
    private javax.swing.JComboBox<String> jcmbFirstQuarterEndDateYear;
    private javax.swing.JComboBox<String> jcmbFirstQuarterStartDateDay;
    private javax.swing.JComboBox<String> jcmbFirstQuarterStartDateMonth;
    private javax.swing.JComboBox<String> jcmbFirstQuarterStartDateYear;
    private javax.swing.JComboBox<String> jcmbFourthQuarterEndDateDay;
    private javax.swing.JComboBox<String> jcmbFourthQuarterEndDateMonth;
    private javax.swing.JComboBox<String> jcmbFourthQuarterEndDateYear;
    private javax.swing.JComboBox<String> jcmbFourthQuarterStartDateDay;
    private javax.swing.JComboBox<String> jcmbFourthQuarterStartDateMonth;
    private javax.swing.JComboBox<String> jcmbFourthQuarterStartDateYear;
    private javax.swing.JComboBox<String> jcmbHolidayRecordAction;
    private javax.swing.JComboBox<String> jcmbSchoolYearClosingDateYear;
    private javax.swing.JComboBox<String> jcmbSchoolYearEndDateDay;
    private javax.swing.JComboBox<String> jcmbSchoolYearEndDateMonth;
    private javax.swing.JComboBox<String> jcmbSchoolYearStartDateDay;
    private javax.swing.JComboBox<String> jcmbSchoolYearStartDateMonth;
    private javax.swing.JComboBox<String> jcmbSchoolYearStartDateYear;
    private javax.swing.JComboBox<String> jcmbSecondQuarterEndDateDay;
    private javax.swing.JComboBox<String> jcmbSecondQuarterEndDateMonth;
    private javax.swing.JComboBox<String> jcmbSecondQuarterEndDateYear;
    private javax.swing.JComboBox<String> jcmbSecondQuarterStartDateDay;
    private javax.swing.JComboBox<String> jcmbSecondQuarterStartDateMonth;
    private javax.swing.JComboBox<String> jcmbSecondQuarterStartDateYear;
    private javax.swing.JComboBox<String> jcmbStartHolidayDay;
    private javax.swing.JComboBox<String> jcmbStartHolidayDay1;
    private javax.swing.JComboBox<String> jcmbStartHolidayMonth;
    private javax.swing.JComboBox<String> jcmbStartHolidayMonth1;
    private javax.swing.JComboBox<String> jcmbStartHolidayYear;
    private javax.swing.JComboBox<String> jcmbStartHolidayYear1;
    private javax.swing.JComboBox<String> jcmbSummerEndDay;
    private javax.swing.JComboBox<String> jcmbSummerEndMonth;
    private javax.swing.JComboBox<String> jcmbSummerEndYear;
    private javax.swing.JComboBox<String> jcmbSummerStartDay;
    private javax.swing.JComboBox<String> jcmbSummerStartMonth;
    private javax.swing.JComboBox<String> jcmbSummerStartYear;
    private javax.swing.JComboBox<String> jcmbThirdQuarterEndDateDay;
    private javax.swing.JComboBox<String> jcmbThirdQuarterEndDateMonth;
    private javax.swing.JComboBox<String> jcmbThirdQuarterEndDateYear;
    private javax.swing.JComboBox<String> jcmbThirdQuarterStartDateDay;
    private javax.swing.JComboBox<String> jcmbThirdQuarterStartDateMonth;
    private javax.swing.JComboBox<String> jcmbThirdQuarterStartDateYear;
    private javax.swing.JLabel jlblClassHours;
    private javax.swing.JLabel jlblEndDate;
    private javax.swing.JLabel jlblEndDate1;
    private javax.swing.JLabel jlblEndDate2;
    private javax.swing.JLabel jlblEndDate3;
    private javax.swing.JLabel jlblEndDate4;
    private javax.swing.JLabel jlblEndDateDay;
    private javax.swing.JLabel jlblEndDateDay1;
    private javax.swing.JLabel jlblEndDateDay2;
    private javax.swing.JLabel jlblEndDateDay3;
    private javax.swing.JLabel jlblEndDateDay4;
    private javax.swing.JLabel jlblEndDateDay5;
    private javax.swing.JLabel jlblEndDateDay6;
    private javax.swing.JLabel jlblEndDateDay7;
    private javax.swing.JLabel jlblEndDateDay8;
    private javax.swing.JLabel jlblEndDateMonth;
    private javax.swing.JLabel jlblEndDateMonth1;
    private javax.swing.JLabel jlblEndDateMonth2;
    private javax.swing.JLabel jlblEndDateMonth3;
    private javax.swing.JLabel jlblEndDateMonth4;
    private javax.swing.JLabel jlblEndDateMonth5;
    private javax.swing.JLabel jlblEndDateMonth6;
    private javax.swing.JLabel jlblEndDateMonth7;
    private javax.swing.JLabel jlblEndDateMonth8;
    private javax.swing.JLabel jlblEndDateYear;
    private javax.swing.JLabel jlblEndDateYear1;
    private javax.swing.JLabel jlblEndDateYear2;
    private javax.swing.JLabel jlblEndDateYear3;
    private javax.swing.JLabel jlblEndDateYear4;
    private javax.swing.JLabel jlblEndDateYear5;
    private javax.swing.JLabel jlblEndDateYear6;
    private javax.swing.JLabel jlblEndDateYear7;
    private javax.swing.JLabel jlblEndDateYear8;
    private javax.swing.JLabel jlblEnrollmentClosingDate;
    private javax.swing.JLabel jlblEnrollmentOpeningDate;
    private javax.swing.JLabel jlblHolidayDescription;
    private javax.swing.JLabel jlblHolidayEndDate;
    private javax.swing.JLabel jlblHolidayEndDate1;
    private javax.swing.JLabel jlblHolidayName;
    private javax.swing.JLabel jlblHolidayStartDate;
    private javax.swing.JLabel jlblHolidayStartDate1;
    private javax.swing.JLabel jlblSchoolYearTo;
    private javax.swing.JLabel jlblStartDate;
    private javax.swing.JLabel jlblStartDate1;
    private javax.swing.JLabel jlblStartDate2;
    private javax.swing.JLabel jlblStartDate3;
    private javax.swing.JLabel jlblStartDate4;
    private javax.swing.JLabel jlblStartDateDay;
    private javax.swing.JLabel jlblStartDateDay1;
    private javax.swing.JLabel jlblStartDateDay2;
    private javax.swing.JLabel jlblStartDateDay3;
    private javax.swing.JLabel jlblStartDateDay4;
    private javax.swing.JLabel jlblStartDateDay5;
    private javax.swing.JLabel jlblStartDateDay6;
    private javax.swing.JLabel jlblStartDateDay7;
    private javax.swing.JLabel jlblStartDateDay8;
    private javax.swing.JLabel jlblStartDateMonth;
    private javax.swing.JLabel jlblStartDateMonth1;
    private javax.swing.JLabel jlblStartDateMonth2;
    private javax.swing.JLabel jlblStartDateMonth3;
    private javax.swing.JLabel jlblStartDateMonth4;
    private javax.swing.JLabel jlblStartDateMonth5;
    private javax.swing.JLabel jlblStartDateMonth6;
    private javax.swing.JLabel jlblStartDateMonth7;
    private javax.swing.JLabel jlblStartDateMonth8;
    private javax.swing.JLabel jlblStartDateYear;
    private javax.swing.JLabel jlblStartDateYear1;
    private javax.swing.JLabel jlblStartDateYear2;
    private javax.swing.JLabel jlblStartDateYear3;
    private javax.swing.JLabel jlblStartDateYear4;
    private javax.swing.JLabel jlblStartDateYear5;
    private javax.swing.JLabel jlblStartDateYear6;
    private javax.swing.JLabel jlblStartDateYear7;
    private javax.swing.JLabel jlblStartDateYear8;
    private javax.swing.JLabel jlblSummerEndDate;
    private javax.swing.JLabel jlblSummerStartDate;
    private javax.swing.JList<String> jlstHolidayRecord;
    public static javax.swing.JList<String> jlstHolidays;
    private javax.swing.JPanel jpnlClassHours;
    private javax.swing.JPanel jpnlEnrollmentSchedule;
    private javax.swing.JPanel jpnlFirstQuarterSchedule;
    private javax.swing.JPanel jpnlFourthQuarterSchedule;
    private javax.swing.JPanel jpnlHolidayDate;
    private javax.swing.JPanel jpnlHolidayDate1;
    private javax.swing.JPanel jpnlHolidaySchedule;
    private javax.swing.JPanel jpnlHolidaySets;
    private javax.swing.JPanel jpnlHolidays;
    private javax.swing.JPanel jpnlSchoolYearSchedule;
    private javax.swing.JPanel jpnlSecondQuarterSchedule;
    private javax.swing.JPanel jpnlThirdQuarterSchedule;
    private javax.swing.JScrollPane jspCreateSchoolYear;
    private javax.swing.JSpinner jsprClassHours;
    private javax.swing.JSpinner jsprSchoolYearFrom;
    private javax.swing.JSpinner jsprSchoolYearTo;
    private javax.swing.JTextArea jtaHolidayDescription;
    private javax.swing.JTable jtblEnrollmentSchedule;
    private javax.swing.JTable jtblSchoolYearList;
    private javax.swing.JButton jtbnClear;
    private javax.swing.JTextField jtfHolidayName;
    // End of variables declaration//GEN-END:variables
}
