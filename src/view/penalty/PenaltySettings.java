/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.penalty;

import component_model_loader.PaymentTermML;
import component_model_loader.SchoolYearML;
import controller.global.SchoolYearController;
import controller.penaltysetting.DisplayCreateController;
import controller.penaltysetting.SchoolYearPenaltyListController;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author John Ferdinand Antonio
 */
public class PenaltySettings extends javax.swing.JPanel {

    private SchoolYearController schoolYearController;
    private SchoolYearML schoolYearModelLoader;
    private PaymentTermML paymentTermModelLoader;
    private DisplayCreateController displayCreatePenaltyController;
    private SchoolYearPenaltyListController schoolYearPenaltyListController;
    
    public PenaltySettings() {
        initComponents();
        remove_title_bar();
        
        schoolYearModelLoader = new SchoolYearML();
        jcmbSyFrom.setModel(schoolYearModelLoader.getAllSchoolYearStart());
        jcmbSyTo.setModel(schoolYearModelLoader.getAllSchoolYearEnd());
        schoolYearController = new SchoolYearController(jcmbSyFrom, jcmbSyTo);
        jcmbSyFrom.addItemListener(schoolYearController);
        
        paymentTermModelLoader = new PaymentTermML();
        jcmbSemestral.setModel(paymentTermModelLoader.getNames());
        jcmbQuarterly.setModel(paymentTermModelLoader.getNames());
        jcmbMonthly.setModel(paymentTermModelLoader.getNames());
        
        jlstSchoolYearFilter.setModel(paymentTermModelLoader.getSchoolYearsWithPenalty());
        
        schoolYearPenaltyListController = new SchoolYearPenaltyListController(
                jcmbSyFrom, jcmbSyTo, jcmbSemestral, jcmbQuarterly, jcmbMonthly,
                jtfSemestralPenalty, jtfQuarterlyPenalty,
                jtfMonthlyPenalty, jlstSchoolYearFilter);
        schoolYearPenaltyListController.control();
        
        
        displayCreatePenaltyController = new DisplayCreateController();
        jmiCreate.addActionListener(displayCreatePenaltyController);
        
        
    }

    
    private void remove_title_bar(){
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        ((BasicInternalFrameUI) jif.getUI()).setNorthPane(null);
        this.setBorder(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jif = new javax.swing.JInternalFrame();
        jpnlTop = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jpnlRecord = new javax.swing.JPanel();
        jpnlPayTermsPenalty = new javax.swing.JPanel();
        jcmbSemestral = new javax.swing.JComboBox<>();
        jcmbQuarterly = new javax.swing.JComboBox<>();
        jcmbMonthly = new javax.swing.JComboBox<>();
        jtfSemestralPenalty = new javax.swing.JTextField();
        jtfQuarterlyPenalty = new javax.swing.JTextField();
        jtfMonthlyPenalty = new javax.swing.JTextField();
        jpnlSchoolYear = new javax.swing.JPanel();
        jcmbSyFrom = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcmbSyTo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jpnlJlstContainer = new javax.swing.JPanel();
        jspSchoolYearFilter = new javax.swing.JScrollPane();
        jlstSchoolYearFilter = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuFile = new javax.swing.JMenu();
        jmiCreate = new javax.swing.JMenuItem();
        jmiEdit = new javax.swing.JMenuItem();
        jmiSave = new javax.swing.JMenuItem();

        setLayout(new java.awt.GridBagLayout());

        jif.setBorder(null);
        jif.setVisible(true);
        jif.getContentPane().setLayout(new java.awt.GridBagLayout());

        jpnlTop.setPreferredSize(new java.awt.Dimension(361, 300));
        jpnlTop.setLayout(new java.awt.GridBagLayout());

        jpnlRecord.setLayout(new java.awt.GridBagLayout());

        jpnlPayTermsPenalty.setLayout(new java.awt.GridBagLayout());

        jpnlPayTermsPenalty.add(jcmbSemestral, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPayTermsPenalty.add(jcmbQuarterly, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPayTermsPenalty.add(jcmbMonthly, gridBagConstraints);

        jtfSemestralPenalty.setColumns(5);
        jpnlPayTermsPenalty.add(jtfSemestralPenalty, new java.awt.GridBagConstraints());

        jtfQuarterlyPenalty.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPayTermsPenalty.add(jtfQuarterlyPenalty, gridBagConstraints);

        jtfMonthlyPenalty.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlPayTermsPenalty.add(jtfMonthlyPenalty, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRecord.add(jpnlPayTermsPenalty, gridBagConstraints);

        jpnlSchoolYear.setLayout(new java.awt.GridBagLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYear.add(jcmbSyFrom, gridBagConstraints);

        jLabel2.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYear.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYear.add(jcmbSyTo, gridBagConstraints);

        jLabel1.setText(" School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlSchoolYear.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRecord.add(jpnlSchoolYear, gridBagConstraints);

        jTabbedPane2.addTab("Record", jpnlRecord);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlTop.add(jTabbedPane2, gridBagConstraints);

        jpnlJlstContainer.setLayout(new java.awt.GridBagLayout());

        jspSchoolYearFilter.setPreferredSize(new java.awt.Dimension(80, 250));

        jspSchoolYearFilter.setViewportView(jlstSchoolYearFilter);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlJlstContainer.add(jspSchoolYearFilter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlTop.add(jpnlJlstContainer, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jif.getContentPane().add(jpnlTop, gridBagConstraints);

        jmenuFile.setText("File");

        jmiCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiCreate.setText("Create");
        jmenuFile.add(jmiCreate);

        jmiEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiEdit.setText("Edit");
        jmenuFile.add(jmiEdit);

        jmiSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSave.setText("Save ");
        jmiSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaveActionPerformed(evt);
            }
        });
        jmenuFile.add(jmiSave);

        jMenuBar1.add(jmenuFile);

        jif.setJMenuBar(jMenuBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jif, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> jcmbMonthly;
    private javax.swing.JComboBox<String> jcmbQuarterly;
    private javax.swing.JComboBox<String> jcmbSemestral;
    private javax.swing.JComboBox<String> jcmbSyFrom;
    private javax.swing.JComboBox<String> jcmbSyTo;
    private javax.swing.JInternalFrame jif;
    public static javax.swing.JList<String> jlstSchoolYearFilter;
    private javax.swing.JMenu jmenuFile;
    private javax.swing.JMenuItem jmiCreate;
    private javax.swing.JMenuItem jmiEdit;
    private javax.swing.JMenuItem jmiSave;
    private javax.swing.JPanel jpnlJlstContainer;
    private javax.swing.JPanel jpnlPayTermsPenalty;
    private javax.swing.JPanel jpnlRecord;
    private javax.swing.JPanel jpnlSchoolYear;
    private javax.swing.JPanel jpnlTop;
    private javax.swing.JScrollPane jspSchoolYearFilter;
    private javax.swing.JTextField jtfMonthlyPenalty;
    private javax.swing.JTextField jtfQuarterlyPenalty;
    private javax.swing.JTextField jtfSemestralPenalty;
    // End of variables declaration//GEN-END:variables
}
