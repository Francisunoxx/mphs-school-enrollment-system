package view.section;

import daoimpl.GradeLevelDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SectionDaoImpl;
import component_model_loader.GradeLevelML;
import component_utility.JTableGUIUtil;
import component_model_loader.SchoolYearML;
import component_model_loader.SectionML;
import component_renderers.JComboBoxRenderer_GradeLevel;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import layout_utility.SectionUtility;
import model.Student;

public class SectionManagementContainer extends javax.swing.JPanel {
    
    Object[] category = new Object[]{"FCFS","Grade Ranking"};
    Object[] sessionList = new Object[]{"AM", "PM"};
    
    DefaultComboBoxModel gradesFromModel = new DefaultComboBoxModel();
    DefaultComboBoxModel gradeToModel = new DefaultComboBoxModel();
    DefaultComboBoxModel categoryModel = new DefaultComboBoxModel(category);
    DefaultComboBoxModel sessionModel = new DefaultComboBoxModel(sessionList);
    
    private SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    private SectionDaoImpl sdi = new SectionDaoImpl();
    private GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();
    
    private GradeLevelML gl = new GradeLevelML();
    private SchoolYearML syml = new SchoolYearML();
    private SectionML sml = new SectionML();
    
    private SchoolYear schoolYear = new SchoolYear();
    
    private Section section = new Section();
    private GradeLevel gradeLevel = new GradeLevel();
    private Session session = new Session();
    private Student student = new Student();
    
