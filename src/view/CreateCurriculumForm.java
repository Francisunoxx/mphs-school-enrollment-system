package view;

import daoimpl.CurriculumDaoImpl;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import component_model_loader.JTableGUIUtil;
import component_model_loader.CurriculumML;
import component_model_loader.GradeLevelML;
import component_model_loader.SchoolYearML;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;
import component_renderers.JComboBoxRenderer_GradeLevel;

public class CreateCurriculumForm extends javax.swing.JPanel {

    //HAS-A
    // Has the following classes
    GradeLevelML glu = new GradeLevelML();
    SchoolYearML syu = new SchoolYearML();
    CurriculumML cu = new CurriculumML();
    CurriculumDaoImpl cdi = new CurriculumDaoImpl();

    Subject subject = new Subject();
    GradeLevel gradeLevel = new GradeLevel();
    Curriculum curriculum = new Curriculum();
    SchoolYear schoolYear = new SchoolYear();

    private final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    private final java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    public CreateCurriculumForm() {
        UIManager.put("ComboBox.disabledBackground", new Color(212, 212, 210));
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        initComponents();
        jcmbGradeLevel.setModel(glu.getAllRegisteredSubjectGradeLevel());
        jcmbGradeLevel.setRenderer(new JComboBoxRenderer_GradeLevel());
        jcmbGradeLevel.setSelectedIndex(-1);
        jcmbSchoolYearYearFrom.setModel(syu.getAllSchoolYearStart());
        jcmbSchoolYearYearFrom.setSelectedIndex(-1);
        jcmbSchoolYearYearTo.setModel(syu.getAllSchoolYearEnd());
        jcmbSchoolYearYearTo.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        gradeLevelJlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcmbGradeLevel = new javax.swing.JComboBox<>();
        jcmbSchoolYearYearFrom = new javax.swing.JComboBox<>();
        jcmbSchoolYearYearTo = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        curriculumDescriptionJta = new javax.swing.JTextArea();
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
        jPanel4 = new javax.swing.JPanel();
        cancelCreateCurriculumJbtn = new javax.swing.JButton();
        saveCurriculumJbtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Create"));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel9.setMinimumSize(new java.awt.Dimension(150, 98));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        gradeLevelJlbl.setText("Grade Level:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(gradeLevelJlbl, gridBagConstraints);

        jLabel6.setText("School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel6, gridBagConstraints);

        jLabel7.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jLabel7, gridBagConstraints);

        jcmbGradeLevel.setModel(new component_model_loader.GradeLevelML().getAllGradeLevels());
        jcmbGradeLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbGradeLevelItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jcmbGradeLevel, gridBagConstraints);

        jcmbSchoolYearYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbSchoolYearYearFromItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jcmbSchoolYearYearFrom, gridBagConstraints);

        jcmbSchoolYearYearTo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jcmbSchoolYearYearTo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel11.add(jPanel9, gridBagConstraints);

        jPanel13.setMinimumSize(new java.awt.Dimension(200, 107));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 107));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText("Description");
        jPanel13.add(jLabel8, new java.awt.GridBagConstraints());

        curriculumDescriptionJta.setColumns(20);
        curriculumDescriptionJta.setRows(5);
        jScrollPane3.setViewportView(curriculumDescriptionJta);

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel11, gridBagConstraints);

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
        jPanel3.add(jpnlSubjectAssignment, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel3, gridBagConstraints);

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

        saveCurriculumJbtn.setText("Create");
        saveCurriculumJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCurriculumJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(saveCurriculumJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel4, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void cancelCreateCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreateCurriculumJbtnActionPerformed

    }//GEN-LAST:event_cancelCreateCurriculumJbtnActionPerformed

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
        int selectedRow = subjectsListJtbl.getSelectedRow(); //selected row whic has the data to be added
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

    private void saveCurriculumJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCurriculumJbtnActionPerformed
        if (jcmbGradeLevel.getSelectedIndex() > -1 && jcmbSchoolYearYearFrom.getSelectedIndex() > -1) {
            int selectedGradeLevel = Integer.parseInt(jcmbGradeLevel.getSelectedItem().toString());
            int selectedSyYearFrom = Integer.parseInt(jcmbSchoolYearYearFrom.getSelectedItem().toString());
            int selectedSyYearTo = Integer.parseInt(jcmbSchoolYearYearTo.getSelectedItem().toString());

            SchoolYear sy = new SchoolYear();
            sy.setYearFrom(selectedSyYearFrom);
            sy.setYearTo(selectedSyYearTo);
            GradeLevel gl = new GradeLevel();
            gl.setLevel(selectedGradeLevel);
            Curriculum curc = new Curriculum();
            curc.setGradeLevel(gl);
            curc.setSchoolYear(sy);

            if (cdi.curriculumExists(curc)) {
                JOptionPane.showMessageDialog(null, "Curriculum for SY :" + selectedSyYearFrom + "-" + selectedSyYearTo + "\nfor Grade: " + selectedGradeLevel
                        + "already exists.");
                JOptionPane.showMessageDialog(null, "Please select a different gradelevel and schoolyear.");
            } else {
                JOptionPane.showMessageDialog(null, "Does not exist yet.");
                //call the cdi.addCurriculum() here
            }
        }

        gradeLevel.setLevel((int) jcmbGradeLevel.getSelectedItem());
        schoolYear.setYearFrom((int) jcmbSchoolYearYearFrom.getSelectedItem());
        curriculum.setCurriculumDescription(curriculumDescriptionJta.getText());
        curriculum.setIsActive(1);
        LocalDateTime now = LocalDateTime.now();
        curriculum.setDateCreated(dtf.format(now));
