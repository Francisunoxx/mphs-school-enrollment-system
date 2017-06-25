/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import daoimpl.SchoolYearDaoImpl;
import daoimpl.StudentDaoImpl;
import component_model_loader.NavigationImpl;
import component_model_loader.RegistrationML;
import component_model_loader.StudentML;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.SchoolYear;

/**
 *
 * @author Jordan
 */
public class EnrollmentPanel extends javax.swing.JPanel {

    JMenuItem menuItemCopyStudentId = new JMenuItem("Copy Student Id");
    JMenuItem menuItemCopyRegistrationId = new JMenuItem("Copy Registration Id");
    JMenuItem menuItemCopyLastName = new JMenuItem("Copy Last Name");
    JPopupMenu popupMenu = new JPopupMenu();
    
    private static final RegistrationML REGISTRATION_GUI_UTIL = new RegistrationML();
    private static final StudentML STUDENT_GUI_UTIL = new StudentML();
    private static final StudentDaoImpl STUDENT_DAO_IMPL = new StudentDaoImpl();
    private static final SchoolYearDaoImpl SCHOOLYEAR_DAO_IMPL = new SchoolYearDaoImpl();
    private final NavigationImpl navigation = new NavigationImpl();
    
    public EnrollmentPanel() {
        initComponents();
        
        popupMenu.add(menuItemCopyStudentId);
        popupMenu.add(menuItemCopyRegistrationId);
        popupMenu.add(menuItemCopyLastName);
        menuItemCopyStudentId.addActionListener(new MyStudentJTableActionListener());
        menuItemCopyRegistrationId.addActionListener(new MyStudentJTableActionListener());
        menuItemCopyLastName.addActionListener(new MyStudentJTableActionListener());
        
        loadActiveStudentsToJTable();
        loadRegisteredApplicantsToJTable();
        jtblRegistrationList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jtblStudentsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnlRegistered = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblSearch = new javax.swing.JLabel();
        jtfSearchRegistered = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbtnViewRegistrationDetails = new javax.swing.JButton();
        jbtnCloseEnrollment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistrationList = new javax.swing.JTable();
        jpnlStudents = new javax.swing.JPanel();
        jpnlStudentsFilter = new javax.swing.JPanel();
        jlblSearch1 = new javax.swing.JLabel();
        jtfSearchStudents = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcmbStatus = new javax.swing.JComboBox<>();
        jpnlStudentsControl = new javax.swing.JPanel();
        jbtnViewDetails = new javax.swing.JButton();
        jbtnClose = new javax.swing.JButton();
        jspStudents = new javax.swing.JScrollPane();
        jtblStudentsList = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jpnlRegistered.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jlblSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblSearch.setText("Search Applicant");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jlblSearch, gridBagConstraints);