    private SectionUtility sectionUtility = new SectionUtility();
    public SectionManagementContainer() {
        initComponents();
        btnFilterGroup.add(radioGradeLevel);
        btnFilterGroup.add(radioSection);
        cbGradeLevel.setModel(gl.getAllGradeLevels());
        
        for(int i = 60; i < 100; i++)
        {
            gradesFromModel.addElement(i);
            gradeToModel.addElement(i);
        }
        cbSchoolYearFrom.setModel(syml.getAllSchoolYearStart());
        cbSchoolYearTo.setModel(syml.getAllSchoolYearEnd());
        cbGradeFrom.setModel(gradesFromModel);
        cbGradeTo.setModel(gradeToModel);
        cbCategory.setModel(categoryModel);
        cbSession.setModel(sessionModel);
        
        tblCreatedSections.setModel(sml.getAllSections());
        
        //Hide first column
        tblCreatedSections.getColumnModel().getColumn(0).setMinWidth(0);
        tblCreatedSections.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblAssign.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssign.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblAssign2.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssign2.getColumnModel().getColumn(0).setMaxWidth(0);
                
        cbGradeLevelList.setModel(gl.getAllGradeLevels());
        
        cbAssignGradeLevel.setModel(gl.getAllGradeLevels());
        
        cbAssignSection.setModel(sml.getAllSectionName());
        cbAssignSection2.setModel(sml.getAllSectionName());
        
        cbAssignGradeLevel2.setModel(gl.getAllGradeLevels());
        
        btnSessionGroup2.add(radioAM2);
        btnSessionGroup2.add(radioPM2);
        
        btnSessionGroup.add(radioAM);
        btnSessionGroup.add(radioPM);
        
        cbGradeLevelList.setRenderer(new JComboBoxRenderer_GradeLevel());
        cbAssignGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        cbAssignGradeLevel2.setRenderer(new JComboBoxRenderer_GradeLevel());
        
        cbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnFilterGroup = new javax.swing.ButtonGroup();
        btnSessionGroup2 = new javax.swing.ButtonGroup();
        btnSessionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbGradeLevelList = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreatedSections = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfSubjectName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGradeFrom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbGradeTo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbGradeLevel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbSchoolYearFrom = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbSchoolYearTo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbSession = new javax.swing.JComboBox<>();
        chbBoth = new javax.swing.JCheckBox();
        tfCapacityAM = new javax.swing.JTextField();
        tfCapacityPM = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAssign = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAssign2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbAssignGradeLevel = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbAssignSection = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        radioGradeLevel = new javax.swing.JRadioButton();
        radioSection = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        radioAM = new javax.swing.JRadioButton();
        radioPM = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cbAssignGradeLevel2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbAssignSection2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        radioAM2 = new javax.swing.JRadioButton();
        radioPM2 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter Control"));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("Grade Level:");
        jPanel7.add(jLabel9, new java.awt.GridBagConstraints());

        cbGradeLevelList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeLevelListItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        jPanel7.add(cbGradeLevelList, gridBagConstraints);

        jPanel3.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        tblCreatedSections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Section Name", "Category", "Grade Range", "Capacity", "Session", "SchoolYear", "Date Created", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreatedSections);
        if (tblCreatedSections.getColumnModel().getColumnCount() > 0) {
            tblCreatedSections.getColumnModel().getColumn(0).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(1).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(2).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(3).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(4).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(5).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(6).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(7).setResizable(false);
            tblCreatedSections.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jButton2.setText("Open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        jPanel8.add(jButton2, gridBagConstraints);

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jTabbedPane2.addTab("Existing", jPanel3);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Section"));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Section Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(tfSubjectName, gridBagConstraints);

        jLabel2.setText("Grades:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(cbGradeFrom, gridBagConstraints);

        jLabel3.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel4.add(cbGradeTo, gridBagConstraints);

        jLabel4.setText("Method:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);

        cbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoryItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(cbCategory, gridBagConstraints);

        jLabel5.setText("Capacity:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel6, gridBagConstraints);

        cbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(cbGradeLevel, gridBagConstraints);

        jLabel7.setText("Year Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel7, gridBagConstraints);

        cbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSchoolYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(cbSchoolYearFrom, gridBagConstraints);

        jLabel8.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel8, gridBagConstraints);

        cbSchoolYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel4.add(cbSchoolYearTo, gridBagConstraints);

        jLabel10.setText("Session:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel4.add(jLabel10, gridBagConstraints);

        cbSession.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSessionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(cbSession, gridBagConstraints);

        chbBoth.setText("Both");
        chbBoth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbBothItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        jPanel4.add(chbBoth, gridBagConstraints);

        tfCapacityAM.setText("AM");
        tfCapacityAM.setEnabled(false);
        tfCapacityAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCapacityAMMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(tfCapacityAM, gridBagConstraints);

        tfCapacityPM.setText("PM");
        tfCapacityPM.setEnabled(false);
        tfCapacityPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCapacityPMMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel4.add(tfCapacityPM, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        jPanel5.add(btnSave, gridBagConstraints);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jTabbedPane2.addTab("New", jPanel2);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(550, 402));
        jPanel14.setLayout(new java.awt.BorderLayout());

        tblAssign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Name", "Grade Level", "General Average", "Entrance Exam Average"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAssign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAssignMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAssign);
        if (tblAssign.getColumnModel().getColumnCount() > 0) {
            tblAssign.getColumnModel().getColumn(0).setResizable(false);
            tblAssign.getColumnModel().getColumn(1).setResizable(false);
            tblAssign.getColumnModel().getColumn(2).setResizable(false);
            tblAssign.getColumnModel().getColumn(3).setResizable(false);
            tblAssign.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel14.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        jPanel10.add(jPanel14, gridBagConstraints);

        jPanel15.setPreferredSize(new java.awt.Dimension(190, 402));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel15.add(btnAdd, gridBagConstraints);

        btnRemove.setText("Remove");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jPanel15.add(btnRemove, gridBagConstraints);

        jPanel10.add(jPanel15, new java.awt.GridBagConstraints());

        jPanel16.setPreferredSize(new java.awt.Dimension(550, 402));
        jPanel16.setLayout(new java.awt.BorderLayout());

        tblAssign2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Name", "Grade Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAssign2);
        if (tblAssign2.getColumnModel().getColumnCount() > 0) {
            tblAssign2.getColumnModel().getColumn(0).setResizable(false);
            tblAssign2.getColumnModel().getColumn(1).setResizable(false);
            tblAssign2.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel16.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel10.add(jPanel16, gridBagConstraints);

        jPanel9.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(500, 150));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(jLabel11, gridBagConstraints);

        cbAssignGradeLevel.setEnabled(false);
        cbAssignGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(cbAssignGradeLevel, gridBagConstraints);

        jLabel20.setText("Section Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(jLabel20, gridBagConstraints);

        cbAssignSection.setEnabled(false);
        cbAssignSection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignSectionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(cbAssignSection, gridBagConstraints);

        jLabel21.setText("Filter By:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        jPanel12.add(jLabel21, gridBagConstraints);

        radioGradeLevel.setText("Grade Level");
        radioGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(radioGradeLevel, gridBagConstraints);

        radioSection.setText("Section");
        radioSection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioSectionItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(radioSection, gridBagConstraints);

        jLabel14.setText("Session:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(jLabel14, gridBagConstraints);

        radioAM.setText("AM");
        radioAM.setEnabled(false);
        radioAM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioAMItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(radioAM, gridBagConstraints);

        radioPM.setText("PM");
        radioPM.setEnabled(false);
        radioPM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioPMItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel12.add(radioPM, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        jPanel11.add(jPanel12, gridBagConstraints);

        jPanel13.setPreferredSize(new java.awt.Dimension(500, 150));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel12.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(jLabel12, gridBagConstraints);

        cbAssignGradeLevel2.setEnabled(false);
        cbAssignGradeLevel2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignGradeLevel2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(cbAssignGradeLevel2, gridBagConstraints);

        jLabel13.setText("Section Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(jLabel13, gridBagConstraints);

        cbAssignSection2.setEnabled(false);
        cbAssignSection2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignSection2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(cbAssignSection2, gridBagConstraints);

        jLabel16.setText("Capacity:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(jLabel16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(lblCapacity, gridBagConstraints);

        jLabel15.setText("Session:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(jLabel15, gridBagConstraints);

        radioAM2.setText("AM");
        radioAM2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioAM2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(radioAM2, gridBagConstraints);

        radioPM2.setText("PM");
        radioPM2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioPM2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel13.add(radioPM2, gridBagConstraints);

        jPanel11.add(jPanel13, new java.awt.GridBagConstraints());

        jPanel9.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel17.setLayout(new java.awt.GridBagLayout());

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        jPanel17.add(btnCreate, gridBagConstraints);

        jPanel9.add(jPanel17, java.awt.BorderLayout.PAGE_END);

        jTabbedPane2.addTab("Assign", jPanel9);

        jPanel1.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (chbBoth.isSelected()) {
            for (int i = 0; i < 2; i++) {

            }
        }
        
        //Setter call from Section
        section.setSectionName(tfSubjectName.getText());
        section.setGradeFrom((int) cbGradeFrom.getSelectedItem());
        section.setGradeTo((int) cbGradeTo.getSelectedItem());
        section.setCategory((String) cbCategory.getSelectedItem());
        
        
        //Method call from SectionDaoImpl
        //If insert
        if(sdi.createSection(section) == true)
        {
            //Setter call from Section
            section.setSectionId(section.getSectionId());
            section.setSectionCategoryId(section.getSectionCategoryId());
            
            if(chbBoth.isSelected())
            {
                for(int i = 0; i < 2; i++)
                {
                    if(i == 0)
                    {
                        session.setCapacity(Integer.parseInt(tfCapacityAM.getText()));
                        //Setter call from GradeLevel
                        gradeLevel.setId(gradeLevel.getId());
                        //Setter call from SchoolYear
                        schoolYear.setSchoolYearId(schoolYear.getSchoolYearId());
                        //Setter && Getter call from Session
                        session.setSessionId(1);

                        //Method call from SectionDaoImpl
                        sdi.createSectionSettings(section, schoolYear, gradeLevel,session);
                    }
                    else
                    {
                        session.setCapacity(Integer.parseInt(tfCapacityPM.getText()));
                        //Setter call from GradeLevel
                        gradeLevel.setId(gradeLevel.getId());
                        //Setter call from SchoolYear
                        schoolYear.setSchoolYearId(schoolYear.getSchoolYearId());
                        //Setter && Getter call from Session
                        session.setSessionId(2);

                        //Method call from SectionDaoImpl
                        sdi.createSectionSettings(section, schoolYear, gradeLevel,session);
                    }
                    
                    JOptionPane.showMessageDialog(null, "Successfully created " + tfSubjectName.getText() + " " + " section!");
                }
            }
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSchoolYearFromItemStateChanged
        int selectedYearFrom = cbSchoolYearFrom.getSelectedIndex();
        cbSchoolYearTo.setSelectedIndex(selectedYearFrom);
            
        //Setter call from SchoolYear
        schoolYear.setSchoolYearId(sydi.getId((int) cbSchoolYearFrom.getSelectedItem()));
    }//GEN-LAST:event_cbSchoolYearFromItemStateChanged

    private void cbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeLevelItemStateChanged
        //Setter call from GradeLevel
        gradeLevel.setLevel((Integer) cbGradeLevel.getSelectedItem());
        gradeLevel.setId(gldi.getId(gradeLevel));
    }//GEN-LAST:event_cbGradeLevelItemStateChanged

    private void cbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoryItemStateChanged
        //Setter call from Section
//        section.setCategory((String) cbCategory.getSelectedItem());
//        section.setSectionCategoryId(sdi.getSectionCategoryId(section));
    }//GEN-LAST:event_cbCategoryItemStateChanged

    private void cbSessionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSessionItemStateChanged
        if(cbSession.getSelectedIndex() == 0)
        {
            session.setSessionId(1);
            
            tfCapacityAM.setEnabled(true);
            tfCapacityPM.setEnabled(false);
        }
        else
        {
            session.setSessionId(2);
            
            tfCapacityAM.setEnabled(false);
            tfCapacityPM.setEnabled(true);
        }
    }//GEN-LAST:event_cbSessionItemStateChanged

    private void cbGradeLevelListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeLevelListItemStateChanged
        //Setter call from GradeLevel & Method call from GradeLevelDaoImpl
        gradeLevel.setLevel((Integer) cbGradeLevelList.getSelectedItem());
        gradeLevel.setId(gldi.getId(gradeLevel));
        
        //Set model on tblCreatedSections
        tblCreatedSections.setModel(sml.getAllSectionsByGradeLevelId(gradeLevel));
        
        //Hide first column
        tblCreatedSections.getColumnModel().getColumn(0).setMinWidth(0);
        tblCreatedSections.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_cbGradeLevelListItemStateChanged

    private void chbBothItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbBothItemStateChanged
        if(chbBoth.isSelected())
        {
            tfCapacityAM.setEnabled(true);
            tfCapacityPM.setEnabled(true);
        }
        else
        {
            tfCapacityAM.setEnabled(false);
            tfCapacityPM.setEnabled(false);
            
        }
    }//GEN-LAST:event_chbBothItemStateChanged

    private void tfCapacityAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCapacityAMMouseClicked
        
        tfCapacityAM.setText("");
        
    }//GEN-LAST:event_tfCapacityAMMouseClicked

    private void tfCapacityPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCapacityPMMouseClicked
        tfCapacityPM.setText("");
    }//GEN-LAST:event_tfCapacityPMMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateSection updateSection = new UpdateSection();
        
        //Setter call from Section
        section.setSectionId((int) tblCreatedSections.getValueAt(tblCreatedSections.getSelectedRow(), 0));
        
        
        
        //Set text on textfields and jcomboboxes
        updateSection.getTfSectionName().setText((String) sectionUtility.getCreatedSectionById(section).get(0));
        updateSection.getCbGradeLevel().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(1));
        updateSection.getCbSchoolYearFrom().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(2));
        updateSection.getCbSchoolYearTo().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(3));
        updateSection.getCbGradeLevelFrom().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(4));
        updateSection.getCbGradeLevelTo().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(5));
        updateSection.getCbMethod().setSelectedItem(sectionUtility.getCreatedSectionById(section).get(6));
        
        if(sectionUtility.getCreatedSectionById(section).size() > 1)
        {
            //Set checked
            updateSection.getChbBoth().setSelected(true);
            for(int i = 0; i < 2; i++)
            {
                if(i == 0)
                {
                    updateSection.getTfAM().setText(sectionUtility.getCreatedSectionById(section).get(7).toString());
                }
                else
                {
                    updateSection.getTfPM().setText((String) sectionUtility.getCreatedSectionById(section).get(7).toString());
                }
            }
        }
        else
        {
            //Remove checked
            updateSection.getChbBoth().setSelected(false);
            updateSection.getTfAM().setText((String) sectionUtility.getCreatedSectionById(section).get(8));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void radioGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioGradeLevelItemStateChanged
        if(radioGradeLevel.isSelected())
        {
            cbAssignGradeLevel.setEnabled(true);
        }
        else
        {
            cbAssignGradeLevel.setEnabled(false);
        }
    }//GEN-LAST:event_radioGradeLevelItemStateChanged

    private void radioSectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioSectionItemStateChanged
        if(radioSection.isSelected())
        {
            cbAssignGradeLevel.setSelectedIndex(0);
            
            cbAssignGradeLevel.setEnabled(true);
            cbAssignSection.setEnabled(true);
            radioAM.setEnabled(true);
            radioPM.setEnabled(true);
        }
        else
        {
            cbAssignGradeLevel.setEnabled(false);
            cbAssignSection.setEnabled(false);
            radioAM.setEnabled(false);
            radioPM.setEnabled(false);
        }
    }//GEN-LAST:event_radioSectionItemStateChanged

    private void cbAssignGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignGradeLevelItemStateChanged
        //Setter call from GradeLevel
        gradeLevel.setLevel((Integer) cbAssignGradeLevel.getSelectedItem());
        gradeLevel.setId(gldi.getId(gradeLevel));
        
        //Set model on tblAssign
        tblAssign.setModel(sml.getAllRegisteredStudentsByGradeId(gradeLevel));
        
        //Hide first column
        tblAssign.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssign.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_cbAssignGradeLevelItemStateChanged

    private void cbAssignSectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignSectionItemStateChanged
        //Setter call from Section
        section.setSectionName((String) cbAssignSection.getSelectedItem());
       
        
        //Set model on tblAssign
        tblAssign.setModel(sml.getAllStudentsBySection(session,section,gradeLevel));
        
        //Hide first column
        tblAssign.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssign.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_cbAssignSectionItemStateChanged

    private void radioAMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioAMItemStateChanged
        //Setter call from Session
        if(radioAM.isSelected())
        {
            session.setSessionId(1);
        }
        else
        {
            session.setSessionId(2);
        }
    }//GEN-LAST:event_radioAMItemStateChanged

    private void radioPMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioPMItemStateChanged
        //Setter call from Session
        if(radioPM.isSelected())
        {
            session.setSessionId(2);
        }
        else
        {
            session.setSessionId(1);
        }
    }//GEN-LAST:event_radioPMItemStateChanged

