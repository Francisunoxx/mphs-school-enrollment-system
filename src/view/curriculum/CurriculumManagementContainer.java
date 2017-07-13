
package view.curriculum;

import view.curriculum.UpdateCurriculum;
import component_model_loader.CurriculumML;
import component_model_loader.GradeLevelML;
import component_model_loader.JTableGUIUtil;
import component_model_loader.SchoolYearML;
import component_renderers.JComboBoxRenderer_GradeLevel;
import daoimpl.CurriculumDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl;
import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import layout_utility.CardLayoutUtil;
import layout_utility.CurriculumUtility;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;

public class CurriculumManagementContainer extends javax.swing.JPanel {
    
    //HAS-A
    // Has the following classes
    
    GradeLevelML glu = new GradeLevelML();
    SchoolYearML syu = new SchoolYearML();
    CurriculumML cu = new CurriculumML();
    
    SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    CurriculumDaoImpl cdi = new CurriculumDaoImpl();
    SubjectDaoImpl sdi = new SubjectDaoImpl();
    GradeLevelDaoImpl gldi= new GradeLevelDaoImpl();
    
    Subject subject = new Subject();
    GradeLevel gradeLevel = new GradeLevel();
    Curriculum curriculum = new Curriculum();
    SchoolYear schoolYear = new SchoolYear();
    
    CurriculumUtility curriculumUtility = new CurriculumUtility();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    
    public CurriculumManagementContainer() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        initComponents();
        
        jcmbGradeLevel.setModel(glu.getAllRegisteredSubjectGradeLevel());
        jcmbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevel.setSelectedIndex(-1);
        
        cbFilterControlYearFrom.setSelectedIndex(-1);
        
        cbFilterControlCurriculumList.setSelectedIndex(-1);
        
        cbSchoolYearFrom.setModel(syu.getAllSchoolYearStart());
//        cbSchoolYearFrom.setSelectedIndex(-1);
        
        cbSchoolYearTo.setModel(syu.getAllSchoolYearEnd());
//        cbSchoolYearTo.setSelectedIndex(-1);
        
        cbGradeLevel.setModel(glu.getAllGradeLevels());
//        cbGradeLevel.setSelectedIndex(-1);
        
        cbCreatedGradeLevel.setModel(glu.getAllGradeLevels());
        cbCreatedGradeLevel.setSelectedIndex(-1);

        cbCreatedSchoolYearStart.setSelectedIndex(-1);
        
        cbCreatedSchoolYearStart.setSelectedIndex(-1);
        
        
        tblCreatedCurriculum.setModel(cu.getAllCurriculum());
        