        jtfSearchRegistered.setColumns(12);
        jtfSearchRegistered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearchRegistered.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSearchRegisteredKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jtfSearchRegistered, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRegistered.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jbtnViewRegistrationDetails.setText("View Details");
        jbtnViewRegistrationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewRegistrationDetailsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jbtnViewRegistrationDetails, gridBagConstraints);

        jbtnCloseEnrollment.setText("Close");
        jbtnCloseEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseEnrollmentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jbtnCloseEnrollment, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRegistered.add(jPanel3, gridBagConstraints);

        jPanel4.setPreferredSize(new java.awt.Dimension(550, 410));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jtblRegistrationList.setAutoCreateRowSorter(true);
        jtblRegistrationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration ID", "Last Name", "First Name", "Middle Name", "Registered Grade Level", "School Year", "Registration Date", "Admission Status", "Downpayment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistrationList.getTableHeader().setReorderingAllowed(false);
        jtblRegistrationList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistrationListMouseClicked(evt);
            }
        });
        jtblRegistrationList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblRegistrationListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistrationList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel4.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(jPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRegistered.add(jScrollPane2, gridBagConstraints);

        jTabbedPane1.addTab("Registered", jpnlRegistered);

        jpnlStudents.setLayout(new java.awt.GridBagLayout());

        jpnlStudentsFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jpnlStudentsFilter.setLayout(new java.awt.GridBagLayout());

        jlblSearch1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblSearch1.setText("Search Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsFilter.add(jlblSearch1, gridBagConstraints);

        jtfSearchStudents.setColumns(12);
        jtfSearchStudents.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearchStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchStudentsActionPerformed(evt);
            }
        });
        jtfSearchStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSearchStudentsKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsFilter.add(jtfSearchStudents, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsFilter.add(jLabel1, gridBagConstraints);

        jcmbStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jcmbStatus.setSelectedIndex(-1);
        jcmbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbStatusItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsFilter.add(jcmbStatus, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudents.add(jpnlStudentsFilter, gridBagConstraints);

        jpnlStudentsControl.setLayout(new java.awt.GridBagLayout());

        jbtnViewDetails.setText("View Details");
        jbtnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewDetailsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsControl.add(jbtnViewDetails, gridBagConstraints);

        jbtnClose.setText("Close");
        jbtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudentsControl.add(jbtnClose, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudents.add(jpnlStudentsControl, gridBagConstraints);

        jspStudents.setBorder(javax.swing.BorderFactory.createTitledBorder("Student List"));
        jspStudents.setPreferredSize(new java.awt.Dimension(550, 402));

        jtblStudentsList.setAutoCreateRowSorter(true);
        jtblStudentsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "School Year", "Student Type", "Last Name", "First Name", "Middle Name", "Status", "Graduated", "Grade Level Last Taken", "School Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblStudentsList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtblStudentsList.getTableHeader().setReorderingAllowed(false);
        jtblStudentsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblStudentsListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblStudentsListMousePressed(evt);
            }
        });
        jspStudents.setViewportView(jtblStudentsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlStudents.add(jspStudents, gridBagConstraints);

        jTabbedPane1.addTab("Students", jpnlStudents);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public static void loadRegisteredApplicantsToJTable(){
        DefaultTableModel dtm = REGISTRATION_GUI_UTIL.getAllRegisteredApplicants(jtblRegistrationList);
        jtblRegistrationList.setModel(dtm);
    }
    
    
    private void jtfSearchRegisteredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchRegisteredKeyPressed
        if ((!jtfSearchRegistered.getText().isEmpty()) && (evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            DefaultTableModel dtm = REGISTRATION_GUI_UTIL.getAllRegisteredApplicantsByKeyword(jtblRegistrationList, jtfSearchRegistered.getText());
            jtblRegistrationList.setModel(dtm);
        }else{
            DefaultTableModel dtm = REGISTRATION_GUI_UTIL.getAllRegisteredApplicants(jtblRegistrationList);
            jtblRegistrationList.setModel(dtm);
        }
    }//GEN-LAST:event_jtfSearchRegisteredKeyPressed

    private void jbtnViewRegistrationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewRegistrationDetailsActionPerformed

        boolean aRowIsSelected = jtblRegistrationList.getSelectedRow() > -1;

        if (aRowIsSelected) {
            int selectedRow = jtblRegistrationList.getSelectedRow();
            String valueOfFirstRowFirstColumn = jtblRegistrationList.getValueAt(selectedRow, 0).toString();
            int registrationId = Integer.parseInt(valueOfFirstRowFirstColumn);
            UpdateRegistrationDetailsGUI detailsGUI = new UpdateRegistrationDetailsGUI(registrationId);
            detailsGUI.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jbtnViewRegistrationDetailsActionPerformed

    private void jtblRegistrationListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistrationListMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedRow = jtblRegistrationList.getSelectedRow();
            String valueOfFirstRowFirstColumn = jtblRegistrationList.getValueAt(selectedRow, 0).toString();
            int registrationId = Integer.parseInt(valueOfFirstRowFirstColumn);
            UpdateRegistrationDetailsGUI detailsGUI = new UpdateRegistrationDetailsGUI(registrationId);
            detailsGUI.setVisible(true);
        }
    }//GEN-LAST:event_jtblRegistrationListMouseClicked

    private void jtblRegistrationListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblRegistrationListKeyPressed
        if (jtblRegistrationList.getSelectedRow() > -1) {

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_jtblRegistrationListKeyPressed

    private void jtfSearchStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchStudentsActionPerformed

    }//GEN-LAST:event_jtfSearchStudentsActionPerformed

    public static void loadAllStudentsToJTable(){
        int currentSchoolYearFrom = SchoolYearDaoImpl.getCurrentSchoolYearFrom();
        int aSchoolYearId = SCHOOLYEAR_DAO_IMPL.getSchoolYearId(currentSchoolYearFrom);
        SchoolYear schoolYear = new SchoolYear();
        schoolYear.setSchoolYearId(aSchoolYearId);

        jtblStudentsList.setModel(STUDENT_GUI_UTIL.getAllStudents(jtblStudentsList));
    }
    
    private void loadActiveStudentsToJTable(){
        DefaultTableModel dtm = STUDENT_GUI_UTIL.getAllActiveStudentsOfCurrentSchoolYear(jtblStudentsList);
            jtblStudentsList.setModel(dtm);
    }
    
    private static String getGradeLevelValue(int aGradeLevel){
        String gl="";
        if(aGradeLevel == 0){
            gl = "Kindergarten";
        }else{
            gl = "Grade "+aGradeLevel;
        }
        return gl;
    }
    
    private void jtfSearchStudentsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchStudentsKeyPressed
        if(!jtfSearchStudents.getText().isEmpty() && evt.getKeyCode() == KeyEvent.VK_ENTER){
            DefaultTableModel dtm = STUDENT_GUI_UTIL.getAllStudentByKeyword(jtblStudentsList, jtfSearchStudents.getText());
            jtblStudentsList.setModel(dtm);
        }else if(jtfSearchStudents.getText().isEmpty()){
            loadAllStudentsToJTable();
        }
    }//GEN-LAST:event_jtfSearchStudentsKeyPressed

    private void jcmbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbStatusItemStateChanged
        boolean notStatus = jcmbStatus.getSelectedIndex() == -1;
        boolean status = jcmbStatus.getSelectedIndex() > -1;
        boolean inactive = jcmbStatus.getSelectedItem().toString().equals("Inactive");
        boolean active = jcmbStatus.getSelectedItem().toString().equals("Active");

        if(status && active ){
            DefaultTableModel tableModel = STUDENT_GUI_UTIL.getAllActiveStudentsOfCurrentSchoolYear(jtblStudentsList);
            jtblStudentsList.setModel(tableModel);
        }else if(status && inactive){
            DefaultTableModel tableModel = STUDENT_GUI_UTIL.getAllInactiveStudents(jtblStudentsList);
            jtblStudentsList.setModel(tableModel);
        }
    }//GEN-LAST:event_jcmbStatusItemStateChanged

    private void jtblStudentsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblStudentsListMouseClicked
        int mySelectedRow = jtblStudentsList.getSelectedRow();
        Object objectStudentId = jtblStudentsList.getValueAt(mySelectedRow, 0);
        int aStudentId = Integer.parseInt(objectStudentId.toString() );
        if(evt.getClickCount() == 2){
            StudentInformationJDialog enrollGui = new StudentInformationJDialog(aStudentId);
            enrollGui.setLocationRelativeTo(null);
            enrollGui.pack();
            enrollGui.setVisible(true);
        }
    }//GEN-LAST:event_jtblStudentsListMouseClicked

    private void jbtnCloseEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseEnrollmentActionPerformed
        navigation.exitEnrollment(this);
    }//GEN-LAST:event_jbtnCloseEnrollmentActionPerformed

    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed
        navigation.exitEnrollment(this);
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jbtnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewDetailsActionPerformed
        boolean hasSelectedRowOnJTable = jtblStudentsList.getSelectedRow() > -1;
        if (hasSelectedRowOnJTable) {
            int mySelectedRow = jtblStudentsList.getSelectedRow();
            Object objectStudentId = jtblStudentsList.getValueAt(mySelectedRow, 0);
            int myStudentId = Integer.parseInt(objectStudentId.toString());
            StudentInformationJDialog enrollGui = new StudentInformationJDialog(myStudentId);
            enrollGui.setLocationRelativeTo(null);
            enrollGui.pack();
            enrollGui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select A Record To Pull Up.");
        }
    }//GEN-LAST:event_jbtnViewDetailsActionPerformed

    
    class MyStudentJTableActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Selected: " + e.getActionCommand());
            JMenuItem selectedMenuItem = (JMenuItem)e.getSource();
            
            if (selectedMenuItem == menuItemCopyStudentId) {
                int row = jtblStudentsList.getSelectedRow();
                int col = 0;
            
//                JOptionPane.showMessageDialog(null,"Row: "+row+"\nColumn: "+col);
                StringSelection stringSelection = new StringSelection(String.valueOf(jtblStudentsList
                        .getModel().getValueAt(row, col)));
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null); //copies the value to clipboard
            }
            else if(selectedMenuItem == menuItemCopyRegistrationId){
                int row = jtblStudentsList.getSelectedRow();
                int col = 1;
            
//                JOptionPane.showMessageDialog(null,"Row: "+row+"\nColumn: "+col);
                StringSelection stringSelection = new StringSelection(String.valueOf(jtblStudentsList
                        .getModel().getValueAt(row, col)));
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null); //copies the value to clipboard
            }
            else if(selectedMenuItem == menuItemCopyLastName){
                int row = jtblStudentsList.getSelectedRow();
                int col = 3;
            
//                JOptionPane.showMessageDialog(null,"Row: "+row+"\nColumn: "+col);
                StringSelection stringSelection = new StringSelection(String.valueOf(jtblStudentsList
                        .getModel().getValueAt(row, col)));
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null); //copies the value to clipboard
            }
        }
    }
    
    private void jtblStudentsListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblStudentsListMousePressed
        jtblStudentsList.setComponentPopupMenu(popupMenu);
        // selects the row at which point the mouse is clicked
        Point point = evt.getPoint();
        int currentRow = jtblStudentsList.rowAtPoint(point);
        jtblStudentsList.setRowSelectionInterval(currentRow, currentRow);
    }//GEN-LAST:event_jtblStudentsListMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JButton jbtnCloseEnrollment;
    private javax.swing.JButton jbtnViewDetails;
    private javax.swing.JButton jbtnViewRegistrationDetails;
    private javax.swing.JComboBox<String> jcmbStatus;
    private javax.swing.JLabel jlblSearch;
    private javax.swing.JLabel jlblSearch1;
    private javax.swing.JPanel jpnlRegistered;
    private javax.swing.JPanel jpnlStudents;
    private javax.swing.JPanel jpnlStudentsControl;
    private javax.swing.JPanel jpnlStudentsFilter;
    private javax.swing.JScrollPane jspStudents;
    private static javax.swing.JTable jtblRegistrationList;
    public static javax.swing.JTable jtblStudentsList;
    private javax.swing.JTextField jtfSearchRegistered;
    private javax.swing.JTextField jtfSearchStudents;
    // End of variables declaration//GEN-END:variables
}