    private void radioPM2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioPM2ItemStateChanged
        if(radioPM2.isSelected())
        {
            //Setter call from Session
            session.setSessionId(2);

            cbAssignGradeLevel2.setEnabled(true);
            cbAssignSection2.setEnabled(true);
        }
        else
        {
            session.setSessionId(1);

            cbAssignGradeLevel2.setEnabled(true);
            cbAssignSection2.setEnabled(true);
        }
    }//GEN-LAST:event_radioPM2ItemStateChanged

    private void radioAM2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioAM2ItemStateChanged
        //Setter call from Session
        if(radioAM2.isSelected())
        {
            session.setSessionId(1);

            cbAssignGradeLevel2.setEnabled(true);
            cbAssignSection2.setEditable(true);
        }
        else
        {
            session.setSessionId(2);

            cbAssignGradeLevel2.setEnabled(true);
            cbAssignSection2.setEditable(true);
        }
    }//GEN-LAST:event_radioAM2ItemStateChanged

    private void cbAssignSection2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignSection2ItemStateChanged
        //Setter call from Section
        section.setSectionName((String) cbAssignSection2.getSelectedItem());

        //Set model on tblAssign
        tblAssign2.setModel(sml.getAllStudentsBySection(session,section,gradeLevel));

        //Hide first column
        tblAssign2.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssign2.getColumnModel().getColumn(0).setMaxWidth(0);
        
        lblCapacity.setText(Integer.toString(sdi.getSectionCapacity(section)));
    }//GEN-LAST:event_cbAssignSection2ItemStateChanged

    private void cbAssignGradeLevel2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignGradeLevel2ItemStateChanged
        //Setter call from Section
        gradeLevel.setLevel((Integer) cbAssignGradeLevel2.getSelectedItem());
        gradeLevel.setId(gldi.getId(gradeLevel));
    }//GEN-LAST:event_cbAssignGradeLevel2ItemStateChanged

    private void tblAssignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAssignMouseClicked
        if (tblAssign.getSelectedRow() > -1) {
            btnAdd.setEnabled(true);
        }
        if (evt.getSource().equals(tblAssign)) {
            if (evt.getClickCount() == 2) {
                JTableGUIUtil jtm = new JTableGUIUtil();
                jtm.copyTableData(tblAssign, tblAssign2);
//                jtm.passStudentToSectionList(tblAssign, tblAssign2);
            }
        }
    }//GEN-LAST:event_tblAssignMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selectedRow = tblAssign.getSelectedRow(); //selected row which has the data to be added
        Object selectedSubjCode = tblAssign.getValueAt(selectedRow, 1);
        
        int rows = tblAssign.getRowCount();
        Object[] curriculumSubjects = new Object[rows];

        for (int j = 0; j < rows; j++) {
            curriculumSubjects[j] = tblAssign.getValueAt(j, 1);
        }
        
        if (Arrays.asList(curriculumSubjects).contains(selectedSubjCode)) {
            JOptionPane.showMessageDialog(null, selectedSubjCode + " is already on the list.");
        } else 
        {
            int counter = 0;
            DefaultTableModel model = (DefaultTableModel) tblAssign2.getModel();
            Object[] rowData = new Object[tblAssign2.getColumnCount()];
            int selectedRowIndex = tblAssign2.getSelectedRow();
            
            for (int i = 0; i < tblAssign2.getColumnCount(); i++) 
            {
            
                rowData[i] = tblAssign2.getValueAt(selectedRowIndex, counter++);
                
            }
            
            model.addRow(rowData);
            tblAssign2.setModel(model);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(tblAssign2.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(null, "Cannot create empty section");
        }
        else
        {
            for(int i = 0; i< tblAssign2.getRowCount(); i++)
            {
                //Setter call from Section while getting the section id
                section.setSectionId(sdi.getSectionId(section));
                //Setter call from Student
                student.setStudentId((int) tblAssign2.getValueAt(i, 0));
                //Setter call from SchoolYear
                schoolYear.setSchoolYearId(sdi.getSectionSchoolYearId(section));
                
                
                //Method call from SectionDaoImpl
                sdi.createStudentSection(section, student, schoolYear);
            }
            
          
            
            JOptionPane.showMessageDialog(null, "Successfully adding " +tblAssign2.getRowCount() + " students to "+cbAssignSection2.getSelectedItem());
        }
    }//GEN-LAST:event_btnCreateActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup btnFilterGroup;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup btnSessionGroup;
    private javax.swing.ButtonGroup btnSessionGroup2;
    private javax.swing.JComboBox<String> cbAssignGradeLevel;
    private javax.swing.JComboBox<String> cbAssignGradeLevel2;
    private javax.swing.JComboBox<String> cbAssignSection;
    private javax.swing.JComboBox<String> cbAssignSection2;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbGradeFrom;
    private javax.swing.JComboBox<String> cbGradeLevel;
    private javax.swing.JComboBox<String> cbGradeLevelList;
    private javax.swing.JComboBox<String> cbGradeTo;
    private javax.swing.JComboBox<String> cbSchoolYearFrom;
    private javax.swing.JComboBox<String> cbSchoolYearTo;
    private javax.swing.JComboBox<String> cbSession;
    private javax.swing.JCheckBox chbBoth;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JRadioButton radioAM;
    private javax.swing.JRadioButton radioAM2;
    private javax.swing.JRadioButton radioGradeLevel;
    private javax.swing.JRadioButton radioPM;
    private javax.swing.JRadioButton radioPM2;
    private javax.swing.JRadioButton radioSection;
    private javax.swing.JTable tblAssign;
    private javax.swing.JTable tblAssign2;
    private javax.swing.JTable tblCreatedSections;
    private javax.swing.JTextField tfCapacityAM;
    private javax.swing.JTextField tfCapacityPM;
    private javax.swing.JTextField tfSubjectName;
    // End of variables declaration//GEN-END:variables
}
