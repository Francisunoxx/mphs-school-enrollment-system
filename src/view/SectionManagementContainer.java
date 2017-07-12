package view;

import daoimpl.GradeLevelDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SectionDaoImpl;
import daoimpl.SessionDaoImpl;
import component_model_loader.GradeLevelML;
import component_model_loader.SchoolYearML;
import component_model_loader.SectionML;
import component_model_loader.SessionML;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import component_renderers.JComboBoxRenderer_GradeLevel;

public class SectionManagementContainer extends javax.swing.JPanel {

    private final int currentSchoolYearFrom = SchoolYearDaoImpl.getCurrentSchoolYearFrom();
    private final GUIManager guiManager = new GUIManager();
    private final SectionDaoImpl sectionDaoImpl = new SectionDaoImpl();
    private final SectionML sectionGUIUtil = new SectionML();
    private final SessionDaoImpl sessionDaoImpl = new SessionDaoImpl();
    private final SessionML sessionGUIUtil = new SessionML();
    private final GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    private final GradeLevelML gradeLevelGUIUtil = new GradeLevelML();
    private final SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();

    public SectionManagementContainer() {
        initComponents();
        guiManager.setGUIComponentModels();
        guiManager.setInitialGUIState();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        sectionsCardContainer = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jpnlCreateSection = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfSectionNameCreate = new javax.swing.JTextField();
        gradeLevelJlbl = new javax.swing.JLabel();
        jcmbGradeLevelCreate = new javax.swing.JComboBox<>();
        jpnlSession = new javax.swing.JPanel();
        jcbAMSessionCreate = new javax.swing.JCheckBox();
        jcbPMSessionCreate = new javax.swing.JCheckBox();
        jlblAMCapacity = new javax.swing.JLabel();
        jtfAMCapacityCreate = new javax.swing.JTextField();
        jlblPMCapacity = new javax.swing.JLabel();
        jtfPMCapacityCreate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnCreateSection = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jspSectionList = new javax.swing.JScrollPane();
        jlstSectionList = new javax.swing.JList<>();
        jpnlUpdateSection = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfSectionNameUpdate = new javax.swing.JTextField();
        gradeLevelJlbl1 = new javax.swing.JLabel();
        jcmbGradeLevelUpdate = new javax.swing.JComboBox<>();
        jcbActiveInactive = new javax.swing.JCheckBox();
        jbtnUpdateSection = new javax.swing.JButton();
        jpnlSession1 = new javax.swing.JPanel();
        jcbAMSessionCreate1 = new javax.swing.JCheckBox();
        jcbPMSessionCreate1 = new javax.swing.JCheckBox();
        jlblAMCapacity2 = new javax.swing.JLabel();
        jtfAMCapacityCreate1 = new javax.swing.JTextField();
        jlblPMCapacity2 = new javax.swing.JLabel();
        jtfPMCapacityCreate1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpnlFilter = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jcmbSchoolYearFrom = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcmbSchoolYearTo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcmbGradeLevelFilter = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        sectionsCardContainer.setLayout(new java.awt.CardLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Curriculum Panel"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jpnlCreateSection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jpnlCreateSection.setLayout(new java.awt.GridBagLayout());

        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Section Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jLabel3, gridBagConstraints);

        jtfSectionNameCreate.setColumns(10);
        jtfSectionNameCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfSectionNameCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSectionNameCreateKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jtfSectionNameCreate, gridBagConstraints);

        gradeLevelJlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gradeLevelJlbl.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(gradeLevelJlbl, gridBagConstraints);

        jcmbGradeLevelCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbGradeLevelCreate.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevelCreate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelCreateItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel9.add(jcmbGradeLevelCreate, gridBagConstraints);

        jpnlSession.setBorder(javax.swing.BorderFactory.createTitledBorder("Session"));
        jpnlSession.setLayout(new java.awt.GridBagLayout());

        jcbAMSessionCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAMSessionCreate.setText("AM");
        jcbAMSessionCreate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAMSessionCreateItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jcbAMSessionCreate, gridBagConstraints);

        jcbPMSessionCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPMSessionCreate.setText("PM");
        jcbPMSessionCreate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPMSessionCreateItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jcbPMSessionCreate, gridBagConstraints);

        jlblAMCapacity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblAMCapacity.setText("Capacity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jlblAMCapacity, gridBagConstraints);

        jtfAMCapacityCreate.setColumns(5);
        jtfAMCapacityCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jtfAMCapacityCreate, gridBagConstraints);

        jlblPMCapacity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblPMCapacity.setText("Capacity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jlblPMCapacity, gridBagConstraints);

        jtfPMCapacityCreate.setColumns(5);
        jtfPMCapacityCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jtfPMCapacityCreate, gridBagConstraints);

        jLabel1.setText("(students)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jLabel1, gridBagConstraints);

        jLabel2.setText("(students)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jpnlSession, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlCreateSection.add(jPanel9, gridBagConstraints);

        jbtnCreateSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnCreateSection.setText("Create");
        jbtnCreateSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateSectionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlCreateSection.add(jbtnCreateSection, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jpnlCreateSection, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(368, 500));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jspSectionList.setBorder(javax.swing.BorderFactory.createTitledBorder("Section List"));
        jspSectionList.setPreferredSize(new java.awt.Dimension(266, 300));

        jlstSectionList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlstSectionList.setPreferredSize(new java.awt.Dimension(167, 90));
        jspSectionList.setViewportView(jlstSectionList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel2.add(jspSectionList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jPanel2, gridBagConstraints);

        jpnlUpdateSection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jpnlUpdateSection.setLayout(new java.awt.GridBagLayout());

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Section Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel10.add(jLabel4, gridBagConstraints);

        jtfSectionNameUpdate.setColumns(10);
        jtfSectionNameUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel10.add(jtfSectionNameUpdate, gridBagConstraints);

        gradeLevelJlbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gradeLevelJlbl1.setText("Grade Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel10.add(gradeLevelJlbl1, gridBagConstraints);

        jcmbGradeLevelUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbGradeLevelUpdate.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevelUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelUpdateItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel10.add(jcmbGradeLevelUpdate, gridBagConstraints);

        jcbActiveInactive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbActiveInactive.setText("Active");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel10.add(jcbActiveInactive, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateSection.add(jPanel10, gridBagConstraints);

        jbtnUpdateSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnUpdateSection.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlUpdateSection.add(jbtnUpdateSection, gridBagConstraints);

        jpnlSession1.setBorder(javax.swing.BorderFactory.createTitledBorder("Session"));
        jpnlSession1.setLayout(new java.awt.GridBagLayout());

        jcbAMSessionCreate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAMSessionCreate1.setText("AM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jcbAMSessionCreate1, gridBagConstraints);

        jcbPMSessionCreate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbPMSessionCreate1.setText("PM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jcbPMSessionCreate1, gridBagConstraints);

        jlblAMCapacity2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblAMCapacity2.setText("Capacity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jlblAMCapacity2, gridBagConstraints);

        jtfAMCapacityCreate1.setColumns(5);
        jtfAMCapacityCreate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jtfAMCapacityCreate1, gridBagConstraints);

        jlblPMCapacity2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblPMCapacity2.setText("Capacity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jlblPMCapacity2, gridBagConstraints);

        jtfPMCapacityCreate1.setColumns(5);
        jtfPMCapacityCreate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jtfPMCapacityCreate1, gridBagConstraints);

        jLabel5.setText("(students)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("(students)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlSession1.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUpdateSection.add(jpnlSession1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jpnlUpdateSection, gridBagConstraints);

        jpnlFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jpnlFilter.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlFilter.add(jLabel7, gridBagConstraints);

        jcmbSchoolYearFrom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jcmbSchoolYearFrom.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearStart());
        jcmbSchoolYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlFilter.add(jcmbSchoolYearFrom, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlFilter.add(jLabel8, gridBagConstraints);

        jcmbSchoolYearTo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jcmbSchoolYearTo.setModel(new component_model_loader.SchoolYearML().getAllSchoolYearEnd());
        jcmbSchoolYearTo.setEnabled(false);
        jcmbSchoolYearTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearToItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlFilter.add(jcmbSchoolYearTo, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Grade Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilter.add(jLabel9, gridBagConstraints);

        jcmbGradeLevelFilter.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jcmbGradeLevelFilter.setModel(new component_model_loader.GradeLevelML().getAllGradeLevels());
        jcmbGradeLevelFilter.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevelFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelFilterItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlFilter.add(jcmbGradeLevelFilter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jpnlFilter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jPanel6, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Section", jPanel3);

        sectionsCardContainer.add(jTabbedPane1, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(sectionsCardContainer, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    class GUIManager {

        private void setInitialGUIState() {
            jtfSectionNameCreate.setText("");
            jtfSectionNameUpdate.setText("");
            jtfSectionNameUpdate.setEnabled(false);
            jcmbGradeLevelCreate.setSelectedIndex(-1);
            jcmbGradeLevelUpdate.setSelectedIndex(-1);
            jcmbGradeLevelFilter.setSelectedIndex(-1);
            jcmbGradeLevelUpdate.setEnabled(false);
            jbtnCreateSection.setEnabled(true);
            jbtnUpdateSection.setEnabled(false);
            jcbActiveInactive.setEnabled(false);
            jtfAMCapacityCreate.setEnabled(false);
            jtfPMCapacityCreate.setEnabled(false);
            jcmbSchoolYearFrom.setSelectedItem(currentSchoolYearFrom);
            jcmbGradeLevelCreate.setEnabled(false);
            jcbAMSessionCreate.setEnabled(false);
            jcbPMSessionCreate.setEnabled(false);
        }

        private void setGUIComponentModels() {
            jcmbGradeLevelCreate.setModel(gradeLevelGUIUtil.getAllGradeLevels());
            jcmbGradeLevelUpdate.setModel(gradeLevelGUIUtil.getAllGradeLevels());
            setSectionJList();
        }
    }


    private void jcmbGradeLevelCreateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelCreateItemStateChanged
        boolean aGradeLevelIsSelected = jcmbGradeLevelCreate.getSelectedIndex() > -1;
        if (aGradeLevelIsSelected) {
            jcbAMSessionCreate.setEnabled(true);
            jcbPMSessionCreate.setEnabled(true);
        }
    }//GEN-LAST:event_jcmbGradeLevelCreateItemStateChanged

    private void jcmbGradeLevelUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelUpdateItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbGradeLevelUpdateItemStateChanged

    private void setSectionJList() {
        jlstSectionList.setModel(sectionGUIUtil.getSectionForJList());
    }

    private void jbtnCreateSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateSectionActionPerformed
        boolean amIsChecked = jcbAMSessionCreate.isSelected();
        boolean pmIsChecked = jcbPMSessionCreate.isSelected();

        List<Session> aSessionList = new ArrayList<>();
        if (amIsChecked && !pmIsChecked) {
            String sessionTitleAM = jcbAMSessionCreate.getText().trim();
            Integer sessionIdAM = sessionDaoImpl.getIdBySessionName(sessionTitleAM);
            Integer capacityAM = Integer.parseInt(jtfAMCapacityCreate.getText().trim());
            Session AM = new Session();
            AM.setSessionId(sessionIdAM);
            AM.setSessionTitle(sessionTitleAM);
            AM.setCapacity(capacityAM);

            aSessionList.add(AM);
        } else if (pmIsChecked && !amIsChecked) {
            String sessionTitlePM = jcbPMSessionCreate.getText().trim();
            Integer sessionIdPM = sessionDaoImpl.getIdBySessionName(sessionTitlePM);
            Integer capacityPM = Integer.parseInt(jtfPMCapacityCreate.getText().trim());
            Session PM = new Session();
            PM.setSessionId(sessionIdPM);
            PM.setSessionTitle(sessionTitlePM);
            PM.setCapacity(capacityPM);

            aSessionList.add(PM);
        } else if (amIsChecked && pmIsChecked) {
            String sessionTitleAM = jcbAMSessionCreate.getText().trim();
            Integer sessionIdAM = sessionDaoImpl.getIdBySessionName(sessionTitleAM);
            Integer capacityAM = Integer.parseInt(jtfAMCapacityCreate.getText().trim());
            Session AM = new Session();
            AM.setSessionId(sessionIdAM);
            AM.setSessionTitle(sessionTitleAM);
            AM.setCapacity(capacityAM);

            String sessionTitlePM = jcbPMSessionCreate.getText().trim();
            Integer sessionIdPM = sessionDaoImpl.getIdBySessionName(sessionTitlePM);
            Integer capacityPM = Integer.parseInt(jtfPMCapacityCreate.getText().trim());
            Session PM = new Session();
            PM.setSessionId(sessionIdPM);
            PM.setSessionTitle(sessionTitlePM);
            PM.setCapacity(capacityPM);

            aSessionList.add(AM);
            aSessionList.add(PM);
        }

        SchoolYear aSchoolYear = new SchoolYear();
        aSchoolYear.setYearFrom(currentSchoolYearFrom);
        aSchoolYear.setSchoolYearId(schoolYearDaoImpl.getId(currentSchoolYearFrom));

        String aSectionName = jtfSectionNameCreate.getText();

        Integer level = Integer.parseInt(jcmbGradeLevelCreate.getSelectedItem().toString());
        GradeLevel aGradeLevel = new GradeLevel();
        aGradeLevel.setLevel(level);
        aGradeLevel.setId(gradeLevelDaoImpl.getId(aGradeLevel));

        Section section = new Section();
        section.setSectionName(aSectionName);
        section.setGradeLevel(aGradeLevel);
        section.setSchoolYear(aSchoolYear);
        section.setSessionList(aSessionList);

        boolean isAdded = sectionDaoImpl.addSection(section);
        if (isAdded) {
            JOptionPane.showMessageDialog(null, "Successfully Added " + aSectionName);
            setSectionJList();
        } else {
            JOptionPane.showMessageDialog(null, "Encountered problems while adding " + aSectionName);
        }
    }//GEN-LAST:event_jbtnCreateSectionActionPerformed

    private void jcmbSchoolYearToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearToItemStateChanged

    }//GEN-LAST:event_jcmbSchoolYearToItemStateChanged

    private void jcmbSchoolYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearFromItemStateChanged
        jcmbSchoolYearTo.setSelectedIndex(jcmbSchoolYearFrom.getSelectedIndex());
        
    }//GEN-LAST:event_jcmbSchoolYearFromItemStateChanged

    private void jtfSectionNameCreateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSectionNameCreateKeyPressed
        boolean jtfSectionNameNotEmpty = !jtfSectionNameCreate.getText().isEmpty();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfSectionNameNotEmpty) {
                jcmbGradeLevelCreate.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jtfSectionNameCreateKeyPressed

    private void jcbAMSessionCreateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAMSessionCreateItemStateChanged
        boolean checkBoxIsChecked = jcbAMSessionCreate.isSelected();
        if (checkBoxIsChecked) {
            jtfAMCapacityCreate.setEnabled(true);
        } else {
            jtfAMCapacityCreate.setEnabled(false);
        }
    }//GEN-LAST:event_jcbAMSessionCreateItemStateChanged

    private void jcbPMSessionCreateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPMSessionCreateItemStateChanged
        boolean checkBoxIsChecked = jcbPMSessionCreate.isSelected();
        if (checkBoxIsChecked) {
            jtfPMCapacityCreate.setEnabled(true);
        } else {
            jtfPMCapacityCreate.setEnabled(false);
        }
    }//GEN-LAST:event_jcbPMSessionCreateItemStateChanged

    private void jcmbGradeLevelFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelFilterItemStateChanged
        boolean gradeLevelIsSelected = jcmbGradeLevelFilter.getSelectedIndex() > -1;
        boolean schoolYearIsSelected = jcmbSchoolYearFrom.getSelectedIndex() > -1;
        if (schoolYearIsSelected && !gradeLevelIsSelected) {
            String aSchoolYearFrom = jcmbSchoolYearFrom.getSelectedItem().toString();
            Integer aSchoolYearId = schoolYearDaoImpl.getId(Integer.parseInt(aSchoolYearFrom));
            jlstSectionList.setModel(sectionGUIUtil.getSectionBySchoolYearForJList(aSchoolYearId));
        }
//        else if (gradeLevelIsSelected) {
//            Integer aGradeLevel = Integer.parseInt(jcmbGradeLevelFilter.getSelectedItem().toString());
//            GradeLevel gradeLevel = new GradeLevel();
//            gradeLevel.setLevel(aGradeLevel);
//            Integer aGradeLevelId = gradeLevelDaoImpl.getId(gradeLevel);
//            JOptionPane.showMessageDialog(null,"GradeLevelId: "+aGradeLevelId);
//            jlstSectionList.setModel(sectionGUIUtil.getSectionByGradeLevelForJList(aGradeLevelId));
//        }
        else if (gradeLevelIsSelected) {
            String aSchoolYearFrom = jcmbSchoolYearFrom.getSelectedItem().toString();
            Integer aSchoolYearId = schoolYearDaoImpl.getId(Integer.parseInt(aSchoolYearFrom));
            Integer aGradeLevel = Integer.parseInt(jcmbGradeLevelFilter.getSelectedItem().toString());
            GradeLevel gradeLevel = new GradeLevel();
            gradeLevel.setLevel(aGradeLevel);
            Integer aGradeLevelId = gradeLevelDaoImpl.getId(gradeLevel);
            jlstSectionList.setModel(sectionGUIUtil.getSectionBySchoolYearAndGradeLevelForJList(aSchoolYearId, aGradeLevelId));
        }
    }//GEN-LAST:event_jcmbGradeLevelFilterItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradeLevelJlbl;
    private javax.swing.JLabel gradeLevelJlbl1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCreateSection;
    private javax.swing.JButton jbtnUpdateSection;
    private javax.swing.JCheckBox jcbAMSessionCreate;
    private javax.swing.JCheckBox jcbAMSessionCreate1;
    private javax.swing.JCheckBox jcbActiveInactive;
    private javax.swing.JCheckBox jcbPMSessionCreate;
    private javax.swing.JCheckBox jcbPMSessionCreate1;
    private javax.swing.JComboBox<String> jcmbGradeLevelCreate;
    private javax.swing.JComboBox<String> jcmbGradeLevelFilter;
    private javax.swing.JComboBox<String> jcmbGradeLevelUpdate;
    private javax.swing.JComboBox<String> jcmbSchoolYearFrom;
    private javax.swing.JComboBox<String> jcmbSchoolYearTo;
    private javax.swing.JLabel jlblAMCapacity;
    private javax.swing.JLabel jlblAMCapacity2;
    private javax.swing.JLabel jlblPMCapacity;
    private javax.swing.JLabel jlblPMCapacity2;
    private javax.swing.JList<String> jlstSectionList;
    private javax.swing.JPanel jpnlCreateSection;
    private javax.swing.JPanel jpnlFilter;
    private javax.swing.JPanel jpnlSession;
    private javax.swing.JPanel jpnlSession1;
    private javax.swing.JPanel jpnlUpdateSection;
    private javax.swing.JScrollPane jspSectionList;
    private javax.swing.JTextField jtfAMCapacityCreate;
    private javax.swing.JTextField jtfAMCapacityCreate1;
    private javax.swing.JTextField jtfPMCapacityCreate;
    private javax.swing.JTextField jtfPMCapacityCreate1;
    private javax.swing.JTextField jtfSectionNameCreate;
    private javax.swing.JTextField jtfSectionNameUpdate;
    private javax.swing.JPanel sectionsCardContainer;
    // End of variables declaration//GEN-END:variables
}
