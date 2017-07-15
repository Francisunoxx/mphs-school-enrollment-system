/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.penalty;

import component_model_loader.PaymentTermML;
import component_model_loader.SchoolYearML;
import controller.global.SchoolYearController;
import controller.penaltysetting.SaveNewController;
import javax.swing.JDialog;

/**
 *
 * @author John Ferdinand Antonio
 */
public class CreatePenalty extends javax.swing.JDialog {

    private SchoolYearController schoolYearController;
    private SchoolYearML schoolYearModelLoader;
    private PaymentTermML paymentTermModelLoader;
    private SaveNewController saveController;
    
    /**
     * Creates new form CreatePenalty
     * @param parent
     * @param modal
     */
    public CreatePenalty(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        schoolYearModelLoader = new SchoolYearML();
        jcmbSyFrom.setModel(schoolYearModelLoader.getAllSchoolYearStart());
        jcmbSyTo.setModel(schoolYearModelLoader.getAllSchoolYearEnd());
        schoolYearController = new SchoolYearController(jcmbSyFrom, jcmbSyTo);
        jcmbSyFrom.addItemListener(schoolYearController);
        
        paymentTermModelLoader = new PaymentTermML();
        jcmbSemestral.setModel(paymentTermModelLoader.getNames());
        jcmbQuarterly.setModel(paymentTermModelLoader.getNames());
        jcmbMonthly.setModel(paymentTermModelLoader.getNames());
        
        saveController = new SaveNewController
            (jcmbSyFrom, jcmbSyTo, jcmbSemestral, jcmbQuarterly, jcmbMonthly, 
                    jtfSemestralPenalty, jtfQuarterlyPenalty, jtfMonthlyPenalty, 
                    jbtnSavePenalty,this);
        saveController.control();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        jbtnSavePenalty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

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

        jbtnSavePenalty.setText("Save");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlRecord.add(jbtnSavePenalty, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jpnlRecord, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnSavePenalty;
    private javax.swing.JComboBox<String> jcmbMonthly;
    private javax.swing.JComboBox<String> jcmbQuarterly;
    private javax.swing.JComboBox<String> jcmbSemestral;
    private javax.swing.JComboBox<String> jcmbSyFrom;
    private javax.swing.JComboBox<String> jcmbSyTo;
    private javax.swing.JPanel jpnlPayTermsPenalty;
    private javax.swing.JPanel jpnlRecord;
    private javax.swing.JPanel jpnlSchoolYear;
    private javax.swing.JTextField jtfMonthlyPenalty;
    private javax.swing.JTextField jtfQuarterlyPenalty;
    private javax.swing.JTextField jtfSemestralPenalty;
    // End of variables declaration//GEN-END:variables
}
