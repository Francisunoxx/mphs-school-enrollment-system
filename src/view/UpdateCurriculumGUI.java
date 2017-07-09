package view;

import daoimpl.CurriculumDaoImpl_OLD;
import daoimpl.EducationalStageDaoImpl;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import component_model_loader.JTableGUIUtil;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import daoimpl.SubjectDaoImpl_OLD;
import javax.swing.DefaultComboBoxModel;

public class UpdateCurriculumGUI extends javax.swing.JDialog {

    String      educationalStage;
    String      curriculumGradeLevel;
    String      CurriculumSchoolYear;
    String      CurriculumDescription;
    int         YearFrom;
    int         YearTo;
    int         CurriculumId;
    int         SchoolYearId;
    int         GradeLevelId;
    
    CurriculumDaoImpl_OLD  curriculum; // object of curriculum class
    
    //Checks if field was changed or not
    static boolean  isCurcNameChanged; 
    boolean         isCurcYearLevelChanged; 
    boolean         isCurcSchoolYearChanged;
    boolean         isCurcDescChanged; 
    boolean         isCurriculumSubjectsChanged;
    
    public UpdateCurriculumGUI
        (String aEducationalStage, String aGradeLevel, String aDescription, String aSchoolYear) {
        
        super(null, ModalityType.APPLICATION_MODAL);
        initComponents();
        UIManager.put( "ComboBox.disabledBackground", new Color(212,212,210) );
        UIManager.put( "ComboBox.disabledForeground", Color.BLACK );
        
        //JOptionPane.showMessageDialog(null,"YearFrom: "+YearFrom+"\nYearTo: "+YearTo);
        
        educationalStage        = aEducationalStage;
        curriculumGradeLevel    = aGradeLevel;
        CurriculumSchoolYear    = aSchoolYear;
        CurriculumDescription   = aDescription;
//        GradeLevelId            = GradeLevelDaoImpl.getId(aGradeLevel);
        //CurriculumId            = CurriculumDaoImpl_OLD.getId(educationalStage, GradeLevelDaoImpl.getId(curriculumGradeLevel), YearFrom, YearTo);
//        SchoolYearId            = SchoolYearDaoImpl.getId(YearFrom, YearTo);
        
        curriculum = new CurriculumDaoImpl_OLD(educationalStage, CurriculumDescription, curriculumGradeLevel, YearFrom, YearTo);
        
        SchoolYearDaoImpl sy = new SchoolYearDaoImpl();
        
//        gradeLevelJcbx.setModel(GradeLevelDaoImpl.getAll());
//        yearFromJcbx.setModel(sy.getAllSchoolYearStart());
//        yearToJcbx.setModel(sy.getAllSchoolYearEnd());
        educationalStageJcbx.setModel(EducationalStageDaoImpl.getStages());

//        curriculumSubjectsJtbl.setModel(curriculum.getSubjects(CurriculumId, curriculumSubjectsJtbl));
        subjectsListJtbl.setModel(SubjectDaoImpl_OLD.getAll(GradeLevelId, subjectsListJtbl));

        setCurriculumInformation();
        setCurriculumNameDocumentListener();
        
        curriculumSubjectsJtbl.getModel().addTableModelListener(new CurriculumSubjectsTableListener());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        topPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        curriculumNameJlbl = new javax.swing.JLabel();
        yearLevelJlbl = new javax.swing.JLabel();
        gradeLevelJcbx = new javax.swing.JComboBox<>();
        schoolYearJlbl = new javax.swing.JLabel();
        yearFromJcbx = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yearToJcbx = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        educationalStageJcbx = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        subjectDescriptionJta = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cancelCreateCurriculumJbtn = new javax.swing.JButton();
        updateCurriculumJbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topPanel.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        subjectsListJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        subjectsListJPanel.setLayout(new java.awt.GridBagLayout());

        subjectsListJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Subject Name", "Units", "Description", "YearLevel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel3.add(subjectsListJPanel, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        addSubjectJbtn.setText("Add");
        addSubjectJbtn.setEnabled(false);
        addSubjectJbtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        removeSubjectJbtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        jPanel3.add(jPanel6, gridBagConstraints);

        curriculumSubjectsJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        curriculumSubjectsJPanel.setLayout(new java.awt.GridBagLayout());

        curriculumSubjectsJtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Subject Name", "Units", "Description", "YearLevel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        curriculumSubjectsJtbl.getTableHeader().setReorderingAllowed(false);
        curriculumSubjectsJtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculumSubjectsJtblMouseClicked(evt);
            }
        });
        curriculumSubjectsJsp.setViewportView(curriculumSubjectsJtbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
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
        jPanel3.add(curriculumSubjectsJPanel, gridBagConstraints);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        curriculumNameJlbl.setText("Education Stage");
        curriculumNameJlbl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                curriculumNameJlblPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(curriculumNameJlbl, gridBagConstraints);

        yearLevelJlbl.setText("Year Level :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(yearLevelJlbl, gridBagConstraints);

        gradeLevelJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gradeLevelJcbxItemStateChanged(evt);
            }
        });
        gradeLevelJcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeLevelJcbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(gradeLevelJcbx, gridBagConstraints);

        schoolYearJlbl.setText("School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(schoolYearJlbl, gridBagConstraints);

        yearFromJcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearFromJcbxItemStateChanged(evt);
            }
        });
        yearFromJcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFromJcbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(yearFromJcbx, gridBagConstraints);

        jLabel7.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel7, gridBagConstraints);

        yearToJcbx.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(yearToJcbx, gridBagConstraints);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jCheckBox1.setText("All Year Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setText("All School Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel12.add(jCheckBox2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jPanel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(educationalStageJcbx, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel9, gridBagConstraints);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText("Description");
        jPanel13.add(jLabel8, new java.awt.GridBagConstraints());

        subjectDescriptionJta.setColumns(20);
        subjectDescriptionJta.setRows(5);
        jScrollPane3.setViewportView(subjectDescriptionJta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel13.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        topPanel.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

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
        jPanel4.add(cancelCreateCurriculumJbtn, gridBagConstraints);

        updateCurriculumJbtn.setText("Save");
        updateCurriculumJbtn.setEnabled(false);
        updateCurriculumJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCurriculumJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(updateCurriculumJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        topPanel.add(jPanel4, gridBagConstraints);

        getContentPane().add(topPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class CurriculumSubjectsTableListener implements TableModelListener{
        @Override
        public void tableChanged(TableModelEvent e) {
            if (e.getType()==TableModelEvent.INSERT||e.getType()==TableModelEvent.DELETE){
                updateCurriculumJbtn.setEnabled(true);
            }
        }
    }
    
    private void setCurriculumNameDocumentListener(){

    }
    
    public static void setIsCurriculumChanged(Boolean bool){
        isCurcNameChanged = bool;
    }
    
    private void cancelCreateCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreateCurriculumJbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelCreateCurriculumJbtnActionPerformed

    private void yearFromJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearFromJcbxItemStateChanged
        int syStartSelectedIndex = yearFromJcbx.getSelectedIndex();
        yearToJcbx.setSelectedIndex(syStartSelectedIndex);
    }//GEN-LAST:event_yearFromJcbxItemStateChanged

    private void gradeLevelJcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gradeLevelJcbxItemStateChanged
        String selectedGradeLevel = (String)gradeLevelJcbx.getSelectedItem();
//        subjectsListJtbl.setModel(SubjectDaoImpl_OLD.getAll(GradeLevelDaoImpl.getId(selectedGradeLevel), subjectsListJtbl));
        //JOptionPane.showMessageDialog(null,"Grade Level ID: "+GradeLevelDaoImpl.getId(selectedGradeLevel) );
        
        
        if (selectedGradeLevel.equals(curriculumGradeLevel)) {
            isCurcYearLevelChanged = false; //still the same, not changed
            
            yearLevelJlbl.setText("Year Level");
        }
    }//GEN-LAST:event_gradeLevelJcbxItemStateChanged

    private void subjectsListJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsListJtblMouseClicked
        int rowsSelected = subjectsListJtbl.getSelectedRow();
        if ( rowsSelected > -1) {
            addSubjectJbtn.setEnabled(true);
        }
        if (evt.getClickCount() == 2) {
            JTableGUIUtil jtm = new JTableGUIUtil();
            jtm.copyTableData(subjectsListJtbl, curriculumSubjectsJtbl);
        }
    }//GEN-LAST:event_subjectsListJtblMouseClicked

    private void curriculumSubjectsJtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculumSubjectsJtblMouseClicked
        if(evt.getClickCount() == 2){
            int selectedRow = curriculumSubjectsJtbl.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel)curriculumSubjectsJtbl.getModel();
            tableModel.removeRow(selectedRow);
        }
    }//GEN-LAST:event_curriculumSubjectsJtblMouseClicked

    private void updateCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCurriculumJbtnActionPerformed
        int     mySyYearFrom            = Integer.parseInt( yearFromJcbx.getSelectedItem().toString() );
        int     mySyYearTo              = Integer.parseInt( yearToJcbx.getSelectedItem().toString() );
        String  myEducationalStage      = educationalStageJcbx.getSelectedItem().toString();
        String  myGradeLevel            = gradeLevelJcbx.getSelectedItem().toString();
        String  myDescription           = subjectDescriptionJta.getText().trim();
        Boolean isSuccessful            = curriculum.updateDetails(curriculumSubjectsJtbl, CurriculumId,myEducationalStage,myDescription,myGradeLevel,mySyYearFrom,mySyYearTo);
        if(isSuccessful){
            JOptionPane.showMessageDialog(null,"Update successful");
            this.dispose();
            CurriculumManagementContainer.flipCardToCurriculumList();
        }
    }//GEN-LAST:event_updateCurriculumJbtnActionPerformed

    private void gradeLevelJcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeLevelJcbxActionPerformed
        String yearLevel = (String)gradeLevelJcbx.getSelectedItem();
        int rowCountOfCurcSubjects = curriculumSubjectsJtbl.getModel().getRowCount();
        
        if (!yearLevel.equals(curriculumGradeLevel) && rowCountOfCurcSubjects > 0) {
            String message = "Changing the year level \nwill clear currently assigned subjects. \n\nContinue?";
                int choice = JOptionPane.showConfirmDialog(null,message,"Continue",JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    isCurcYearLevelChanged = true;
                    yearLevelJlbl.setText("* Year Level");
                    //subjectsListJtbl.setModel(SubjectDaoImpl_OLD.getSubjectsByGradeLevel(yearLevel,subjectsListJtbl));

                    //Remove rows on curriculum subjects when year level is changed
                    DefaultTableModel curcSubjTblModel = (DefaultTableModel) curriculumSubjectsJtbl.getModel();
                    JTableGUIUtil.deleteAllRows(curcSubjTblModel);

                    //enable the save button because changes were made on year level
                    updateCurriculumJbtn.setEnabled(true);
                }else if(choice == JOptionPane.NO_OPTION){
                    gradeLevelJcbx.setSelectedItem(curriculumGradeLevel);
                }
        }        
    }//GEN-LAST:event_gradeLevelJcbxActionPerformed

    private void curriculumNameJlblPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_curriculumNameJlblPropertyChange
        
    }//GEN-LAST:event_curriculumNameJlblPropertyChange

    private void yearFromJcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFromJcbxActionPerformed
        int selectedSyStart = Integer.parseInt( (yearFromJcbx.getSelectedItem().toString()) );
        
        if( selectedSyStart != YearFrom ){
            schoolYearJlbl.setText("* School Year:");
            updateCurriculumJbtn.setEnabled(true);
            isCurcSchoolYearChanged = true;
        }
        if ( selectedSyStart == YearFrom ){
            schoolYearJlbl.setText("School Year:");
            isCurcSchoolYearChanged = false;
        }
    }//GEN-LAST:event_yearFromJcbxActionPerformed

    private void setCurriculumInformation() {
//        //JOptionPane.showMessageDialog(null,"CurriculumDaoImpl_OLD Id: "+CurriculumId);
//        ArrayList<Object> curColumns = CurriculumDaoImpl_OLD.getInformationOf(CurriculumId);
//        
//        educationalStageJcbx.setSelectedItem(curColumns.get(0).toString() );
//        subjectDescriptionJta.setText( curColumns.get(4).toString() );
//        gradeLevelJcbx.setSelectedItem( "Grade "+curColumns.get(3).toString() );
//        Object syStart =  curColumns.get(1).toString() ;
//        Object syEnd =  curColumns.get(2).toString();
//
//        yearFromJcbx.getModel().setSelectedItem(syStart);
//        yearToJcbx.getModel().setSelectedItem(syEnd);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjectJbtn;
    private javax.swing.JButton cancelCreateCurriculumJbtn;
    private javax.swing.JLabel curriculumNameJlbl;
    private javax.swing.JPanel curriculumSubjectsJPanel;
    private javax.swing.JScrollPane curriculumSubjectsJsp;
    private javax.swing.JTable curriculumSubjectsJtbl;
    private javax.swing.JComboBox<String> educationalStageJcbx;
    private javax.swing.JComboBox<String> gradeLevelJcbx;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton removeSubjectJbtn;
    private javax.swing.JLabel schoolYearJlbl;
    private javax.swing.JTextArea subjectDescriptionJta;
    private javax.swing.JPanel subjectsListJPanel;
    private javax.swing.JScrollPane subjectsListJsp;
    private javax.swing.JTable subjectsListJtbl;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton updateCurriculumJbtn;
    private javax.swing.JComboBox<String> yearFromJcbx;
    private javax.swing.JLabel yearLevelJlbl;
    private javax.swing.JComboBox<String> yearToJcbx;
    // End of variables declaration//GEN-END:variables
}