        //Hide first column
        tblCreatedCurriculum.getColumnModel().getColumn(0).setMinWidth(0);
        tblCreatedCurriculum.getColumnModel().getColumn(0).setMaxWidth(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtpCurriculum = new javax.swing.JTabbedPane();
        jpnlCurriculumListCardContainer = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbCreatedGradeLevel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbCreatedSchoolYearStart = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbCreatedSchoolYearEnd = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreatedCurriculum = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpnlCurriculumCreatorCardContainer = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        gradeLevelJlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        cbFilterControlYearFrom = new javax.swing.JComboBox<>();
        cbFilterControlYearTo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbFilterControlCurriculumList = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        tfCurriculumName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        curriculumDescriptionJta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cbSchoolYearFrom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbSchoolYearTo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbGradeLevel = new javax.swing.JComboBox<>();
        jpnlSubjectAssignment = new javax.swing.JPanel();
        subjectsListJPanel = new javax.swing.JPanel();
        subjectsListJsp = new javax.swing.JScrollPane();
        subjectsListJtbl = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        addSubjectJbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        removeSubjectJbtn = new javax.swing.JButton();
        curriculumSubjectsJPanel = new javax.swing.JPanel();
        curriculumSubjectsJsp = new javax.swing.JScrollPane();
        curriculumSubjectsJtbl = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        cancelCreateCurriculumJbtn = new javax.swing.JButton();
        saveCurriculumJbtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jtpCurriculum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpCurriculumMouseClicked(evt);
            }
        });

        jpnlCurriculumListCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Curriculum Card Container"));
        jpnlCurriculumListCardContainer.setLayout(new java.awt.BorderLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter Controls"));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel14.add(jLabel11, gridBagConstraints);

        cbCreatedGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCreatedGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel14.add(cbCreatedGradeLevel, gridBagConstraints);

        jLabel12.setText("School Year:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel14.add(jLabel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel14.add(cbCreatedSchoolYearStart, gridBagConstraints);

        jLabel13.setText("to");
        jPanel14.add(jLabel13, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        jPanel14.add(cbCreatedSchoolYearEnd, gridBagConstraints);

        jpnlCurriculumListCardContainer.add(jPanel14, java.awt.BorderLayout.NORTH);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Curriculum List"));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        tblCreatedCurriculum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "School Year", "Grade Level", "Description", "Date Created", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCreatedCurriculum.setRowHeight(25);
        tblCreatedCurriculum.getTableHeader().setReorderingAllowed(false);
        tblCreatedCurriculum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCreatedCurriculumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCreatedCurriculum);
        if (tblCreatedCurriculum.getColumnModel().getColumnCount() > 0) {
            tblCreatedCurriculum.getColumnModel().getColumn(0).setResizable(false);
            tblCreatedCurriculum.getColumnModel().getColumn(1).setResizable(false);
            tblCreatedCurriculum.getColumnModel().getColumn(2).setResizable(false);
            tblCreatedCurriculum.getColumnModel().getColumn(3).setResizable(false);
            tblCreatedCurriculum.getColumnModel().getColumn(4).setResizable(false);
            tblCreatedCurriculum.getColumnModel().getColumn(5).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 696;
        gridBagConstraints.ipady = 279;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 6, 6);
        jPanel15.add(jScrollPane1, gridBagConstraints);

        jpnlCurriculumListCardContainer.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel16.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        jPanel16.add(jButton1, gridBagConstraints);

        jpnlCurriculumListCardContainer.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        jtpCurriculum.addTab("Existing", jpnlCurriculumListCardContainer);

        jpnlCurriculumCreatorCardContainer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlCurriculumCreatorCardContainer.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter Controls"));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 98));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        gradeLevelJlbl.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(gradeLevelJlbl, gridBagConstraints);

        jLabel6.setText("School Year:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel6, gridBagConstraints);

        jLabel7.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(jLabel7, gridBagConstraints);

        jcmbGradeLevel.setModel(new component_model_loader.GradeLevelML().getAllGradeLevels());
        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        jcmbGradeLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbGradeLevelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel9.add(jcmbGradeLevel, gridBagConstraints);

        cbFilterControlYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFilterControlYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel9.add(cbFilterControlYearFrom, gridBagConstraints);

        cbFilterControlYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel9.add(cbFilterControlYearTo, gridBagConstraints);

        jLabel3.setText("Curriculum Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel3, gridBagConstraints);

        cbFilterControlCurriculumList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFilterControlCurriculumListItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 50;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel9.add(cbFilterControlCurriculumList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel9, gridBagConstraints);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("New Curriculum"));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 107));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 107));
        jPanel13.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel13.add(tfCurriculumName, gridBagConstraints);

        jLabel1.setText("Curriculum Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel13.add(jLabel1, gridBagConstraints);

        jLabel8.setText("Description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel13.add(jLabel8, gridBagConstraints);

        curriculumDescriptionJta.setColumns(20);
        curriculumDescriptionJta.setRows(5);
        jScrollPane3.setViewportView(curriculumDescriptionJta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel13.add(jScrollPane3, gridBagConstraints);

        jLabel5.setText("School Year:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel13.add(jLabel5, gridBagConstraints);

        cbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSchoolYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel13.add(cbSchoolYearFrom, gridBagConstraints);

        jLabel9.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel13.add(jLabel9, gridBagConstraints);

        cbSchoolYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        jPanel13.add(cbSchoolYearTo, gridBagConstraints);

        jLabel10.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel13.add(jLabel10, gridBagConstraints);

        cbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel13.add(cbGradeLevel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jPanel11, gridBagConstraints);

        jpnlSubjectAssignment.setLayout(new java.awt.GridBagLayout());

        subjectsListJPanel.setLayout(new java.awt.GridBagLayout());

        subjectsListJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Subject Name", "Description", "Year Level"
            }
        ));
        subjectsListJtbl.getTableHeader().setReorderingAllowed(false);
        subjectsListJtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectsListJtblMouseClicked(evt);
            }
        });
        subjectsListJsp.setViewportView(subjectsListJtbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        subjectsListJPanel.add(subjectsListJsp, gridBagConstraints);

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Subject List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel8.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        subjectsListJPanel.add(jPanel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectAssignment.add(subjectsListJPanel, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        addSubjectJbtn.setText("Add");
        addSubjectJbtn.setEnabled(false);
        addSubjectJbtn.setMargin(new java.awt.Insets(3, 3, 3, 3));
        addSubjectJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectJbtnActionPerformed(evt);
            }
        });
        jPanel5.add(addSubjectJbtn, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(jPanel5, gridBagConstraints);

        jPanel7.setLayout(new java.awt.BorderLayout());

        removeSubjectJbtn.setText("Remove");
        removeSubjectJbtn.setEnabled(false);
        removeSubjectJbtn.setMargin(new java.awt.Insets(3, 3, 3, 3));
        removeSubjectJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSubjectJbtnActionPerformed(evt);
            }
        });
        jPanel7.add(removeSubjectJbtn, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel6.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectAssignment.add(jPanel6, gridBagConstraints);

        curriculumSubjectsJPanel.setLayout(new java.awt.GridBagLayout());

        curriculumSubjectsJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Subject Name", "Description", "Year Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        curriculumSubjectsJtbl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                curriculumSubjectsJtblFocusLost(evt);
            }
        });
        curriculumSubjectsJtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculumSubjectsJtblMouseClicked(evt);
            }
        });
        curriculumSubjectsJsp.setViewportView(curriculumSubjectsJtbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        curriculumSubjectsJPanel.add(curriculumSubjectsJsp, gridBagConstraints);

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Curriculum Subjects");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel10.add(jLabel4, gridBagConstraints);

        curriculumSubjectsJPanel.add(jPanel10, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSubjectAssignment.add(curriculumSubjectsJPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel4.add(jpnlSubjectAssignment, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel12.setLayout(new java.awt.GridBagLayout());

        cancelCreateCurriculumJbtn.setText("Cancel");
        cancelCreateCurriculumJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCreateCurriculumJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(cancelCreateCurriculumJbtn, gridBagConstraints);

        saveCurriculumJbtn.setText("Create");
        saveCurriculumJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCurriculumJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(saveCurriculumJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel12, gridBagConstraints);

        jpnlCurriculumCreatorCardContainer.add(jPanel3, java.awt.BorderLayout.CENTER);

        jtpCurriculum.addTab("New", jpnlCurriculumCreatorCardContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel2.add(jtpCurriculum, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel2, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jtpCurriculumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpCurriculumMouseClicked
        
//        if(jtpCurriculum.getSelectedIndex() == 0){
//            CardLayoutUtil.flipCardTo(jpnlCurriculumCreatorCardContainer, new CreateCurriculumForm());
//            CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
//        }else if(jtpCurriculum.getSelectedIndex() == 1){
//            CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
//            CardLayoutUtil.flipCardTo(jpnlCurriculumCreatorCardContainer, new CreateCurriculumForm());
//        }
        
    }//GEN-LAST:event_jtpCurriculumMouseClicked

    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
        if(jcmbGradeLevel.getSelectedIndex() != -1)
        {
            gradeLevel.setLevel((int) jcmbGradeLevel.getSelectedItem());
            
            sdi.getEachSubjectByGradeLevelForCurriculum(gradeLevel);
            
            subjectsListJtbl.setModel(cu.getAllSubjectsByGradeLevel(gradeLevel));
            
            
            /*******************************************************************/
            
            //Set Model on cbFilterControlYearFrom
            cbFilterControlYearFrom.setModel(cu.getCurriculumSchoolYearStart(gradeLevel));
            
            /*******************************************************************/
            
            //Set Model on cbFilterControlYearTo
            cbFilterControlYearTo.setModel(cu.getCurriculumSchoolYearEnd(gradeLevel));
        }
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged

    private void cbFilterControlYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFilterControlYearFromItemStateChanged
        if(cbFilterControlYearFrom.getSelectedIndex() != -1)
        {
            int selectedYearFrom = cbFilterControlYearFrom.getSelectedIndex();
            cbFilterControlYearTo.setSelectedIndex(selectedYearFrom);
            
            /**************************************************************************/
            
            //Setter call from SchoolYear
            schoolYear.setYearFrom((Integer) cbFilterControlYearFrom.getSelectedItem());
            
            //Set Model on cbControlCurriculumList
            cbFilterControlCurriculumList.setModel(cu.getAllCurriculumByStartYear(schoolYear));
           
            /***************************************************************************/
            
            //Setter call from Curriculum
            curriculum.setCurriculumTitle((String) cbFilterControlCurriculumList.getSelectedItem());
            
            //Set Model on subjectsListJtbl
            subjectsListJtbl.setModel(cu.getAllSubjectsOfCurriculumByName(curriculum));

        }
    }//GEN-LAST:event_cbFilterControlYearFromItemStateChanged

    private void subjectsListJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsListJtblMouseClicked
        if (subjectsListJtbl.getSelectedRow() > -1) {
            addSubjectJbtn.setEnabled(true);
        }
        if (evt.getSource().equals(subjectsListJtbl)) {
            if (evt.getClickCount() == 2) {
                JTableGUIUtil jtm = new JTableGUIUtil();
                jtm.copyTableData(subjectsListJtbl, curriculumSubjectsJtbl);
            }
        }
    }//GEN-LAST:event_subjectsListJtblMouseClicked

    private void addSubjectJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectJbtnActionPerformed
        int selectedRow = subjectsListJtbl.getSelectedRow(); //selected row which has the data to be added
        Object selectedSubjCode = subjectsListJtbl.getValueAt(selectedRow, 0);
        //        JOptionPane.showMessageDialog(null, selectedSubjCode);

        int rows = curriculumSubjectsJtbl.getRowCount();
        Object[] curriculumSubjects = new Object[rows];

        for (int j = 0; j < rows; j++) {
            curriculumSubjects[j] = curriculumSubjectsJtbl.getValueAt(j, 0);
        }

        if (Arrays.asList(curriculumSubjects).contains(selectedSubjCode)) {
            JOptionPane.showMessageDialog(null, selectedSubjCode + " is already on the list.");
        } else {
            DefaultTableModel curriculumSubjectsModel = (DefaultTableModel) curriculumSubjectsJtbl.getModel();

            Object[] rowData = new Object[subjectsListJtbl.getColumnCount()];
            int selectedRowIndex = subjectsListJtbl.getSelectedRow();
            for (int i = 0; i < subjectsListJtbl.getColumnCount(); i++) {
                rowData[i] = subjectsListJtbl.getValueAt(selectedRowIndex, i);
            }
            curriculumSubjectsModel.addRow(rowData);
            curriculumSubjectsJtbl.setModel(curriculumSubjectsModel);
        }
    }//GEN-LAST:event_addSubjectJbtnActionPerformed

    private void removeSubjectJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSubjectJbtnActionPerformed
        if (curriculumSubjectsJtbl.getSelectedRow() > -1) {
            int selectedRowIndex = curriculumSubjectsJtbl.getSelectedRow();
            DefaultTableModel curriculumSubjectsModel = (DefaultTableModel) curriculumSubjectsJtbl.getModel();
            curriculumSubjectsModel.removeRow(selectedRowIndex);
            curriculumSubjectsJtbl.clearSelection();
            removeSubjectJbtn.setEnabled(false);
        }
    }//GEN-LAST:event_removeSubjectJbtnActionPerformed

    private void curriculumSubjectsJtblFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_curriculumSubjectsJtblFocusLost

    }//GEN-LAST:event_curriculumSubjectsJtblFocusLost

    private void curriculumSubjectsJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculumSubjectsJtblMouseClicked
        if (curriculumSubjectsJtbl.getSelectedRow() > -1) {
            removeSubjectJbtn.setEnabled(true);
        } else if (curriculumSubjectsJtbl.getSelectedRow() == -1) {
            curriculumSubjectsJtbl.clearSelection(); //deselects all rows and columns
        }

        if (evt.getClickCount() == 2) {
            int selectedRow = curriculumSubjectsJtbl.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) curriculumSubjectsJtbl.getModel();
            model.removeRow(selectedRow);
        }

    }//GEN-LAST:event_curriculumSubjectsJtblMouseClicked

    private void cancelCreateCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreateCurriculumJbtnActionPerformed

    }//GEN-LAST:event_cancelCreateCurriculumJbtnActionPerformed

    private void saveCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCurriculumJbtnActionPerformed
//        if (jcmbGradeLevel.getSelectedIndex() > -1 && jcmbSchoolYearYearFrom.getSelectedIndex() > -1) {
//            int selectedGradeLevel = Integer.parseInt(jcmbGradeLevel.getSelectedItem().toString());
//            int selectedSyYearFrom = Integer.parseInt(jcmbSchoolYearYearFrom.getSelectedItem().toString());
//            int selectedSyYearTo = Integer.parseInt(jcmbSchoolYearYearTo.getSelectedItem().toString());
//
//            SchoolYear sy = new SchoolYear();
//            sy.setYearFrom(selectedSyYearFrom);
//            sy.setYearTo(selectedSyYearTo);
//            GradeLevel gl = new GradeLevel();
//            gl.setLevel(selectedGradeLevel);
//            Curriculum curc = new Curriculum();
//            curc.setGradeLevel(gl);
//            curc.setSchoolYear(sy);
//
//            if(cdi.curriculumExists(curc)){
//                JOptionPane.showMessageDialog
//                (null,"Curriculum for SY :"+selectedSyYearFrom+"-"+selectedSyYearTo+"\nfor Grade: "+selectedGradeLevel+
//                    "already exists.");
//                JOptionPane.showMessageDialog(null,"Please select a different gradelevel and schoolyear.");
//            }else{
//                JOptionPane.showMessageDialog(null,"Does not exist yet.");
//                //call the cdi.addCurriculum() here
//            }
//        }
        
        

    
    //Setter call from GradeLevel & while setting it's id
    gradeLevel.setId(gldi.getId(gradeLevel));
    //Setter call from YearLevel
    schoolYear.setSchoolYearId(schoolYear.getSchoolYearId());
    //Setter call from Curriculum
    curriculum.setCurriculumTitle(tfCurriculumName.getText());
    curriculum.setCurriculumDescription(curriculumDescriptionJta.getText());
    
    //If exist
    if(cdi.checkCurriculumExists(curriculum, gradeLevel, schoolYear) == true)
    {
        JOptionPane.showMessageDialog(null, "Curriculum "+tfCurriculumName.getText() + " already exist"
                + "\n" + "please choose different grade level and school year");
        
//        tfCurriculumName.setBackground(Color.pink);
//        
//        //Validation 
//        tfCurriculumName.setName("tfCurriculumName");
//        tfCurriculumName.setInputVerifier(new Validation());
        
        
    }
    //If not exist
    else
    {
         
        if(cdi.createCurriculum(curriculum, schoolYear, gradeLevel) == true)
            
            JOptionPane.showMessageDialog(null, "Successful creating " +tfCurriculumName.getText() + " curriculum");
            
            /**************************************************************/
        
            for(int i = 0; i < curriculumSubjectsJtbl.getModel().getRowCount(); i++)
            {
                //While looping < rowCount also insert into curriculum_subject_lt
            
                //Setter call from Curriculum && Getter call from CurriculumDAOImpl
                curriculum.setCurriculumId(curriculum.getCurriculumId());
            
                //Setter call from Subject
                subject.setSubjectTitle((String) curriculumSubjectsJtbl.getValueAt(i, 1));
        
                //Setter call from Subject & Method call from SubjectDaoImpl
                subject.setSubjectId(sdi.getSubjectId(subject));
            
                //Method call from CurriculumDAOImpl
                cdi.createCurriculumSubjects(curriculum, subject);
            }
        
    }

        
        
        
        
        
        
        


        
    }//GEN-LAST:event_saveCurriculumJbtnActionPerformed

    private void jcmbGradeLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbGradeLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbGradeLevelActionPerformed

    private void cbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSchoolYearFromItemStateChanged
//        if (cbSchoolYearFrom.getSelectedIndex() > -1) {
            int selectedYearFrom = cbSchoolYearFrom.getSelectedIndex();
            cbSchoolYearTo.setSelectedIndex(selectedYearFrom);
            
            //Setter call from SchoolYear
            schoolYear.setSchoolYearId(sydi.getId((int) cbSchoolYearFrom.getSelectedItem()));
            
//        }
    }//GEN-LAST:event_cbSchoolYearFromItemStateChanged

    private void cbFilterControlCurriculumListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFilterControlCurriculumListItemStateChanged
        if(cbFilterControlCurriculumList.getSelectedIndex() == 1)
        {
            
            
        }
    }//GEN-LAST:event_cbFilterControlCurriculumListItemStateChanged

    private void cbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeLevelItemStateChanged
//        if(cbGradeLevel.getSelectedIndex() > -1)
//        {
            //Setter call from GradeLevel
            gradeLevel.setLevel((Integer) cbGradeLevel.getSelectedItem());
            
//        }
    }//GEN-LAST:event_cbGradeLevelItemStateChanged

    private void cbCreatedGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCreatedGradeLevelItemStateChanged
        if(cbCreatedGradeLevel.getSelectedIndex() > -1)
        {
            //Setter call from GradeLevel
            gradeLevel.setLevel((Integer) cbCreatedGradeLevel.getSelectedItem());
            
            //Set model on JComboboxes
            cbCreatedSchoolYearStart.setModel(cu.getCurriculumSchoolYearStart(gradeLevel));
            
            /*******************************************************************/
            
            cbCreatedSchoolYearEnd.setModel(cu.getCurriculumSchoolYearEnd(gradeLevel));
        }
    }//GEN-LAST:event_cbCreatedGradeLevelItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UpdateCurriculum updateCurriculum = new UpdateCurriculum();
        
        //Setter call from Curriculum & Getting the id at selected row at column 0
        curriculum.setCurriculumId((int) tblCreatedCurriculum.getValueAt(tblCreatedCurriculum.getSelectedRow(), 0));
        
        //Set model on tblCreatedCurriculumList
        updateCurriculum.getTblCreatedCurriculumList().setModel(cu.getCreatedCurriculumInfoById(curriculum));
        
        updateCurriculum.getTblCreatedCurriculumList().getColumnModel().getColumn(0).setMinWidth(0);
        updateCurriculum.getTblCreatedCurriculumList().getColumnModel().getColumn(0).setMaxWidth(0);
        
        //Set selected item on jcomboboxes
        updateCurriculum.getCbCreatedGradeLevel().setSelectedItem(curriculumUtility.getCreatedCurriculumInfoById(curriculum).get(4));
        
        updateCurriculum.getCbCreatedSchoolYearStart().setSelectedItem(curriculumUtility.getCreatedCurriculumInfoById(curriculum).get(5));
        updateCurriculum.getCbCreatedSchoolYearEnd().setSelectedItem(curriculumUtility.getCreatedCurriculumInfoById(curriculum).get(6));
        
        
        //Set text on jtextfield and jtextarea
        updateCurriculum.getTfCurriculumName().setText((String) curriculumUtility.getCreatedCurriculumInfoById(curriculum).get(0));
        updateCurriculum.getTaCurriculumDescription().setText((String) curriculumUtility.getCreatedCurriculumInfoById(curriculum).get(1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblCreatedCurriculumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCreatedCurriculumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCreatedCurriculumMouseClicked

    public static void flipCardToCurriculumList(){
//        CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
    }
    
    public static JComboBox getCbSchoolYearStart()
    {
        return cbSchoolYearFrom;
    }
    
    public static JComboBox getCbSchoolYearEnd()
    {
        return cbSchoolYearTo;
    }
    
    public static JComboBox getCbGradeLevel()
    {
        return cbGradeLevel;
    }
    
    public static JTable getTblCreatedCurriculum()
    {
        return tblCreatedCurriculum;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjectJbtn;
    private javax.swing.JButton cancelCreateCurriculumJbtn;
    private javax.swing.JComboBox<String> cbCreatedGradeLevel;
    private javax.swing.JComboBox<String> cbCreatedSchoolYearEnd;
    private javax.swing.JComboBox<String> cbCreatedSchoolYearStart;
    private javax.swing.JComboBox<String> cbFilterControlCurriculumList;
    private javax.swing.JComboBox<String> cbFilterControlYearFrom;
    private javax.swing.JComboBox<String> cbFilterControlYearTo;
    private static javax.swing.JComboBox<String> cbGradeLevel;
    private static javax.swing.JComboBox<String> cbSchoolYearFrom;
    private static javax.swing.JComboBox<String> cbSchoolYearTo;
    private javax.swing.JTextArea curriculumDescriptionJta;
    private javax.swing.JPanel curriculumSubjectsJPanel;
    private javax.swing.JScrollPane curriculumSubjectsJsp;
    public javax.swing.JTable curriculumSubjectsJtbl;
    private javax.swing.JLabel gradeLevelJlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    public static javax.swing.JPanel jpnlCurriculumCreatorCardContainer;
    public static javax.swing.JPanel jpnlCurriculumListCardContainer;
    private javax.swing.JPanel jpnlSubjectAssignment;
    private javax.swing.JTabbedPane jtpCurriculum;
    private javax.swing.JButton removeSubjectJbtn;
    private javax.swing.JButton saveCurriculumJbtn;
    private javax.swing.JPanel subjectsListJPanel;
    private javax.swing.JScrollPane subjectsListJsp;
    private javax.swing.JTable subjectsListJtbl;
    private static javax.swing.JTable tblCreatedCurriculum;
    private javax.swing.JTextField tfCurriculumName;
    // End of variables declaration//GEN-END:variables
}