//        cdi.addCurriculum(curriculum, schoolYear, gradeLevel);

        for (int i = 0; i < curriculumSubjectsJtbl.getModel().getRowCount(); i++) {
            //While looping < rowCount also insert into curriculum_subject_lt
            curriculum.s.setSubjectCode((String) curriculumSubjectsJtbl.getValueAt(i, 0));
            curriculum.setCurriculumId(curriculum.getCurriculumId());
//            cdi.addCurriculumWithSubjects(curriculum);
        }
    }//GEN-LAST:event_saveCurriculumJbtnActionPerformed

    private void jcmbSchoolYearYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbSchoolYearYearFromItemStateChanged
        if (jcmbSchoolYearYearFrom.getSelectedIndex() > -1) {
            int selectedYearFrom = jcmbSchoolYearYearFrom.getSelectedIndex();
            jcmbSchoolYearYearTo.setSelectedIndex(selectedYearFrom);
        }


    }//GEN-LAST:event_jcmbSchoolYearYearFromItemStateChanged

    private void jcmbGradeLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbGradeLevelItemStateChanged
        if (jcmbGradeLevel.getSelectedIndex() != -1) {
            gradeLevel.setLevel((int) jcmbGradeLevel.getSelectedItem());
//            cdi.getEachSubjectByGradeLevelForCurriculum(gradeLevel);
            subjectsListJtbl.setModel(cu.getAllSubjectsByGradeLevel(gradeLevel));
        }
//        else
//        {
//            cdi.getAllSubjectForCurriculum();
//            subjectsListJtbl.setModel(cu.getAllSubjectsWithGradeLevel());
//        }
    }//GEN-LAST:event_jcmbGradeLevelItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjectJbtn;
    private javax.swing.JButton cancelCreateCurriculumJbtn;
    private javax.swing.JTextArea curriculumDescriptionJta;
    private javax.swing.JPanel curriculumSubjectsJPanel;
    private javax.swing.JScrollPane curriculumSubjectsJsp;
    public javax.swing.JTable curriculumSubjectsJtbl;
    private javax.swing.JLabel gradeLevelJlbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcmbGradeLevel;
    private javax.swing.JComboBox<String> jcmbSchoolYearYearFrom;
    private javax.swing.JComboBox<String> jcmbSchoolYearYearTo;
    private javax.swing.JPanel jpnlSubjectAssignment;
    private javax.swing.JButton removeSubjectJbtn;
    private javax.swing.JButton saveCurriculumJbtn;
    private javax.swing.JPanel subjectsListJPanel;
    private javax.swing.JScrollPane subjectsListJsp;
    private javax.swing.JTable subjectsListJtbl;
    // End of variables declaration//GEN-END:variables
}
